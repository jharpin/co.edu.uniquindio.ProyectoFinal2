package co.edu.uniquindio.proyecto.model;

import co.edu.uniquindio.proyecto.model.builder.PresupuestoBuilder;

public class Presupuesto {
    private String nombrePresupuesto;
    private String idPresupuesto;
    private int montoAsignado;
    private int montoGastado;
    private Categoria categoria;

    public Presupuesto(String nombrePresupuesto,String idPresupuesto,int montoAsignado,int montoGastado,Categoria categoria) {}

    public String getNombrePresupuesto() {return nombrePresupuesto;}
    public void setNombrePresupuesto(String nombrePresupuesto) {this.nombrePresupuesto = nombrePresupuesto;}
    public String getIdPresupuesto() {return idPresupuesto;}
    public void setIdPresupuesto(String idPresupuesto) {this.idPresupuesto = idPresupuesto;}
    public int getMontoAsignado() {return montoAsignado;}
    public void setMontoAsignado(int montoAsignado) {this.montoAsignado = montoAsignado;}
    public int getMontoGastado() {return montoGastado;}
    public void setMontoGastado(int montoGastado) {this.montoGastado = montoGastado;}
    public Categoria getCategoria() {return categoria;}public void setCategoria(Categoria categoria) {this.categoria = categoria;}

    public static PresupuestoBuilder builder(){return new PresupuestoBuilder();}
}
