package co.edu.uniquindio.proyecto.model.builder;

import co.edu.uniquindio.proyecto.model.Categoria;
import co.edu.uniquindio.proyecto.model.Presupuesto;

public class PresupuestoBuilder {
    private String nombrePresupuesto;
    private String idPresupuesto;
    private int montoAsignado;
    private int montoGastado;
    private Categoria categoria;

    public PresupuestoBuilder nombrePresupuesto(String nombrePresupuesto){
        this.nombrePresupuesto= nombrePresupuesto;
        return this;
    }
    public PresupuestoBuilder idPresupuesto(String idPresupuesto){
        this.idPresupuesto = idPresupuesto;
        return this;
    }

    public PresupuestoBuilder montoAsignado(int montoAsignado){
        this.montoAsignado = montoAsignado;
        return this;
    }
    public PresupuestoBuilder montoGastado(int montoGastado){
        this.montoGastado = montoGastado;
        return this;
    }
    public  PresupuestoBuilder categoria(Categoria categoria){
        this.categoria = categoria;
        return this;
    }
    public Presupuesto build(){return new Presupuesto(nombrePresupuesto,idPresupuesto,montoAsignado,montoGastado,categoria);}
}
