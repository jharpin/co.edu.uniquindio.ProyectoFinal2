package co.edu.uniquindio.proyecto.viewController;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyecto.Controller.CategoriaController;
import co.edu.uniquindio.proyecto.mapping.dto.CategoriaDto;
import co.edu.uniquindio.proyecto.mapping.dto.TransaccionDto;
import co.edu.uniquindio.proyecto.model.Categoria;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CategoriaViewController {
    CategoriaController categoriaController;
    ObservableList<CategoriaDto> listaOriginal = FXCollections.observableArrayList();
    ObservableList<CategoriaDto> listaCategorias = FXCollections.observableArrayList();

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
    private TableColumn<CategoriaDto, String> colDescripcion;
    @FXML
    private TableColumn<CategoriaDto, String> colNombreCategoria;
    @FXML
    private TableColumn<CategoriaDto, String> colidCategoria;
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
    private TableView<CategoriaDto> tablaCategorias;
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
    void initialize() {
        categoriaController = new CategoriaController();
        cargarCategorias();
    }
    private void cargarCategorias() {
        List<CategoriaDto> categorias = categoriaController.obtenerCategoria();
        listaCategorias.setAll(categorias);
        listaOriginal.setAll(categorias);
        tablaCategorias.setItems(listaOriginal);
    }


}
