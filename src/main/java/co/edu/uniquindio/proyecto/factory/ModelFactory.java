package co.edu.uniquindio.proyecto.factory;

import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.mapping.mappers.ProyectoMappingImpl;
import co.edu.uniquindio.proyecto.model.GestionBilletera;
import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.model.builder.UsuarioBuilder;
import co.edu.uniquindio.proyecto.services.IModelFactoryServices;
import co.edu.uniquindio.proyecto.services.IProyectoMapping;
import co.edu.uniquindio.proyecto.utils.DataUtil;

import java.util.List;

public class ModelFactory implements IModelFactoryServices {

    private Usuario usuarioActivo;
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

    public Usuario getUsuarioActivo() {
        return usuarioActivo;
    }
    public void setUsuarioActivo(Usuario usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

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
    public boolean actualizarUsuario(Usuario usuario) {

        return gestionBilletera.actualizarUsuario(usuario);
    }


    public List<Usuario> obtenerListaUsuarios() {
        return gestionBilletera.getListaUsuarios();
    }
    public boolean verificarIdExistente(String id) {
        return obtenerListaUsuarios().stream().anyMatch(u -> u.getIdUsuario().equals(id));
    }

}
