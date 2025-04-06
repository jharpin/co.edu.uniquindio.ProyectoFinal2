module co.edu.uniquindio.gestionempleadofx.proyecto {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens co.edu.uniquindio.proyecto to javafx.fxml;
    exports co.edu.uniquindio.proyecto;
    opens co.edu.uniquindio.proyecto.viewController to javafx.fxml;
    exports co.edu.uniquindio.proyecto.viewController;

}