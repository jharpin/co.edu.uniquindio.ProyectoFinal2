package co.edu.uniquindio.proyecto.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.model.GestionBilletera;
import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.model.builder.UsuarioBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import co.edu.uniquindio.proyecto.Controller.UsuarioController;
import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.factory.ModelFactory;

public class RegistroUsuarioviewController {

    UsuarioController usuarioController;
    Usuario usuario;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnRegistrarUsuario;

    @FXML
    private Label lblBilleteraVirtual;

    @FXML
    private Label lblContrasenia;

    @FXML
    private Label lblEmailUsuario;

    @FXML
    private Label lblIdUsuario;

    @FXML
    private Label lblRegistroTl;

    @FXML
    private Label lblTelefonoUsuario;

    @FXML
    private Label lblnombreUsuario;

    @FXML
    private Hyperlink linkInicioSesion;

    @FXML
    private TextField txtEmailUsuario;

    @FXML
    private TextField txtIdeusuario;

    @FXML
    private TextField txtNombreUsuario;

    @FXML
    private TextField txtTelefonoUsuario;

    @FXML
    private TextField txtcontrasenia;
    @FXML
    void initialize() {
        usuarioController=new UsuarioController();
        initView();
    }
    private void initView() {
    }
    @FXML
    void IrinicioSesion(ActionEvent event) {
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
    void onRegistrar(ActionEvent event) {
        // Obtener datos del formulario
        String idUsuario = txtIdeusuario.getText();
        String nombreUsuario = txtNombreUsuario.getText();
        String emailUsuario = txtEmailUsuario.getText();
        String telefonoUsuario = txtTelefonoUsuario.getText();
        String contraseniaUsuario = txtcontrasenia.getText();

        // Validación básica
        if (idUsuario.isEmpty() || nombreUsuario.isEmpty() || emailUsuario.isEmpty()
                || telefonoUsuario.isEmpty() || contraseniaUsuario.isEmpty()) {
            mostrarAlerta(null, null,"Campos incompletos");
            return;


    }


        // Crear el builder y construir el usuario
        UsuarioBuilder builder = new UsuarioBuilder()
                .setNombreUsuario(nombreUsuario)
                .setIdUsuario(idUsuario)
                .setEmailUsuario(emailUsuario)
                .setTelefonoUsuario(telefonoUsuario)
                .setContraseniaUsuario(contraseniaUsuario);

        //modelfactory
        GestionBilletera gestion = usuarioController.getGestionBilletera();
        boolean creado = gestion.crearUsuario(builder);

        if (creado) {
            mostrarAlerta("Éxito", null, "Usuario registrado exitosamente.");
            txtIdeusuario.clear();
            txtNombreUsuario.clear();
            txtEmailUsuario.clear();
            txtTelefonoUsuario.clear();
            txtcontrasenia.clear();

            // Mostrar la lista actual de usuarios
            String listaUsuarios = "Usuarios registrados:\n";
            for (Usuario u : gestion.getListaUsuarios()) {
                listaUsuarios += "- " + u.getNombreUsuario() + " (ID: " + u.getIdUsuario() + ")\n";
            }
            mostrarAlerta("Lista de Usuarios", null, listaUsuarios);

        } else {
            mostrarAlerta("Error", null, "El usuario ya existe o ocurrió un error.");
        }
    }
    private boolean validarCampos(Usuario usuario) {
        if (usuario.getEmailUsuario() == null || usuario.getEmailUsuario().isEmpty()) {
            mostrarAlerta("no valido","","El correo es obligatorio.");
            return false;
        }
        if (!usuario.getEmailUsuario().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            mostrarAlerta("no valido","","El correo no tiene un formato válido.");
            return false;
        }
        if (usuario.getIdUsuario() == null || usuario.getIdUsuario().isEmpty()) {
            mostrarAlerta("no valido","","El ID es obligatorio.");
            return false;
        }
        ModelFactory modelFactory = null;
        if (modelFactory.verificarIdExistente(usuario.getIdUsuario())) {
            mostrarAlerta("no valido","","El ID ya existe. Debe ser único.");
            return false;
        }
        if (usuario.getTelefonoUsuario() == null || !usuario.getTelefonoUsuario().matches("\\d+")) {
            mostrarAlerta("no valido","","El teléfono debe contener solo números.");
            return false;
        }
        if (usuario.getTelefonoUsuario().length() < 7 || usuario.getTelefonoUsuario().length() > 10) {
            mostrarAlerta("no valido","","El teléfono debe tener entre 7 y 10 dígitos.");
            return false;
        }
        if (usuario.getContraseniaUsuario() == null || usuario.getContraseniaUsuario().length() < 6) {
            mostrarAlerta("no valido","","La contraseña debe tener al menos 6 caracteres.");
            return false;
        }
        return true;
    }


    private void mostrarAlerta(String titulo, String encabezado, String contenido) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(encabezado);
        alert.setContentText(contenido);
        alert.showAndWait();
    }





}


