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
        usuarios = modelfactory.getGestionBilletera().getListaUsuarios();
        usuarios.add(new Usuario("admin123","admi","admin@admin.com",null,"admi12345."));
    }



    @Override
    public Usuario iniciarSesionA(String idUsuario, String contraseniaUsuario) {
        System.out.println("Intentando autenticación para: " + idUsuario);

        IAutentificador login = new LoginProxy(new LoginService());
        Usuario usuario = login.iniciarSesionA(idUsuario, contraseniaUsuario);
        if (usuario == null) {
            System.out.println("Acceso denegado: usuario no válido.");
            return null;
        }

        // Verifica si es administrador y si tiene la contraseña correcta
        if ("admini".equals(usuario.getIdUsuario())) {
            if (!"admin123".equals(contraseniaUsuario)) {
                System.out.println("Contraseña incorrecta para el administrador.");
                return null;
            }
        }

        return usuario;
    }




}
