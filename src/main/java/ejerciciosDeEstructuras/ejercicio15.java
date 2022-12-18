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
        boolean[] arrayCaraCruz = new boolean[10];

        rellenarArray(arrayCaraCruz);

        System.out.println("Hay un total de  " + numeroDeCaras(arrayCaraCruz) + " caras en el Array");

        System.out.println("Hay un total de  " + numeroDeCruces(arrayCaraCruz) + " cruces en el Array");

    }

    public static void rellenarArray(boolean[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            System.out.println(random.nextBoolean());
        }

    }

    public static int numeroDeCaras(boolean[] array) {
        int contadorCaras = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == true) {
                contadorCaras++;

            }
            
        }

        return contadorCaras;
    }

    public static int numeroDeCruces(boolean[] array) {
        int contadorCruces = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == false) {
                contadorCruces++;

            }

        }

        return contadorCruces;
    }
}
