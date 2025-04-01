package co.edu.uniquindio.gestionempleadofx.proyecto.factory;

public class ModelFactory {
    private static ModelFactory modelFactory;

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        ///si no, retorne el objeto ya creado
        return modelFactory;
    }
}