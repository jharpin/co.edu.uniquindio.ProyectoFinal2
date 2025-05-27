package co.edu.uniquindio.proyecto.Controller;

import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.mapping.dto.TransaccionDto;
import co.edu.uniquindio.proyecto.model.Categoria;

import java.util.ArrayList;

public class CategoriaController {
    ModelFactory modelFactory;
    public CategoriaController() {modelFactory=ModelFactory.getInstance();}
    public ArrayList<Categoria> obtenerCategoria(){
        return modelFactory.obtenerCategoria();}
    public boolean CrearTransaccion(TransaccionDto transaccion){
        return modelFactory.crearTransaccion(transaccion);
    }
}


