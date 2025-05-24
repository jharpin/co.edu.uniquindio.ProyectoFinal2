package co.edu.uniquindio.proyecto.patrones.proxy;

import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.services.IAutentificador;

import java.util.ArrayList;
import java.util.List;

public class LoginService implements IAutentificador {
    private List<Usuario> usuarios = new ArrayList<>();

    public LoginService() {
        usuarios.add(new Usuario("admin123","admi","admin@admin.com",null,"admi12345."));
    }

    @Override
    public Usuario iniciarSesion(String identificacion, String contrasena) {
        for (Usuario u : usuarios) {
            if (u.iniciarSesion(identificacion, contrasena)) return u;
        }
        return null;
    }


}
