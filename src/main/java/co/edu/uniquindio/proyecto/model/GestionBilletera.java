package co.edu.uniquindio.proyecto.model;
import co.edu.uniquindio.proyecto.model.builder.UsuarioBuilder;

import java.util.ArrayList;

public class GestionBilletera  {
    private ArrayList<Cuenta> listaCuentas;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Banco> listaBancos;


    public GestionBilletera() {
        /// inicializacion de listas
        this.listaCuentas = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
        this.listaBancos = new ArrayList<>();
          }

    public ArrayList<Cuenta> getListaCuentas() {return listaCuentas;}
    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {this.listaCuentas = listaCuentas;}
    public ArrayList<Banco> getListaBancos() {return listaBancos;}
    public void setListaBancos(ArrayList<Banco> listaBancos) {this.listaBancos = listaBancos;}
    public ArrayList<Usuario> getListaUsuarios() {return listaUsuarios;}
    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {this.listaUsuarios = listaUsuarios;}


    public void mostrarInfoBilletera() {
    }

    public boolean mostrarListaUsuarios() {
        return false;
    }

    public boolean mostrarListaBanco() {return false;}



    public boolean crearUsuario(Usuario usuario){
       Usuario Encontrado = obtenerUsuario(usuario.getIdUsuario());

           if(Encontrado == null){
               getListaUsuarios().add(usuario);
               return true;
           }else {
               return false;
           }
    }


    public boolean eliminarUsuario(String idUsuario) {
        return false;
    }


    public Usuario obtenerUsuario(String idUsuario) {
        Usuario usuario = null;
        for(Usuario usuario1 : getListaUsuarios()){
            if(usuario1.getIdUsuario().equalsIgnoreCase(idUsuario)){
                usuario = usuario1;
                break;
            }
        }
        return null;
    }

}
