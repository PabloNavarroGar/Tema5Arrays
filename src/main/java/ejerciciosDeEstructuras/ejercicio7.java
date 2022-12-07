/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDeEstructuras;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        //Arrays 1 y 2 con el metodo de pedir su numero
        int[] array1 = new int[pedirNumeroArray()];
        ///int[] array2 = new int[pedirNumeroArray()];
        //
        //El programa inicializará los arrays con números aleatorios entre 1 y 100.
        //Creamos el bucle for para que se vaya introduciendo desde la posicion 0 hasta 
        //la posicion que hemos puesto en el metodo
        System.out.println("-------Array1-----------");

        System.out.println("\n");
        for (int i = 0; i < array1.length; i++) {

            //Hacemos que cree numeros entre el 1 y el 100
            array1[i] = random.nextInt(100) + 1;

           
    

        }
        //Mostrar el array llamando al metodo
         imprimirArray(array1);
        System.out.println(" ");

        System.out.println("\n");
        int[] array2 = new int[pedirNumeroArray()];
        System.out.println("-------Array2-----------");
        for (int i = 0; i < array2.length -1; i++) {
            
            
            array2[i] = (int) (Math.random()*100)+1;

            
        }
        //Mostrar el array 2
        imprimirArray(array2);
        
        
        System.out.println("Multiplicacion de los arrays");
        
        multiplicarArrays(array1, array2);
        
        
        imprimirArray(array1);
        
        imprimirArray(array2);
    }
    
    
    

    //Metodo que pone el tamaño de los array
    public static int pedirNumeroArray() {
        Scanner teclado = new Scanner(System.in);
        int numeroArray = 0;

        // Se pone dentro del bloque try la sentencia que puede producir 
        // el error
        do {
            System.out.println("Introduce de cuantos numeros compondran el  array");
            try {
                numeroArray = teclado.nextInt();
                // La calificación es válida. Imprimo y salgo del bucle

                break;
            } catch (InputMismatchException ime) {
                // En caso de error
                System.out.println("No es un numero entero");
                // Limpieza del buffer
                teclado.nextLine();
            }
        } while (true);
        return numeroArray;

    }
//metodo para imprimir el Array , void, ya que no devuelve nada slo muestra
   public static void imprimirArray (int arrayAux[]){
        for(int i=0;i<arrayAux.length;i++){
            System.out.println(arrayAux[i]+"-");
        }
    }
   
   
   
   
   public static int multiplicarArrays(int [] a1, int [] a2){
     int[] arrayFinal = new int[a1.length];
       
     
   }
}
