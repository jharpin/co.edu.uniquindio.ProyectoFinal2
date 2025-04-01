package co.edu.uniquindio.gestionempleadofx.proyecto.Controller;
import co.edu.uniquindio.gestionempleadofx.proyecto.factory.ModelFactory;
import co.edu.uniquindio.gestionempleadofx.proyecto.model.Administrador;
import co.edu.uniquindio.gestionempleadofx.proyecto.mapping.dto.Administradordto;

import java.util.List;

public class AdministradorController {
    ModelFactory modelFactory;

    public AdministradorController(ModelFactory modelFactory) {
        modelFactory = ModelFactory.getInstance();
    }

    public List<Administradordto> obtenerAdministrador() {
        //return (List<Administradordtoo>) modelFactory.Administradordto();
    }

}
