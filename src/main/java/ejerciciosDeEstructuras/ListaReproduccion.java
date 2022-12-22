/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosDeEstructuras;


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

    public void cambiarCancion(int posicion, Cancion c) {
        posicion = Math.abs(posicion);
        if (posicion < this.lista.size() && posicion > -1) {
            this.lista.set(posicion, c);
        }

    }

    public void grabarCancion(Cancion c) {
        this.lista.add(c);

    }
    //Elimminar cancion posicion
    public boolean eliminarCancion(int posicion) {
        if (posicion < this.lista.size() && posicion > -1) {
            this.lista.remove(posicion);
            return true;
        }
        return false;
    }

        //Eliminar objeto
        public boolean eliminarCancion(Cancion c){
            
            return this.lista.remove(c);
        }
                
    public static void imprimirLista(ListaReproduccion tmp) {
        String texto = "";
        int contadorCanciones = 0;
        for (Cancion c : tmp.getLista()) {

            texto += ++contadorCanciones + c.toString() + "\n";

        }
        System.out.println(texto);

    }

    public int buscarCancion(Cancion c) {

        return this.lista.indexOf(c);

    }
    //Ordenar por titulo
    public void ordenarListaTitulo() {

        Collections.sort(this.lista,(c1,c2)->c1.getTitulo().compareToIgnoreCase(c2.getTitulo()));

    }
    //Ordenar por cantante
    public void OrdenarListaConCollections() {
        Collections.sort(this.lista,(c1,c2)->c1.getCantante().compareToIgnoreCase(c2.getCantante()));
    }

    //busqueda por titulo
    
    public int buscarPorTitulo(String titulo){
        
        
        Cancion aux= new Cancion();
        aux.setTitulo(titulo);
        ordenarListaTitulo();
        return Collections.binarySearch(this.lista, aux, (c1,c2)->c1.getTitulo().compareToIgnoreCase(c2.getTitulo()));
    }
    
    //Ordenar la duracion: Ordenar un numero decimal o entero, con 2 objetos
    public void ordenarDuracion(){
        
        Collections.sort(this.lista,(c1,c2)->Double.compare(c1.getDuracion(),c2.getDuracion()));
    }
    
    
    
    
    
    
    
    
    
    public List<Cancion> getLista() {
        return lista;
    }

    public void setLista(List<Cancion> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "ListaReproduccion{" + "lista=" + lista + ", tamanio=" + tamanio + '}';
    }

}
