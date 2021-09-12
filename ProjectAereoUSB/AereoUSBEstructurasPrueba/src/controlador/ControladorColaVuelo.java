package controlador;

import modelador.Vuelo;
import modelador.Avion;

public class ControladorColaVuelo {

    Avion avion;
    //Atributos
    private NodoCola primero;
    private NodoCola ultimo;
    private int tamanio;

    public ControladorColaVuelo() {
        primero = null;
        ultimo = null;
        tamanio = 0;

    }

    /**
     * Indica si la cola esta vacia
     *
     * @return
     */
    public boolean colaVacia() {
        return primero == null;
    }

    /**
     * Indica el tamaño de la cola
     *
     * @return
     */
    public int tamanioCola() {
        return tamanio;
    }

    /**
     * Devuelve el primer elemento en la cola
     *
     * @return
     */
    public Vuelo vueloCabeza() {
        if (colaVacia()) {
            return null;
        }
        return primero.getElemento();

    }

    /**
     * Elimina y devuelve el primer elemento de la cola
     *
     * @return
     */
    public Vuelo cancelarVuelo() {
        if (colaVacia()) {
            return null;
        }

        Vuelo elemento = primero.getElemento();
        NodoCola aux = primero.getSiguiente();
        primero = null;
        primero = aux;
        tamanio--;
        if (colaVacia()) {
            primero = null;
        }
        return elemento;
    }

    /**
     * Añade un nuevo elemento a la cola
     *
     * @param elemento
     * @return
     */
    public boolean agregarVuelo(Vuelo elemento) {

        NodoCola aux = new NodoCola(elemento, null);

        if (colaVacia()) {
            primero = aux;
            ultimo = aux;
            tamanio++;
            return true;
        } else {
            ultimo.setSiguiente(aux);
            ultimo = aux;
            tamanio++;
        }

        return true;

    }

    /**
     * Muestra el contenido
     *
     * @return
     */
    public String toString() {

        if (colaVacia()) {
            return "La cola esta vacia";
        } else {

            String cadena = " ";

            NodoCola aux = primero;
            while (aux != null) {
                cadena += aux;
                aux = aux.getSiguiente();
            }

            return cadena;

        }
    }

    public boolean validarExiste(Vuelo elemento) {
        NodoCola aux = primero;
        while (aux != null) {
            if (aux.getElemento().getIdVuelo().equalsIgnoreCase(elemento.getIdVuelo())) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    public boolean validarExisteID(String elemento) {
        NodoCola aux = primero;
        while (aux != null) {
            if (aux.getElemento().getIdVuelo().equalsIgnoreCase(elemento)) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    public NodoCola darVueloBuscado(String IDVuelo) {

        NodoCola aux = primero;
        while (aux != null) {
            if (aux.getElemento().getIdVuelo().equalsIgnoreCase(IDVuelo)) {
                return aux;
            }
            aux = aux.getSiguiente();
        }
        return aux;
    }

    public void cancelarPorID(String borrado) {

        if (primero.getElemento().getIdVuelo() == borrado) {
            primero = this.primero.getSiguiente();
            ultimo.setSiguiente(primero);

            this.tamanio--;
            //System.out.println("Borra clase archivo");
        } else {

            NodoCola actual = primero.getSiguiente();
            boolean encontro = false;
            NodoCola anterior = primero;

            while (!encontro && primero.getElemento() != actual.getElemento()) {

                if (actual.getElemento().getIdVuelo() == borrado) {
                    encontro = true;
                } else {
                    anterior = actual;

                    actual = actual.getSiguiente();

                }

            }

            if (encontro) {
                anterior.setSiguiente(actual.getSiguiente());
            }
            this.tamanio--;
        }
    }

    public String mostrarCola() {
        NodoCola aux = primero;
        String cadena = " ";
        do {
            cadena = cadena + aux.getElemento() + "\n";
            aux = aux.getSiguiente();
        } while (aux != null);
        System.out.println(cadena);
        return cadena;
    }

    public void eliminarPorDato(String borrado) {

        if (this.primero.getElemento().getIdVuelo() == borrado) {
            primero = this.primero.getSiguiente();
            ultimo.setSiguiente(primero);
            this.tamanio--;
        } else {
            NodoCola actual = this.primero.getSiguiente();
            boolean encontro = false;
            NodoCola anterior = primero;
            while ((!encontro) && (primero.getElemento() != actual.getElemento()) && actual != null) {
                if (actual.getElemento().getIdVuelo() == borrado) {
                    encontro = true;
                } else {
                    anterior = actual;
                    actual = actual.getSiguiente();
                }
            }
            if (encontro) {
                anterior.setSiguiente(actual.getSiguiente());
            }
            this.tamanio--;
        }
    }

    public boolean vincularClienteAVuelo(Vuelo elemento) {
        NodoCola aux = new NodoCola(elemento, null);
        int contenedorAsientos = 0;
        if (colaVacia()) {
            System.out.println("No hay vuelos");
        } else {
            contenedorAsientos = avion.getNumeroAsientos();
           
        }
        return true;
    }

}

//    public void cancelarPorID(String IDbuscado) {
//        if (!colaVacia()) {
//            NodoCola aux = primero;
//            while (aux != null) {
//                if (aux.getElemento().getIdVuelo().equalsIgnoreCase(IDbuscado)) {
//               
//                    
//                    tamanio--;
//                } else {
//                    aux = aux.getSiguiente();
//                }
//            }
//        }
//    }

