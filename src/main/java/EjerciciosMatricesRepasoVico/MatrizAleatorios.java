/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosMatricesRepasoVico;

import java.util.Random;

/**
 *
 * @author samue
 */
public class MatrizAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] matriz = generarMatriz(4);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.print(matriz[i][j] + "  ");
            }
            
            System.out.println();
        }
        
        
    }
    
    
    public static int [][] generarMatriz(int n){
        Random random = new Random();
        int[][] matriz = new int [n][n];//Se crea  con las mismas filas y columnas 
        int [] numeros = new int [n * n];//Creo un array que tiene el mismo tamaño con el misma variable de la matriz
        //multiplicado a si mismo para adaptar el tamaño de la matriz
        for (int i = 0; i < n*n; i++) {
            numeros[i] = i+1;
        } //Se rellena el array del 1 al numero que maximo que hayamos metido en el array
        //Recorro y relleno la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //Creo una variable  int con el numero aleaotrio y entre los parentesis
                //mancamos  N^2 y ponemosmos -i y multiplicamos restando n - j,para que no se salga
                int numeroAleatorios = random.nextInt(n*n -i * n-j );
                //Se pone esto para que no haya arrayboundexepction
                //La matriz coge los numeros aleatorios del array
                matriz[i][j] = numeros[numeroAleatorios];
                //Esto hace que NO se repitan esos numeros aleatorios
                //por cada vez que se repita el bucle, va ir poniendo los numeros sin que se repitan
                
                numeros[numeroAleatorios] = numeros[n*n -i * n-j -1];
                
            }
        }
        return matriz;
    }
    
    
    
}
