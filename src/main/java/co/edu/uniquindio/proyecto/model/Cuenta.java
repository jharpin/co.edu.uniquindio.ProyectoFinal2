package co.edu.uniquindio.proyecto.model;

import co.edu.uniquindio.proyecto.services.ICuentaCrud;

public class Cuenta implements ICuentaCrud {
    private String nombreCuenta;
    private String idCuenta;
    private Cuenta cuenta;
    private String numeroCuenta;
    private String tipoCuenta;

    public Cuenta() {}

    public String getNombreCuenta() {return nombreCuenta;}
    public void setNombreCuenta(String nombreCuenta) {this.nombreCuenta = nombreCuenta;}
    public String getIdCuenta() {return idCuenta;}
    public void setIdCuenta(String idCuenta) {this.idCuenta = idCuenta;}
    public Cuenta getCuenta() {return cuenta;}
    public void setCuenta(Cuenta cuenta) {this.cuenta = cuenta;}
    public String getNumeroCuenta() {return numeroCuenta;}
    public void setNumeroCuenta(String numeroCuenta) {this.numeroCuenta = numeroCuenta;}
    public String getTipoCuenta() {return tipoCuenta;}
    public void setTipoCuenta(String tipoCuenta) {this.tipoCuenta = tipoCuenta;}

    @Override
    public String toString() {
        return "Cuenta{" +
                "nombreCuenta='" + nombreCuenta + '\'' +
                ", idCuenta='" + idCuenta + '\'' +
                ", cuenta=" + cuenta +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", tipoCuenta='" + tipoCuenta + '\'' +
                '}';
    }
}

