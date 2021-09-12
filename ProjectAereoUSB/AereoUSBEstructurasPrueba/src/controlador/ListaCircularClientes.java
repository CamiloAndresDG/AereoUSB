/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.InputStream;
import java.util.Scanner;
import modelador.Cliente;

/**
 *
 * @author Usuario
 */
public class ListaCircularClientes {

    private NodoLista tope;
    private NodoLista ultimo;
    private int cantidad;

    private int size;

    public ListaCircularClientes() {
        cantidad = 0;
        tope = null;
        ultimo = null;
    }

    public NodoLista getTope() {
        return tope;
    }

    public void setTope(NodoLista tope) {
        this.tope = tope;
    }

    public NodoLista getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoLista ultimo) {
        this.ultimo = ultimo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isempty() {
        if (tope == null) {
            return true;

        } else {
            return false;
        }
    }

    public boolean agregarCabeza(Cliente valor) {
        NodoLista nuevo = new NodoLista(valor);
        if (this.isempty()) {
            this.tope = nuevo;
            this.ultimo = nuevo;
            tope.setSiguiente(ultimo);
            this.cantidad++;
            return true;
        } else {
            if (validarExiste(nuevo) == true) {
                return false;
            } else {
                NodoLista aux = this.tope;

                this.tope = nuevo;

                this.tope.setSiguiente(aux);
                this.ultimo.setSiguiente(tope);
                this.cantidad++;
                return true;
            }
        }

    }

    public boolean agregarCola(Cliente valor) {
        NodoLista nuevo = new NodoLista(valor);
        if (this.isempty()) {
            this.tope = nuevo;
            this.ultimo = nuevo;
            ultimo.setSiguiente(tope);
            this.cantidad++;
            return true;

        } else {
            if (validarExiste(nuevo) == true) {
                return false;
            } else {

                nuevo.setSiguiente(tope);
                ultimo.setSiguiente(nuevo);
                ultimo = nuevo;
                this.cantidad++;
                return true;
            }
        }

    }

    //Retorna el valor de un nodo en una posición indicada
    public Cliente consultarValor(Cliente buscado) {
        NodoLista aux = tope;
        Cliente cuantos = null;
        boolean encontro = false;
        while (!encontro) {
            if (cuantos == buscado) {
                return aux.getElemento();
            }
            aux = aux.getSiguiente();
        }
        return null;

    }

    //Dice si existe o no un nodo con el valor dado
    public Cliente buscar(int buscado) {
        NodoLista aux = tope;
        if (tope.getElemento().getCcCliente() == buscado) {
            return aux.getElemento();
        }
        while (aux.getElemento().getCcCliente() != tope.getElemento().getCcCliente()) {
            if (aux.getElemento().getCcCliente() == buscado) {
                return aux.getElemento();
            } else {
                buscarPorSig(buscado);
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    public boolean validarExiste(NodoLista nuevo) {
        NodoLista aux = tope;
        boolean encontro = false;

        if (tope.getElemento().getCcCliente() == nuevo.getElemento().getCcCliente()) {
            encontro = true;
            return true;
        } else {
            while (!encontro && aux.getElemento().getCcCliente() != tope.getElemento().getCcCliente()) {
                if (aux.getElemento().getCcCliente() == nuevo.getElemento().getCcCliente()) {
                    encontro = true;
                    return true;
                }
                aux = aux.getSiguiente();
            }
        }
        return false;
    }

    /*public boolean validarExiste(Vuelo elemento) {
        NodoCola aux = primero;
        while (aux != null) {
            if (aux.getElemento().getIdVuelo().equalsIgnoreCase(elemento.getIdVuelo())) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }*/
    public void eliminarPorDato(int borrado) {

        if (this.tope.getElemento().getCcCliente() == borrado) {
            tope = this.tope.getSiguiente();
            ultimo.setSiguiente(tope);
            this.cantidad--;
        } else {
            NodoLista actual = this.tope.getSiguiente();
            boolean encontro = false;
            NodoLista anterior = tope;
            while (!encontro && tope.getElemento() != actual.getElemento()) {
                if (actual.getElemento().getCcCliente() == borrado) {
                    encontro = true;
                } else {
                    anterior = actual;
                    actual = actual.getSiguiente();
                }
            }
            if (encontro) {
                anterior.setSiguiente(actual.getSiguiente());
            }
            this.cantidad--;
        }
    }

    public void eilminarPorPosicion(int borrado) {
        int cuantos = 1;
        if (cuantos == borrado) {
            tope = this.tope.getSiguiente();
            ultimo.setSiguiente(tope);
            this.cantidad--;
            //System.out.println("Borra clase archivo");
        } else {
            cuantos++;
            NodoLista actual = this.tope.getSiguiente();
            boolean encontro = false;
            NodoLista sig = tope;
            while (actual.getElemento() != tope.getElemento() && !encontro) {
                if (cuantos == borrado) {
                    encontro = true;
                } else {
                    sig = actual;
                    actual = actual.getSiguiente();
                    cuantos++;
                }
            }
            if (encontro) {
                sig.setSiguiente(actual.getSiguiente());
            }
            this.cantidad--;

        }
    }

    public void vaciar() {
        tope = null;
        ultimo = null;
        cantidad = 0;

    }

    public boolean validarExiste(Cliente elemento) {
        NodoLista aux = tope;
        while (aux != null) {
            if (aux.getElemento().getCcCliente() == elemento.getCcCliente()) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    public String mostrarLista() {
        NodoLista aux = ultimo.getSiguiente();
        String cadena = " ";
        do {
            cadena = cadena + aux.getElemento() + "\n";
            aux = aux.getSiguiente();
        } while (aux != ultimo.getSiguiente());
        System.out.println(cadena);
        return cadena;
    }

    public int getSize() {
        return size;
    }

    public boolean buscarPorSig(int buscado) {
        NodoLista aux = tope.getSiguiente();
        if (tope.getElemento().getCcCliente() == buscado) {
            return true;
        }
        while (aux.getElemento().getCcCliente() != tope.getElemento().getCcCliente()) {
            if (aux.getElemento().getCcCliente() == buscado) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

}
