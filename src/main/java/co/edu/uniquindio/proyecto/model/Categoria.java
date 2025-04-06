package co.edu.uniquindio.proyecto.model;

public class Categoria {
    private String idCategoria;
    private String DescripcionCategoria;

    public String getDescripcionCategoria() {return DescripcionCategoria;}
    public void setDescripcionCategoria(String descripcionCategoria) {DescripcionCategoria = descripcionCategoria;}
    public String getIdCategoria () {return idCategoria;}
    public void setIdCategoria (String idCategoria){this.idCategoria = idCategoria;}

    @Override
    public String toString() {
        return "Categoria{" +
                "idCategoria='" + idCategoria + '\'' +
                ", DescripcionCategoria='" + DescripcionCategoria + '\'' +
                '}';
    }
}

