package co.edu.uniquindio.proyecto.factory;

import co.edu.uniquindio.proyecto.mapping.dto.TransaccionDto;
import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.mapping.mappers.ProyectoMappingImpl;
import co.edu.uniquindio.proyecto.model.GestionBilletera;
import co.edu.uniquindio.proyecto.model.Transaccion;
import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.model.builder.UsuarioBuilder;
import co.edu.uniquindio.proyecto.services.IModelFactoryServices;
import co.edu.uniquindio.proyecto.services.IProyectoMapping;
import co.edu.uniquindio.proyecto.utils.DataUtil;

import java.util.List;

public class ModelFactory implements IModelFactoryServices {

    private static ModelFactory modelFactory;
    private GestionBilletera gestionBilletera;
    private IProyectoMapping mapper;

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private ModelFactory() {
        mapper=new ProyectoMappingImpl();
        gestionBilletera = DataUtil.inicializarDatos();
    }

    @Override
    public boolean crearUsuario(UsuarioDto usuario) {
        Usuario usuario1 = mapper.usuarioDtoToUsuario(usuario);
        return gestionBilletera.crearUsuario(usuario1);
    }
@Override
public boolean crearTransaccion(TransaccionDto transaccion){
    Transaccion transaccion1=mapper.transaccionDtoToTransaccion(transaccion);
    return gestionBilletera.crearTransaccion(transaccion1);
};

    @Override
    public boolean eliminarUsuario(String idUsuario) {
        return false;
    }

    @Override
    public boolean agregarCuenta() {
        return false;
    }

    @Override
    public boolean eliminarCuenta() {
        return false;
    }

    @Override
    public boolean actualizarCuenta() {
        return false;
    }

    @Override
    public List<UsuarioDto> obtenerUsuario() {
        return mapper.getUsuarioDtos(gestionBilletera.getListaUsuarios());
    }
@Override
public List<TransaccionDto>obtenerTransacciones(){
        return mapper.getTransaccionDtos(gestionBilletera.getListaTransacciones());
}
    @Override
    public void mostrarInfoBilletera() {

    }

    @Override
    public List<UsuarioDto> obtenerUsuarios() {
        return List.of();
    }

    @Override
    public boolean mostrarListaUsuarios() {
        return false;
    }

    @Override
    public boolean mostrarListaBanco() {
        return false;
    }

    @Override
    public boolean agregarUsuario(UsuarioDto usuariodto) {
        return false;
    }

    @Override
    public boolean actualizarUsuario(UsuarioDto usuariodto) {
        return false;
    }
    public List<Usuario> obtenerListaUsuarios() {
        return gestionBilletera.getListaUsuarios();
    }
    public boolean verificarIdExistente(String id) {
        return obtenerListaUsuarios().stream().anyMatch(u -> u.getIdUsuario().equals(id));
    }

}
