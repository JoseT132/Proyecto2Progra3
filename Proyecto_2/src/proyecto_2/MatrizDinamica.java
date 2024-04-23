package proyecto_2;

public class MatrizDinamica {

    private Nodo inicio;

    // Constructor
    public MatrizDinamica() {
        this.inicio = null;
    }

    public void insertarDato(Vehiculo vehiculo, int fila, int columna) {
        // Creación del nodo con los datos
        Nodo newNodo = new Nodo(vehiculo);
        // Si la matriz está vacia el nuevo nodo sera el inicio
        if (inicio == null) {
            inicio = newNodo;
            return;
        }
        // Buscar la fila en la que se insertara el nuevo nodo
        Nodo nodoFila = buscarFila(fila);

        // Si no se encuentra la fila crear una nueva fila
        if (nodoFila == null) {
            nodoFila = new Nodo(null); // La fila inicialmente esta vacia
            nodoFila.setSiguienteFila(inicio);
            inicio = nodoFila;
        }
        // Buscar la columna en la que se insertara el nuevo nodo
        Nodo nodoColumna = buscarColumna(columna);
        if (nodoColumna == null) {
            nodoColumna = new Nodo(null); // La columna inicialmente esta vacia
            nodoColumna.setSiguienteColumna(inicio);
            inicio = nodoColumna;
        }
        // Insertar el nuevo nodo en la fila
        Nodo temp = nodoFila;
        while (temp.getSiguienteColumna() != null && temp.getSiguienteColumna().getDato() != null) {
            temp = temp.getSiguienteColumna();
        }
        temp.setSiguienteColumna(newNodo);

        // Insertar el nuevo nodo en la columna
        temp = nodoColumna;
        while (temp.getSiguienteFila() != null && temp.getSiguienteFila().getDato() != null) {
            temp = temp.getSiguienteFila();
        }
        temp.setSiguienteFila(newNodo);
    }

    private Nodo buscarFila(int fila) {
        Nodo temp = inicio;
        while (temp != null) {
            // Si se encuentra la fila retorna el nodo de la fila
            if (temp.getDato() == null && fila == 0) {
                return temp;
            }
            fila--;
            temp = temp.getSiguienteFila();
        }
        return null; // La fila no se encontro
    }

    private Nodo buscarColumna(int columna) {
        Nodo temp = inicio;
        while (temp != null && columna > 0) {
            columna--;
            temp = temp.getSiguienteColumna();
        }
        return temp;
    }
}
