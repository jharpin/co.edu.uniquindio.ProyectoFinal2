package co.edu.uniquindio.proyecto.patrones.proxy;

import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.services.IAutentificador;

public class LoginProxy implements IAutentificador{
    private LoginService loginService = new LoginService();

    @Override
    public Usuario iniciarSesion(String identificacion, String contrasena){
        System.out.println("Intentando autenticación para: " + identificacion);

        Usuario usuario = loginService.iniciarSesion(identificacion, contrasena);

        if (usuario == null) {
            System.out.println(" Acceso denegado: usuario no válido.");
            return null;
        //}

        //if (usuario.isAdmin()) {
            //System.out.println(" Acceso concedido como ADMIN.");
        } else {
            System.out.println(" Acceso concedido como USUARIO.");
        }

        return usuario;
    }


}
