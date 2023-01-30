/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5F;

import ejerciciosDeEstructuras.ejercicio5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author samue
 */
public class BaseMilitar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Ejercito ejercito = new Ejercito();//Creacion del ejercito

        ArrayList<Soldado> soldados = new ArrayList<>();

        //Creacion de Soldados
        Soldado s1 = new Soldado(1, "Juan", "Palomo", "Palomo");
        Soldado s2 = new Soldado(2, "Pablo", "Navarro", "Garcia");
        Soldado s3 = new Soldado(3, "Alberto", "Jimenez", "Jagger");
        Soldado s4 = new Soldado(4, "Sergio", "Ramirez", "Albarez");
        Soldado s5 = new Soldado(5, "Juan", "Alberto", "Perez");
        Soldado s6 = new Soldado(6, "Juan", "Alvarez", "Palomo");

        //Alistando soldados en el ejercito ejercito
        ejercito.alistarUnSoldado(s1);
        ejercito.alistarUnSoldado(s2);
        ejercito.alistarUnSoldado(s3);
        ejercito.alistarUnSoldado(s4);
        ejercito.alistarUnSoldado(s5);
        ejercito.alistarUnSoldado(s6);

        System.out.println();

        System.out.println("----------");
        //Condicion para comprobar si no hay soldados saldra una condicion u otra
        if (ejercito.estaVacio()) {

            System.out.println("El ejercito esta vacio porque tiene " + ejercito.miembrosDelEjercito() + " miembros");

        } else {

            System.out.println("El ejercito tiene " + ejercito.miembrosDelEjercito() + "  soldado disponibles ");
        }
        //Comprobamos si sale condicion

        System.out.println("------------------");

        //Comprobando los DNI de si un solsado esta en el ejercito con cierto nif..
        System.out.println("¿Esta el soldado con el nif 1?");

        System.out.println(ejercito.estaSoldado(1));

        System.out.println("--------------------------");
        //Vamos a meter los saldados en el arrayList
        soldados = ejercito.sacarArrayListSoldado();
            
        soldados.forEach(System.out::println);

        System.out.println("----------------------------");
        System.out.println("\n");

        //Vamos a desalistar a un soldado
        ejercito.desalistarSoldado2(1);
        Collections.sort(soldados);
        //OJITO que HAY QUE IMPRIMIR EL EJERCITO  LLAMANDO A UN GET y luego un foreach
        //NO AL LISTA DE LOS SOLDADOS
        ejercito.getEjecito().forEach(System.out:: println);
        //Comprobamos ahora si se a restado el soldado que hemos quitado
        System.out.println("Ahora en el ejercito nos quedan " +ejercito.miembrosDelEjercito() +" soldados");
        System.out.println("---------Mostrando ejercito con los metodos mostrar-----------------");
        ejercito.mostrarEjercito1();
        
        System.out.println("-------------");
        ejercito.mostrarEjercito2();
        
    }

}
