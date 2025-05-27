package co.edu.uniquindio.proyecto.Controller;

import co.edu.uniquindio.proyecto.factory.ModelFactory;
import co.edu.uniquindio.proyecto.mapping.dto.CategoriaDto;
import co.edu.uniquindio.proyecto.mapping.dto.CuentaDto;
import co.edu.uniquindio.proyecto.model.Cuenta;
import co.edu.uniquindio.proyecto.model.Usuario;

import java.util.List;

public class CuentaController {
    ModelFactory modelFactory;
    public CuentaController() {modelFactory=ModelFactory.getInstance();}
    public List<CuentaDto> obtenerCuenta(){
        return modelFactory.obtenerCuenta();
    }
    public boolean CrearCuenta(CuentaDto cuenta){
        return modelFactory.crearCuenta(cuenta);
    }
    public boolean actualizarCuenta(Cuenta cuenta) {
        return modelFactory.actualizarCuenta(cuenta);
    }
    public boolean eliminarCuenta(String idCuenta) {
        return modelFactory.eliminarCuenta(idCuenta);
    }
}
