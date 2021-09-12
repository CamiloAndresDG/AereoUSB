/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelador;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Camilo y Roberth
 */
public class Cliente {

    public Cliente siguiente;
    private String nombreCliente;
    private String apellidoCliente;
    private int ccCliente;
    private char generoCliente;
    private String nacionalidadCliente;
    private String correoCliente;
    private int telefonoCliente;
    private boolean pasaBordo;

    public Cliente() {
        this.nombreCliente = "";
        this.apellidoCliente = "";
        this.ccCliente = 0;
        this.generoCliente = ' ';
        this.nacionalidadCliente = "";
        this.correoCliente = "";
        this.telefonoCliente = 0;
        this.pasaBordo = false;
    }

    public Cliente(String nombreCliente, String apellidoCliente, int ccCliente, char generoCliente, String nacionalidadCliente, String correoCliente, int telefonoCliente, boolean visaCliente) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.ccCliente = ccCliente;
        this.generoCliente = generoCliente;
        this.nacionalidadCliente = nacionalidadCliente;
        this.correoCliente = correoCliente;
        this.telefonoCliente = telefonoCliente;
        this.pasaBordo = visaCliente;
    }

    public Cliente(String idVuelo, String fechaSalida, String fechaRegreso, String horaSalida, String horaRegreso, String ciudadOrigen, String ciudadLlegada, int numeroPasajeros, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public int getCcCliente() {
        return ccCliente;
    }

    public void setCcCliente(int ccCliente) {
        this.ccCliente = ccCliente;
    }

    public char getGeneroCliente() {
        return generoCliente;
    }

    public void setGeneroCliente(char generoCliente) {
        this.generoCliente = generoCliente;
    }

    public String getNacionalidadCliente() {
        return nacionalidadCliente;
    }

    public void setNacionalidadCliente(String nacionalidadCliente) {
        this.nacionalidadCliente = nacionalidadCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public Cliente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cliente siguiente) {
        this.siguiente = siguiente;
    }

    public boolean isPasaBordo() {
        return pasaBordo;
    }

    public void setPasaBordo(boolean pasaBordo) {
        this.pasaBordo = pasaBordo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombreCliente);
        hash = 97 * hash + Objects.hashCode(this.apellidoCliente);
        hash = 97 * hash + this.ccCliente;
        hash = 97 * hash + this.generoCliente;
        hash = 97 * hash + Objects.hashCode(this.nacionalidadCliente);
        hash = 97 * hash + Objects.hashCode(this.correoCliente);
        hash = 97 * hash + this.telefonoCliente;
        hash = 97 * hash + (this.pasaBordo ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.ccCliente != other.ccCliente) {
            return false;
        }
        if (this.generoCliente != other.generoCliente) {
            return false;
        }
        if (this.telefonoCliente != other.telefonoCliente) {
            return false;
        }
        if (this.pasaBordo != other.pasaBordo) {
            return false;
        }
        if (!Objects.equals(this.nombreCliente, other.nombreCliente)) {
            return false;
        }
        if (!Objects.equals(this.apellidoCliente, other.apellidoCliente)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidadCliente, other.nacionalidadCliente)) {
            return false;
        }
        if (!Objects.equals(this.correoCliente, other.correoCliente)) {
            return false;
        }
        return true;
    }

    


    

    @Override
    public String toString() {
        return "Cliente( " + "Nombre: " + nombreCliente + ", apellido: " + apellidoCliente + ", cedula: " + ccCliente + ", genero: " + generoCliente + ", nacionalidad: " + nacionalidadCliente + ", correo: " + correoCliente + ", telefono: " + telefonoCliente + ", ¿Tiene VISA?=" + pasaBordo + " )";
    }

}
