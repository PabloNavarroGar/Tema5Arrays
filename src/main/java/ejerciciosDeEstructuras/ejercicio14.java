/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDeEstructuras;

import java.text.DecimalFormat;
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
       DecimalFormat df = new DecimalFormat("#.00");
       int [][] matriz = new int[3][3];
       //Le meto el metodo de rellenar la matriz con numeros aleatorios
       //A. Rellenar aleatoriamente todas las casillas entre 1 100
        rellenarMatrizAleatorios(matriz);
        System.out.println("La matriz rellenada es:");
        imprimirMatriz(matriz);
       //B.Calculas la media de todos los valores
        //Sumo las filas primero
       
        System.out.println("La media es: "+df.format(calculasLaMedia(matriz)));
        
        //C.Calcular Valor minimo y el valor máximo de todos los valores.
      
        System.out.println("El numero mas pequeño de la matriz es :" + obtenerNumeroMinimo(matriz));
        System.out.println("El numero mas grande de la matriz es :" + obtenerNumeroMaximo(matriz));
        
    }
    
    
    
    public static void rellenarMatrizAleatorios(int [][] matriz){
        for (int i = 0; i <matriz.length; i++) {
                //Usar array.lengt para medir todo
            for (int j = 0; j <matriz.length; j++) {
               //Aqui llamo al array con sus indices y metemos el numero con ++
               //Aqui puedo meter otros metodos para rellenar
               //Como en el parametro esta la matriz, no hace falta que la cree de nuevo, 
               
                matriz[i][j]= numeroEnteroRandom();
                //Imprimo el resultado
                    
                
            }
         
       }
        
        
    }
    //Metodo para imprimirMatriz, muy importante usar en TODOS los ejercicios de las matriz
    public static void imprimirMatriz (int[][] matrizPedir){
        for (int i = 0; i < matrizPedir.length; i++) {
            //Dentro del for para recorrer las 2 parte, le meto la i
            for (int j = 0; j < matrizPedir[i].length; j++) {
                
                if(j != matrizPedir[i].length -1){
                    
                    System.out.print("["+matrizPedir[i][j]+"]" + " - " );
                }else {
                    
                    System.out.println("["+matrizPedir[i][j]+"]");
                }
                
                
            }
            
        }
        
        
    }
    //Le paso la Matriz por parametros
    public static int numeroEnteroRandom() {

        Random random = new Random();
        int numero = random.nextInt(100 - 1 + 1) + 1;
        return numero;
    }
   
    public static int calcularFilas(int[][] matriz,int numFila){
       
        if(numFila >=0 && numFila <=matriz.length)
        {
          return matriz[numFila].length;
        }else{
            return -1;
        }
         
    }
    
    public static double calculasLaMedia(int[][] matriz){
        double media=0;
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                
                media+=matriz[i][j];
                
            }
            
        }
        media = media/9;
        return media;
    }
    
    public static int obtenerNumeroMinimo(int [][] matriz){
        
        int numero = matriz[0][0];
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] < numero){
                    
                    numero = matriz[i][j];
                }
            }
        }
        
        return numero;
    }
    
    
     public static int obtenerNumeroMaximo(int [][] matriz){
        
        int numero = matriz[0][0];
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > numero){
                    
                    numero = matriz[i][j];
                }
            }
        }
        
        return numero;
    }
    
}
