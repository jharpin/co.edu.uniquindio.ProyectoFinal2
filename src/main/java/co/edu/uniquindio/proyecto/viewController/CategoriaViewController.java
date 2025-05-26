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

public class CategoriaViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizarCategoria;

    @FXML
    private Button btnCrearCategoria;

    @FXML
    private Button btnEliminarCategoria;

    @FXML
    private TableColumn<?, ?> colDescripcion;

    @FXML
    private TableColumn<?, ?> colNombreCategoria;

    @FXML
    private TableColumn<?, ?> colidCategoria;

    @FXML
    private Label lblIdeCategoria;

    @FXML
    private Label lblSubtitulo;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lbldescripcion;

    @FXML
    private Label lblnombreCategoria;

    @FXML
    private TableView<?> tablaTransacciones;

    @FXML
    private TextField txtDescripcionCateg;

    @FXML
    private TextField txtIdeCategoria;

    @FXML
    private TextField txtnombreCategoria;

    @FXML
    void onActualizar(ActionEvent event) {

    }

    @FXML
    void onCrear(ActionEvent event) {

    }

    @FXML
    void onEliminarCategoria(ActionEvent event) {

    }

    @FXML
    void initialize() {}
}
