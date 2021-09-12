/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelador;

import java.util.Objects;

/**
 *
 * @author 306
 */
public class Trabajador {

    private String idTrabajador;
    private String nombreTrabajador;
    private String apellidoTrabajador;
    private int ccTrabajador;
    private String tipoTrabajador;
    private String nacionalidadTrabajador;
    private char generoTrabajador;
    private String correoTrabajador;
    private int telefonoTrabajador;
    private boolean estadoTrabajando;
    private boolean visaTrabajador;

    public Trabajador() {
        this.idTrabajador = "";
        this.nombreTrabajador = "";
        this.apellidoTrabajador = "";
        this.ccTrabajador = 0;
        this.tipoTrabajador = "";
        this.nacionalidadTrabajador = "";
        this.generoTrabajador = ' ';
        this.correoTrabajador = "";
        this.telefonoTrabajador = 0;
        this.estadoTrabajando = true;
        this.visaTrabajador = true;
    }

    public Trabajador(String idTrabajador, String nombreTrabajador, String apellidoTrabajador, int ccTrabajador, String tipoTrabajador, String nacionalidadTrabajador, char generoTrabajador, String correoTrabajador, int telefonoTrabajador, boolean estadoTrabajando, boolean visaTrabajador) {
        this.idTrabajador = idTrabajador;
        this.nombreTrabajador = nombreTrabajador;
        this.apellidoTrabajador = apellidoTrabajador;
        this.ccTrabajador = ccTrabajador;
        this.tipoTrabajador = tipoTrabajador;
        this.nacionalidadTrabajador = nacionalidadTrabajador;
        this.generoTrabajador = generoTrabajador;
        this.correoTrabajador = correoTrabajador;
        this.telefonoTrabajador = telefonoTrabajador;
        this.estadoTrabajando = estadoTrabajando;
        this.visaTrabajador = visaTrabajador;
    }

    public String getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(String idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public String getApellidoTrabajador() {
        return apellidoTrabajador;
    }

    public void setApellidoTrabajador(String apellidoTrabajador) {
        this.apellidoTrabajador = apellidoTrabajador;
    }

    public int getCcTrabajador() {
        return ccTrabajador;
    }

    public void setCcTrabajador(int ccTrabajador) {
        this.ccTrabajador = ccTrabajador;
    }

    public String getTipoTrabajador() {
        return tipoTrabajador;
    }

    public void setTipoTrabajador(String tipoTrabajador) {
        this.tipoTrabajador = tipoTrabajador;
    }

    public String getNacionalidadTrabajador() {
        return nacionalidadTrabajador;
    }

    public void setNacionalidadTrabajador(String nacionalidadTrabajador) {
        this.nacionalidadTrabajador = nacionalidadTrabajador;
    }

    public char getGeneroTrabajador() {
        return generoTrabajador;
    }

    public void setGeneroTrabajador(char generoTrabajador) {
        this.generoTrabajador = generoTrabajador;
    }

    public String getCorreoTrabajador() {
        return correoTrabajador;
    }

    public void setCorreoTrabajador(String correoTrabajador) {
        this.correoTrabajador = correoTrabajador;
    }

    public int getTelefonoTrabajador() {
        return telefonoTrabajador;
    }

    public void setTelefonoTrabajador(int telefonoTrabajador) {
        this.telefonoTrabajador = telefonoTrabajador;
    }

    public boolean isEstadoTrabajando() {
        return estadoTrabajando;
    }

    public void setEstadoTrabajando(boolean estadoTrabajando) {
        this.estadoTrabajando = estadoTrabajando;
    }

    public boolean isVisaTrabajador() {
        return visaTrabajador;
    }

    public void setVisaTrabajador(boolean visaTrabajador) {
        this.visaTrabajador = visaTrabajador;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.idTrabajador);
        hash = 61 * hash + Objects.hashCode(this.nombreTrabajador);
        hash = 61 * hash + Objects.hashCode(this.apellidoTrabajador);
        hash = 61 * hash + this.ccTrabajador;
        hash = 61 * hash + Objects.hashCode(this.tipoTrabajador);
        hash = 61 * hash + Objects.hashCode(this.nacionalidadTrabajador);
        hash = 61 * hash + this.generoTrabajador;
        hash = 61 * hash + Objects.hashCode(this.correoTrabajador);
        hash = 61 * hash + this.telefonoTrabajador;
        hash = 61 * hash + (this.estadoTrabajando ? 1 : 0);
        hash = 61 * hash + (this.visaTrabajador ? 1 : 0);
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
        final Trabajador other = (Trabajador) obj;
        if (this.ccTrabajador != other.ccTrabajador) {
            return false;
        }
        if (this.generoTrabajador != other.generoTrabajador) {
            return false;
        }
        if (this.telefonoTrabajador != other.telefonoTrabajador) {
            return false;
        }
        if (this.estadoTrabajando != other.estadoTrabajando) {
            return false;
        }
        if (this.visaTrabajador != other.visaTrabajador) {
            return false;
        }
        if (!Objects.equals(this.idTrabajador, other.idTrabajador)) {
            return false;
        }
        if (!Objects.equals(this.nombreTrabajador, other.nombreTrabajador)) {
            return false;
        }
        if (!Objects.equals(this.apellidoTrabajador, other.apellidoTrabajador)) {
            return false;
        }
        if (!Objects.equals(this.tipoTrabajador, other.tipoTrabajador)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidadTrabajador, other.nacionalidadTrabajador)) {
            return false;
        }
        if (!Objects.equals(this.correoTrabajador, other.correoTrabajador)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "idTrabajador=" + idTrabajador + ", nombreTrabajador=" + nombreTrabajador + ", apellidoTrabajador=" + apellidoTrabajador + ", ccTrabajador=" + ccTrabajador + ", tipoTrabajador=" + tipoTrabajador + ", nacionalidadTrabajador=" + nacionalidadTrabajador + ", generoTrabajador=" + generoTrabajador + ", correoTrabajador=" + correoTrabajador + ", telefonoTrabajador=" + telefonoTrabajador + ", estadoTrabajando=" + estadoTrabajando + ", visaTrabajador=" + visaTrabajador + '}';
    }
    
    

}
