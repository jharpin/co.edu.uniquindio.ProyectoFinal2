package co.edu.uniquindio.proyecto.model.builder;

import co.edu.uniquindio.proyecto.model.Usuario;

public class UsuarioBuilder {
    private String nombreUsuario;
    private String idUsuario;
    private String emailUsuario;
    private String telefonoUsuario;
    private String contraseniaUsuario;
    private double dinero;

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
    public UsuarioBuilder dinero(double dinero) {
        this.dinero = dinero;
        return this;
    }

    public Usuario build() {
        return new Usuario(nombreUsuario, idUsuario, emailUsuario, telefonoUsuario, contraseniaUsuario,dinero);

    }

}
