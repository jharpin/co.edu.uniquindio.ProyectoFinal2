package co.edu.uniquindio.proyecto.model;

import co.edu.uniquindio.proyecto.model.builder.AdministradorBuilder;

public class Administrador {
    private String nombreAdministrador;
    private String idAdministrador;
    private String emailAdministrador;
    private String telefonoAdministrador;
    private String contraseniaAdministrador;

    public Administrador(String nombreAdministrador,String idAdministrador,String emailAdministrador,String telefonoAdministrador,String contraseniaAdministrador){
        this.nombreAdministrador=nombreAdministrador;
        this.idAdministrador=idAdministrador;
        this.emailAdministrador=emailAdministrador;
        this.telefonoAdministrador=telefonoAdministrador;
        this.contraseniaAdministrador=contraseniaAdministrador;
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getEmailAdministrador() {
        return emailAdministrador;
    }

    public void setEmailAdministrador(String emailAdministrador) {
        this.emailAdministrador = nombreAdministrador;
    }

    public String getTelefonoAdministrador() {
        return telefonoAdministrador;
    }

    public void setTelefonoAdministrador(String telefonoAdministrador) {
        this.telefonoAdministrador = nombreAdministrador;
    }

    public String getContraseniaAdministrador() {
        return contraseniaAdministrador;
    }

    public void setContraseniaAdministrador(String contraseniaAdministrador) {
        this.contraseniaAdministrador = contraseniaAdministrador;
    }
    public static AdministradorBuilder builder(){
        return new AdministradorBuilder();
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "nombreAdministrador='" + nombreAdministrador + '\'' +
                ", idAdministrador='" + idAdministrador + '\'' +
                ", emailAdministrador='" + emailAdministrador + '\'' +
                ", telefonoAdministrador='" + telefonoAdministrador + '\'' +
                ", contraseniaAdministrador='" + contraseniaAdministrador + '\'' +
                '}';
    }
}