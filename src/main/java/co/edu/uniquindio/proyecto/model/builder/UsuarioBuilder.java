package co.edu.uniquindio.proyecto.model.builder;

import co.edu.uniquindio.proyecto.model.Usuario;

public class UsuarioBuilder {
    private String nombreUsuario;
    private String idUsuario;
    private String emailUsuario;
    private String telefonoUsuario;
    private String contraseniaUsuario;

    public UsuarioBuilder (String idUsuario,String nombreUsuario, String emailUsuario, String telefonoUsuario, String contraseniaUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.emailUsuario = emailUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.contraseniaUsuario = contraseniaUsuario;
    }
    public UsuarioBuilder(){}

    public UsuarioBuilder setNombreUsuario(String nombreUsuario) {this.nombreUsuario = nombreUsuario;return this;}
    public UsuarioBuilder setIdUsuario(String idUsuario) {this.idUsuario = idUsuario;return this;}
    public UsuarioBuilder setEmailUsuario(String emailUsuario) {this.emailUsuario = emailUsuario;return this;}
    public UsuarioBuilder setTelefonoUsuario(String telefonoUsuario) {this.telefonoUsuario = telefonoUsuario;return this;}
    public UsuarioBuilder setContraseniaUsuario(String contraseniaUsuario) {this.contraseniaUsuario = contraseniaUsuario;return this;}
    public Usuario build() {
        return new Usuario(nombreUsuario, idUsuario, emailUsuario, telefonoUsuario, contraseniaUsuario);
    }
}
