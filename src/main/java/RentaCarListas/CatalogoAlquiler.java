/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentaCarListas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author pablo
 */
public class CatalogoAlquiler {

    //Atributos del Catalogo
   private List<Alquiler> lista;//Importamos la clase y dentro de los flechas metemos la clase

    public CatalogoAlquiler(int tamanio) {
       
        tamanio = Math.abs(tamanio);//Para que sea positivo
        this.lista = new ArrayList<>(tamanio);//Se crea el array y se da como longitud el tamaño que le introducimos.

        
        //Por simplicidad y ya que solo se va a mandar el archivo java, es este caso en los enum de Nombre de cliente que hariamos 
        //un ejemplo de que se escogeria aleatoriamente entre unos cuantos , y como los apellidos

    }

    public CatalogoAlquiler() {
    }

    //Metodo que no devuelve nada que es un for each, el cual le damos el objeto de CLiente y recibira los datos de la lista de clientes
    public void mostrarCatalogoAlquileres() {
        for (Alquiler c : this.lista) {
            System.out.println(c);
        }

    }

    //Numero de clientes que hay en el catalogo, NO ES EL TAMAÑO DEL ARRAY
    public int getNumeroAlquileres() {
        return this.lista.size();
    }

    //Es una busqueda secuencial , va desde 0 hasta el ultimo
    private int buscarAlquiler(Alquiler c) {
        //se le para el objeto como parametro
        if( c!=null){
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i) != null && c.equals(this.lista.get(i))) {
                return i;
            }
        }
        }
        //Como no encuetra ese cliente duevuelve -1
        return -1;
    }

    public Alquiler buscarAlquiler(int id) {
        Alquiler aux = new Alquiler();

        aux.setAlquierID(id);//Fuerzo a que el cliente tenga el nif que busco
        int posicion = buscarAlquiler(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;

    }

    //añadir un alquiler
    public void anadirAlquiler(Alquiler c) {
        //Si hay hueco, se inserta en el hueco
       this.lista.add(c);

    }

    public List<Alquiler> getListaAlquiler() {
        return lista;
    }

    @Override
    public String toString() {
        String tmp = "";//declaracion string
        //Foreach que le metemos el array y luego la lista
        for (Alquiler c : this.lista) {

            
                tmp += c.toString() + "\n";
            
        }
        return tmp;
    }
}
