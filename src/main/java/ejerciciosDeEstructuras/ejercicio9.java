/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDeEstructuras;

import static Apuntes.Tema5estructuras.busquedaSecuencial;
import java.util.Arrays;
import static org.apache.commons.lang3.ArrayUtils.swap;

/**
 *
 * @author samue
 */
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // TODO code application logic here
        int[] numerosArray = {8, 6, 4, 2, 1, 3, 5, 7, 9, 10, 12, 11};
        int pos = busquedaSecuencial(numerosArray, 5);

        System.out.println("El numero se encuentra en la posicion " + pos);

        //BUSQUEDA BINARIA
        int posicion = Arrays.binarySearch(numerosArray, 5);

        System.out.println("La posicion del 5 es la = " + posicion);

        //Metodo bubble
        ordenarBubble(numerosArray);

        System.out.println("Array ordenado por metodo bubble");
        for (int i = 0; i < numerosArray.length; i++) {

            System.out.print(numerosArray[i]+" - ");

        }

    }
    //metodo bubble
    public static void ordenarBubble(int[] arrayOrdenar) {
        //For con el array de parametro, luego ontro for que vaya contando los indices de i
        //y la condicion oara ordenarlo
        for (int i = arrayOrdenar.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayOrdenar[j] > arrayOrdenar[j + 1]) {
                    swap(arrayOrdenar, j, j + 1);
                }

            }

        }

    }
}
