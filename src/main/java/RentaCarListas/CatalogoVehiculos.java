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
 * @author tomas
 */
public class CatalogoVehiculos {

    private List<Vehiculo> lista;

    //El constructor recibe el tamaño del catalogo e inicializa
    //la estructura de datos con vehiculos aleatorios.
    public CatalogoVehiculos(int tamanio) {

        tamanio = Math.abs(tamanio);//incializa el Nº de vehiculos del catalogo al tamaño que le estoy diciendo y que sea positivo
        this.lista = new ArrayList<>(tamanio); //Se crear el arrya y toma el tamaño que se le da en el parametro y se mete en el array

        //Una vez creada la estructura de datos le doy valor a cada
        //elemento
        //En cada iteracion pone el tamanio
        for (int i = 0; i < tamanio; i++) {
            this.lista.add(new Vehiculo());//se pone el tamanio en el for
            //se declara la lista
        }

    }

    public void mostrarCatalogo() {
        for (Vehiculo v : this.lista) {
            System.out.println(v);
        }

    }

    //Numero de vehiculos que hay en el catalogo, NO EL TAMAÑO DEL ARRAY
    public int getNumeroVehiculos() {
        return this.lista.size();//tamanio de la lista
    }

    //Es una busqueda secuencial , va desde 0 hasta el ultimo
    private int buscarVehiculo(Vehiculo v) {
        //se le para el objeto como parametro
        if (v != null) {
            for (int i = 0; i < this.lista.size(); i++) {
                if (this.lista.get(i) != null && v.equals(this.lista.get(i))) {
                    return i;
                }
            }
        }
        //Como no encuentra ese cliente devuelve -1
        return -1;
    }

    public Vehiculo buscarVehiculo(String bastidor) {

        Vehiculo aux = new Vehiculo();

        aux.setBastidor(bastidor);//Fuerzo a que el cliente tenga el bastidor que busco
        int posicion = buscarVehiculo(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }

    public boolean borrarVehiculo(Vehiculo v) {
        //LLamo al metodo de buscar enlazandolo con una variable
        int posicionVehiculoArray = buscarVehiculo(v);
        //Si la posicion es mayor o iguala 0, pone el vehiculo en 0
        if (posicionVehiculoArray >= 0) {
            this.lista.remove(posicionVehiculoArray);
            return true;
        }

        return false;

    }

    //añadir un vehiculo
    public void anadirVehiculo(Vehiculo v) {
        this.lista.add(v);//Solo es una linea de comando xD

    }

    public List<Vehiculo> getListaVehiculos() {
        return lista;
    } //Con el metodo to String esto deja de ser util

    @Override
    public String toString() {
        String tmp = "";//declaracion string
        //Foreach que le metemos el array y luego le metmeos la listo
        for (Vehiculo v : this.lista) {

            //Lanzar una expecion
            //Hacemos un tostring del objeto 'v' 
            tmp += v.toString() + "\n";
        
        }
        return tmp;
    }

}
