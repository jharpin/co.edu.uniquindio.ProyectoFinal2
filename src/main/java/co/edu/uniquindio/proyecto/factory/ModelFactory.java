package co.edu.uniquindio.proyecto.factory;

import co.edu.uniquindio.proyecto.mapping.dto.*;
import co.edu.uniquindio.proyecto.mapping.mappers.ProyectoMappingImpl;
import co.edu.uniquindio.proyecto.model.*;
import co.edu.uniquindio.proyecto.services.IModelFactoryServices;
import co.edu.uniquindio.proyecto.services.IProyectoMapping;
import co.edu.uniquindio.proyecto.utils.DataUtil;

import java.util.List;

public class ModelFactory implements IModelFactoryServices {

    private UsuarioDto usuarioActivo;
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
    public boolean crearTransaccion(TransaccionDto transaccion) {
        Transaccion transaccion1 = mapper.transaccionDtoToTransaccion(transaccion);
        return gestionBilletera.crearTransaccion(transaccion1);
    }
    @Override
    public boolean crearUsuario(UsuarioDto usuario) {
        Usuario usuario1 = mapper.usuarioDtoToUsuario(usuario);
        return gestionBilletera.crearUsuario(usuario1);
    }

    public UsuarioDto getUsuarioActivo() {
        return usuarioActivo;
    }


    public void setUsuarioActivo(UsuarioDto usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    @Override
    public boolean eliminarUsuario(String idUsuario) {
        return gestionBilletera.eliminarUsuario(idUsuario);
    }

    @Override
    public boolean actualizarCuenta(Cuenta cuenta) {
        return gestionBilletera.actualizarCuenta(cuenta);
    }


    @Override
    public List<UsuarioDto> obtenerUsuario() {
        return mapper.getUsuarioDtos(gestionBilletera.getListaUsuarios());
    }

    @Override
    public List<TransaccionDto> obtenerTransacciones() {
        return mapper.getTransaccionDtos(gestionBilletera.getListaTransacciones());
    }

    @Override
    public void mostrarInfoBilletera() {

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
        Usuario usuario = mapper.usuarioDtoToUsuario(usuariodto);
        return  gestionBilletera.crearUsuario(usuario);
    }

    @Override
    public boolean actualizarUsuario(UsuarioDto usuariodto) {

        Usuario usuario = mapper.usuarioDtoToUsuario(usuariodto);

        return gestionBilletera.actualizarUsuario(usuario);
    }


    @Override
    public boolean crearCategoria(CategoriaDto categoria) {
        Categoria categoria1 = mapper.categoriaDtoToCategoria(categoria);
        return gestionBilletera.crearCategoria(categoria1);
    }

    public List<CategoriaDto> obtenerCategoria() {
        List<Categoria> lista = gestionBilletera.getListaCategoria();
        return mapper.getCategoriaDtos(lista);
    }

    @Override
    public boolean crearCuenta(CuentaDto cuenta) {
        Cuenta cuenta1 = mapper.cuentaDtoToCuenta(cuenta);
        return gestionBilletera.crearCuenta(cuenta1);
    }

    @Override
    public List<CuentaDto> obtenerCuenta() {
        List<Cuenta> lista = gestionBilletera.getListaCuentas();
        return mapper.getCuentaDtos(lista);
    }
    @Override
    public boolean eliminarCuenta(String idCuenta) {
        return gestionBilletera.eliminarCuenta(idCuenta);
    }

    @Override
    public List<PresupuestoDto> obtenerPresupuestos() {
        return mapper.getPresupuestosDto(gestionBilletera.getListaPresupuestos());
    }

}
