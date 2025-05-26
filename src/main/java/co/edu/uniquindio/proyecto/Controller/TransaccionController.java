package co.edu.uniquindio.proyecto.Controller;

import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.mapping.dto.TransaccionDto;

import java.util.List;

public class TransaccionController {
    ModelFactory modelFactory;
    public TransaccionController() {modelFactory=ModelFactory.getInstance();}
    public List<TransaccionDto>obtenerTransacciones(){
        return modelFactory.obtenerTransacciones();}
    public boolean CrearTransaccion(TransaccionDto transaccion){
        return modelFactory.crearTransaccion(transaccion);
    }
}
