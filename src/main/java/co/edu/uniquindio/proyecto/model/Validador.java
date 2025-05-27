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
        return idUsuario.equals("admi") && contraseniaUsuario.equals("admi12345.");

    }
    public static boolean validarCorreo(String emailUsuario) {
        return emailUsuario.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }


    public static boolean validarTelefono(String telefono) {
        return telefono != null && telefono.matches("\\d+");
    }

    public static boolean validarContrasena(String contrasena) {
        return contrasena != null && contrasena.length() >= 6;
    }

    public static boolean campoObligatorio(String valor) {
        return valor != null && !valor.trim().isEmpty();
    }
}


