package co.edu.uniquindio.proyecto.viewController;

import co.edu.uniquindio.proyecto.Controller.UsuarioController;
import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.model.Validador;
import co.edu.uniquindio.proyecto.patrones.proxy.LoginProxy;
import co.edu.uniquindio.proyecto.patrones.proxy.LoginService;
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

    UsuarioController usuarioController;

    IAutentificador loginProxy;
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



    @FXML
    void IngresarLogin(ActionEvent event) {
        String id = txtIdentificacionLogin.getText();
        String pass = txtContraseniaLogin.getText();
        UsuarioDto usuario = loginProxy.iniciarSesionA(id, pass);

        if (usuario == null) {
            mostrarAlerta("Error de Inicio de Sesión", "Credenciales incorrectas", Alert.AlertType.ERROR);
            return;
        }

        ModelFactory.getInstance().setUsuarioActivo(usuario);
        mostrarAlerta("Inicio de Sesión Exitoso", "¡Bienvenido, " + usuario.idUsuario() + "!", Alert.AlertType.INFORMATION);

        String vista = new Validador().validarAdministrador(id, pass)
                ? "/co/edu/uniquindio/proyecto/DashboardAdministrador.fxml"
                : "/co/edu/uniquindio/proyecto/DashboardUsuario.fxml";

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(vista));
            Parent root = loader.load();
            Object controller = loader.getController();
            if (controller instanceof DashboardUsuarioViewController usuarioController) {
                usuarioController.setUsuario(usuario);
            }
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void mostrarAlerta(String titulo, String mensaje, Alert.AlertType tipo) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
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
//
    @FXML
    void initialize() {
        usuarioController = new UsuarioController();
        loginProxy = new LoginProxy(new LoginService());
    }

}

