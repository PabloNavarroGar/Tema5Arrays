/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio27Pila;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo
 */
public class Pila<T> {

    protected List<T> lista;
    private int tamanioPila;

    public Pila(int tamanioPila) {
        //Creo un constructor, el cual tiene un tamaño.
        tamanioPila = Math.abs(tamanioPila);
        this.lista = new ArrayList<T>();
        this.tamanioPila = tamanioPila;
    }

    public void apilarPush(T elementos) {
        //condicion si la lista de elementos es menor que el tamanio de la pila metes,
        //si no sale mensaje
        if (lista.size() < tamanioPila) {
            lista.add(elementos);

        } else {

            System.out.println("Pila llena");
        }

    }

    public void desapilarPop(T elementos) {

        if (!lista.isEmpty()) {

            elementos = lista.remove(lista.size() - 1);

        } else {

            System.out.println("Pila vacia");
        }

    }

    public boolean estaVacia() {

        return lista.isEmpty();
    }

    public boolean estaLlena() {

        return lista.size() == tamanioPila;
    }

    public int numeroElementosPila() {

        return lista.size();
    }

    public void mostarElementos() {
        //Mostar elementos de la 
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(lista.get(i));

        }
    }
    
  
  

    public void rellenar(T[] array) {
        int numeroMaxElementos = array.length;

        if (numeroMaxElementos <= tamanioPila) {

            for (int i = 0; i < numeroMaxElementos; i++) {

                apilarPush(array[i]);
            }
        } else {
            System.out.println("El tamano del array es mayor que el de la pila");
        }

    }

    public Object[] sacarElementos() {

        Object[] elementos = this.lista.toArray();
        this.lista.clear();
        return elementos;

    }

}
