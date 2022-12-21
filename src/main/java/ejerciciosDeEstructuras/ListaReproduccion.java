/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosDeEstructuras;

import RentaCarListas.Vehiculo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class ListaReproduccion {

    //Ponemos el array list y tomando el objeto de cancion
    private List<Cancion> lista;
    int tamanio = numeroCanciones();

    public ListaReproduccion() {

        this.lista = new ArrayList<>(tamanio);

    }

    public int numeroCanciones() {
        Scanner teclado = new Scanner(System.in);

        int canciones;

        do {
            try {
                canciones = 0;
                System.out.println("Introduce numero");

                canciones = teclado.nextInt();

                break;
            } catch (InputMismatchException ime) {
                System.out.println("Dato Invalido,vuelva a introducirlo");
                teclado.nextLine();
            }
        } while (true);

        return canciones;
    }

    public void estaVacia() {

        //Vaciar toda la lista
        this.lista.isEmpty();
    }

    public int escucharCancion(int numeroBuscar) {

        int indice = -1;
        //Recorremos el array completo
        //usando este metodo de la clase arraylist devuelve el numero de la posicion
        this.lista.lastIndexOf(indice);

        return indice;

    }

    public void cambiarCancion(int numeroBuscar, Cancion c) {

        this.lista.set(numeroBuscar, c);

    }

    public void grabarCancion(Cancion c) {
        this.lista.add(c);

    }
    
    public void eliminaCancion(int numeroBuscar){
        
        this.lista.remove(numeroBuscar);
        
    }
    
    public void eliminaCancion(Cancion c){
        
        this.lista.remove(c);
    }
    
    public void imprimirLista (ListaReproduccion tmp){
        
        this.lista.toString();
        
    }
    
    public void buscarCancion(Cancion c){
        
        this.lista.indexOf(c);
        
        
    }
     
   public void ordenar1(ArrayList<Cancion> listaCancion){
       
      Collections.sort(Array);
       
       
   } 
}
