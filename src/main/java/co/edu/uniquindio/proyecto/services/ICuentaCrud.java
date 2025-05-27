package co.edu.uniquindio.proyecto.services;

import co.edu.uniquindio.proyecto.mapping.dto.CategoriaDto;
import co.edu.uniquindio.proyecto.mapping.dto.CuentaDto;

import java.util.List;

public interface ICuentaCrud {
    boolean crearCuenta(CuentaDto cuenta);
    List<CuentaDto> obtenerCuenta();

}
