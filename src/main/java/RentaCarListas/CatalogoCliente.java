/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentaCarListas;


import java.util.Arrays;

/**
 *
 * @author pablo
 */
public class CatalogoCliente {

    //Atributos del Catalogo
    private int numeroClientes;//Numero entero de clientes que tiene el catalogo
    private Cliente[] listaClientes;//Array que contiene los clientes

    public CatalogoCliente(int tamanio) {
        this.numeroClientes = tamanio;//Recibe el tamaño que le ponemos en el parametro
        tamanio = Math.abs(tamanio);//Para que sea positivo
        this.listaClientes = new Cliente[tamanio];//Se crea el array y se da como longitud el tamaño que le introducimos.

        for (int i = 0; i < listaClientes.length; i++) {
            this.listaClientes[i] = new Cliente();

        }
        //Por simplicidad y ya que solo se va a mandar el archivo java, es este caso en los enum de Nombre de cliente que hariamos 
        //un ejemplo de que se escogeria aleatoriamente entre unos cuantos , y como los apellidos

    }

    //Metodo que no devuelve nada que es un for each, el cual le damos el objeto de CLiente y recibira los datos de la lista de clientes
    public void mostrarCatalogoClientes() {
        for (Cliente c : listaClientes) {
            System.out.println(c);
        }

    }

    //Numero de clientes que hay en el catalogo, NO ES EL TAMAÑO DEL ARRAY
    public int getNumeroCLientes() {
        return numeroClientes;
    }

    //Es una busqueda secuencial , va desde 0 hasta el ultimo
    private int buscarCliente(Cliente c) {
        //se le para el objeto como parametro
        if (c != null) {
            for (int i = 0; i < this.listaClientes.length; i++) {
                if (this.listaClientes[i] != null && c.equals(this.listaClientes[i])) {
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

        return (posicion >= 0) ? this.listaClientes[posicion] : null;

    }

    //añadir un vehiculo
    public void anadirCliente(Cliente c) {
        //Si hay hueco, se inserta en el hueco
        //Si el numero de vehiculos en menor a la lista de vehiculos
        //Hay hueco
        if (this.numeroClientes < this.listaClientes.length) {
            for (int i = 0; i < this.listaClientes.length; i++) {
                if (this.listaClientes[i] == null) {
                    this.listaClientes[i] = c;
                }
                this.numeroClientes++;
                //System.out.println("Guardando Cliente en  las posicion " + i);
                break;
            }
        } else {
            //si esta lleno
            //Arrays.copu of T es dato generico, se le pone ++ porque se añade 1 mas en el nuevo array
            //this.listaClientes= Arrays.copyOf(listaClentes, ++numeroClientes*2);
            //Se le pone un *2 al final, que quiere decir que el nuevo Array tiene el doble de tamaño que la orignal,(eficiencia)
            //Para evitar confusiones le sumo, ya el ++ a continuacion y luego pongo el metodo y me olvido
            this.numeroClientes++;//Aqui ya valdria 11
            this.listaClientes = Arrays.copyOf(listaClientes, numeroClientes);
            this.listaClientes[this.numeroClientes - 1] = c;//En la posicion 10 le guardo el vehiculo
        }

    }

    public Cliente[] getListaCliente() {
        return listaClientes;
    }

    @Override
    public String toString() {
        String tmp = "";//declaracion string
        //Foreach que le metemos el array y luego la lista
        for (Cliente c : listaClientes) {

            if (c != null) { //Lanzar una expecion
                //Hacemos un tostring del objeto 'v' 
                tmp += c.toString() + "\n";
            }
        }
        return tmp;
    }
    
    
  
}
