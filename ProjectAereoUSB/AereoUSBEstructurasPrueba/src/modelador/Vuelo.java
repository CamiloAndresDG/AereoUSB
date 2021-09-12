/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelador;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author 306
 */
public class Vuelo {

    Avion avion;
    
    private String idVuelo;
    private String fechaIda;
    private String fechaRegreso;
    private String horaIda;
    private String horaRegreso;
    private String ciudadIda;
    private String ciudadRegreso;
    private int cantDePasajeros;
    private String estadoDelVuelo;
   

    public Vuelo() {
        this.idVuelo = "";
        this.fechaIda = "";
        this.fechaRegreso = "";
        this.horaIda = "";
        this.horaRegreso = "";
        this.ciudadIda = "";
        this.ciudadRegreso = "";
        this.cantDePasajeros = 0;
        this.estadoDelVuelo =  "";
    }
    
    public Vuelo(String idVuelo, String fechaIda, String fechaRegreso, String horaIda, String horaRegreso, String ciudadIda, String ciudadRegreso, int cantDePasajeros, String estadoDelVuelo) {
        this.idVuelo = idVuelo;
        this.fechaIda = fechaIda;
        this.fechaRegreso = fechaRegreso;
        this.horaIda = horaIda;
        this.horaRegreso = horaRegreso;
        this.ciudadIda = ciudadIda;
        this.ciudadRegreso = ciudadRegreso;
        this.cantDePasajeros = cantDePasajeros;
        this.estadoDelVuelo = estadoDelVuelo;
    }


    public String getIdVuelo() {
        return idVuelo;
    }

    public String getFechaIda() {
        return fechaIda;
    }

    public String getFechaRegreso() {
        return fechaRegreso;
    }

    public String getHoraIda() {
        return horaIda;
    }

    public String getHoraRegreso() {
        return horaRegreso;
    }

    public String getCiudadIda() {
        return ciudadIda;
    }

    public String getCiudadRegreso() {
        return ciudadRegreso;
    }

    public int getCantDePasajeros() {
        return cantDePasajeros;
    }

    public String isEstadoDelVuelo() {
        return estadoDelVuelo;
    }

    public void setIdVuelo(String idVuelo) {
        this.idVuelo = idVuelo;
    }

    public void setFechaIda(String fechaIda) {
        this.fechaIda = fechaIda;
    }

    public void setFechaRegreso(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public void setHoraIda(String horaIda) {
        this.horaIda = horaIda;
    }

    public void setHoraRegreso(String horaRegreso) {
        this.horaRegreso = horaRegreso;
    }

    public void setCiudadIda(String ciudadIda) {
        this.ciudadIda = ciudadIda;
    }

    public void setCiudadRegreso(String ciudadRegreso) {
        this.ciudadRegreso = ciudadRegreso;
    }

    public void setCantDePasajeros(int cantDePasajeros) {
        this.cantDePasajeros = cantDePasajeros;
    }

    public void setEstadoDelVuelo(String estadoDelVuelo) {
        this.estadoDelVuelo = estadoDelVuelo;
    }

    public String getEstadoDelVuelo() {
        return estadoDelVuelo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.idVuelo);
        hash = 59 * hash + Objects.hashCode(this.fechaIda);
        hash = 59 * hash + Objects.hashCode(this.fechaRegreso);
        hash = 59 * hash + Objects.hashCode(this.horaIda);
        hash = 59 * hash + Objects.hashCode(this.horaRegreso);
        hash = 59 * hash + Objects.hashCode(this.ciudadIda);
        hash = 59 * hash + Objects.hashCode(this.ciudadRegreso);
        hash = 59 * hash + this.cantDePasajeros;
        hash = 59 * hash + Objects.hashCode(this.estadoDelVuelo);
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
        final Vuelo other = (Vuelo) obj;
        if (this.cantDePasajeros != other.cantDePasajeros) {
            return false;
        }
        if (!Objects.equals(this.idVuelo, other.idVuelo)) {
            return false;
        }
        if (!Objects.equals(this.fechaIda, other.fechaIda)) {
            return false;
        }
        if (!Objects.equals(this.fechaRegreso, other.fechaRegreso)) {
            return false;
        }
        if (!Objects.equals(this.horaIda, other.horaIda)) {
            return false;
        }
        if (!Objects.equals(this.horaRegreso, other.horaRegreso)) {
            return false;
        }
        if (!Objects.equals(this.ciudadIda, other.ciudadIda)) {
            return false;
        }
        if (!Objects.equals(this.ciudadRegreso, other.ciudadRegreso)) {
            return false;
        }
        if (!Objects.equals(this.estadoDelVuelo, other.estadoDelVuelo)) {
            return false;
        }
        return true;
    }

    
    
    

    @Override
    public String toString() {
        return "Vuelo{" + "idVuelo=" + idVuelo + ", fechaIda=" + fechaIda + ", fechaRegreso=" + fechaRegreso + ", horaIda=" + horaIda + ", horaRegreso=" + horaRegreso + ", ciudadIda=" + ciudadIda + ", ciudadRegreso=" + ciudadRegreso + ", cantDePasajeros=" + cantDePasajeros + ", estadoDelVuelo=" + estadoDelVuelo + '}';
    }
    
}
