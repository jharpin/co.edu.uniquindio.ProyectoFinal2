package co.edu.uniquindio.proyecto.viewController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyecto.Controller.UsuarioController;
import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ActualizarDatosViewController {

    UsuarioController usuarioController;
    
    private Usuario usuario;


    @FXML
    private Button btnActualizarUsuario;

    @FXML
    private Label lblBilleteraVirtual;

    @FXML
    private Label lblRegistroTl1;

    @FXML
    private Label lblTelefonoUsuario;

    @FXML
    private Label lblTelefonoUsuario1;

    @FXML
    private Label lblTelefonoUsuario2;
    @FXML
    private Label lblinfo;

    @FXML
    private Hyperlink linkCerrar;

    @FXML
    private TextField txtEmailUsuario;

    @FXML
    private TextField txtNombreUsuario;

    @FXML
    private TextField txtNumerotelefono;



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

        actualizarUsuario();

    }

    private void actualizarUsuario() {
        usuario.setNombreUsuario(txtNombreUsuario.getText());
        usuario.setTelefonoUsuario(txtNumerotelefono.getText());

        usuarioController.actualizarUsuario(usuario);
        Alert alerta = new Alert(Alert.AlertType.INFORMATION, "Usuario actualizado");
        alerta.show();

    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
       
        txtNombreUsuario.setText(usuario.getNombreUsuario());
        txtNumerotelefono.setText(usuario.getTelefonoUsuario());

    }


    @FXML
    void onAgregarDinero(ActionEvent event) {

    }

    @FXML
    void onTransferir(ActionEvent event) {

    }


    @FXML
    void initialize() {
        usuarioController = new UsuarioController();

        usuario = ModelFactory.getInstance().getUsuarioActivo();
        if (usuario != null) {
            txtNombreUsuario.setText(usuario.getNombreUsuario());
            txtNumerotelefono.setText(usuario.getTelefonoUsuario());
        }
    }
}
