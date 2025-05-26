package co.edu.uniquindio.proyecto.mapping.mappers;

import co.edu.uniquindio.proyecto.mapping.dto.CategoriaDto;
import co.edu.uniquindio.proyecto.mapping.dto.TransaccionDto;
import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;

import co.edu.uniquindio.proyecto.model.Categoria;
import co.edu.uniquindio.proyecto.model.Transaccion;
import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.services.IProyectoMapping;

import java.util.ArrayList;
import java.util.List;

public class ProyectoMappingImpl implements IProyectoMapping {
    @Override
    public List<CategoriaDto> getCategoriaDtos(List<Categoria> listaCategoria) {
        if(listaCategoria==null){
            return null;
        }
        List<CategoriaDto> CategoriaDto = new ArrayList<CategoriaDto>(listaCategoria.size());
        for (Categoria categoria : listaCategoria) {
            CategoriaDto.add(categoriaToCategoriaDto(categoria));
        }
        return CategoriaDto;
    }


    @Override
    public List<TransaccionDto> getTransaccionDtos(List<Transaccion> listaTransacciones) {
        if(listaTransacciones==null){
            return null;
        }
        List<TransaccionDto> transaccionesDto = new ArrayList<TransaccionDto>(listaTransacciones.size());
        for (Transaccion transaccion : listaTransacciones) {
            transaccionesDto.add(transaccionToTransaccionDto(transaccion));
        }
        return transaccionesDto;
    }



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
    public TransaccionDto transaccionToTransaccionDto(Transaccion transaccion) {
        return new TransaccionDto(
                transaccion.getId()
                ,transaccion.getCuentaOrigen()
                ,transaccion.getCuentaDestino()
                ,transaccion.getMonto()
                ,transaccion.getFecha()
                ,transaccion.getTipo()
                ,transaccion.getCategoria()
                ,transaccion.getDescripcion()
        );
    }

    @Override
    public UsuarioDto usuarioToUsuarioDto(Usuario usuario) {
        return new UsuarioDto(
                usuario.getNombreUsuario()
                ,usuario.getIdUsuario()
                , usuario.getEmailUsuario()
                , usuario.getTelefonoUsuario()
                , usuario.getContraseniaUsuario()
        );

    }
    @Override
    public Transaccion transaccionDtoToTransaccion(TransaccionDto transaccionDto) {
        return Transaccion.builder()
                .id(transaccionDto.id())
                .categoria(transaccionDto.categoria())
                .descripcion(transaccionDto.descripcion())
                .monto(transaccionDto.monto())
                .fecha(transaccionDto.fecha())
                .tipo(transaccionDto.tipo())
                .cuentaOrigen(transaccionDto.cuentaOrigen())
                .cuentaDestino(transaccionDto.cuentaDestino())
                .build();
    }

    @Override
    public CategoriaDto categoriaToCategoriaDto(Categoria categoria) {
        return null;
    }

    @Override
    public Categoria categoriaDtoToCategoria(CategoriaDto categoriaDto) {
        return null;
    }

    @Override
    public Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto) {
        return Usuario.builder()
                .nombreUsuario(usuarioDto.nombreUsuario())
                .idUsuario(usuarioDto.idUsuario())
                .emailUsuario(usuarioDto.emailUsuario())
                .telefonoUsuario(usuarioDto.telefonoUsuario())
                .contraseniaUsuario(usuarioDto.contraseniaUsuario())
                .build();
    }




}