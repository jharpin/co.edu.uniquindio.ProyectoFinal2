package co.edu.uniquindio.proyecto.model;
import co.edu.uniquindio.proyecto.mapping.dto.TransaccionDto;
import co.edu.uniquindio.proyecto.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyecto.model.builder.TransaccionBuilder;
import co.edu.uniquindio.proyecto.model.builder.UsuarioBuilder;

import java.util.ArrayList;

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
        return false;
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
        return null;
    }
    public Usuario buscarUsuarioPorId(String idUsuario) {
        return listaUsuarios.stream()
                .filter(u -> u.getIdUsuario().equals(idUsuario))
                .findFirst()
                .orElse(null);
    }

    public boolean actualizarUsuario(Usuario usuario) {

        Usuario usuarioActual = obtenerUsuario(usuario.getIdUsuario());

        if(usuarioActual != null){

                usuarioActual.setNombreUsuario(usuario.getNombreUsuario());
                usuario.setEmailUsuario(usuario.getEmailUsuario());
                usuario.setTelefonoUsuario(usuario.getTelefonoUsuario());

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

    //crear un crud de usuarios en administrador
    //crear un crud de cuentas rn administrador
}
