package co.edu.uniquindio.proyecto.services;

import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.model.builder.UsuarioBuilder;

public interface IUsuarioCrud {
    boolean crearUsuario(UsuarioBuilder NuevoUsuario);
    boolean eliminarUsuario(String idUsuario);
   // boolean ActualizarUsuario();
    Usuario obtenerUsuario(String idUsuario);
}
