package co.edu.uniquindio.proyecto.viewController;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyecto.Controller.PresupuestoController;
import co.edu.uniquindio.proyecto.Controller.TransaccionController;
import co.edu.uniquindio.proyecto.mapping.dto.PresupuestoDto;
import co.edu.uniquindio.proyecto.model.Categoria;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PresupuestoViewController {
    PresupuestoController presupuestoController;
    ObservableList<PresupuestoDto> listaPresupuestos = FXCollections.observableArrayList();
    PresupuestoDto presupuestoSeleccionado;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bntAgregarPresupuesto;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnEliminarPresupuesto;

    @FXML
    private TableColumn<PresupuestoDto, Categoria> colCategoria;

    @FXML
    private TableColumn<PresupuestoDto, String> colEstadoP;

    @FXML
    private TableColumn<PresupuestoDto, String> colIde;

    @FXML
    private TableColumn<PresupuestoDto, String> colMontoAsig;

    @FXML
    private TableColumn<PresupuestoDto, String> colMontoGas;

    @FXML
    private TableColumn<PresupuestoDto, String> colnombreP;

    @FXML
    private ComboBox<?> comboCategoria;

    @FXML
    private ComboBox<?> comboEstadoPresupuesto;

    @FXML
    private Label lblCategoria;

    @FXML
    private Label lblEsatdoPresupuesto;

    @FXML
    private Label lblMontoasignado;

    @FXML
    private Label lblSubtitulo;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblmontoAsignado;

    @FXML
    private Label lblnombrePresupuesto;

    @FXML
    private TableView<PresupuestoDto> tablaPresupuesto;

    @FXML
    private TextField txtMontoasignado;

    @FXML
    private TextField txtnombrePresupuesto;

//    @FXML
//    void onActualizar(ActionEvent event) {
//        actualizarPresupuesto();
//    }

//    private void actualizarPresupuesto() {
//        if (presupuestoSeleccionado != null) {
//            PresupuestoDto presupuestoActualizado = crearPresupuestoDto();
//            if (datosValidos(presupuestoActualizado)) {
//                if (PresupuestoController.actualizarPresupuesto(presupuestoActualizado)) {
//                    for (PresupuestoDto presupuesto : listaPresupuestos) {
//                        if (presupuesto.equals(presupuestoSeleccionado)) {
//                            listaPresupuestos.remove(presupuesto);
//                            listaPresupuestos.add(presupuestoActualizado);
//                            break;
//                        }
//                    }
//                    mostrarMensaje("Cliente actualizado", null, "Los datos del cliente han sido actualizados.", Alert.AlertType.INFORMATION);
//                } else {
//
//                    mostrarMensaje("Error", null, "No se pudo actualizar el cliente.", Alert.AlertType.ERROR);
//                }
//            } else {
//
//                mostrarMensaje("Campos incompletos", null, "Por favor, llena todos los campos.", Alert.AlertType.WARNING);
//            }
//        }
//    }

//    private PresupuestoDto crearPresupuestoDto() {
//        return new PresupuestoDto(txtnombrePresupuesto.getText()
//                );
//    }

    @FXML
    void onAgregar(ActionEvent event) {
            agregarPresupuesto();
    }

    private void agregarPresupuesto() {
    }

    @FXML
    void onEliminar(ActionEvent event) {
            eliminarPresupuesto();
    }

    private void eliminarPresupuesto() {
    }

    @FXML
    void initialize() {
        presupuestoController = new PresupuestoController();
        initView();
    }
    private void initView(){
        initDataBinding();
        obtenerPresupuestos();
        tablaPresupuesto.getItems().clear();
        tablaPresupuesto.setItems(listaPresupuestos);
        listenerSelection();
    }


    private void obtenerPresupuestos(){
        listaPresupuestos.addAll(presupuestoController.obtenerPresupuestos());
    }

    private void initDataBinding(){
        colIde.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().idPresupuesto()));
        colnombreP.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombrePresupuesto()));
        colMontoAsig.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().montoAsignado())));
        colMontoGas.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().montoGastado())));

        
        
    }

    private void listenerSelection(){
        tablaPresupuesto.getSelectionModel().selectedItemProperty().addListener((obs,oldSelection,newSelection) -> {
            presupuestoSeleccionado = newSelection;
            mostrarInformacionPresupuesto(presupuestoSeleccionado);
        });
    }
    private void mostrarInformacionPresupuesto(PresupuestoDto presupuestoSeleccionado){
        if(presupuestoSeleccionado !=null){
            txtMontoasignado.setText(String.valueOf(presupuestoSeleccionado.montoAsignado()));
            txtnombrePresupuesto.setText(presupuestoSeleccionado.nombrePresupuesto());

        }
    }
    private boolean datosValidos(PresupuestoDto presupuestoDto) {
        if(presupuestoDto.nombrePresupuesto().isBlank() ||
                presupuestoDto.montoAsignado() == 0.0||
                presupuestoDto.idPresupuesto().isBlank() ||
                presupuestoDto.montoGastado() == 0.0
                ){
            return false;
        }
        return true;
    }
    private void mostrarMensaje(String titulo, String header, String contenido, Alert.AlertType alertType){
        Alert aler = new Alert(alertType);
        aler.setTitle(titulo);
        aler.setHeaderText(header);
        aler.setContentText(contenido);
        aler.showAndWait();
    }
}
