/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDeEstructuras;

import java.util.Arrays;

/**
 *
 * @author samue
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creacion del array
        double[] array1 = new double[20];

        for (int i = 0; i < array1.length; i++) {
            Arrays.fill(array1, 7.5);
            double d = array1[i];

            System.out.print(" - " + d);

        }

        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");

        double[] array2 = new double[20];

        for (int i = 0; i < array2.length; i++) {
            Arrays.fill(array2, 7.5);
            double d = array2[i];

            System.out.print(" - " + d);

        }

    }
}
