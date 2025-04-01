package co.edu.uniquindio.gestionempleadofx.proyecto.model;

import co.edu.uniquindio.gestionempleadofx.proyecto.model.builder.AdministradorBuilder;

public class Administrador {
    private String nombreAdministrador;
    private String idAdministrador;
    private String emailAdministrador;
    private String telefonoAdministrador;
    private String contraseniaAdministrador;

    public Administrador() {
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
        this.nombreAdministrador = nombreAdministrador;
    }

    public String getTelefonoAdministrador() {
        return telefonoAdministrador;
    }

    public void setTelefonoAdministrador(String telefonoAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
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

    public String toString() {
        return nombreAdministrador;
    }
}