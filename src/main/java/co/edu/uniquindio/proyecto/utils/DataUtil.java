package co.edu.uniquindio.proyecto.utils;

import co.edu.uniquindio.proyecto.model.GestionBilletera;
import co.edu.uniquindio.proyecto.model.Usuario;

public class DataUtil {
    public static GestionBilletera inicializarDatos(){
        GestionBilletera gestionBilletera = GestionBilletera.getInstance();

        // Verifica que solo se inicialice una vez
        if (!gestionBilletera.getListaUsuarios().isEmpty()) return gestionBilletera;

        Usuario usuario1 = Usuario.builder()
                .idUsuario("1")
                .nombreUsuario("jhonatan")
                .emailUsuario("jhonatan@gmail.com")
                .telefonoUsuario("123456789")
                .contraseniaUsuario("1")
                .direccion("av colon")
                .saldo(2)
                .build();

        Usuario usuario2 = Usuario.builder()
                .idUsuario("2")
                .nombreUsuario("Laura")
                .emailUsuario("laura@gmail.com")
                .telefonoUsuario("987654321")
                .contraseniaUsuario("1234")
                .build();

        Usuario usuario3 = Usuario.builder()
                .idUsuario("admi")
                .nombreUsuario("admin123")
                .emailUsuario("admin@admin.com")
                .telefonoUsuario(null)
                .contraseniaUsuario("admi12345.")
                .build();

        gestionBilletera.getListaUsuarios().add(usuario1);
        gestionBilletera.getListaUsuarios().add(usuario2);
        gestionBilletera.getListaUsuarios().add(usuario3);
        return gestionBilletera;
    }
}


