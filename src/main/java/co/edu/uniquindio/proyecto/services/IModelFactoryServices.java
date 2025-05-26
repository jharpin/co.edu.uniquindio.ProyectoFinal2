package co.edu.uniquindio.proyecto.services;

import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.model.Usuario;


import java.util.List;

public interface IModelFactoryServices extends IUsuarioCrud, ICuentaCrud, IGestionBilleteraCrud {

    void mostrarInfoBilletera();
    List<UsuarioDto> obtenerUsuarios();
    boolean mostrarListaUsuarios();
    boolean mostrarListaBanco();
    boolean agregarUsuario(UsuarioDto usuariodto);
    boolean actualizarUsuario(Usuario usuariod);

    boolean crearUsuario(UsuarioDto usuario);

    boolean eliminarUsuario(String cedula);
    boolean agregarCuenta();
    boolean eliminarCuenta();
    boolean actualizarCuenta();


}
