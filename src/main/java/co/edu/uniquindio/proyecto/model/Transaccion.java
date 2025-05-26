package co.edu.uniquindio.proyecto.model;

import java.util.Date;

public class Transaccion {
    private Cuenta cuenta;
    private Banco banco;
    private String idTransaccion;
    private Date fechaTransaccion;
    private String estadoTransaccion;

    public Cuenta getCuenta() {return cuenta;}
    public void setCuenta(Cuenta cuenta) {this.cuenta = cuenta;}
    public String getEstadoTransaccion() {return estadoTransaccion;}
    public void setEstadoTransaccion(String estadoTransaccion) {this.estadoTransaccion = estadoTransaccion;}
    public Date getFechaTransaccion() {return fechaTransaccion;}
    public void setFechaTransaccion(Date fechaTransaccion) {this.fechaTransaccion = fechaTransaccion;}
    public Banco getBanco() {return banco;}
    public void setBanco(Banco banco) {this.banco = banco;}
    public String getIdTransaccion() {return idTransaccion;}
    public void setIdTransaccion(String idTransaccion) {this.idTransaccion = idTransaccion;}

    @Override
    public String toString() {
        return "Transaccion{" +
                "cuenta=" + cuenta +
                ", banco=" + banco +
                ", idTransaccion='" + idTransaccion + '\'' +
                ", fechaTransaccion=" + fechaTransaccion +
                ", estadoTransaccion='" + estadoTransaccion + '\'' +
                '}';
    }
}
