package co.edu.uniquindio.proyecto.services;

public interface IModelFactoryServices extends IUsuarioCrud, IAdministradorCrud, ICuentaCrud, IGestionBilleteraCrud {
    void mostrarInfoBilletera();

    boolean mostrarListaUsuarios();
    boolean mostrarListaBanco();

}
