package proyecto_2;

public class Nodo {

    private Object dato;
    private Nodo NextFila;
    private Nodo NextColum;

    public Nodo(Object dato) {
        this.dato = dato;
        this.NextFila = null;
        this.NextColum = null;
    }

    // Getters y setters
    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguienteFila() {
        return NextFila;
    }

    public void setSiguienteFila(Nodo NextFila) {
        this.NextFila = NextFila;
    }

    public Nodo getSiguienteColumna() {
        return NextColum;
    }

    public void setSiguienteColumna(Nodo NextColum) {
        this.NextColum = NextColum;
    }
}

