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


        gestionBilletera.getListaUsuarios().add(usuario1);

        return gestionBilletera;

    }
}
