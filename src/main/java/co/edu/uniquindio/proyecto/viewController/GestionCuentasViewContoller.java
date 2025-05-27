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
    private Button btnActualizar;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnEliminarCuenta;

    @FXML
    private TableColumn<?, ?> colidecuenta;

    @FXML
    private TableColumn<?, ?> colnombrecuenta;

    @FXML
    private TableColumn<?, ?> colnumerocuenta;

    @FXML
    private TableColumn<?, ?> coltipocuenta;

    @FXML
    private ComboBox<?> comboTipo;

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
    private TableView<?> tableCuentas;

    @FXML
    private TextField txtCuenta;

    @FXML
    private TextField txtideCuenta;

    @FXML
    private TextField txtnumerocuenta;

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

