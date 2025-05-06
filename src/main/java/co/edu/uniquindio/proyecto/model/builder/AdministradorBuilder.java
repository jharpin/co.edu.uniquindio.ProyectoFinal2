package co.edu.uniquindio.proyecto.model.builder;
import co.edu.uniquindio.proyecto.model.Administrador;

public class AdministradorBuilder {
    private String nombreAdministrador;
    private String idAdministrador;
    private String emailAdministrador;
    private String telefonoAdministrador;
    private String contraseniaAdministrador;

    public AdministradorBuilder nombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
        return this;
    }
    public AdministradorBuilder idAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
        return this;
    }
    public AdministradorBuilder emailAdministrador(String emailAdministrador) {
        this.emailAdministrador = emailAdministrador;
        return this;
    }
    public AdministradorBuilder telefonoAdministrador(String telefonoAdministrador) {
        this.telefonoAdministrador = telefonoAdministrador;
        return this;
    }
    public AdministradorBuilder contraseniaAdministrador(String contraseniaAdministrador) {
        this.contraseniaAdministrador = contraseniaAdministrador;
        return this;
    }

    public Administrador build() {
        return new Administrador(nombreAdministrador,idAdministrador,emailAdministrador,telefonoAdministrador,contraseniaAdministrador);
    }
}
