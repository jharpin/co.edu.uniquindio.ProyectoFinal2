package co.edu.uniquindio.proyecto.viewController;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyecto.Controller.CategoriaController;
import co.edu.uniquindio.proyecto.mapping.dto.CategoriaDto;
import co.edu.uniquindio.proyecto.mapping.dto.TransaccionDto;
import co.edu.uniquindio.proyecto.model.Categoria;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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
    public void initialize() {
        categoriaController = new CategoriaController();

        cargarCategorias();

        colidCategoria.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().idCategoria()));
        colNombreCategoria.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().nombreCategoria()));
        colDescripcion.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().descripcionCategoria()));
    }
    @FXML
    void onActualizar(ActionEvent event) {

    }
    private void limpiarCampos() {
        txtIdeCategoria.clear();
        txtnombreCategoria.clear();
        txtDescripcionCateg.clear();
    }
    private void cargarCategorias() {
        List<CategoriaDto> categorias = categoriaController.obtenerCategoria();
        listaCategorias.setAll(categorias);
        listaOriginal.setAll(categorias);
        tablaCategorias.setItems(listaOriginal);
    }
    @FXML
    void onCrear(ActionEvent event) {
            String id = txtIdeCategoria.getText();
            String nombre = txtnombreCategoria.getText();
            String descripcion = txtDescripcionCateg.getText();

        CategoriaDto nueva = new CategoriaDto(id, nombre, descripcion);

        if (categoriaController.CrearCategoria(nueva)) {
            listaCategorias.add(nueva);
            listaOriginal.add(nueva);
            tablaCategorias.setItems(listaCategorias);
            limpiarCampos();
            mostrarAlerta("Éxito", "Categoria registrada correctamente.");
        } else {
            mostrarAlerta("Error", "No se pudo registrar la Categoria.");
        }
    }
    @FXML
    void onEliminarCategoria(ActionEvent event) {

    }



    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }


}
