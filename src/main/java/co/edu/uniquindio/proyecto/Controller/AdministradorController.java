package co.edu.uniquindio.proyecto.Controller;
import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.mapping.dto.Administradordto;

public class AdministradorController {
    ModelFactory modelFactory;

    public AdministradorController(ModelFactory modelFactory) {
        modelFactory = ModelFactory.getInstance();
    }

    public List<Administradordto> obtenerAdministrador() {
        return (List<Administradordtoo>) modelFactory.Administradordto();
    }
}
