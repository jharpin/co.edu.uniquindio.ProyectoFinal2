package co.edu.uniquindio.proyecto.viewController;

import co.edu.uniquindio.proyecto.model.Cuenta;
import co.edu.uniquindio.proyecto.model.Transaccion;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class ConsultarTransaccionViewController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

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
    private TableColumn<?, ?> colTipo;

    @FXML
    private TableColumn<?, ?> colValorTransferido;

    @FXML
    private Button filtrarButton;

    @FXML
    private DatePicker filtroFechaPicker;

    @FXML
    private ComboBox<?> filtroTipoComboBox;

    @FXML
    private Label lblSubtitulo;

    @FXML
    private Label lblTitulo;

    @FXML
    private TableView<?> tablaTransacciones;

    @FXML
    private Button verDetallesButton;

    @FXML
    void initialize() {}}