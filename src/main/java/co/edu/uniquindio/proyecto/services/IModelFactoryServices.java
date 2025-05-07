package co.edu.uniquindio.proyecto.services;

import co.edu.uniquindio.proyecto.mapping.dto.Usuariodto;

import java.util.List;

public interface IModelFactoryServices extends IUsuarioCrud, IAdministradorCrud, ICuentaCrud, IGestionBilleteraCrud {

    void mostrarInfoBilletera();
    List<Usuariodto> obtenerUsuarios();
    boolean mostrarListaUsuarios();
    boolean mostrarListaBanco();
    boolean agregarUsuario(Usuariodto usuariodto);
    boolean actualizarUsuario(Usuariodto usuariodto);
    boolean eliminarUsuario(String cedula);
    boolean agregarCuenta();
    boolean eliminarCuenta();
    boolean actualizarCuenta();

}
