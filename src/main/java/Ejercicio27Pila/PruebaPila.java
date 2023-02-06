/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio27Pila;

/**
 *
 * @author pablo
 */
public class PruebaPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Pila<String> pilaString = new Pila(5);
        
        System.out.println("---------Pila con los String");
        pilaString.apilarPush("Primero");
        pilaString.apilarPush("Segundo");
        pilaString.apilarPush("Tercero");
        pilaString.apilarPush("Cuarto");
//        pilaString.apilarPush("Quinto");

        pilaString.mostarElementos();

        if (pilaString.estaLlena()) {
            System.out.println("La pila esta llena porque tiene " + pilaString.numeroElementosPila() + " elementos");

        } else {
            System.out.println("La pila no  esta llena porque tiene " + pilaString.numeroElementosPila() + " elementos");
        }

        System.out.println("----Voy a quitar elementos-----");

        pilaString.desapilarPop("Tercero");
        pilaString.desapilarPop("Segundo");
        pilaString.desapilarPop("Primero");
        pilaString.desapilarPop("Cuarto");
        pilaString.desapilarPop("Quinto");

        if (pilaString.estaVacia()) {

            System.out.println("La pila esta vacia porque tiene " + pilaString.numeroElementosPila() + " elementos");
        } else {

            System.out.println("La pila no esta vacia porque tiene " + pilaString.numeroElementosPila() + " elementos");
        }

        System.out.println("-----------------------");
        pilaString.desapilarPop("Segundo");//Quito el Segundo
        pilaString.mostarElementos();

        //Voy a crear un Array con 5 elementos y los voy a meter en la pila
        System.out.println("Voy a meter un array con el metodo ->");
        String[] ejemplo = {"Juan", "Pabo", "Mario", "Lucia", "Marta"};

        pilaString.rellenar(ejemplo);

        pilaString.mostarElementos();

        System.out.println("------");

        System.out.println(pilaString.toString());

        System.out.println("----------Probando con los objetos de las canciones--------------");

        Pila<Cancion> pilaCancion = new Pila(5);
        //Creo las canciones
        Cancion c1 = new Cancion("Beat it", "Michakel Jakson", "1982");
        Cancion c2 = new Cancion("Forever Young", "Alphaville", "1984");
        Cancion c3 = new Cancion("Hungry Eyes", "Eric Carmen", "1987");
        System.out.println("---------Pila con las Canciones");
        pilaCancion.apilarPush(c1);
        pilaCancion.apilarPush(c3);
        pilaCancion.apilarPush(c2);

        System.out.println("Lista de canciones");
        pilaCancion.mostarElementos();
        System.out.println("Hay un total de " + pilaCancion.numeroElementosPila() + " canciones");
        System.out.println("---------Borrando Alphaville---- ");
        pilaCancion.desapilarPop(c3);
        pilaCancion.mostarElementos();

        System.out.println("-------------Voy a quitar todas las canciones-----------");

        pilaCancion.sacarElementos();

        System.out.println("Veo ahora cuantas canciones hay en la lista....");
      
        System.out.println("Hay un total de " + pilaCancion.numeroElementosPila() + " canciones");
        
        System.out.println("Voy a volver a rellenar la pila con las canciones");
        //Meto las canciones en el array
        Cancion[] canciones = {c3,c1,c2};
        pilaCancion.rellenar(canciones);
        
        pilaCancion.mostarElementos();
    }

}
