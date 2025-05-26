package co.edu.uniquindio.proyecto.Controller;

import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.model.Usuario;

public class PerfilController {
    private UsuarioDto usuarioActual;

    ModelFactory modelFactory;
    public PerfilController() {modelFactory=ModelFactory.getInstance();}

    public void setUsuarioActual(UsuarioDto usuario) {
        this.usuarioActual = usuario;

    }
}
