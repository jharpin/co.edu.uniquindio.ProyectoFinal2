package co.edu.uniquindio.proyecto.patrones.proxy;

import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.model.Validador;
import co.edu.uniquindio.proyecto.services.IAutentificador;

public class LoginProxy implements IAutentificador {

    private IAutentificador autentificador;

    public LoginProxy(IAutentificador autentificador) {
        this.autentificador = autentificador;
    }

    @Override
    public UsuarioDto iniciarSesionA(String identificacion, String contrasena) {
        System.out.println("Intentando autenticación para: " + identificacion);

        UsuarioDto usuario = autentificador.iniciarSesionA(identificacion, contrasena);

        if (usuario == null) {
            System.out.println(" Acceso denegado: usuario no válido.");
            return null;
        } else {
            System.out.println(" Acceso concedido como USUARIO.");
        }
        return usuario;
    }

    public boolean autenticar(String idUsuario, String contraseniaUsuario) {
        Validador validador = new Validador();

        // Validación estricta del administrador
        if (validador.validarAdministrador(idUsuario, contraseniaUsuario)) {
            System.out.println("Administrador autenticado.");
            return true;
        }

        // Rechazar si alguien intenta usar la clave del admin con otro correo
        if (contraseniaUsuario.equals("admin123")) {
            System.out.println("Clave del administrador usada por un usuario no autorizado.");
            return false;
        }


        return false;
    }
}