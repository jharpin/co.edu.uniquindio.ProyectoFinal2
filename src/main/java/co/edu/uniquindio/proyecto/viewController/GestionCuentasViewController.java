package co.edu.uniquindio.proyecto.viewController;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class GestionCuentasViewController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnBuscarcuenta;

    @FXML
    private Button btnEliminarCuenta;

    @FXML
    private TableColumn<?, ?> colIdcuenta;

    @FXML
    private TableColumn<?, ?> coldineroCuentaTotal;

    @FXML
    private TableColumn<?, ?> colusuarioAsociado;

    @FXML
    private Label lblBilleteraVirtual;

    @FXML
    private Label lblLogintl;

    @FXML
    private Label lblnumerocuenta;

    @FXML
    private TableView<?> tableCuentas;

    @FXML
    private TextField txtNumeroCuenta;

    @FXML
    void ActualizarUsuario(ActionEvent event) {

        System.out.println("funciona");

    }

    @FXML
    void Eliminarusuario(ActionEvent event) {
        System.out.println("funciona");

    }

    @FXML
    void initialize() {
    }
}
