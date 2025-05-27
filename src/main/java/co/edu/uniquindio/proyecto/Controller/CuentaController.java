package co.edu.uniquindio.proyecto.Controller;

import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.mapping.dto.CategoriaDto;
import co.edu.uniquindio.proyecto.mapping.dto.CuentaDto;

import java.util.List;

public class CuentaController {
    ModelFactory modelFactory;
    public CuentaController() {modelFactory=ModelFactory.getInstance();}
    public List<CuentaDto> obtenerCuenta(){
        return modelFactory.obtenerCategoria();
    }
    public boolean CrearCategoria(CategoriaDto categoria){
        return modelFactory.crearCategoria(categoria);
    }

}
