package co.edu.uniquindio.proyecto.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyecto.Controller.GestionUsuarioController;
import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class GestionUsuarioViewController {

    GestionUsuarioController gestionUsuarioController;
    ObservableList<UsuarioDto> listaUsuarios = FXCollections.observableArrayList();
    UsuarioDto usuarioSeleccionado;

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
    private TableColumn<UsuarioDto, String> colCorreoUsuario;

    @FXML
    private TableColumn<UsuarioDto, String> colIdUsuario;

    @FXML
    private TableColumn<UsuarioDto, String> colnombreUsuario;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtIdentificacion;

    @FXML
    private TextField txtNombreUsuario;

    @FXML
    private Label lblBilleteraVirtual;

    @FXML
    private Label lblLogintl;

    @FXML
    private Hyperlink linkCerrar;

    @FXML
    private TableView<UsuarioDto> tableUsuarios;
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

        actualizarUsuario();

    }

    @FXML
    void Eliminarusuario(ActionEvent event) {

    }

    @FXML
    void irCrearUsuario(ActionEvent event) {

    }
    private void actualizarUsuario(){

    }

    @FXML
    void initialize() {

        gestionUsuarioController = new GestionUsuarioController();
        initView();
    }

    private void initView(){
        initDataBinding();
        obtenerUsuarios();
        tableUsuarios.getItems().clear();
        tableUsuarios.setItems(listaUsuarios);
        listenerSelection();
    }

    private void obtenerUsuarios(){
        listaUsuarios.addAll(gestionUsuarioController.obtnerUsuario());
    }

    private void initDataBinding(){
        colnombreUsuario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombreUsuario()));
        colIdUsuario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().idUsuario()));
        colCorreoUsuario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().emailUsuario()));
    }

    private void listenerSelection(){
        tableUsuarios.getSelectionModel().selectedItemProperty().addListener((obs,oldSelection,newSelection) -> {
            usuarioSeleccionado = newSelection;
            mostrarInformacionUsuario(usuarioSeleccionado);
        });
    }
    private void mostrarInformacionUsuario(UsuarioDto usuarioSeleccionado){
        if(usuarioSeleccionado != null){
            txtNombreUsuario.setText(usuarioSeleccionado.nombreUsuario());
            txtIdentificacion.setText(usuarioSeleccionado.idUsuario());
            txtCorreo.setText(usuarioSeleccionado.emailUsuario());
        }
    }
}
