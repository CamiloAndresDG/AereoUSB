/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JList;
import javax.swing.JOptionPane;
import modelador.Avion;
import modelador.Cliente;

/**
 *
 * @author Usuario
 */
public class ControladorPilaAvion {

    public Avion topeAviones;
    public int totalAviones;

    String arr[];

    public ControladorPilaAvion() {
        this.totalAviones = 0;
        arr = new String[2];
    }

    public void setTopeAviones(Avion topeAviones) {
        this.topeAviones = topeAviones;
    }

    public void setTotalAviones(int totalAviones) {
        this.totalAviones = totalAviones;
    }

    public Avion getTopeAviones() {
        return topeAviones;
    }

    public int getTotalAviones() {
        return totalAviones;
    }

    public boolean emptyAvion() {
        if (topeAviones == null) {
            return true;
        } else {
            return false;
        }

    }

    public boolean pushAvion(Avion elemento) {
        if (emptyAvion() == true) {
            topeAviones = elemento;
            totalAviones++;
            return true;
        } else {
            if (validarExiste(elemento) == true) {
                return false;
            } else {
                Avion aux = topeAviones;
                topeAviones = elemento;
                topeAviones.setSiguiente(aux);
                totalAviones++;
                return true;
            }
        }
    }

    public void popAvion(String borrado) {
        if (this.topeAviones.getMatricula().equalsIgnoreCase(borrado)) {
            Avion siguiente = this.topeAviones.getSiguiente();
            this.topeAviones = siguiente;
            this.totalAviones--;
        } else {
            Avion anterior = null;
            Avion actual = this.topeAviones;
            boolean encontro = false;

            while (actual != null && !encontro) {
                if (actual.getMatricula().equalsIgnoreCase(borrado)) {
                    encontro = true;
                } else {
                    anterior = actual;
                    actual = actual.getSiguiente();
                }
            }
            if (encontro) {
                anterior.setSiguiente(actual.getSiguiente());
            }
            this.totalAviones--;
        }
    }

    public int TotalAviones() {
        return this.totalAviones;
    }

    public Avion buscarPorMatricula(String buscado) {
        Avion aux = topeAviones;

        while (aux != null) {
            if (aux.getMatricula().equalsIgnoreCase(buscado)) {
                return aux;
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    public boolean validarExiste(Avion elemento) {
        Avion aux = topeAviones;
        while (aux != null) {
            if (aux.getMatricula().equalsIgnoreCase(elemento.getMatricula())) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    public String[] darAviones() {
        String aviones[] = new String[this.totalAviones];
        String actual = " ";
        Avion aux = this.topeAviones;
        int cont = 0;

        while (aux != null) {
            {
                actual = "Matricula: " + aux.getMatricula() + ", marca: " + aux.getMarca() + ", modelo: " + aux.getModelo() + ", numero de asientos: " + aux.getNumeroAsientos() + ", cantidad de equipaje soportado: " + aux.getCantidadEquipajeSoportado() + ", costo del mantenimiento: " + aux.getCostoMantenimiento() + ", costo del hangar: " + aux.getCostoHangar();
                aviones[cont] = actual;
                cont++;
            }
            aux = aux.getSiguiente();
        }
        return aviones;
    }

}
