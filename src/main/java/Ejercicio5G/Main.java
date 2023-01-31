/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5G;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Traductor diccionario = new Traductor();
        //Se crea el diccionario con la clase traductor
        //Se crean las palabras
        palabraExtranjera pex1 = new palabraExtranjera("House");
        palabraEspanola pes1 = new palabraEspanola("Casa");

        palabraExtranjera pex2 = new palabraExtranjera("Bird");
        palabraEspanola pes2 = new palabraEspanola("Pájaro");

        palabraExtranjera pex3 = new palabraExtranjera("Cat");
        palabraEspanola pes3 = new palabraEspanola("Gato");

        palabraExtranjera pex4 = new palabraExtranjera("Tree");
        palabraEspanola pes4 = new palabraEspanola("Árbol");
        //Se introducen los objetos, y como necesitamos String, tenemos que llaman a los gets
        diccionario.anadirPalabra(pex1.getPalabraEx(), pes1.getPalabraEs());
        diccionario.anadirPalabra(pex2.getPalabraEx(), pes2.getPalabraEs());
        diccionario.anadirPalabra(pex3.getPalabraEx(), pes3.getPalabraEs());
        diccionario.anadirPalabra(pex4.getPalabraEx(), pes4.getPalabraEs());

        diccionario.imprimirPalaras();

        System.out.println("------------------------");

        System.out.println("------------------------");
        
        System.out.println("------Lista de palabras Españolas-----");
        ArrayList<String> espanoilas = diccionario.sacarPalabrasEspanolas();

        espanoilas.forEach(System.out::println);
         System.out.println("------Lista de palabras Extranjeras-----");
        ArrayList<String> extranjeras = diccionario.sacarPalabrasExtranjeras();
        extranjeras.forEach(System.out::println);
        //extranjeras.forEach(System.out::println);
        
        
        System.out.println("--------------------");
        
        //Borramos una palabra
        
        System.out.println("Borrando una palabra");
        
        System.out.println("Voy a borrar House");
        
        diccionario.borrarPalabraExtranjera("House");
        
        
       diccionario.imprimirPalaras();
        
        
       System.out.println("Traduciendo una palabra");
        
        System.out.println("Voy a traducir House");
        
        System.out.println(diccionario.traducir("House"));
        
        
        System.out.println("---------------------");
        
        System.out.println("Modificando palabra gato por perro");
        
        diccionario.modificarPalabras("Cat", "Perro");
        
        diccionario.imprimirPalaras();
       
    }

}
