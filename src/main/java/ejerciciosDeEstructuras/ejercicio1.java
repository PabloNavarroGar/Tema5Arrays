/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDeEstructuras;

/**
 *
 * @author pablo
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] numeros = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < numeros.length; i++) {
            //Va sumando la i, desde indice hasta el ultimo numero
            //mira el 0, i valdra 0 e ira sumando
            System.out.print(" - "+numeros[i]);
            
            
            
         
        }
        System.out.println("\n");
         int suma=0;
         
         suma = numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4]+numeros[5];
         
         System.out.println("Suma de los array"+suma);
       
    }

}
