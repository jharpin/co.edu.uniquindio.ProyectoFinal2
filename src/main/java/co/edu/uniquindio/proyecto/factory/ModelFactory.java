package co.edu.uniquindio.proyecto.factory;

import co.edu.uniquindio.proyecto.mapping.dto.CategoriaDto;
import co.edu.uniquindio.proyecto.mapping.dto.CuentaDto;
import co.edu.uniquindio.proyecto.mapping.dto.TransaccionDto;
import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.mapping.mappers.ProyectoMappingImpl;
import co.edu.uniquindio.proyecto.model.*;
import co.edu.uniquindio.proyecto.services.IModelFactoryServices;
import co.edu.uniquindio.proyecto.services.IProyectoMapping;
import co.edu.uniquindio.proyecto.utils.DataUtil;

import java.util.List;

public class ModelFactory implements IModelFactoryServices {

    private UsuarioDto usuarioActivo;
    private static ModelFactory modelFactory;
    private final GestionBilletera gestionBilletera;
    private final IProyectoMapping mapper;

    private ModelFactory() {
        this.mapper = new ProyectoMappingImpl();
        this.gestionBilletera = GestionBilletera.getInstance(); // ¡Singleton correcto!
        inicializarDatosSiEsNecesario();
    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private void inicializarDatosSiEsNecesario() {
        if (gestionBilletera.getListaUsuarios().isEmpty()) {
            GestionBilletera datosIniciales = DataUtil.inicializarDatos();
            gestionBilletera.setListaUsuarios(datosIniciales.getListaUsuarios());
            gestionBilletera.setListaCuentas(datosIniciales.getListaCuentas());
            gestionBilletera.setListaCategoria(datosIniciales.getListaCategoria());
            gestionBilletera.setListaBancos(datosIniciales.getListaBancos());
            gestionBilletera.setListaTransacciones(datosIniciales.getListaTransacciones());
        }
    }

    public UsuarioDto getUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(UsuarioDto usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    @Override
    public boolean crearUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = mapper.usuarioDtoToUsuario(usuarioDto);
        return gestionBilletera.crearUsuario(usuario);
    }

    @Override
    public boolean actualizarUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = mapper.usuarioDtoToUsuario(usuarioDto);
        return gestionBilletera.actualizarUsuario(usuario);
    }

    @Override
    public boolean eliminarUsuario(String idUsuario) {
        return gestionBilletera.eliminarUsuario(idUsuario);
    }

    @Override
    public boolean agregarUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = mapper.usuarioDtoToUsuario(usuarioDto);
        return gestionBilletera.crearUsuario(usuario);
    }

    @Override
    public boolean crearCuenta(CuentaDto cuentaDto) {
        Cuenta cuenta = mapper.cuentaDtoToCuenta(cuentaDto);
        return gestionBilletera.crearCuenta(cuenta);
    }

    @Override
    public boolean eliminarCuenta(String idCuenta) {
        return gestionBilletera.eliminarCuenta(idCuenta);
    }

    @Override
    public boolean actualizarCuenta(Cuenta cuenta) {
        return gestionBilletera.actualizarCuenta(cuenta);
    }

    @Override
    public boolean crearTransaccion(TransaccionDto transaccionDto) {
        Transaccion transaccion = mapper.transaccionDtoToTransaccion(transaccionDto);
        return gestionBilletera.crearTransaccion(transaccion);
    }

    @Override
    public boolean crearCategoria(CategoriaDto categoriaDto) {
        Categoria categoria = mapper.categoriaDtoToCategoria(categoriaDto);
        return gestionBilletera.crearCategoria(categoria);
    }

    @Override
    public List<Usuario> obtenerListaUsuarios() {
        return gestionBilletera.getListaUsuarios();
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
    public List<CuentaDto> obtenerCuenta() {
        return mapper.getCuentaDtos(gestionBilletera.getListaCuentas());
    }

    @Override
    public List<CategoriaDto> obtenerCategoria() {
        return mapper.getCategoriaDtos(gestionBilletera.getListaCategoria());
    }

    @Override
    public void mostrarInfoBilletera() {
        // Implementar si es necesario
    }

    @Override
    public boolean mostrarListaUsuarios() {
        return false; // Cambiar si es necesario
    }

    @Override
    public boolean mostrarListaBanco() {
        return false; // Cambiar si es necesario
    }

    public GestionBilletera getGestionBilletera() {
        return gestionBilletera;
    }
}
