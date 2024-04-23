package proyecto_2;

public class ListaHorizontal {

    //debe tener una raiz de la cual partir 
    private nodoOrtogonal primero;
    private nodoOrtogonal ultimo;

    public ListaHorizontal() {
        primero = null;
        ultimo = null; //se debe apuntar a nulo 
    }

    public nodoOrtogonal getPrimero() {
        return primero;
    }

    public void setPrimero(nodoOrtogonal primero) {
        this.primero = primero;
    }

    public nodoOrtogonal getUltimo() {
        return ultimo;
    }

    public void setUltimo(nodoOrtogonal ultimo) {
        this.ultimo = ultimo;
    }

    /// Metodo para insercion 
    public void insertarNodo(nodoOrtogonal insertar) {
        //verificar si esta vacio
        if (primero == null) {
            primero = ultimo = insertar;
        } else {

            if (insertar.getX() < primero.getX()) {
                frente(insertar);
            } else {

                if (insertar.getX() > ultimo.getX()) {
                    insertafinal(insertar);
                } else {
                    //si no esta al inicio o al final se encuentra en medio
                    medio(insertar);

                }
            }
        }
    }

    public void frente(nodoOrtogonal insertar) {
        primero.setIzquierda(insertar);
        insertar.setDerecha(primero);
        primero = insertar;
    }

    public void insertafinal(nodoOrtogonal insertar) {
        ultimo.setDerecha(insertar); //coloca el nodo abajo del primer nodo
        insertar.setIzquierda(ultimo); //coloca el ultimo nodo arriba del ultimo que se agrego
        ultimo = insertar;
    }

    public void medio(nodoOrtogonal insertar) {
        // Para esta parte se necesitan 2 nodos ortogonales temporales
        nodoOrtogonal temp1;
        nodoOrtogonal temp2;
        temp1 = primero;
        while (temp1.getX() < insertar.getX()) {
            //recorre la lista en forma vertical esta encontrar la posicion correcta hacia abajo
            temp1 = temp1.getDerecha();
        }
        // se recupera el valor inicial de la variable temporal por que el puntero quedara en medio de los temporales
        temp2 = temp1.getIzquierda();
        if (temp2 != null) {
            temp2.setDerecha(insertar);
        }
        temp1.setIzquierda(insertar);
        insertar.setDerecha(temp1);
        insertar.setIzquierda(temp2);
    }

}
