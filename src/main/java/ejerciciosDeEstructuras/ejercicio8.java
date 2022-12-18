/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDeEstructuras;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Realizar un programa que lea de la entrada un número y utilice ese número
//        para crear un array de enteros de ese tamaño.A continuación, el programa inicializa 
//         el array con los valores que el usuario introduzca por teclado.Finalmente
//        , se deberá recorrer el array e imprimir tantos 
//        caracteres ‘*’ como indique el valor de cada elemento del array.Ejemplo
//        : los valores 5,4,3,2 producirán la siguiente salida:
//*****
//****
//***
//**    
        int[] arrayNumerosEnteros = new int[pedirNumeroEnteroTeclado()];

        for (int i = 0; i < arrayNumerosEnteros.length; i++) {

            Scanner teclado = new Scanner(System.in);

            // Se pone dentro del bloque try la sentencia que puede producir 
            // el error
            do {
                System.out.println("Introduzca el numero de la casilla  " + (i + 1));
                //en ecaner se iguala con la matriz en este punto
                arrayNumerosEnteros[i] = Math.abs(teclado.nextInt());
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
            //Se imprime el array con los numeros

        }
        //For que usa el tamaño del array creado y volvemos a poner otro for adentro que recorra los numeros de adentro cambiandolos por la estrella
        //NOTA: REPASAR PREGUNTAR QUE ME FALTA
        for (int j = 0; j < arrayNumerosEnteros.length; j++) {
            int arrayNumerosEntero = arrayNumerosEnteros[j];

            for (int k = 0; k < arrayNumerosEntero; k++) {

                System.out.println("*");
                
               
            }

        }
    }

    public static int pedirNumeroEnteroTeclado() {
        Scanner teclado = new Scanner(System.in);
        int numeroTamanioArray = 0;

        // Se pone dentro del bloque try la sentencia que puede producir 
        // el error
        do {
            System.out.println("Introduce el tamaño del array");
            try {
                numeroTamanioArray = teclado.nextInt();
                // La calificación es válida. Imprimo y salgo del bucle

                break;
            } catch (InputMismatchException ime) {
                // En caso de error
                System.out.println("No es un numero entero");
                // Limpieza del buffer
                teclado.nextLine();
            }
        } while (true);
        return numeroTamanioArray;

    }
}
