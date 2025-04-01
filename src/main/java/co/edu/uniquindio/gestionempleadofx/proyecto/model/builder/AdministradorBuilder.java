package co.edu.uniquindio.gestionempleadofx.proyecto.model.builder;
import co.edu.uniquindio.gestionempleadofx.proyecto.model.Administrador;

public class AdministradorBuilder {
    private String nombreAdministrador;
    private String idAdministrador;
    private String emailAdministrador;
    private String telefonoAdministrador;
    private String contraseniaAdministrador;

    public AdministradorBuilder setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
        return this;
    }
    public AdministradorBuilder setIdAdministrador(String idAdministrador) {this.idAdministrador = idAdministrador;return this;}
    public AdministradorBuilder setEmailAdministrador(String emailAdministrador) {this.emailAdministrador = emailAdministrador;return this;}
    public AdministradorBuilder setTelefonoAdministrador(String telefonoAdministrador){this.telefonoAdministrador = telefonoAdministrador;return this;}

    public Administrador build() {
        return null;
    }
}
