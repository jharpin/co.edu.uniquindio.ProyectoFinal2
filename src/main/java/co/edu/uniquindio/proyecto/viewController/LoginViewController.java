package co.edu.uniquindio.proyecto.viewController;

import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.patrones.proxy.LoginProxy;
import co.edu.uniquindio.proyecto.services.IAutentificador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginViewController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnLogin;

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
    private PasswordField txtContraseniaLogin;

    @FXML
    private TextField txtIdentificacionLogin;
    private IAutentificador loginProxy = new LoginProxy();


    @FXML
    void IngresarLogin(ActionEvent event) {
            String identificacion = txtIdentificacionLogin.getText();
            String contrasena = txtContraseniaLogin.getText();

            Usuario usuario = loginProxy.iniciarSesion(identificacion, contrasena);

            if (usuario != null) {
                //if (usuario.isAdmin()) {
                    // Redirigir a vista administrador
                   // System.out.println("Redirigiendo a vista ADMIN...");
                System.out.println("Redirigiendo a vista USUARIO...");
                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Inicio de Sesión Exitoso");
                alerta.setHeaderText(null);
                alerta.setContentText("¡Bienvenido, " + usuario.getIdUsuario() + "!");
                alerta.showAndWait();

            } else {
                System.out.println(" Credenciales incorrectas");
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error de Inicio de Sesión");
                alerta.setHeaderText("Credenciales incorrectas");
                alerta.setContentText("Por favor, verifica du identificacion y contraseña.");
                alerta.showAndWait();
            }

    }

    @FXML
    void irAOlvidoContrasenia(ActionEvent event) {
        try {
            // Cargar el archivo FXML de registro
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/proyecto/OlvidoContrasenia.fxml"));
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
    private void irARegistroUsuario(ActionEvent event) {
        try {
            // Cargar el archivo FXML de registro
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/proyecto/RegistroUsuarios.fxml"));
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

