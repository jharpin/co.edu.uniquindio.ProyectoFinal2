package co.edu.uniquindio.proyecto.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ActualizarDatosAdmiviewController {
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
    private Hyperlink linkCerrar;

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
    void ActualizarDatosAdmi(ActionEvent event) {

    }

    @FXML
    void initialize() {}
}
