package co.edu.uniquindio.proyecto.viewController;

import co.edu.uniquindio.proyecto.Controller.TransaccionController;
import co.edu.uniquindio.proyecto.mapping.dto.TransaccionDto;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class TransaccionViewController {

    TransaccionController transaccionController;
    ObservableList<TransaccionDto> listaTransacciones = FXCollections.observableArrayList();
    ObservableList<TransaccionDto> listaOriginal = FXCollections.observableArrayList();

    @FXML private TextField cuentaOrigenField, cuentaDestinoField, montoField;
    @FXML private TextArea descripcionArea;
    @FXML private ComboBox<String> tipoComboBox, categoriaComboBox, filtroTipoComboBox, filtroCategoriaComboBox;
    @FXML private DatePicker filtroFechaPicker;
    @FXML private TableView<TransaccionDto> tablaTransacciones;
    @FXML private TableColumn<TransaccionDto, String> colIdTrans, colCuentaOrigen, colCuentaDestino, colTipo, colCategoria, colDescripcion;
    @FXML private TableColumn<TransaccionDto, Double> colValorTransferido;
    @FXML private TableColumn<TransaccionDto, LocalDate> colFechaTrans;

    @FXML
    public void initialize() {
        transaccionController = new TransaccionController();

        tipoComboBox.getItems().addAll("Depósito", "Retiro", "Transferencia");
        filtroTipoComboBox.getItems().addAll("Depósito", "Retiro", "Transferencia");

        categoriaComboBox.getItems().addAll("Ahorro", "Gastos", "Servicios", "Otros");
        filtroCategoriaComboBox.getItems().addAll("Ahorro", "Gastos", "Servicios", "Otros");

        colIdTrans.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().id()));
        colCuentaOrigen.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().cuentaOrigen()));
        colCuentaDestino.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().cuentaDestino()));
        colTipo.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().tipo()));
        colCategoria.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().categoria()));
        colDescripcion.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().descripcion()));
        colValorTransferido.setCellValueFactory(data -> new SimpleDoubleProperty(data.getValue().monto()).asObject());
        colFechaTrans.setCellValueFactory(data -> new SimpleObjectProperty<>(data.getValue().fecha()));

        cargarTransacciones();
    }

    private void cargarTransacciones() {
        List<TransaccionDto> transacciones = transaccionController.obtenerTransacciones();
        listaTransacciones.setAll(transacciones);
        listaOriginal.setAll(transacciones);
        tablaTransacciones.setItems(listaTransacciones);
    }
    private static int contadorTransacciones = 1;
    @FXML
    private void onEnviar() {
        String id = String.format("T%03d", contadorTransacciones++);
        String origen = cuentaOrigenField.getText();
        String destino = cuentaDestinoField.getText();
        String tipo = tipoComboBox.getValue();
        String categoria = categoriaComboBox.getValue();
        String descripcion = descripcionArea.getText();

        double monto;
        try {
            monto = Double.parseDouble(montoField.getText());
        } catch (NumberFormatException e) {
            mostrarAlerta("Error", "El monto debe ser un número válido.");
            return;
        }

        TransaccionDto nueva = new TransaccionDto(id, origen, destino, monto, LocalDate.now(), tipo, categoria, descripcion);

        if (transaccionController.CrearTransaccion(nueva)) {
            listaTransacciones.add(nueva);
            listaOriginal.add(nueva);
            tablaTransacciones.setItems(listaTransacciones);
            limpiarCampos();
            mostrarAlerta("Éxito", "Transacción registrada correctamente.");
        } else {
            mostrarAlerta("Error", "No se pudo registrar la transacción.");
        }
    }

    @FXML
    private void filtrar() {
        ObservableList<TransaccionDto> filtradas = FXCollections.observableArrayList(listaOriginal);

        LocalDate fechaFiltro = filtroFechaPicker.getValue();
        String tipoFiltro = filtroTipoComboBox.getValue();
        String categoriaFiltro = filtroCategoriaComboBox.getValue();

        if (fechaFiltro != null) {
            filtradas.removeIf(t -> !t.fecha().equals(fechaFiltro));
        }

        if (tipoFiltro != null && !tipoFiltro.isEmpty()) {
            filtradas.removeIf(t -> !t.tipo().equalsIgnoreCase(tipoFiltro));
        }

        if (categoriaFiltro != null && !categoriaFiltro.isEmpty()) {
            filtradas.removeIf(t -> !t.categoria().equalsIgnoreCase(categoriaFiltro));
        }

        listaTransacciones.setAll(filtradas);
        tablaTransacciones.setItems(listaTransacciones);
    }

    @FXML
    private void verDetalles() {
        TransaccionDto seleccionada = tablaTransacciones.getSelectionModel().getSelectedItem();
        if (seleccionada == null) {
            mostrarAlerta("Advertencia", "Debes seleccionar una transacción.");
            return;
        }

        String detalles = "ID: " + seleccionada.id() +
                "\nOrigen: " + seleccionada.cuentaOrigen() +
                "\nDestino: " + seleccionada.cuentaDestino() +
                "\nMonto: $" + seleccionada.monto() +
                "\nFecha: " + seleccionada.fecha() +
                "\nTipo: " + seleccionada.tipo() +
                "\nCategoría: " + seleccionada.categoria() +
                "\nDescripción: " + seleccionada.descripcion();

        mostrarAlerta("Detalles de Transacción", detalles);
    }

    private void limpiarCampos() {
        cuentaOrigenField.clear();
        cuentaDestinoField.clear();
        montoField.clear();
        tipoComboBox.setValue(null);
        categoriaComboBox.setValue(null);
        descripcionArea.clear();
    }
    @FXML
    private void limpiarFiltros() {
        filtroFechaPicker.setValue(null);
        filtroTipoComboBox.setValue(null);
        filtroCategoriaComboBox.setValue(null);

        listaTransacciones.setAll(listaOriginal);
        tablaTransacciones.setItems(listaTransacciones);
    }
    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
