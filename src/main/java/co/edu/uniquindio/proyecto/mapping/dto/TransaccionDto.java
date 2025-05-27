package co.edu.uniquindio.proyecto.mapping.dto;

import java.time.LocalDate;

public record TransaccionDto(
        String id,
        String cuentaOrigen,
        String cuentaDestino,
        double monto,
        LocalDate fecha,
        String tipo,
        String categoria,
        String descripcion
) {
}
