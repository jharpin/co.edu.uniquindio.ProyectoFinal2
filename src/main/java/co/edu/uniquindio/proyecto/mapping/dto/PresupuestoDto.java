package co.edu.uniquindio.proyecto.mapping.dto;

import co.edu.uniquindio.proyecto.model.Categoria;

public record PresupuestoDto (String nombrePresupuesto,
                              String idPresupuesto,
                              int montoAsignado,
                              int montoGastado,
                              Categoria categoria
                              ){
}
