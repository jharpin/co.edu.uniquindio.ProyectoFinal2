package co.edu.uniquindio.proyecto.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView btnLogin;

    @FXML
    private AnchorPane imgLogin;

    @FXML
    private Label lblBilleteraVirtual;

    @FXML
    private Label lblContraseniaLogin;

    @FXML
    private Label lblIdentificacionLogin;

    @FXML
    private Label lblLogintl;

    @FXML
    private Hyperlink linkOlvidoContrasenia;

    @FXML
    private Hyperlink linkRegistrarCuenta;

    @FXML
    private TextField txtContraseniaLogin;

    @FXML
    private TextField txtIdentificacionLogin;
}
