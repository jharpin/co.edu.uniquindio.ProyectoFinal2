package co.edu.uniquindio.proyecto.services;

import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.model.Usuario;

import java.util.List;

public interface IGestionBMapping {
    List<UsuarioDto> getUsuarioDto(List<Usuario> listaUsuarios);
    UsuarioDto UsuarioToUsuarioDto(Usuario usuario);
    Usuario usuarioDtoToUsuario(UsuarioDto usuarioto);


}
