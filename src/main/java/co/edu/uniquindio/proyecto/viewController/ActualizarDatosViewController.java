package co.edu.uniquindio.proyecto.viewController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ActualizarDatosViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizarUsuario;

    @FXML
    private Button btnRetirarDinero;

    @FXML
    private Button btnTranferir;

    @FXML
    private Label lblBilleteraVirtual;

    @FXML
    private Label lblNumeroCuenta;

    @FXML
    private Label lblRegistroTl;

    @FXML
    private Label lblRegistroTl1;

    @FXML
    private Label lblTelefonoUsuario;

    @FXML
    private Label lblTelefonoUsuario1;

    @FXML
    private Label lblnombreInfo;

    @FXML
    private Label lblnombreUsuario;

    @FXML
    private Label lblnombreUsuario1;

    @FXML
    private Label lblnombreUsuario11;

    @FXML
    private Label lblnumeroDinero;

    @FXML
    private Hyperlink linkCerrar;

    @FXML
    private TextField txtEmailUsuario;

    @FXML
    private TextField txtTelefonoUsuario;



    @FXML
    void cerrarSesion(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/proyecto/Login.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) linkCerrar.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Retirar(ActionEvent event) {

    }



    @FXML
    void onActualizar(ActionEvent event) {

    }

    @FXML
    void onAgregarDinero(ActionEvent event) {

    }

    @FXML
    void onTransferir(ActionEvent event) {

    }

    @FXML
    void initialize() {}
}
