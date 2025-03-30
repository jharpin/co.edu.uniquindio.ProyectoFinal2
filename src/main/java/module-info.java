module co.edu.uniquindio.gestionempleadofx.proyecto {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens co.edu.uniquindio.gestionempleadofx.proyecto to javafx.fxml;
    exports co.edu.uniquindio.gestionempleadofx.proyecto;
}