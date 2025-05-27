package co.edu.uniquindio.proyecto.Controller;

import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.mapping.dto.CategoriaDto;
import co.edu.uniquindio.proyecto.mapping.dto.TransaccionDto;

import java.util.List;

public class CategoriaController {
    ModelFactory modelFactory;
    public CategoriaController() {modelFactory=ModelFactory.getInstance();}
    public List<CategoriaDto> obtenerCategoria(){
        return modelFactory.obtenerCategoria();}
    public boolean CrearTransaccion(TransaccionDto transaccion){
        return modelFactory.crearTransaccion(transaccion);
    }
}


