package co.edu.uniquindio.proyecto.factory;

import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.mapping.mappers.ProyectoMappingImpl;
import co.edu.uniquindio.proyecto.model.GestionBilletera;
import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.model.builder.UsuarioBuilder;
import co.edu.uniquindio.proyecto.services.IModelFactoryServices;
import co.edu.uniquindio.proyecto.services.IProyectoMapping;

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
    public GestionBilletera getGestionBilletera() {
        return gestionBilletera;
    }
    private ModelFactory() {
       mapper=new ProyectoMappingImpl();
        gestionBilletera = new GestionBilletera();
    }

    @Override
    public boolean crearUsuario(UsuarioBuilder NuevoUsuario) {
        return false;
    }

    @Override
    public boolean eliminarUsuario(String idUsuario) {
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
    public boolean mostrarListaUsuarios() {
        return false;
    }

    @Override
    public boolean mostrarListaBanco() {
        return false;
    }
}
