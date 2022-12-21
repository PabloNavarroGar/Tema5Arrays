/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentaCarListas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo
 */
public class Catalogo<T> {
    //Esto sirve para indicar cualquier tipo de objeto
    //esto es una clase genérica
    protected List<T> lista;// el protected sirve para que se pueda llamar a otras clases
    
    
     public Catalogo(int tamanio) {

        tamanio = Math.abs(tamanio);
        this.lista = new ArrayList<>(tamanio); //Se puede poner el tamaño
        //Todo add, requiere el tamaño 
        //lista.size() es 0, no hay ninguna iteracion
        // Una vez creada la estructura de datos
        // le doy el valor a cada elemento
       
        }
     
     
       @Override
    public String toString() {
        String tmp = "";//declaracion string
        //Foreach que le metemos el array y luego le metmeos la listo
        for (T t : this.lista) {

            //Lanzar una expecion
            //Hacemos un tostring del objeto 'v' 
            tmp += t.toString() + "\n";
        
        }
        return tmp;
    }

     public int getNumeroElementos() {
        return this.lista.size();//tamanio de la lista
    }
     
     
     public int buscarElemento(T elemento) {
        //se le para el objeto como parametro
        if (elemento != null) {
            for (int i = 0; i < this.lista.size(); i++) {
                if (this.lista.get(i) != null && elemento.equals(this.lista.get(i))) {
                    return i;
                }
            }
        }
        //Como no encuentra ese cliente devuelve -1
        return -1;
    }

   public boolean borrarElemento(T elemento) {
        //LLamo al metodo de buscar enlazandolo con una variable
        int posicionVehiculoArray = buscarElemento(elemento);
        //Si la posicion es mayor o iguala 0, pone el vehiculo en 0
        if (posicionVehiculoArray >= 0) {
            this.lista.remove(posicionVehiculoArray);
            return true;
        }

        return false;

    }
   
   public void anadirElemento(T elemento) {
        this.lista.add(elemento);//Solo es una linea de comando xD

    }
   
    }


