/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelador.Cliente;

/**
 *
 * @author Usuario
 * @param <object>
 */
public class NodoLista {

    private NodoLista siguiente;
    private Cliente elemento;

    public NodoLista(Cliente elemento) {
        this.elemento = elemento;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }

    public Cliente getElemento() {
        return elemento;
    }

    public void setElemento(Cliente elemento) {
        this.elemento = elemento;
    }

}
