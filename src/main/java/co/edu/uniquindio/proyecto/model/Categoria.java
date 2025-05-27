package co.edu.uniquindio.proyecto.model;

import co.edu.uniquindio.proyecto.model.builder.CategoriaBuilder;
import co.edu.uniquindio.proyecto.model.builder.TransaccionBuilder;

public class Categoria {

    private String idCategoria;
    private String nombreCategoria;
    private String descripcionCategoria;

    public Categoria(String idCategoria, String nombreCategoria, String descripcionCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
    }

    public String getNombreCategoria(){return nombreCategoria;}
    public void setNombreCategoria(String nombreCategoria){nombreCategoria = nombreCategoria;}
    public String getDescripcionCategoria() {return descripcionCategoria;}
    public void setDescripcionCategoria(String descripcionCategoria) {descripcionCategoria = descripcionCategoria;}
    public String getIdCategoria () {return idCategoria;}
    public void setIdCategoria (String idCategoria){this.idCategoria = idCategoria;}


    public static CategoriaBuilder builder() {
        return new CategoriaBuilder();
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nombreCategoria='" + nombreCategoria + '\'' +
                "idCategoria='" + idCategoria + '\'' +
                ", DescripcionCategoria='" + descripcionCategoria + '\'' +
                '}';
    }
}

