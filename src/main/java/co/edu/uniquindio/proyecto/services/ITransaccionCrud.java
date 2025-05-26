package co.edu.uniquindio.proyecto.services;

import co.edu.uniquindio.proyecto.mapping.dto.TransaccionDto;

import java.util.List;

public interface ITransaccionCrud {
    boolean crearTransaccion(TransaccionDto Transaccion);
    List<TransaccionDto> obtenerTransacciones();
}
