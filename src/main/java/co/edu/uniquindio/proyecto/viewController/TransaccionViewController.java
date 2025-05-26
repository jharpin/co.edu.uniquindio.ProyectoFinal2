package co.edu.uniquindio.proyecto.viewController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TransaccionViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnenviarDinero;

    @FXML
    private TableColumn<?, ?> colFechaTrans;

    @FXML
    private TableColumn<?, ?> colIdTrans;

    @FXML
    private TableColumn<?, ?> colValorTransferido;

    @FXML
    private TableColumn<?, ?> colnumeroCuenta;

    @FXML
    private Label lblBilleteraVirtual2;

    @FXML
    private Label lblRegistroTl2;

    @FXML
    private Label lblnumerocuenta;

    @FXML
    private Label lblvaloratrans;

    @FXML
    private TableView<?> tableTransaccion;

    @FXML
    private TextField txtnumerocuenta;

    @FXML
    private TextField txtvaloraTransf;

    @FXML
    void onEnviar(ActionEvent event) {}
}
