/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDeEstructuras;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] enteros = null;
        
        arrayEnteros(enteros);

    }
    
    
    
    public static void arrayEnteros(int[] enteros) {
        Scanner teclado = new Scanner(System.in);
        //Con este bucle for para arrays, por cada entero del indice 
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = teclado.nextInt();

        }

        boolean repetir = true;
        do {
            System.out.println("Introduce el número entero " );
            try {
                teclado.nextInt();
                // La calificación es válida. Imprimo y salgo del bucle

                repetir = false;
            } catch (InputMismatchException ime) {
                // En caso de error
                System.out.println("No es un numero entero");
                // Limpieza del buffer
                teclado.nextLine();
            }
        } while (repetir);

    }

}
