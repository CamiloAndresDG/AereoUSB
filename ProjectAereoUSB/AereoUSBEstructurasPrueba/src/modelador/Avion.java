/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelador;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author 306
 */
public class Avion{

    //DATOS
    public Avion siguiente;
    public String matricula;
    public String marca;
    public String modelo;
    public int numeroAsientos;
    public double cantidadEquipajeSoportado;
    public double costoMantenimiento;
    public double costoHangar;

    public Avion() {
        matricula = "";
        marca = "";
        modelo = "";
        numeroAsientos = 0;
        cantidadEquipajeSoportado = 0.0;
        costoMantenimiento = 0.0;
        costoHangar = 0.0;
    }

    public Avion(String nMatricula, String nMarca, String nModelo, int nNumeroAsientos, double nCantidadEquipajeSoportado, double nCostoMantenimiento, double nCostoHangar) {
        this.matricula = nMatricula;
        this.marca = nMarca;
        this.modelo = nModelo;
        this.numeroAsientos = nNumeroAsientos;
        this.cantidadEquipajeSoportado = nCantidadEquipajeSoportado;
        this.costoMantenimiento = nCostoMantenimiento;
        this.costoHangar = nCostoHangar;
    }

    public void setSiguiente(Avion siguiente) {
        this.siguiente = siguiente;
    }

    public Avion getSiguiente() {
        return siguiente;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public double getCantidadEquipajeSoportado() {
        return cantidadEquipajeSoportado;
    }

    public void setCantidadEquipajeSoportado(double cantidadEquipajeSoportado) {
        this.cantidadEquipajeSoportado = cantidadEquipajeSoportado;
    }

    public double getCostoMantenimiento() {
        return costoMantenimiento;
    }

    public void setCostoMantenimiento(double costoMantenimiento) {
        this.costoMantenimiento = costoMantenimiento;
    }

    public double getCostoHangar() {
        return costoHangar;
    }

    public void setCostoHangar(double costoHangar) {
        this.costoHangar = costoHangar;
    }

    
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.matricula);
        hash = 29 * hash + Objects.hashCode(this.marca);
        hash = 29 * hash + Objects.hashCode(this.modelo);
        hash = 29 * hash + this.numeroAsientos;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.cantidadEquipajeSoportado) ^ (Double.doubleToLongBits(this.cantidadEquipajeSoportado) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.costoMantenimiento) ^ (Double.doubleToLongBits(this.costoMantenimiento) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.costoHangar) ^ (Double.doubleToLongBits(this.costoHangar) >>> 32));
        return hash;
    }

    
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
        final Avion other = (Avion) obj;
        if (this.numeroAsientos != other.numeroAsientos) {
            return false;
        }
        if (Double.doubleToLongBits(this.cantidadEquipajeSoportado) != Double.doubleToLongBits(other.cantidadEquipajeSoportado)) {
            return false;
        }
        if (Double.doubleToLongBits(this.costoMantenimiento) != Double.doubleToLongBits(other.costoMantenimiento)) {
            return false;
        }
        if (Double.doubleToLongBits(this.costoHangar) != Double.doubleToLongBits(other.costoHangar)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Avion( " + "Matricula:" + matricula + ", marca:" + marca + ", modelo:" + modelo + ", numero de asientos:" + numeroAsientos + ", cantidad de equipaje soportado:" + cantidadEquipajeSoportado + ", costo de mantenimiento:" + costoMantenimiento + ", costo del hangar:" + costoHangar + " )";
    }
}
