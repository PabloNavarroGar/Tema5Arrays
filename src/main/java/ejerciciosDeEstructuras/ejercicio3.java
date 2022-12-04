/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDeEstructuras;

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
        
        double [] array1 = new double [20];
        
        for (int i = 0; i < array1.length; i++) {
            double valorArray = array1[i];
            valorArray= 7.5;
            
            System.out.println(valorArray);
        }
        
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        
         double [] array2 = new double [20];
        
        for (int i = 0; i < array1.length; i++) {
            double valorArray = array2[i];
            valorArray= 7.5;
            
            System.out.println(valorArray);
        }
       
        array1[5]= 6.3;
        
        for(double aux:array1){
            System.out.print(" - " +aux);
        }
        
        System.out.println("\n");
       for(double aux:array2){
            System.out.print(" - " +aux);
        }
    }
    
}
