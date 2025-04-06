package co.edu.uniquindio.proyecto.model.builder;

import co.edu.uniquindio.proyecto.model.Administrador;

public class UsuarioBuilder {
    private String nombreUsuario;
    private String idUsuario;
    private String emailUsuario;
    private String telefonoUsuario;
    private String contraseniaUsuario;

    public void setIdUsuario(String idUsuario) {this.idUsuario = idUsuario;}
    public void setNombreUsuario(String nombreUsuario) {this.nombreUsuario = nombreUsuario;}
    public void setEmailUsuario(String emailUsuario) {this.emailUsuario = emailUsuario;}
    public void setTelefonoUsuario(String telefonoUsuario) {this.telefonoUsuario = telefonoUsuario;}
    public void setContraseniaUsuario(String contraseniaUsuario) {this.contraseniaUsuario = contraseniaUsuario;}

    public UsuarioBuilder build() {
        return null;
    }
}
