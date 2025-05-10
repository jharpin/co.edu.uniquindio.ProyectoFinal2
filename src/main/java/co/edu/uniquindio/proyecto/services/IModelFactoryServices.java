package co.edu.uniquindio.proyecto.services;

import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;


import java.util.List;

public interface IModelFactoryServices extends IUsuarioCrud, IAdministradorCrud, ICuentaCrud, IGestionBilleteraCrud {

    void mostrarInfoBilletera();
    List<UsuarioDto> obtenerUsuarios();
    boolean mostrarListaUsuarios();
    boolean mostrarListaBanco();
    boolean agregarUsuario(UsuarioDto usuariodto);
    boolean actualizarUsuario(UsuarioDto usuariodto);
    boolean eliminarUsuario(String cedula);
    boolean agregarCuenta();
    boolean eliminarCuenta();
    boolean actualizarCuenta();

}
