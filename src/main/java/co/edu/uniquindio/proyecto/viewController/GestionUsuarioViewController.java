package co.edu.uniquindio.proyecto.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class GestionUsuarioViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizarUsuario;

    @FXML
    private Button btnCrearUsuario;

    @FXML
    private Button btnEliminarUsuario;

    @FXML
    private TableColumn<?, ?> colCorreoUsuario;

    @FXML
    private TableColumn<?, ?> colIdUsuario;

    @FXML
    private TableColumn<?, ?> colnombreUsuario;

    @FXML
    private Label lblBilleteraVirtual;

    @FXML
    private Label lblLogintl;

    @FXML
    private Hyperlink linkCerrar;

    @FXML
    private TableView<?> tableUsuarios;
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
    void ActualizarUsuario(ActionEvent event) {

    }

    @FXML
    void Eliminarusuario(ActionEvent event) {

    }

    @FXML
    void irCrearUsuario(ActionEvent event) {

    }

    @FXML
    void initialize() {}
}
