/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDeEstructuras;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author samue
 */
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean[] arrayCaraCruz = new boolean[1000];
        
        rellenarArray(arrayCaraCruz);

        //Falta el metodo para imprimir el resultado
        System.out.println("Hay un total de  " + numeroDeCaras(arrayCaraCruz)+ " caras en el Array");

        System.out.println("Hay un total de  " + numeroDeCruces(arrayCaraCruz) + " cruces en el Array");

    }

    public static void rellenarArray(boolean[] array) {
        Random random = new Random();
        //Imprimia con el sout, hay que llamar al array con el iterador e igualarlo
        for (int i = 0; i < array.length; i++) {
           array[i]=random.nextBoolean();//Rellenar el array con el random.nextboolean
        }

    }
    //Metodo para que salgan las caras
    public static int numeroDeCaras(boolean[] array) {
        int contadorCaras = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i]) {//ASI SIGNIFICA QUE ES TRUE, VICO LO QUIERE ASI
                contadorCaras++;

            }

        }

        return contadorCaras;
    }
    //Metodo para que salgan las cruces
    public static int numeroDeCruces(boolean[] array) {
        int contadorCruces = 0;

        for (int i = 0; i < array.length; i++) {

            if (!array[i] ) {//SIGNIFICA QUE ESO ES IUGALES A FALSO, HAY QUE HACERLO ASI
                contadorCruces++;

            }

        }

        return contadorCruces;
    }
}
