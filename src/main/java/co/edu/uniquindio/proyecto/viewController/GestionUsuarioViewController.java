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
    private TableColumn<UsuarioDto, String> colCorreo;


    @FXML
    private TableColumn<UsuarioDto, String> colNombreUsuario;

    @FXML
    private TableColumn<UsuarioDto , String> colSaldo;

    @FXML
    private TableColumn<UsuarioDto, String> colTelefono;

    @FXML
    private TableColumn<UsuarioDto, String> colDireccion;

    @FXML
    private TextField txtCorreo;

    @FXML
    private Button btnNuevoUsuario;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtIdentificacion;

    @FXML
    private TextField txtNombreUsuario;

    @FXML
    private TableColumn<UsuarioDto, String> colIdentificacion;

    @FXML
    private TableColumn<UsuarioDto, String> colContrasena;

    @FXML
    private TextField txtSaldo;

    @FXML
    private TextField txtContraseña;

    @FXML
    private TextField txtTelefono;
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
    void OnNuevoUsuario(ActionEvent event) {

        nuevoUsuario();

    }

    @FXML
    void Eliminarusuario(ActionEvent event) {
        eliminarUsuario();
    }

    @FXML
    void irCrearUsuario(ActionEvent event) {
        agregarUsuario();
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
        colNombreUsuario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombreUsuario()));
        colTelefono.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().telefonoUsuario()));
        colCorreo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().emailUsuario()));
        colDireccion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().direccion()));
        colSaldo.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().saldo())));
        colContrasena.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().contraseniaUsuario())));
        colIdentificacion.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().idUsuario())));

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
            txtTelefono.setText(usuarioSeleccionado.telefonoUsuario());
            txtCorreo.setText(usuarioSeleccionado.emailUsuario());
            txtDireccion.setText(usuarioSeleccionado.direccion());
            txtSaldo.setText(String.valueOf(usuarioSeleccionado.saldo()));
            txtContraseña.setText(usuarioSeleccionado.contraseniaUsuario());
            txtIdentificacion.setText(usuarioSeleccionado.idUsuario());
        }
    }


    private void nuevoUsuario() {
        limpiarCampos();
        txtNombreUsuario.setText("Ingrese un nombre");
    }

    private void agregarUsuario() {

        UsuarioDto usuarioDto = crearUsuarioDto();

        if(datosValidos(usuarioDto)) {
            if(gestionUsuarioController.agregarUsuario(usuarioDto)) {
                listaUsuarios.add(usuarioDto);
                mostrarMensaje("usuario creado", "usuario","usuario creado",Alert.AlertType.INFORMATION);
            }else{
                mostrarMensaje("usuario no creado","usuario","usuario no creado",Alert.AlertType.ERROR);
            }
        }else{
            mostrarMensaje("titulo incompleto","usuario","titulo incompleto",Alert.AlertType.ERROR);
        }

    }

    private UsuarioDto crearUsuarioDto() {
        return new UsuarioDto(txtNombreUsuario.getText()
                                ,txtIdentificacion.getText()
                                ,txtCorreo.getText(),
                                txtTelefono.getText(),
                                txtContraseña.getText()
                                ,txtDireccion.getText()
                                ,Double.parseDouble(txtSaldo.getText()));

    }

    private void actualizarUsuario(){

            if (usuarioSeleccionado != null) {
                UsuarioDto usuarioActualizado = ActualizarUsuarioDto();
                if (datosValidos(usuarioActualizado)){
                    if (gestionUsuarioController.actualizarUsuario(usuarioActualizado)) {
                        for (UsuarioDto usuario1 : listaUsuarios) {
                            if (usuario1.equals(usuarioSeleccionado)) {
                                listaUsuarios.remove(usuario1);
                                listaUsuarios.add(usuarioActualizado);

                                break;
                            }
                        }
                        mostrarMensaje("Cliente actualizado", null, "Los datos del cliente han sido actualizados.", Alert.AlertType.INFORMATION);
                    } else {
                        mostrarMensaje("Error", null, "No se pudo actualizar el cliente.", Alert.AlertType.ERROR);
                    }
                } else {
                    mostrarMensaje("Campos incompletos", null, "Por favor, llena todos los campos.", Alert.AlertType.WARNING);
                }
            }
    }
    private void eliminarUsuario() {
        if(usuarioSeleccionado != null){
            if(gestionUsuarioController.eliminarUsuario(usuarioSeleccionado.idUsuario())){
                listaUsuarios.remove(usuarioSeleccionado);
                limpiarCampos();
                mostrarMensaje("cliente eliminado", "cliente", "cliente eliminado",Alert.AlertType.INFORMATION);
            }else{
                mostrarMensaje("cliente no eliminado", "cliente", "cliente no eliminado",Alert.AlertType.ERROR);
            }
        }
    }
    private void limpiarCampos() {
        txtNombreUsuario.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtSaldo.setText("");
        txtTelefono.setText("");
        txtIdentificacion.setText("");
        txtContraseña.setText("");
    }
    private UsuarioDto ActualizarUsuarioDto(){
        return new UsuarioDto(txtNombreUsuario.getText()
                                ,usuarioSeleccionado.idUsuario()
                                ,txtCorreo.getText()
                                ,txtTelefono.getText()
                                ,usuarioSeleccionado.contraseniaUsuario()
                                ,txtDireccion.getText()
                                ,Double.parseDouble(txtSaldo.getText()));
    }
    private boolean datosValidos(UsuarioDto usuarioDto) {
        if(usuarioDto.nombreUsuario().isBlank() ||
                usuarioDto.idUsuario().isBlank()||
                usuarioDto.emailUsuario().isBlank() ||
                usuarioDto.direccion().isBlank() ||
                usuarioDto.telefonoUsuario().isBlank() ||
                usuarioDto.saldo() == 0.0){
            return false;
        }
        return true;
    }
    private void mostrarMensaje(String titulo, String header, String contenido, Alert.AlertType alertType){
        Alert aler = new Alert(alertType);
        aler.setTitle(titulo);
        aler.setHeaderText(header);
        aler.setContentText(contenido);
        aler.showAndWait();
    }


}
