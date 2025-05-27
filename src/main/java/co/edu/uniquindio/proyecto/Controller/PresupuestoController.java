package co.edu.uniquindio.proyecto.Controller;

import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.mapping.dto.PresupuestoDto;

import java.util.List;

public class PresupuestoController {
    ModelFactory modelFactory;
    public  PresupuestoController() {modelFactory = ModelFactory.getInstance();}
    public List<PresupuestoDto> obtenerPresupuestos(){
        return modelFactory.obtenerPresupuestos();
    }
}
