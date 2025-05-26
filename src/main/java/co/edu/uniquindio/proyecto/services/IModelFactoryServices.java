package co.edu.uniquindio.proyecto.services;

import co.edu.uniquindio.proyecto.mapping.dto.TransaccionDto;
import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;


import java.util.List;

public interface IModelFactoryServices extends IUsuarioCrud, ICuentaCrud, IGestionBilleteraCrud, ITransaccionCrud, ICategoria {

    void mostrarInfoBilletera();
    List<UsuarioDto> obtenerUsuarios();
    List<TransaccionDto> obtenerTransacciones();
    boolean mostrarListaUsuarios();
    boolean mostrarListaBanco();
    boolean agregarUsuario(UsuarioDto usuariodto);
    boolean actualizarUsuario(UsuarioDto usuariodto);

    boolean crearTransaccion(TransaccionDto transaccion);

    boolean crearUsuario(UsuarioDto usuario);

    boolean eliminarUsuario(String cedula);
    boolean agregarCuenta();
    boolean eliminarCuenta();
    boolean actualizarCuenta();
    ;

}
