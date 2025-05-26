package co.edu.uniquindio.proyecto.viewController;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.model.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class DashboardAdministradorViewController {

    private UsuarioDto usuario;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizarDatosAdmi;

    @FXML
    private Label lActualizarAdmi;

    @FXML
    private Label lblActualizar;

    @FXML
    private Label lblActualizarDireccionAd;

    @FXML
    private Label lblBilleteraVirtual;

    @FXML
    private Label lblEmailActualizar;

    @FXML
    private Label lblnombreActualizar;

    @FXML
    private Tab seccionActualizar;

    @FXML
    private TableColumn<?, ?> tablaDatosAdmi;

    @FXML
    private TextField txtDireccionadAct;

    @FXML
    private TextField txtEmailAdmAct;

    @FXML
    private TextField txtNombreAdmActu;

    @FXML
    private TextField txtTelefAdmAct;

    @FXML
    void initialize() {}
}
