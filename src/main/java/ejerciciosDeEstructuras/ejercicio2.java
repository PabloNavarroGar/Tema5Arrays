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

        /*Escribe un programa para leer la altura de un número determinado de personas
        y calcular la altura media. El número de personas se pide por teclado y debe ser
        entero un entero mayor que cero. Posteriormente el programa irá pidiendo la altura,
        en cm, de cada una de las personas y las guardará en una estructura de almacenamiento.
        Si la altura leída no es positiva, el programa la pasará a número positivo. También es
        necesario saber cuántas personas tienen una altura superior a la media e inferior a la media. 
         */
  
        
        
        /*Systemout(indicar numeros de personas)
        numeroPersonas=metodoleerenterosinerroresScanner
        int[] alturasdeCadaPersonas = new int[numeroPersonas]
        
        for(int=0;i<numeroPersonas;i++){
        Para que salga numero persona 1 2 3, (i+1)
        
        }*/
    }
    
    
    
     public static int pedirNumeroPersonas() {
         Scanner teclado = new Scanner(System.in);
        int numeroPersonas=0;

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
