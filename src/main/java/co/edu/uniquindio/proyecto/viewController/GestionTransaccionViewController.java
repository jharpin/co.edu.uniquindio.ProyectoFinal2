package co.edu.uniquindio.proyecto.viewController;

import co.edu.uniquindio.proyecto.model.Cuenta;
import co.edu.uniquindio.proyecto.model.Transaccion;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class GestionTransaccionViewController {
    @FXML
    private ComboBox<Cuenta> cmbCuentaOrigen;

    @FXML
    private ComboBox<Cuenta> cmbCuentaDestino;

    @FXML
    private TextField txtMonto;

    @FXML
    private ComboBox<String> cmbTipoTransaccion;

    @FXML
    private ComboBox<String> cmbCategoria;

    @FXML
    private TextArea txtDescripcion;

    @FXML
    private TableView<Transaccion> tablaTransacciones;

    @FXML
    private TableColumn<Transaccion, String> colCuentaOrigen;
}
