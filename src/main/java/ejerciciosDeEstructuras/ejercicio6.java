/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDeEstructuras;

import java.util.Arrays;

/**
 *
 * @author pablo
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 2, 2};
        boolean comparativa;
        //Comparando con la clase Arrays

        // Probarlo con los arrays [1,2,3] y [1,2,3],   [1,2,3] y [1,2,2].
        System.out.println("¿El igual el array 1 y 1? " + Arrays.equals(array1, array1));

        //[1,2,3,4] y [1,2,3]
        System.out.println(" ¿El array 2 es igual al 1? " + Arrays.equals(array2, array1));

        // [1,2,3] y [1,2,2]
        System.out.println(" ¿El array 1 es igual al 3? " + Arrays.equals(array1, array3));

        System.out.println("-----------Comparativa con el metodo----------------");

        System.out.println("¿El igual el array 1 y 1? " + compararArrays2(array1, array1));
        System.out.println("¿El igual el array 1 y 2? " + compararArrays2(array2, array1));
         System.out.println(" ¿El array 1 es igual al 3? " + compararArrays2(array1, array3));
         //hola

    }

   

    public static boolean compararArrays2(int[] a1, int[] a2) {
        boolean resultado = true;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    resultado = true;
                } else{
                    resultado = false;
                }
                 //Rompe la iteración puesto que, si determinó que un dato se repite, no es necesario seguir comparando.   
            }
        }
        return resultado;

    }

}
