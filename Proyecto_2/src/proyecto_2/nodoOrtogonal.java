package proyecto_2;

import java.util.*;

public class nodoOrtogonal {

    // Definimos los datos que contendra cada nodo 
    private String placa;
    private String color;
    private String linea;
    private String modelo;
    private String propietario;
    private int x;
    private int y; //coordenadas x y y para los apuntadores 
    private int fila;
    private int columna;
    private nodoOrtogonal arriba;
    private nodoOrtogonal abajo;
    private nodoOrtogonal izquierda;
    private nodoOrtogonal derecha;

    //Getters y setters 
   public nodoOrtogonal(int x, int y) {
    this.x = x;
    this.y = y;
    arriba = null;
    abajo = null;
    izquierda = null;
    derecha = null;// el nodo apunta a nulo en todas las direcciones
}

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public nodoOrtogonal getArriba() {
        return arriba;
    }

    public void setArriba(nodoOrtogonal arriba) {
        this.arriba = arriba;
    }

    public nodoOrtogonal getAbajo() {
        return abajo;
    }

    public void setAbajo(nodoOrtogonal abajo) {
        this.abajo = abajo;
    }

    public nodoOrtogonal getDerecha() {
        return derecha;
    }

    public void setDerecha(nodoOrtogonal derecha) {
        this.derecha = derecha;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public nodoOrtogonal getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(nodoOrtogonal izquierda) {
        this.izquierda = izquierda;
    }

}
