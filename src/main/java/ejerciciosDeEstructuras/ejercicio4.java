/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDeEstructuras;

import static Apuntes.Tema5estructuras.busquedaSecuencial;
import java.util.Arrays;

/**
 *
 * @author pablo
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int pos = busquedaSecuencial(numeros, 5);
        
        System.out.println("El numero se encuentra en la posicion " + pos);
        

        //BUSQUEDA BINARIA
        int posicion = Arrays.binarySearch(numeros, 5);

        System.out.println("La posicion del 5 es la = " + posicion);

    
    }

}
