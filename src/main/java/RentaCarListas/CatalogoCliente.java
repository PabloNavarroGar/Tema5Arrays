/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentaCarListas;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author pablo
 */
public class CatalogoCliente {

    //Atributos del Catalogo
    private List<Cliente> lista;
    public CatalogoCliente(int tamanio) {
       
        tamanio = Math.abs(tamanio);//Para que sea positivo
        this.lista= new ArrayList<>(tamanio);//Se crea el array y se da como longitud el tamaño que le introducimos.

        for (int i = 0; i < tamanio; i++) {
            this.lista.add(new Cliente());

        }
        //Por simplicidad y ya que solo se va a mandar el archivo java, es este caso en los enum de Nombre de cliente que hariamos 
        //un ejemplo de que se escogeria aleatoriamente entre unos cuantos , y como los apellidos

    }

    //Metodo que no devuelve nada que es un for each, el cual le damos el objeto de CLiente y recibira los datos de la lista de clientes
    public void mostrarCatalogoClientes() {
        for (Cliente c : this.lista) {
            System.out.println(c);
        }

    }

    //Numero de clientes que hay en el catalogo, NO ES EL TAMAÑO DEL ARRAY
    public int getNumeroCLientes() {
        return this.lista.size();
    }

    //Es una busqueda secuencial , va desde 0 hasta el ultimo
    private int buscarCliente(Cliente c) {
        //se le para el objeto como parametro
        if (c != null) {
            for (int i = 0; i < this.lista.size(); i++) {
                if (this.lista.get(i) != null && c.equals (this.lista.get(i))) {
                    return i;
                }
            }
        }
        //Como no encuetra ese cliente duevuelve -1
        return -1;
    }

    public Cliente buscarCliente(String nif) {
        Cliente aux = new Cliente();

        aux.setNif(nif);//Fuerzo a que el cliente tenga el nif que busco
        int posicion = buscarCliente(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;

    }
    
    public boolean borrarCliente(Cliente c) {
        //LLamo al metodo de buscar enlazandolo con una variable
        int posicionVehiculoArray = buscarCliente(c);
        //Si la posicion es mayor o iguala 0, pone el vehiculo en 0
        if (posicionVehiculoArray >= 0) {
            this.lista.remove(posicionVehiculoArray);
            return true;
        }

        return false;

    }
    //añadir un vehiculo
    public void anadirCliente(Cliente c) {
        //Si hay hueco, se inserta en el hueco
        //Si el numero de vehiculos en menor a la lista de vehiculos
        //Hay hueco
        this.lista.add(c);

    }

    public List<Cliente> getListaCliente() {
        return lista;
    }

    @Override
    public String toString() {
        String tmp = "";//declaracion string
        //Foreach que le metemos el array y luego la lista
        for (Cliente c : this.lista) {

            
                tmp += c.toString() + "\n";
            
        }
        return tmp;
    }
    
    
  
}
