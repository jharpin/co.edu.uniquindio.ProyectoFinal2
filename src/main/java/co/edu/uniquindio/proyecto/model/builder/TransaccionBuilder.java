package co.edu.uniquindio.proyecto.model.builder;

import co.edu.uniquindio.proyecto.model.Transaccion;

import java.time.LocalDate;

public class TransaccionBuilder {

    private String id;
    private String cuentaOrigen;
    private String cuentaDestino;
    private double monto;
    private LocalDate fecha;
    private String tipo;
    private String categoria;
    private String descripcion;

    public TransaccionBuilder id(String id) {
        this.id = id;
        return this;
    }

    public TransaccionBuilder cuentaOrigen(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
        return this;
    }

    public TransaccionBuilder cuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
        return this;
    }

    public TransaccionBuilder monto(double monto) {
        this.monto = monto;
        return this;
    }

    public TransaccionBuilder fecha(LocalDate fecha) {
        this.fecha = fecha;
        return this;
    }

    public TransaccionBuilder tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public TransaccionBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public TransaccionBuilder descripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public Transaccion build() {
        return new Transaccion(id, cuentaOrigen, cuentaDestino, monto, fecha, tipo, categoria, descripcion);
    }
}
