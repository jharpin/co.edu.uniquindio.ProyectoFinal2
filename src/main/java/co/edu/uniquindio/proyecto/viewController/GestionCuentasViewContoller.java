package co.edu.uniquindio.proyecto.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class GestionCuentasViewContoller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizarCuenta;

    @FXML
    private Button btnAgregarCuenta;

    @FXML
    private Button btnEliminarCuenta;

    @FXML
    private TableColumn<?, ?> colIde;

    @FXML
    private TableColumn<?, ?> colNombreCuenta;

    @FXML
    private TableColumn<?, ?> colNumerocuenta;

    @FXML
    private TableColumn<?, ?> colTipoCuenta;

    @FXML
    private ComboBox<?> combotTipoCuenta;

    @FXML
    private Label lblBilleteraVirtual1;

    @FXML
    private Label lblIdeCuenta;

    @FXML
    private Label lblIdeCuenta1;

    @FXML
    private Label lblIdeCuenta11;

    @FXML
    private Label lblRegistroTl1;

    @FXML
    private TableView<?> tableCuentas;

    @FXML
    private TextField txtIdeCuenta;

    @FXML
    private TextField txtNombreCuenta;

    @FXML
    private TextField txtNumeroCuenta;

    @FXML
    void onActualizar(ActionEvent event) {

    }

    @FXML
    void onAgregar(ActionEvent event) {

    }

    @FXML
    void onEliminar(ActionEvent event) {

    }

    @FXML
    void initialize() {}
}

