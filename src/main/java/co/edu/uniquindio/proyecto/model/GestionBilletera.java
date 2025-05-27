package co.edu.uniquindio.proyecto.model;

import java.util.ArrayList;
import java.util.List;

public class GestionBilletera  {
    private ArrayList<Cuenta> listaCuentas;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Banco> listaBancos;
    private ArrayList<Transaccion>listaTransacciones;
    private ArrayList<Categoria>listaCategoria;



    public GestionBilletera() {
        /// inicializacion de listas
        this.listaCuentas = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
        this.listaBancos = new ArrayList<>();
        this.listaTransacciones = new ArrayList<>();
        this.listaCategoria=new ArrayList<>();
          }

    public ArrayList<Transaccion>getListaTransacciones() {return listaTransacciones;}


    public ArrayList<Cuenta> getListaCuentas() {return listaCuentas;}
    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {this.listaCuentas = listaCuentas;}
    public ArrayList<Banco> getListaBancos() {return listaBancos;}
    public void setListaBancos(ArrayList<Banco> listaBancos) {this.listaBancos = listaBancos;}
    public ArrayList<Usuario> getListaUsuarios() {return listaUsuarios;}
    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {this.listaUsuarios = listaUsuarios;}
    public ArrayList<Categoria> getListaCategoria() {return listaCategoria;}
    public void setListaCategoria(ArrayList<Categoria> listaCategoria) {this.listaCategoria = listaCategoria;}

    public void mostrarInfoBilletera() {
    }

    public boolean mostrarListaUsuarios() {
        return false;
    }

    public boolean mostrarListaBanco() {return false;}


    public boolean crearTransaccion(Transaccion transaccion){
        Transaccion Encontrada=obtenerTransaccion(transaccion.getId());
        if(Encontrada==null){
            getListaTransacciones().add(transaccion);
            return true;
        }else{
            return false;
        }
    }
    public boolean crearUsuario(Usuario usuario){
       Usuario Encontrado = obtenerUsuario(usuario.getIdUsuario());

           if(Encontrado == null){
               getListaUsuarios().add(usuario);
               return true;
           }else {
               return false;
           }
    }


    public boolean eliminarUsuario(String idUsuario){
        Usuario Encontrado = obtenerUsuario(idUsuario);
        if(Encontrado != null){
            getListaUsuarios().remove(Encontrado);
            return true;
        }else{
            return false;
        }
    }

    public Transaccion obtenerTransaccion(String idTransaccion) {
        for (Transaccion transaccion : listaTransacciones) {
            if (transaccion != null && transaccion.getId().equals(idTransaccion)) {
                return transaccion;
            }
        }
        return null;
    }

    public Usuario obtenerUsuario(String idUsuario) {
        Usuario usuario = null;
        for(Usuario usuario1 : getListaUsuarios()){
            if(usuario1.getIdUsuario().equalsIgnoreCase(idUsuario)){
                usuario = usuario1;
                break;
            }
        }
        return usuario;
    }
    private static GestionBilletera instancia;

    public static GestionBilletera getInstance() {
        if (instancia == null) {
            instancia = new GestionBilletera();
        }
        return instancia;
    }

    public boolean actualizarUsuario(Usuario usuario) {

        Usuario usuarioActual = obtenerUsuario(usuario.getIdUsuario());

        if(usuarioActual != null){

            usuarioActual.setEmailUsuario(usuario.getEmailUsuario());
            usuarioActual.setTelefonoUsuario(usuario.getTelefonoUsuario());
            usuarioActual.setNombreUsuario(usuario.getNombreUsuario());
            usuarioActual.setDireccion(usuario.getDireccion());
            usuarioActual.setSaldo(usuario.getSaldo());


                return true;

        }else {
            return false;
        }
    }
    public boolean crearCategoria(Categoria categoria){
        Categoria Encontrada=obtenerCategoria(categoria.getIdCategoria());
        if(Encontrada==null){
            getListaCategoria().add(categoria);
            return true;
        }else{
            return false;
        }
    }
    public Categoria obtenerCategoria(String idCategoria) {
        for (Categoria categoria : listaCategoria) {
            if (categoria != null && categoria.getIdCategoria().equals(idCategoria)) {
                return categoria;
            }
        }
        return null;
    }

    // cuentas por si se borra copiar desde aca
    public boolean crearCuenta(Cuenta cuenta){
        Cuenta Encontrada=obtenerCuenta(cuenta.getIdCuenta());
        if(Encontrada==null){
            getListaCuentas().add(cuenta);
            return true;
        }else{
            return false;
        }
    }
    public Cuenta obtenerCuenta(String idCuenta) {
        for (Cuenta cuenta : listaCuentas) {
            if (cuenta!= null && cuenta.getIdCuenta().equals(idCuenta)) {
                return cuenta;
            }
        }
        return null;
    }
    public boolean actualizarCuenta(Cuenta cuenta) {

        Cuenta cuentaActual = obtenerCuenta(cuenta.getIdCuenta());

        if(cuentaActual != null){

            cuentaActual.setNombreCuenta(cuenta.getNombreCuenta());
            cuentaActual.setNumeroCuenta(cuenta.getNumeroCuenta());
            cuentaActual.setTipoCuenta(cuenta.getTipoCuenta());

            return true;

        }else {
            return false;
        }
    }
    public boolean eliminarCuenta(String idCuenta) {
        return listaCuentas.removeIf(cuenta -> cuenta.getIdCuenta().equals(idCuenta));
    }

    public void setListaTransacciones(ArrayList<Transaccion> listaTransacciones) {
    }


    //crear un crud de usuarios en administrador
    //crear un crud de cuentas rn administrador
}
