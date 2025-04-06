package co.edu.uniquindio.proyecto.viewController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class olvidoContraseniaViewController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnRecuperarContrasenia;

    @FXML
    private Label lblBilleteraVirtual;

    @FXML
    private Label lblEmailRecuperar;

    @FXML
    private Label lblIdentificacionRecuperar;

    @FXML
    private Label lblRecuperar;

    @FXML
    private Hyperlink linkOlvidoContrasenia;

    @FXML
    private TextField txt1recuperarEmail;

    @FXML
    private TextField txtIdentificacionRecuperar;

    @FXML
    void RecuperarConttasenia(ActionEvent event) {

    }

    @FXML
    void irLogin(ActionEvent event) {
        try {
            // Cargar el archivo FXML de registro
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/proyecto/Login.fxml"));
            Parent root = loader.load();

            // Obtener la escena actual desde el hyperlink
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Cambiar la escena
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void initialize() {}
}
