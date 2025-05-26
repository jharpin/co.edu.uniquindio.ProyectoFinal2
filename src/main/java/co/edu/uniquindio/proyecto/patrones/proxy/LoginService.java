package co.edu.uniquindio.proyecto.patrones.proxy;

import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.model.GestionBilletera;
import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.services.IAutentificador;

import java.util.ArrayList;
import java.util.List;

public class LoginService implements IAutentificador {

    ModelFactory modelfactory;
    private List<Usuario> usuarios;

    public LoginService() {
        modelfactory = ModelFactory.getInstance();
        usuarios = modelfactory.obtenerListaUsuarios();
        usuarios.add(new Usuario("admin123","admi","admin@admin.com",null,"admi12345."));
    }



    @Override
    public Usuario iniciarSesion(String identificacion, String contrasena) {
        for (Usuario u : usuarios) {
            if (u.getIdUsuario().equalsIgnoreCase(identificacion) || u.getContraseniaUsuario().equalsIgnoreCase(contrasena)) {
                return u;
            }
        }
        return null;
    }



}
