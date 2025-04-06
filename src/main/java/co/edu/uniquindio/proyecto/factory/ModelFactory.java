package co.edu.uniquindio.proyecto.factory;

import co.edu.uniquindio.proyecto.model.GestionBilletera;

public class ModelFactory {
    private static ModelFactory modelFactory;
    private GestionBilletera gestionBilletera;

    private ModelFactory() {
        // Inicializar la lógica de negocio aquí
        gestionBilletera = new GestionBilletera();
    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    public GestionBilletera getGestionBilletera() {
        return gestionBilletera;
    }
}
