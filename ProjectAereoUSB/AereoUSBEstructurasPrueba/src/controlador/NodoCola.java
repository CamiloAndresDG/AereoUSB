/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelador.Vuelo;

/**
 *
 * @author 102
 */
public class NodoCola {

    //Atributos
    private Vuelo elemento;
    private NodoCola siguiente; //Apunta al siguiente nodo

    //Contructor
    public NodoCola(Vuelo elemento, NodoCola siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    //Metodos
    public Vuelo getElemento() {
        return elemento;
    }

    public void setElemento(Vuelo elemento) {
        this.elemento = elemento;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return elemento + "\n";
    }
}

