package co.edu.uniquindio.proyecto.mapping.mappers;

import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.services.IProyectoMapping;

import java.util.ArrayList;
import java.util.List;

public class ProyectoMappingImpl implements IProyectoMapping {

    @Override
    public List<UsuarioDto> getUsuarioDtos(List<Usuario> listaUsuarios) {
        if (listaUsuarios == null) {
            return null;
        }
        List<UsuarioDto> listaUsuariosDto = new ArrayList<UsuarioDto>(listaUsuarios.size());
        for (Usuario usuario : listaUsuarios) {
            listaUsuariosDto.add(usuarioToUsuarioDto(usuario));
        }
        return listaUsuariosDto;
    }

    @Override
    public UsuarioDto usuarioToUsuarioDto(Usuario usuario) {
        return new UsuarioDto(
                usuario.getNombreUsuario(),
                usuario.getIdUsuario(),
                usuario.getContraseniaUsuario(),
                usuario.getEmailUsuario(),
                usuario.getTelefonoUsuario());
    }

    @Override
    public Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto) {
        return Usuario.builder()
                .nombreUsuario(usuarioDto.nombreUsuario())
                .idUsuario(usuarioDto.idUsuario())
                .contraseniaUsuario(usuarioDto.contraseniaUsuario())
                .emailUsuario(usuarioDto.emailUsuario())
                .telefonoUsuario(usuarioDto.telefonoUsuario())
                .build();
    }
}

