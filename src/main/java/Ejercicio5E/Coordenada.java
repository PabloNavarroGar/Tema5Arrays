/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5E;

/**
 *
 * @author samue
 */
public class Coordenada {
    
    
    //Atributos
    
    private int fila;
    private int columna;

    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    //Getter y Setters
    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.fila;
        hash = 79 * hash + this.columna;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coordenada other = (Coordenada) obj;
        if (this.fila != other.fila) {
            return false;
        }
        return this.columna == other.columna;
    }
    //To String
    @Override
    public String toString() {
        return "Coordenada{" + "fila=" + fila + ", columna=" + columna + '}';
    }
    
    
}
