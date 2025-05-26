package co.edu.uniquindio.proyecto.mapping.dto;

public record UsuarioDto(
        String nombreUsuario,
        String idUsuario,
        String emailUsuario,
        String telefonoUsuario,
        String contraseniaUsuario,
        double dinero
        ) {
}
