package co.edu.uniquindio.proyecto.viewController;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyecto.Controller.EstadisticasController;
import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.model.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class EstadisticasviewController  {

    EstadisticasController estadisticasController;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblBilleteraVirtual;

    @FXML
    private Label lblLogintl;
    @FXML
    private BarChart<String, Number> barChart;

    @FXML
    void initialize() {
        estadisticasController = new EstadisticasController();
        assert lblBilleteraVirtual != null : "fx:id=\"lblBilleteraVirtual\" was not injected: check your FXML file 'EstadisticasGraficasAdmi.fxml'.";
        assert lblLogintl != null : "fx:id=\"lblLogintl\" was not injected: check your FXML file 'EstadisticasGraficasAdmi.fxml'.";

    }


    private void cargarEstadisticasSaldos() {
        List<UsuarioDto> usuarios = estadisticasController.obtenerListaUsuarios();

        int rango1 = 0;
        int rango2 = 0;
        int rango3 = 0;
        int rango4 = 0;

        for (UsuarioDto usuario : usuarios) {
            double saldo = usuario.saldo();
            if (saldo <= 1000) {
                rango1++;
            } else if (saldo <= 5000) {
                rango2++;
            } else if (saldo <= 10000) {
                rango3++;
            } else {
                rango4++;
            }
        }

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Usuarios por Rango de Saldo");

        series.getData().add(new XYChart.Data<>("0 - 100", rango1));
        series.getData().add(new XYChart.Data<>("101 - 500", rango2));
        series.getData().add(new XYChart.Data<>("501 - 1000", rango3));
        series.getData().add(new XYChart.Data<>("> 1000", rango4));

        barChart.getData().add(series);
    }
}




