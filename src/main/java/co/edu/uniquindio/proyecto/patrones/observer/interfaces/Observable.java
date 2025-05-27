package co.edu.uniquindio.proyecto.patrones.observer.interfaces;

public interface Observable {
    void agregarObservador(Observer o);
    void eliminarObservador(Observer o);
    void notificarObservadores(String mensaje);

}
