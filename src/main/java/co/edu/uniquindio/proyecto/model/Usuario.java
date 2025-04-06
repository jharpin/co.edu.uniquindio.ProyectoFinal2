package co.edu.uniquindio.proyecto.model;

import co.edu.uniquindio.proyecto.model.builder.AdministradorBuilder;

public class Usuario {
    private String nombreUsuario;
    private String idUsuario;
    private String emailUsuario;
    private String telefonoUsuario;
    private String contraseniaUsuario;

    public String getIdUsuario() {return idUsuario;}

    public void setIdUsuario(String idUsuario) {this.idUsuario = idUsuario;}

    public String getNombreUsuario() {return nombreUsuario;}

    public void setNombreUsuario(String nombreUsuario) {this.nombreUsuario = nombreUsuario;}

    public String getEmailUsuario() {return emailUsuario;}

    public void setEmailUsuario(String emailUsuario) {this.emailUsuario = emailUsuario;}

    public String getTelefonoUsuario() {return telefonoUsuario;}

    public void setTelefonoUsuario(String telefonoUsuario) {this.telefonoUsuario = telefonoUsuario;}

    public String getContraseniaUsuario() {return contraseniaUsuario;}

    public void setContraseniaUsuario(String contraseniaUsuario) {this.contraseniaUsuario = contraseniaUsuario;}
    public static UsuarioBuilder builder(){
        return new UsuarioBuilder();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", idUsuario='" + idUsuario + '\'' +
                ", emailUsuario='" + emailUsuario + '\'' +
                ", telefonoUsuario='" + telefonoUsuario + '\'' +
                ", contraseniaUsuario='" + contraseniaUsuario + '\'' +
                '}';
    }
}
