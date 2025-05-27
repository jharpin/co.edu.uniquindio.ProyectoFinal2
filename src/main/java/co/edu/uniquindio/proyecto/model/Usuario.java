package co.edu.uniquindio.proyecto.model;

import co.edu.uniquindio.proyecto.model.builder.UsuarioBuilder;

public class Usuario {
        private String idUsuario;
        private String nombreUsuario;
        private String emailUsuario;
        private String telefonoUsuario;
        private String contraseniaUsuario;
        private String direccion;
        private double saldo;

        public Usuario( String nombreUsuario,String idUsuario, String emailUsuario, String telefonoUsuario, String contraseniaUsuario,String direccion,double saldo) {

            this.idUsuario = idUsuario;
            this.nombreUsuario = nombreUsuario;
            this.emailUsuario = emailUsuario;
            this.telefonoUsuario = telefonoUsuario;
            this.contraseniaUsuario = contraseniaUsuario;
            this.direccion = direccion;
            this.saldo = saldo;
        }

    public String getIdUsuario() {return idUsuario;}

    public void setIdUsuario(String idUsuario) {this.idUsuario = idUsuario;}

    public String getNombreUsuario() {return nombreUsuario;}

    public void setNombreUsuario(String nombreUsuario) {this.nombreUsuario = nombreUsuario;}

    public String getEmailUsuario() {return emailUsuario;}

    public void setEmailUsuario(String emailUsuario) {this.emailUsuario = emailUsuario;}

    public String getTelefonoUsuario() {return telefonoUsuario;}

    public void setTelefonoUsuario(String telefonoUsuario) {this.telefonoUsuario = telefonoUsuario;}

    public String getContraseniaUsuario() {return contraseniaUsuario;}

    public String getDireccion() {
        return direccion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setContraseniaUsuario(String contraseniaUsuario) {this.contraseniaUsuario = contraseniaUsuario;}
    public static UsuarioBuilder builder( ) {
        return new UsuarioBuilder();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", idUsuario='" + idUsuario + '\'' +
                ", emailUsuario='" + emailUsuario + '\'' +
                ", telefonoUsuario='" + telefonoUsuario + '\'' +
                ", contraseniaUsuario='" + contraseniaUsuario + '\'' +
                '}';
    }


    public void setDireccion(String direccion) {
            this.direccion = direccion;
    }

    public void setSaldo(double saldo) {
            this.saldo = saldo;
    }
}
