package co.edu.uniquindio.proyecto.services;

import co.edu.uniquindio.proyecto.mapping.dto.Usuariodto;
import co.edu.uniquindio.proyecto.model.Usuario;

import java.util.List;

public interface IGestionBMapping {
    List<Usuariodto> getUsuariodto(List<Usuario> listaUsuarios);
    Usuariodto UsuarioToUsuariodto(Usuario usuario);
    Usuario usuariodtoToUsuario(Usuariodto usuarioto);


}
