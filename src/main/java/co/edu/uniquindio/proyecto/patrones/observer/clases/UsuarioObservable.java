package co.edu.uniquindio.proyecto.patrones.observer.clases;


import co.edu.uniquindio.proyecto.model.Usuario;
import co.edu.uniquindio.proyecto.patrones.observer.interfaces.Observable;
import co.edu.uniquindio.proyecto.patrones.observer.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class UsuarioObservable implements Observable {

    private final Usuario usuario;
    private final List<Observer> observadores = new ArrayList<>();

    public UsuarioObservable(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void notificarCambio(String mensaje) {
        notificarObservadores("Usuario " + usuario.getNombreUsuario() + ": " + mensaje);
    }

    @Override
    public void agregarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void eliminarObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores(String mensaje) {
        for (Observer o : observadores) {
            o.update(mensaje);
        }
    }
}
