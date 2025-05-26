package co.edu.uniquindio.proyecto.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
public class PresupuestoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> categoriaComboBox;

    @FXML
    private ComboBox<?> categoriaComboBox1;

    @FXML
    private TableColumn<?, ?> colCategoria;

    @FXML
    private TableColumn<?, ?> colCuentaDestino;

    @FXML
    private TableColumn<?, ?> colCuentaOrigen;

    @FXML
    private TableColumn<?, ?> colFechaTrans;

    @FXML
    private TableColumn<?, ?> colIdTrans;

    @FXML
    private TableColumn<?, ?> colValorTransferido;

    @FXML
    private TextField cuentaOrigenField;

    @FXML
    private Label lblSubtitulo;

    @FXML
    private Label lblTitulo;

    @FXML
    private TextField montoField;

    @FXML
    private TableView<?> tablaTransacciones;

    @FXML
    void initialize() {}
}
