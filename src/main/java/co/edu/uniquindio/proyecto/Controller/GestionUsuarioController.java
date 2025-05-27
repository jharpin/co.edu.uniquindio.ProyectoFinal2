package co.edu.uniquindio.proyecto.Controller;

import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.model.Usuario;

import java.util.List;

public class GestionUsuarioController {
    ModelFactory modelFactory;

    public GestionUsuarioController(){modelFactory= ModelFactory.getInstance();}

    public List<UsuarioDto> obtnerUsuario(){return modelFactory.obtenerUsuario();}

    public boolean agregarUsuario(UsuarioDto usuario){
        return modelFactory.agregarUsuario(usuario);
    }

    public boolean eliminarUsuario(String id){return modelFactory.eliminarUsuario(id);}

    public boolean actualizarUsuario(UsuarioDto usuario){return modelFactory.actualizarUsuario(usuario);}

    public List<Usuario> obtenerListaUsuarios(){return modelFactory.obtenerListaUsuarios();}
}
