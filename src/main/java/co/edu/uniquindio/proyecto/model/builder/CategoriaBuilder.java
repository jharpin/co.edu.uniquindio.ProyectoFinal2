package co.edu.uniquindio.proyecto.model.builder;

import co.edu.uniquindio.proyecto.model.Categoria;


public class CategoriaBuilder {
    private String idCategoria;
    private String nombreCategoria;
    private String descripcionCategoria;

    public CategoriaBuilder idCategoria (String idCategoria) {
        this.idCategoria = idCategoria;
        return this;
    }

    public CategoriaBuilder nombreCategoria (String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
        return this;
    }

    public CategoriaBuilder descripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
        return this;
    }
    public Categoria build() {
        return new Categoria(idCategoria, nombreCategoria, descripcionCategoria);
    }
}
