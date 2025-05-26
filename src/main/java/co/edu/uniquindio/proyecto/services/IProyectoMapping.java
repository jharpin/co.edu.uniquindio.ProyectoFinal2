package co.edu.uniquindio.proyecto.services;

import co.edu.uniquindio.proyecto.mapping.dto.TransaccionDto;
import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.model.Transaccion;
import co.edu.uniquindio.proyecto.model.Usuario;

import java.util.List;

public interface IProyectoMapping {
    List<UsuarioDto> getUsuarioDtos(List<Usuario> usuarios);
    UsuarioDto usuarioToUsuarioDto(Usuario usuario);
    Usuario usuarioDtoToUsuario(UsuarioDto usuario);
    List<TransaccionDto>getTransaccionDtos(List<Transaccion> transacciones);
    TransaccionDto transaccionToTransaccionDto(Transaccion transaccion);
    Transaccion transaccionDtoToTransaccion(TransaccionDto transaccionDto);
}
