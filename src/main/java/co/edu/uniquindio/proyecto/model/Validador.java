package co.edu.uniquindio.proyecto.model;

public class Validador {
    public boolean validar(String nombreUsuario, String idUsuario, String emailUsuario, String telefonoUsuario, String contraseniaUsuario) {
        return !nombreUsuario.isEmpty()
                &&!idUsuario.isEmpty()
                && emailUsuario.contains("@")
                &&!telefonoUsuario.isEmpty()
                && contraseniaUsuario.length() >= 6;
    }

    public boolean validarAdministrador(String idUsuario, String contraseniaUsuario) {
        String ideAdmi = "admi";
        String claveAdmin = "admin123";

        return idUsuario.equals(ideAdmi) && contraseniaUsuario.equals(claveAdmin);
    }
}
