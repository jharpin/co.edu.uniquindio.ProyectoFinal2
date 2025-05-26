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
                .idUsuario("2")
                .nombreUsuario("jhonatan")
                .emailUsuario("jhonatan@gmail.com")
                .telefonoUsuario("123456789")
                .contraseniaUsuario("14")
                .build();

        Usuario usuario3 = Usuario.builder()
                .idUsuario("admi")
                .nombreUsuario("admin123")
                .emailUsuario("admin@admin.com")
                .telefonoUsuario(null)
                .contraseniaUsuario("admi12345.")
                .build();
        gestionBilletera.getListaUsuarios().add(usuario3);
        gestionBilletera.getListaUsuarios().add(usuario2);
        gestionBilletera.getListaUsuarios().add(usuario1);

        return gestionBilletera;

    }
}
