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
public class ejercicio12Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Declara e inicializa una matriz de caracteres de 2x3, con los valores
        que tú quieras. Implementa un método, en la misma clase que el método main(),
        que reciba una matriz de caracteres y la imprima por consola.
*/      System.out.println("El array creado tiene las siguientes letras");
         char[][] ejemplo  = matriz();
         
        System.out.println("---------------------------");
        
        
        int[][] ejemplo2 = matrizRellenadaConFor();
  
    }
    
    //Declarar la matriz en el meotdo
   public static char[][]  matriz (){
       char [][] arrayLetras = new char[2][3];
       arrayLetras[0][0] = 'a';
       arrayLetras[0][1] = 'b';
       arrayLetras[0][2] = 'c';
       arrayLetras[1][0] = 'd';
       arrayLetras[1][1] = 'e';
       arrayLetras[1][2] = 'f';
       //Para imprimir las casilla despues de simbolo mejor, le meti a i el numero
       //de filas y a j el numero de casillas
       for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 3; j++) {
               System.out.print(arrayLetras[i][j]+ " ");
           }
           System.out.println();
       }
       
       
       return arrayLetras;
      }
     //Como rellenar matrices de forma eficas
   
   public static int[][] matrizRellenadaConFor (){
       int [][] arrayNumeros = new int [2][3];
       int numeros =0;//creo el numero(contador)
        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j <3; j++) {
               //Aqui llamo al array con sus indices y metemos el numero con ++
               //Aqui puedo meter otros metodos para rellenar
                arrayNumeros[i][j]= numeros++;
                //Imprimo el resultado
                System.out.print(numeros + " ");        
                
            }
            System.out.println("");
       }
       
       
       return arrayNumeros;
   }
       
      
   
    
}
