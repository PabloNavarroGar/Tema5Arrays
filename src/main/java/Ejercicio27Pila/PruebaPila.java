/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio27Pila;

import ejerciciosDeEstructuras.Cancion;

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
        Pila<Cancion> pilaCancion = new Pila(5);

        System.out.println("---------Pila con los String");
        pilaString.apilarPush("Primero");
        pilaString.apilarPush("Segundo");
        pilaString.apilarPush("Tercero");
        pilaString.apilarPush("Cuarto");
        pilaString.apilarPush("Quinto");

        pilaString.mostarElementos();

        if (pilaString.estaLlena()) {
            System.out.println("La pila esta llena porque tiene " + pilaString.numeroElementosPila()+" elementos");

        } else {
            System.out.println("La pila no  esta llena porque tiene" + pilaString.numeroElementosPila()+" elementos");
        }

        System.out.println("----Voy a quitar elementos-----");

        pilaString.desapilarPop("Tercero");
        pilaString.desapilarPop("Segundo");
        pilaString.desapilarPop("Primero");
        pilaString.desapilarPop("Cuarto");
        pilaString.desapilarPop("Quinto");

        if (pilaString.estaVacia()) {

            System.out.println("La pila esta vacia porque tiene " + pilaString.numeroElementosPila()+" elementos");
        } else {

            System.out.println("La pila no esta vacia porque tiene " + pilaString.numeroElementosPila()+" elementos");
        }

        System.out.println("-----------------------");
        pilaString.desapilarPop("Segundo");//Quito el Segundo
        pilaString.mostarElementos();
        
        //Voy a crear un Array con 5 elementos y los voy a meter en la pila
        System.out.println("Voy a meter un array con el metodo ->");
        String[] ejemplo={"Juan","Pabo","Mario","Lucia","Marta"};
        
        pilaString.rellenar(ejemplo);
        
        pilaString.mostarElementos();
        
        
        System.out.println("------");
        
        
        System.out.println(pilaString.toString());
    
        

    }

}
