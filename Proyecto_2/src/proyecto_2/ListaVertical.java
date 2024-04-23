package proyecto_2;

public class ListaVertical {

    //debe tener una raiz de la cual partir 
    private nodoOrtogonal primero;
    private nodoOrtogonal ultimo;

    public ListaVertical() {
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
            //verificar si la insercion es menor al valor que se encuentra en la cima , comparando las coordenadas
            // del valor que se encuentra en la cima , con el valor que se va a insertar
            if (insertar.getY() < primero.getY()) {
                frente(insertar);
            } else {
                //verfica que el valor de insercion sea mayor al que se encuentra al final de la lista
                if (insertar.getY() > ultimo.getY()) {
                    insertafinal(insertar);
                } else {
                    //si no esta al inicio o al final se encuentra en medio
                    medio(insertar);

                }
            }
        }
    }

    public void frente(nodoOrtogonal insertar) {
        primero.setArriba(insertar);// nodo arriba del primer nodo
        insertar.setAbajo(primero);// coloca el primer nodo abajo del que se agrego
        primero = insertar; //actualiza
    }

    public void insertafinal(nodoOrtogonal insertar) {
        ultimo.setAbajo(insertar); //coloca el nodo abajo del primer nodo
        insertar.setArriba(ultimo); //coloca el ultimo nodo arriba del ultimo que se agrego
        ultimo = insertar;
    }

    public void medio(nodoOrtogonal insertar) {
        // Para esta parte se necesitan 2 nodos ortogonales temporales
        nodoOrtogonal temp1;
        nodoOrtogonal temp2;
        temp1 = primero;
        while (temp1.getY() < insertar.getY()) {
            //recorre la lista en forma vertical esta encontrar la posicion correcta hacia abajo
            temp1 = temp1.getAbajo();
        }
        // se recupera el valor inicial de la variable temporal por que el puntero quedara en medio de los temporales
        temp2 = temp1.getArriba();
        if (temp2 != null) {
            temp2.setAbajo(insertar);
        }
        temp1.setArriba(insertar);
        insertar.setAbajo(temp1);
        insertar.setArriba(temp2);
    }

}
