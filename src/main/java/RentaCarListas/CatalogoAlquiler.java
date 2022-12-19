/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentaCarListas;

import java.time.LocalDate;
import java.util.Arrays;

/**
 *
 * @author pablo
 */
public class CatalogoAlquiler {

    //Atributos del Catalogo
    private int numeroAlquileres;//Numero entero de clientes que tiene el catalogo
    private Alquiler[] listaAlquiler;//Array que contiene los clientes

    public CatalogoAlquiler(int tamanio) {
        this.numeroAlquileres = 0;//Recibe el tamaño que le ponemos en el parametro
        tamanio = Math.abs(tamanio);//Para que sea positivo
        this.listaAlquiler = new Alquiler[tamanio];//Se crea el array y se da como longitud el tamaño que le introducimos.

        
        //Por simplicidad y ya que solo se va a mandar el archivo java, es este caso en los enum de Nombre de cliente que hariamos 
        //un ejemplo de que se escogeria aleatoriamente entre unos cuantos , y como los apellidos

    }

    public CatalogoAlquiler() {
    }

    //Metodo que no devuelve nada que es un for each, el cual le damos el objeto de CLiente y recibira los datos de la lista de clientes
    public void mostrarCatalogoAlquileres() {
        for (Alquiler c : listaAlquiler) {
            System.out.println(c);
        }

    }

    //Numero de clientes que hay en el catalogo, NO ES EL TAMAÑO DEL ARRAY
    public int getNumeroAlquileres() {
        return numeroAlquileres;
    }

    //Es una busqueda secuencial , va desde 0 hasta el ultimo
    private int buscarAlquiler(Alquiler c) {
        //se le para el objeto como parametro
        if( c!=null){
        for (int i = 0; i < this.listaAlquiler.length; i++) {
            if (this.listaAlquiler[i] != null && c.equals(this.listaAlquiler[i])) {
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

        return (posicion >= 0) ? this.listaAlquiler[posicion] : null;

    }

    //añadir un alquiler
    public void anadirAlquiler(Alquiler c) {
        //Si hay hueco, se inserta en el hueco
        //Si el numero de vehiculos en menor a la lista de vehiculos
        //Hay hueco
        if (this.numeroAlquileres < this.listaAlquiler.length) {
            for (int i = 0; i < this.listaAlquiler.length; i++) {
                if (this.listaAlquiler[i] == null) {
                    this.listaAlquiler[i] = c;
                }
                this.numeroAlquileres++;
                //System.out.println("Guardando Cliente en  las posicion " + i);
                break;
            }
        } else {
            //si esta lleno
            //Arrays.copu of T es dato generico, se le pone ++ porque se añade 1 mas en el nuevo array
            //this.listaClientes= Arrays.copyOf(listaClentes, ++numeroClientes*2);
            //Se le pone un *2 al final, que quiere decir que el nuevo Array tiene el doble de tamaño que la orignal,(eficiencia)
            //Para evitar confusiones le sumo, ya el ++ a continuacion y luego pongo el metodo y me olvido
            this.numeroAlquileres++;//Aqui ya valdria 11
            this.listaAlquiler = Arrays.copyOf(listaAlquiler, numeroAlquileres);
            this.listaAlquiler[this.numeroAlquileres - 1] = c;//En la posicion 10 le guardo el vehiculo
        }

    }

    public Alquiler[] getListaAlquiler() {
        return listaAlquiler;
    }

    @Override
    public String toString() {
        String tmp = "";//declaracion string
        //Foreach que le metemos el array y luego la lista
        for (Alquiler c : listaAlquiler) {

            if (c != null) { //Lanzar una expecion
                //Hacemos un tostring del objeto 'v' 
                tmp += c.toString() + "\n";
            }
        }
        return tmp;
    }
}
