package co.edu.uniquindio.proyecto.model.builder;

import co.edu.uniquindio.proyecto.model.Categoria;
import co.edu.uniquindio.proyecto.model.Cuenta;

public class CuentaBuilder {
    private String idCuenta;
    private String nombreCuenta;
    private String numeroCuenta;
    private String tipoCuenta;

    public CuentaBuilder idCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
        return this;
    }

    public CuentaBuilder nombreCuenta (String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
        return this;
    }

    public CuentaBuilder numeroCuenta (String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        return this;
    }

    public CuentaBuilder tipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
        return this;
    }
    public Cuenta build() {
        return new Cuenta(idCuenta, nombreCuenta, numeroCuenta, tipoCuenta);
    }
}
