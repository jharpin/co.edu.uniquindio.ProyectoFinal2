package co.edu.uniquindio.proyecto.services;

import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.model.Usuario;

public interface IAutentificador {
    UsuarioDto iniciarSesionA(String identificacion, String contrasena);
}
