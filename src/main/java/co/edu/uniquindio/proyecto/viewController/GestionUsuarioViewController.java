package co.edu.uniquindio.proyecto.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
    private TableView<?> tableUsuarios;

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
