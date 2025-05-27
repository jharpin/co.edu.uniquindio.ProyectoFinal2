package co.edu.uniquindio.proyecto.services;

import co.edu.uniquindio.proyecto.mapping.dto.CategoriaDto;
import co.edu.uniquindio.proyecto.model.Categoria;

import java.util.ArrayList;

public interface ICategoria {
    boolean crearCategoria(CategoriaDto categoria);
    ArrayList<Categoria> obtenerCategoria();

}
