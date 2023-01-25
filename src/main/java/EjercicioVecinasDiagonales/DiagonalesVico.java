/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioVecinasDiagonales;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author pablo
 */
public class DiagonalesVico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] matriz ={ 
            {4,6,3,2},
            {5,9,7,6},
            {4,4,1,1},
            {0,3,6,8}
        
        };
        mostar(matriz);
        List<Integer> diagonal = elementosDiagonalPrincipal(matriz);
        System.out.println("La diagonal es :");
        diagonal.forEach(System.out::print);
        
        System.out.println(Arrays.toString(elementosDiagonalSecundaria(matriz)));
    }
    
    public static int[] elementosDiagonalSecundaria(int[][] m){
        int [] array = new int [m.length];
        
        for (int i = 0; i < m.length; i++) {
            array[i]= m[i][m.length-1 -i];
        }
        
        return array;
    }
    //No se pueden meter primitivos en colecciones
    public static List<Integer> elementosDiagonalPrincipal(int[][] m){
        //Si voy a deolver enteros crear lista de enteros
        //Es una clase especial la cual no e pueden tener constructores
        List<Integer> lista = new ArrayList<>(); 
        for (int i = 0; i < m.length; i++) {
            lista.add(m[i][i]);
        }
        
        return lista;
    }
        //Metodo para devolver la matriz entera
    public static void mostar(int [][] m){
        for(int[] fila:m){//Por cada fila que tenga m
              for(int valor : fila){//Por cada elemento que hay en la fila
                  
                  System.out.print(valor+ " ");
              }
            
                 System.out.println("");
        }
        
        
    }
    
}
