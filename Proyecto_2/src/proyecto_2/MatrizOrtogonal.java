package proyecto_2;

import java.util.*;

public class MatrizOrtogonal {

    private ListaVertical listaVertical;
    private ListaHorizontal listaHorizontal;

    // Constructor que inicializa las listas verticales y horizontales
    public MatrizOrtogonal() {
        listaVertical = new ListaVertical();
        listaHorizontal = new ListaHorizontal();
    }

    // Método para insertar un nodo en la matriz ortogonal
    public void insertarNodo(nodoOrtogonal nodo) {
        listaVertical.insertarNodo(nodo);
        listaHorizontal.insertarNodo(nodo);
    }

    // Método para eliminar un nodo de la matriz ortogonal
    public void eliminarNodo(String propiedad, String valor) {
        nodoOrtogonal nodo = buscarnodo(propiedad, valor);

        if (nodo != null) {
            eliminarNodHorizontal(nodo);
            eliminarNodVertical(nodo);
            System.out.println("Nodo eliminado correctamente.");
        } else {
            System.out.println("No se encontro el nodo con " + propiedad + " = " + valor);
        }
    }

    // Método auxiliar para buscar horizontalmente
    private nodoOrtogonal buscaNodHorizontal(int x) {
        nodoOrtogonal nodo = listaHorizontal.getPrimero();
        while (nodo != null) {
            if (nodo.getX() == x) {
                return nodo;
            }
            nodo = nodo.getDerecha();
        }
        return null;
    }

    // Método auxiliar para buscar verticalmente
    private nodoOrtogonal buscaNodVertical(int y) {
        nodoOrtogonal nodo = listaVertical.getPrimero();
        while (nodo != null) {
            if (nodo.getY() == y) {
                return nodo;
            }
            nodo = nodo.getAbajo();
        }
        return null;
    }

    // Método auxiliar para eliminar en X
    private void eliminarNodHorizontal(nodoOrtogonal nodo) {
        nodoOrtogonal izquierda = nodo.getIzquierda();
        nodoOrtogonal derecha = nodo.getDerecha();

        if (izquierda != null) {
            izquierda.setDerecha(derecha);
        } else {
            listaHorizontal.setPrimero(derecha);
        }

        if (derecha != null) {
            derecha.setIzquierda(izquierda);
        } else {
            listaHorizontal.setUltimo(izquierda);
        }
    }

    // Método auxiliar para eliminar en Y
    private void eliminarNodVertical(nodoOrtogonal nodo) {
        nodoOrtogonal arriba = nodo.getArriba();
        nodoOrtogonal abajo = nodo.getAbajo();

        if (arriba != null) {
            arriba.setAbajo(abajo);
        } else {
            listaVertical.setPrimero(abajo);
        }

        if (abajo != null) {
            abajo.setArriba(arriba);
        } else {
            listaVertical.setUltimo(arriba);
        }
    }

    // Método para buscar un nodo por una propiedad específica
    public nodoOrtogonal buscarnodo(String propiedad, String valor) {
        nodoOrtogonal actual = listaHorizontal.getPrimero();

        // Recorremos la lista horizontal
        while (actual != null) {
            switch (propiedad) {
                case "placa":
                    if (actual.getPlaca().equalsIgnoreCase(valor)) {
                        return actual;
                    }
                    break;
                case "color":
                    if (actual.getColor().equalsIgnoreCase(valor)) {
                        return actual;
                    }
                    break;
                case "linea":
                    if (actual.getLinea().equalsIgnoreCase(valor)) {
                        return actual;
                    }
                    break;
                case "modelo":
                    if (actual.getModelo().equalsIgnoreCase(valor)) {
                        return actual;
                    }
                    break;
                case "propietario":
                    if (actual.getPropietario().equalsIgnoreCase(valor)) {
                        return actual;
                    }
                    break;
            }
            actual = actual.getDerecha();
        }

        // Si no se encontró en la lista horizontal, buscamos en la lista vertical
        actual = listaVertical.getPrimero();
        while (actual != null) {
            switch (propiedad) {
                case "placa":
                    if (actual.getPlaca().equalsIgnoreCase(valor)) {
                        return actual;
                    }
                    break;
                case "color":
                    if (actual.getColor().equalsIgnoreCase(valor)) {
                        return actual;
                    }
                    break;
                case "linea":
                    if (actual.getLinea().equalsIgnoreCase(valor)) {
                        return actual;
                    }
                    break;
                case "modelo":
                    if (actual.getModelo().equalsIgnoreCase(valor)) {
                        return actual;
                    }
                    break;
                case "propietario":
                    if (actual.getPropietario().equalsIgnoreCase(valor)) {
                        return actual;
                    }
                    break;
            }
            actual = actual.getAbajo();
        }

        return null; // Nodo no encontrado
    }
}
