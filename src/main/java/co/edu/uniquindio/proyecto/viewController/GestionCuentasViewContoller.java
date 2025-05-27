package co.edu.uniquindio.proyecto.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyecto.Controller.CuentaController;
import co.edu.uniquindio.proyecto.Controller.TransaccionController;
import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.mapping.dto.CuentaDto;
import co.edu.uniquindio.proyecto.mapping.dto.TransaccionDto;
import co.edu.uniquindio.proyecto.model.Cuenta;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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
    void onActualizar(ActionEvent event) {

    }

    @FXML
    void onAgregar(ActionEvent event) {
        String id = txtideCuenta.getText();
        String numerocuenta= txtnumerocuenta.getText();
        String nombrecuenta= txtnombreCuenta.getText();
        String tipo = comboTipo.getValue();

        if (id.isEmpty() ||numerocuenta.isEmpty() ||nombrecuenta.isEmpty()|| tipo == null) {
            mostrarMensaje("Error", "Campos vacíos", "Debes llenar todos los campos");
            return;
        }

        CuentaDto cuentaDto = new CuentaDto(id, Double.parseDouble(saldo), tipo);
        modelFactoryController.crearCuenta(cuentaDto);
        cargarDatosTabla(); // actualiza tabla
        limpiarCampos();
    }



    @FXML
    void onEliminar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        cuentaController = new CuentaController();

        colIdCuenta.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getIdCuenta()));
        colTipoCuenta.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getTipoCuenta()));
        colSaldoCuenta.setCellValueFactory(data -> new SimpleStringProperty(String.valueOf(data.getValue().getSaldoCuenta())));
        tablaCuentas.setItems(listaCuentasDto);
    }
}

