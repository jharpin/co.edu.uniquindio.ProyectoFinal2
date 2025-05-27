package co.edu.uniquindio.proyecto.services;

import co.edu.uniquindio.proyecto.mapping.dto.CategoriaDto;

import java.util.List;

public interface ICategoria {
    boolean crearCategoria(CategoriaDto categoria);
    List<CategoriaDto> obtenerCategoria();

}
