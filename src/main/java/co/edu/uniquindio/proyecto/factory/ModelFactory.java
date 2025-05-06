package co.edu.uniquindio.proyecto.factory;

import co.edu.uniquindio.proyecto.mapping.dto.Usuariodto;
import co.edu.uniquindio.proyecto.model.GestionBilletera;
import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.model.builder.UsuarioBuilder;
import co.edu.uniquindio.proyecto.services.IModelFactoryServices;

import java.util.List;

public class ModelFactory implements IModelFactoryServices {
    private static ModelFactory modelFactory;
    private GestionBilletera gestionBilletera;

    private ModelFactory() {
        // Inicializar la lógica de negocio aquí
        gestionBilletera = new GestionBilletera();
    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    public GestionBilletera getGestionBilletera() {
        return gestionBilletera;
    }

    @Override
    public void mostrarInfoBilletera() {
        
    }

    @Override
    public List<Usuariodto> obtenerUsuarios() {
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
    public boolean agregarUsuario(Usuariodto usuariodto) {
        return false;
    }

    @Override
    public boolean actualizarUsuario(Usuariodto usuariodto) {
        return false;
    }

    @Override
    public boolean crearUsuario(UsuarioBuilder NuevoUsuario) {
        return false;
    }

    @Override
    public boolean eliminarUsuario(String cedula) {
        return false;
    }

    @Override
    public Usuario obtenerUsuario(String idUsuario) {
        return null;
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
}
