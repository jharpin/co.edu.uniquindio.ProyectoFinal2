package co.edu.uniquindio.proyecto.Controller;

import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;

import java.util.List;

public class EstadisticasController {
    ModelFactory modelFactory;
    public EstadisticasController(){modelFactory.getInstance();}
    public List<UsuarioDto> obtenerListaUsuarios(){
        return modelFactory.obtenerUsuario();
    }
}
