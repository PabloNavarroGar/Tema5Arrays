/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDeEstructuras;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

      
        //variables
        int numeroPersonas;
        int alturaPersonas;
        int alturaMedia;
        int contadorPorEncimaDeLaMedia = 0;
        int contadorPorDebajoDeLaMedia = 0;
        //Varibales junto con los metodos
        numeroPersonas = pedirNumeroPersonas();
        //alturaPersonas = pedirAlturaPersonas();

        //Instacia de la matriz con para pedir sus datos
        int[] alturasDeCadaPersona = new int[numeroPersonas];
        for (int i = 0; i < alturasDeCadaPersona.length; i++) {

            Scanner teclado = new Scanner(System.in);

            // Se pone dentro del bloque try la sentencia que puede producir 
            // el error
            do {
                System.out.println("Introduzca altura de la persona " + (i + 1));
                //en ecaner se iguala con la matriz en este punto
                alturasDeCadaPersona[i] = Math.abs(teclado.nextInt());
                try {

                    // La calificación es válida. Imprimo y salgo del bucle
                    break;
                } catch (InputMismatchException ime) {
                    // En caso de error
                    System.out.println("No es un numero entero");
                    // Limpieza del buffer
                    teclado.nextLine();
                }

            } while (true);
            //Se imprime el mensaje con las alturas de cada persona
            System.out.println("Altura de la persona " + (i + 1) + " es de " + alturasDeCadaPersona[i] + " centímetros");

        }
        System.out.println("-----------Array con los datos puestos------------------");
        System.out.println(" ");
        //Tamaño del array con los datos puestos y suma de alturas
        int sumaDeAlturas = 0;
        int alturas = 0;
        for (int i = 0; i < alturasDeCadaPersona.length; i++) {
            alturas = alturasDeCadaPersona[i];

            System.out.println(" Altura persona numero " + (i + 1) + " = " + alturas);
            sumaDeAlturas += alturasDeCadaPersona[i];
        }
        //Suma de las alturas 

        System.out.println("Para poder hacer la media sumo todas las alturas y la guardo en una variable "
                + "en total la suma de las medidas del array es de : " + sumaDeAlturas);

        //Hacemos la media
        alturaMedia = sumaDeAlturas / numeroPersonas;
        //Imprimimos la altura media
        System.out.println("La altura media es de :" + alturaMedia);

        System.out.println("\n");
        //Cuántas personas tienen una altura superior a la media e inferior a la media.
        System.out.println("------------Comparacion media-----------------");
        //Aqui hago otro for, el cual le tomo dentro de un if la lacula de cada
        //persona y si es mejor a la media, se le suma 1 punto al contrador si no al otro
        for (int i = 0; i < alturasDeCadaPersona.length; i++) {
            

            if (alturaMedia < alturasDeCadaPersona[i]) {
                contadorPorDebajoDeLaMedia++;

            } else {
                contadorPorEncimaDeLaMedia++;
            }

        }
        System.out.println(" Solo " + contadorPorEncimaDeLaMedia + " estan por encima de la media");

        System.out.println(" Solo " + contadorPorDebajoDeLaMedia + " estan por debajo de la media");

    }

    public static int pedirNumeroPersonas() {
        Scanner teclado = new Scanner(System.in);
        int numeroPersonas = 0;

        // Se pone dentro del bloque try la sentencia que puede producir 
        // el error
        do {
            System.out.println("Introduce el numero de personas que iran al array");
            try {
                numeroPersonas = teclado.nextInt();
                // La calificación es válida. Imprimo y salgo del bucle

                break;
            } catch (InputMismatchException ime) {
                // En caso de error
                System.out.println("No es un numero entero");
                // Limpieza del buffer
                teclado.nextLine();
            }
        } while (true);
        return numeroPersonas;

    }

}
