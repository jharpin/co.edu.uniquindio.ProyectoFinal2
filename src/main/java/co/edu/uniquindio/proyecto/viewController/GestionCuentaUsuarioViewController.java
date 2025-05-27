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

    }

}
