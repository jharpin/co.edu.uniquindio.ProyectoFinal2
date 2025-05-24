package co.edu.uniquindio.proyecto.services;

import co.edu.uniquindio.proyecto.model.Usuario;

public interface IAutentificador {
    Usuario iniciarSesion(String identificacion, String contrasena);
}
