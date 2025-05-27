package co.edu.uniquindio.proyecto.services;

import co.edu.uniquindio.proyecto.mapping.dto.*;
import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.model.*;

import java.util.ArrayList;
import java.util.List;

public interface IProyectoMapping {
    List<UsuarioDto> getUsuarioDtos(List<Usuario> usuarios);
    UsuarioDto usuarioToUsuarioDto(Usuario usuario);
    Usuario usuarioDtoToUsuario(UsuarioDto usuario);

    List<CategoriaDto> getCategoriaDtos(List<Categoria> listaCategoria);

    List<TransaccionDto>getTransaccionDtos(List<Transaccion> transacciones);
    TransaccionDto transaccionToTransaccionDto(Transaccion transaccion);
    Transaccion transaccionDtoToTransaccion(TransaccionDto transaccionDto);
    CategoriaDto categoriaToCategoriaDto(Categoria categoria);
    Categoria categoriaDtoToCategoria(CategoriaDto categoriaDto);
    List<CuentaDto> getCuentaDtos(List<Cuenta> listaCuenta);
    CuentaDto cuentaToCuentaDto(Cuenta cuenta);
    Cuenta cuentaDtoToCuenta(CuentaDto cuentaDto);

    List<PresupuestoDto> getPresupuestosDto(List<Presupuesto> listaPresupuestos);
}
