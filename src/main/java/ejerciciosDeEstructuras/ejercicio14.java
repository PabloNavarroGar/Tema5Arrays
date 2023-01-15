/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDeEstructuras;

import java.util.Random;

/**
 *
 * @author samue
 */
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Escribe un programa que dada una matriz de 3x3 enteros 
        //y realice las siguientes funciones:
        //Array de 3x3
        //Rellenar aleatoriamente todas las casillas de
        //la matriz con números enteros entre 1 y 100
        //Calcular la media de todos los valores 
        //Calcular el valor mínimo y el máximo de todos los valores

       int [][] array = new int[3][3];
       
       rellenarNumerosAleatorios(array);
       
      
    }
    
    
    
    public static void rellenarNumerosAleatorios(int [][] array){
        
        
        
    }
    
    public static int numeroEnteroRandom(int minimo, int maximo) {

        Random random = new Random();
        int numero = random.nextInt(maximo - minimo + 1) + minimo;
        return numero;
    }


}
