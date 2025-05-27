package co.edu.uniquindio.proyecto.viewController;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyecto.Controller.CuentaController;
import co.edu.uniquindio.proyecto.Controller.TransaccionController;
import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.mapping.dto.CuentaDto;
import co.edu.uniquindio.proyecto.mapping.dto.TransaccionDto;
import co.edu.uniquindio.proyecto.model.Cuenta;
import co.edu.uniquindio.proyecto.model.GestionBilletera;
import co.edu.uniquindio.proyecto.model.Usuario;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class GestionCuentasViewContoller {
    CuentaController cuentaController;
    ObservableList<CuentaDto> listaCuenta = FXCollections.observableArrayList();
    ObservableList<CuentaDto> listaOriginal = FXCollections.observableArrayList();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnEliminarCuenta;

    @FXML
    private TableColumn<CuentaDto, String> colidecuenta;

    @FXML
    private TableColumn<CuentaDto, String> colnombrecuenta;

    @FXML
    private TableColumn<CuentaDto, String> colnumerocuenta;

    @FXML
    private TableColumn<CuentaDto, String> coltipocuenta;

    @FXML
    private ComboBox<String> comboTipo;

    @FXML
    private Label lblBilleteraVirtual;

    @FXML
    private Label lblLogintl;

    @FXML
    private Label lblnumerocuenta;

    @FXML
    private Label lblnumerocuenta1;

    @FXML
    private Label lblnumerocuenta11;

    @FXML
    private Label lblnumerocuenta12;

    @FXML
    private TableView<CuentaDto> tableCuentas;

    @FXML
    private TextField txtnombreCuenta;

    @FXML
    private TextField txtideCuenta;

    @FXML
    private TextField txtnumerocuenta;

    @FXML
    void initialize() {
        cuentaController = new CuentaController();
        comboTipo.getItems().addAll("Ahorro", "Gastos", "Servicios", "Otros");
        colidecuenta.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().idCuenta()));
        colnombrecuenta.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().nombreCuenta()));
        colnumerocuenta.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().numeroCuenta()));
        coltipocuenta.setCellValueFactory(data -> new SimpleStringProperty(String.valueOf(data.getValue().tipoCuenta())));
        tableCuentas.setItems(listaCuenta);
        tableCuentas.setOnMouseClicked(event -> {
            CuentaDto seleccionada = tableCuentas.getSelectionModel().getSelectedItem();
            if (seleccionada != null) {
                txtideCuenta.setText(seleccionada.idCuenta());
                txtnumerocuenta.setText(String.valueOf(seleccionada.numeroCuenta()));
                txtnombreCuenta.setText(String.valueOf(seleccionada.nombreCuenta()));
                comboTipo.setValue(seleccionada.tipoCuenta());
            }
        });
    }

    @FXML
    void onActualizar(ActionEvent event) {
        actualizarCuenta();
    }


    @FXML
    void onAgregar(ActionEvent event) {

        String id = txtideCuenta.getText();
        String numerocuenta = txtnumerocuenta.getText();
        String nombrecuenta = txtnombreCuenta.getText();
        String tipo = comboTipo.getValue();

        CuentaDto nueva = new CuentaDto(id, numerocuenta, nombrecuenta, tipo);
        if (cuentaController.CrearCuenta(nueva)) {
            listaCuenta.add(nueva);
            listaOriginal.add(nueva);
            tableCuentas.setItems(listaCuenta);
            limpiarCampos();
            mostrarAlerta("Éxito", "Cuenta registrada correctamente.");
        } else {
            mostrarAlerta("Error", "No se pudo registrar la Cuenta.");
        }
    }

    private void limpiarCampos() {
        txtideCuenta.clear();
        txtnumerocuenta.clear();
        txtnombreCuenta.clear();
        comboTipo.setValue(null);

    }

    private void actualizarCuenta() {
        CuentaDto seleccionada = tableCuentas.getSelectionModel().getSelectedItem();
        if (seleccionada == null) {
            mostrarAlerta("Error Selección requerida", "Selecciona una cuenta para actualizar.");
            return;
        }


        String numerocuenta = txtnumerocuenta.getText();
        String nombrecuenta = txtnombreCuenta.getText();
        String tipo = comboTipo.getValue();

        if (numerocuenta.isEmpty() || nombrecuenta.isEmpty() || tipo == null) {
            mostrarAlerta("Error Campos vacíos", "Debes llenar todos los campos");
            return;
        }

        for (int i = 0; i < listaCuenta.size(); i++) {
            CuentaDto cuenta = listaCuenta.get(i);
            if (cuenta.idCuenta().equals(seleccionada.idCuenta())) {
                CuentaDto actualizada = new CuentaDto(
                        cuenta.idCuenta(),
                        numerocuenta,
                        nombrecuenta,
                        tipo
                );
                listaCuenta.set(i, actualizada);
                break;
            }
        }
        cargarDatosTabla();
        limpiarCampos();
    }
    private void cargarDatosTabla() {
        tableCuentas.setItems(listaCuenta);
    }



    @FXML
    void onEliminar(ActionEvent event) {
        CuentaDto seleccionada = tableCuentas.getSelectionModel().getSelectedItem();

        if (seleccionada != null) {
            cuentaController.eliminarCuenta(seleccionada.idCuenta());
            listaCuenta.removeIf(c -> c.idCuenta().equals(seleccionada.idCuenta()));
            tableCuentas.refresh();
        }
    }




    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
