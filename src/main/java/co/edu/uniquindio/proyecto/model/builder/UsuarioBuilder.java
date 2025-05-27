package co.edu.uniquindio.proyecto.model.builder;

import co.edu.uniquindio.proyecto.model.Usuario;

public class UsuarioBuilder {
    private String nombreUsuario;
    private String idUsuario;
    private String emailUsuario;
    private String telefonoUsuario;
    private String contraseniaUsuario;
    private String direccion;
    private double saldo;

    public UsuarioBuilder nombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        return this;
    }
    public UsuarioBuilder idUsuario(String idUsuario){
        this.idUsuario = idUsuario;
        return this;
    }
    public UsuarioBuilder emailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
        return this;
    }
    public UsuarioBuilder telefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
        return this;
    }
    public UsuarioBuilder contraseniaUsuario(String contraseniaUsuario) {
        this.contraseniaUsuario = contraseniaUsuario;
        return this;
    }
    public UsuarioBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }
    public UsuarioBuilder saldo(double saldo){
        this.saldo = saldo;
        return this;
    }

    public Usuario build() {
return new Usuario(nombreUsuario, idUsuario, emailUsuario, telefonoUsuario, contraseniaUsuario,direccion,saldo);
    }
    public UsuarioBuilder setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public UsuarioBuilder setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        return this;
    }

    public UsuarioBuilder setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
        return this;
    }

    public UsuarioBuilder setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
        return this;
    }

    public UsuarioBuilder setContraseniaUsuario(String contraseniaUsuario) {
        this.contraseniaUsuario = contraseniaUsuario;
        return this;
    }
}
