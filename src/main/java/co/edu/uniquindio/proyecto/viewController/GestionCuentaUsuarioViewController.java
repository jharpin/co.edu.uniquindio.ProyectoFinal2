package co.edu.uniquindio.proyecto.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.patrones.observer.clases.AlertaObserver;
import co.edu.uniquindio.proyecto.patrones.observer.clases.UsuarioObservable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class GestionCuentaUsuarioViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnEnviarDinero;

    @FXML
    private Button btnRetirarDinero;

    @FXML
    private TableColumn<?, ?> colCategoria;

    @FXML
    private TableColumn<?, ?> colCuentaDestino;

    @FXML
    private TableColumn<?, ?> colCuentaOrigen;

    @FXML
    private TableColumn<?, ?> colDescripcion;

    @FXML
    private TableColumn<?, ?> colFechaTrans;

    @FXML
    private TableColumn<?, ?> colIdTrans;

    @FXML
    private TableColumn<?, ?> colTipo;

    @FXML
    private TableColumn<?, ?> colValorTransferido;

    @FXML
    private Label lblBilleteraVirtual;

    @FXML
    private Label lblLogintl;

    @FXML
    private Label lblinfoestadodecuenta;

    @FXML
    private Label lblinfonumerocuenta;

    @FXML
    private Label lblinfotipodecuenta;

    @FXML
    private TableView<?> tablaGestioncuentasu;

    @FXML
    private TextField txtNumerocuentaEnviar;

    @FXML
    private TextField txtRetirarDinero;

    @FXML
    private TextField txtmontoaEnviar;

    private UsuarioObservable usuarioObservable;

    public void inicializarUsuario(Usuario usuario) {
        usuarioObservable = new UsuarioObservable(usuario);
        usuarioObservable.agregarObservador(new AlertaObserver());
    }

    public void ejemploDeUso() {
        usuarioObservable.notificarCambio("realizó una transferencia");
    }
    @FXML
    void initialize() {
        assert btnEnviarDinero != null : "fx:id=\"btnEnviarDinero\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert btnRetirarDinero != null : "fx:id=\"btnRetirarDinero\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert colCategoria != null : "fx:id=\"colCategoria\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert colCuentaDestino != null : "fx:id=\"colCuentaDestino\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert colCuentaOrigen != null : "fx:id=\"colCuentaOrigen\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert colDescripcion != null : "fx:id=\"colDescripcion\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert colFechaTrans != null : "fx:id=\"colFechaTrans\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert colIdTrans != null : "fx:id=\"colIdTrans\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert colTipo != null : "fx:id=\"colTipo\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert colValorTransferido != null : "fx:id=\"colValorTransferido\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert lblBilleteraVirtual != null : "fx:id=\"lblBilleteraVirtual\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert lblLogintl != null : "fx:id=\"lblLogintl\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert lblinfoestadodecuenta != null : "fx:id=\"lblinfoestadodecuenta\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert lblinfonumerocuenta != null : "fx:id=\"lblinfonumerocuenta\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert lblinfotipodecuenta != null : "fx:id=\"lblinfotipodecuenta\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert tablaGestioncuentasu != null : "fx:id=\"tablaGestioncuentasu\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert txtNumerocuentaEnviar != null : "fx:id=\"txtNumerocuentaEnviar\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert txtRetirarDinero != null : "fx:id=\"txtRetirarDinero\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";
        assert txtmontoaEnviar != null : "fx:id=\"txtmontoaEnviar\" was not injected: check your FXML file 'GestionCuentasUsuario.fxml'.";

    }

}
