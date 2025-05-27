package co.edu.uniquindio.proyecto.Controller;

import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.model.GestionBilletera;
import co.edu.uniquindio.proyecto.model.Usuario;

import java.util.List;

public class UsuarioController {
    ModelFactory modelFactory;
    public UsuarioController() {modelFactory=ModelFactory.getInstance();}
    public List<UsuarioDto>obtenerUsuarios(){
        return modelFactory.obtenerUsuario();}
    public boolean crearUsuario(UsuarioDto usuario){
        return modelFactory.crearUsuario(usuario);
    }

    public boolean actualizarUsuario(Usuario usuario) {
        return modelFactory.actualizarUsuario(usuario);
    }
}
