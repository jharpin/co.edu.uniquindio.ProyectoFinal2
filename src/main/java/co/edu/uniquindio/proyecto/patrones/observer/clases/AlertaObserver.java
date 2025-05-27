package co.edu.uniquindio.proyecto.patrones.observer.clases;

import co.edu.uniquindio.proyecto.patrones.observer.interfaces.Observer;
import javafx.scene.control.Alert;

public class AlertaObserver implements Observer {

    @Override
    public void update(String mensaje) {
        // Imprimir en consola
        System.out.println("🔔 ALERTA: " + mensaje);

        // También mostrar visualmente en JavaFX
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Notificación");
        alert.setHeaderText("Mensaje del sistema");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
