package co.edu.uniquindio.proyecto.model;
import co.edu.uniquindio.proyecto.services.IAdministradorCrud;
import co.edu.uniquindio.proyecto.services.ICuentaCrud;
import co.edu.uniquindio.proyecto.services.IModelFactoryServices;
import co.edu.uniquindio.proyecto.services.IUsuarioCrud;

import java.util.ArrayList;
import java.util.Collections;
public class GestionBilletera implements IModelFactoryServices, ICuentaCrud, IAdministradorCrud, IUsuarioCrud {
    private ArrayList<Cuenta> cuentas;
    private ArrayList<Banco> bancos;


    public GestionBilletera() {
        /// inicializacion de listas
        this.cuentas = new ArrayList<>();
        this.bancos = new ArrayList<>();
          }

    public ArrayList<Cuenta> getCuentas() {return cuentas;}
    public void setCuentas(ArrayList<Cuenta> cuentas) {this.cuentas = cuentas;}
    public ArrayList<Banco> getBancos() {return bancos;}
    public void setBancos(ArrayList<Banco> bancos) {this.bancos = bancos;}

    @Override
    public void mostrarInfoBilletera() {
    }
    @Override
    public boolean mostrarListaUsuarios() {
        return false;
    }
    @Override
    public boolean mostrarListaBanco() {return false;}
}
