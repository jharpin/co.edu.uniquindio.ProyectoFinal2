package co.edu.uniquindio.proyecto.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PresupuestoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bntAgregarPresupuesto;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnEliminarPresupuesto;

    @FXML
    private TableColumn<?, ?> colCategoria;

    @FXML
    private TableColumn<?, ?> colEstadoP;

    @FXML
    private TableColumn<?, ?> colIde;

    @FXML
    private TableColumn<?, ?> colMontoAsig;

    @FXML
    private TableColumn<?, ?> colMontoGas;

    @FXML
    private TableColumn<?, ?> colnombreP;

    @FXML
    private ComboBox<?> comboCategoria;

    @FXML
    private ComboBox<?> comboEstadoPresupuesto;

    @FXML
    private Label lblCategoria;

    @FXML
    private Label lblEsatdoPresupuesto;

    @FXML
    private Label lblMontoasignado;

    @FXML
    private Label lblSubtitulo;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblmontoAsignado;

    @FXML
    private Label lblnombrePresupuesto;

    @FXML
    private TableView<?> tablaPresupuesto;

    @FXML
    private TextField txtMontoasignado;

    @FXML
    private TextField txtnombrePresupuesto;

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
