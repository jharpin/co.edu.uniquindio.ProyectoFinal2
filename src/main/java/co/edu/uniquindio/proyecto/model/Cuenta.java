package co.edu.uniquindio.proyecto.model;

import co.edu.uniquindio.proyecto.model.builder.CuentaBuilder;
import co.edu.uniquindio.proyecto.services.ICuentaCrud;

public class Cuenta  {
    private String idCuenta;
    private String nombreCuenta;
    private String numeroCuenta;
    private String tipoCuenta;


    public Cuenta(String nombreCuenta, String idCuenta, String numeroCuenta, String tipoCuenta) {
        this.idCuenta = idCuenta;
        this.nombreCuenta = nombreCuenta;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public String getNombreCuenta() {return nombreCuenta;}
    public void setNombreCuenta(String nombreCuenta) {this.nombreCuenta = nombreCuenta;}
    public String getIdCuenta() {return idCuenta;}
    public void setIdCuenta(String idCuenta) {this.idCuenta = idCuenta;}
    public String getNumeroCuenta() {return numeroCuenta;}
    public void setNumeroCuenta(String numeroCuenta) {this.numeroCuenta = numeroCuenta;}
    public String getTipoCuenta() {return tipoCuenta;}
    public void setTipoCuenta(String tipoCuenta) {this.tipoCuenta = tipoCuenta;}

    public static CuentaBuilder builder() {
        return new CuentaBuilder();
    }
    @Override
    public String toString() {
        return "Cuenta{" +
                ", idCuenta='" + idCuenta + '\'' +
                "nombreCuenta='" + nombreCuenta + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", tipoCuenta='" + tipoCuenta + '\'' +
                '}';
    }
}

