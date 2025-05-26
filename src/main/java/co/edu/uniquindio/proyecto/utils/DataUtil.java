package co.edu.uniquindio.proyecto.utils;

import co.edu.uniquindio.proyecto.model.GestionBilletera;
import co.edu.uniquindio.proyecto.model.Usuario;

public class DataUtil {
    public static GestionBilletera inicializarDatos(){

        GestionBilletera gestionBilletera = new GestionBilletera();

        Usuario usuario1 = Usuario.builder()
                .idUsuario("1")
                .nombreUsuario("jhonatan")
                .emailUsuario("jhonatan@gmail.com")
                .telefonoUsuario("123456789")
                .contraseniaUsuario("1")
                .build();

        Usuario usuario2 = Usuario.builder()
                .idUsuario("11")
                .nombreUsuario("admi")
                .emailUsuario("admin@admin.com")
                .telefonoUsuario("3113775851")
                .contraseniaUsuario("11")
                .dinero(12)
                .build();

        gestionBilletera.getListaUsuarios().add(usuario2);
        gestionBilletera.getListaUsuarios().add(usuario1);

        return gestionBilletera;

    }
}
