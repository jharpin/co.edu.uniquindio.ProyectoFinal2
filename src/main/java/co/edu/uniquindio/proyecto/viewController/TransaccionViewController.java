package co.edu.uniquindio.proyecto.viewController;

import co.edu.uniquindio.proyecto.mapping.dto.TransaccionDto;
import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.utils.DataUtil;
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
import java.util.stream.Collectors;

public class TransaccionViewController {

    ObservableList<TransaccionDto> listaTransacciones = FXCollections.observableArrayList();
    ObservableList<TransaccionDto> listaOriginal = FXCollections.observableArrayList();

    @FXML private ComboBox<String> cuentaOrigenField, cuentaDestinoField;
    @FXML private TextField montoField;
    @FXML private TextArea descripcionArea;
    @FXML private ComboBox<String> tipoComboBox, categoriaComboBox, filtroTipoComboBox, filtroCategoriaComboBox;
    @FXML private DatePicker filtroFechaPicker;
    @FXML private TableView<TransaccionDto> tablaTransacciones;
    @FXML private TableColumn<TransaccionDto, String> colIdTrans, colCuentaOrigen, colCuentaDestino, colTipo, colCategoria, colDescripcion;
    @FXML private TableColumn<TransaccionDto, Double> colValorTransferido;
    @FXML private TableColumn<TransaccionDto, LocalDate> colFechaTrans;

    @FXML
    public void initialize() {
        tipoComboBox.getItems().addAll("Depósito", "Retiro", "Transferencia");
        filtroTipoComboBox.getItems().addAll("Depósito", "Retiro", "Transferencia");

        categoriaComboBox.getItems().addAll("Ahorro", "Gastos", "Servicios", "Otros");
        filtroCategoriaComboBox.getItems().addAll("Ahorro", "Gastos", "Servicios", "Otros");

        cargarUsuarios();

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

    private void cargarUsuarios() {
        List<Usuario> usuarios = DataUtil.inicializarDatos()
                .getListaUsuarios()
                .stream()
                .filter(u -> !u.getIdUsuario().equalsIgnoreCase("admi"))
                .collect(Collectors.toList());

        List<String> nombres = usuarios.stream().map(Usuario::getNombreUsuario).toList();
        cuentaOrigenField.getItems().addAll(nombres);
        cuentaDestinoField.getItems().addAll(nombres);
    }

    private void cargarTransacciones() {
        listaTransacciones.clear();
        listaOriginal.clear();

        // Datos de ejemplo
        listaTransacciones.add(new TransaccionDto(UUID.randomUUID().toString(), "Usuario1", "Usuario2", 5000, LocalDate.now(), "Depósito", "Ahorro", "Ejemplo"));
        listaOriginal.addAll(listaTransacciones);
        tablaTransacciones.setItems(listaTransacciones);
    }

    @FXML
    private void onEnviar() {
        try {
            TransaccionDto nueva = new TransaccionDto(
                    UUID.randomUUID().toString(),
                    cuentaOrigenField.getValue(),
                    cuentaDestinoField.getValue(),
                    Double.parseDouble(montoField.getText()),
                    LocalDate.now(),
                    tipoComboBox.getValue(),
                    categoriaComboBox.getValue(),
                    descripcionArea.getText()
            );

            listaTransacciones.add(nueva);
            listaOriginal.add(nueva);
            tablaTransacciones.setItems(listaTransacciones);
            limpiarCampos();
            mostrarAlerta("Éxito", "Transacción registrada correctamente.");
        } catch (Exception e) {
            mostrarAlerta("Error", "Datos inválidos. Revisa los campos.");
        }
    }

    @FXML
    private void filtrar() {
        ObservableList<TransaccionDto> filtradas = FXCollections.observableArrayList(listaOriginal);

        LocalDate fechaFiltro = filtroFechaPicker.getValue();
        String tipoFiltro = filtroTipoComboBox.getValue();
        String categoriaFiltro = filtroCategoriaComboBox.getValue();

        if (fechaFiltro != null)
            filtradas.removeIf(t -> !t.fecha().equals(fechaFiltro));
        if (tipoFiltro != null && !tipoFiltro.isEmpty())
            filtradas.removeIf(t -> !t.tipo().equalsIgnoreCase(tipoFiltro));
        if (categoriaFiltro != null && !categoriaFiltro.isEmpty())
            filtradas.removeIf(t -> !t.categoria().equalsIgnoreCase(categoriaFiltro));

        listaTransacciones.setAll(filtradas);
        tablaTransacciones.setItems(listaTransacciones);
    }

    @FXML
    private void limpiarFiltros() {
        filtroFechaPicker.setValue(null);
        filtroTipoComboBox.setValue(null);
        filtroCategoriaComboBox.setValue(null);

        listaTransacciones.setAll(listaOriginal);
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

        mostrarAlerta("Detalles", detalles);
    }

    private void limpiarCampos() {
        cuentaOrigenField.setValue(null);
        cuentaDestinoField.setValue(null);
        montoField.clear();
        tipoComboBox.setValue(null);
        categoriaComboBox.setValue(null);
        descripcionArea.clear();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
