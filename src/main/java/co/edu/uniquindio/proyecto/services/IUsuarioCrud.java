package co.edu.uniquindio.proyecto.services;

import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.model.builder.UsuarioBuilder;

import java.util.List;

public interface IUsuarioCrud {
    boolean crearUsuario(UsuarioDto Usuario);
    boolean eliminarUsuario(String idUsuario);
    List<UsuarioDto> obtenerUsuario();
}
