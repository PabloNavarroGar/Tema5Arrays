/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioVecinasDiagonales;

import static ejerciciosDeEstructuras.ejercicio12Matriz.matrizRellenadaConFor;
import java.util.Arrays;

/**
 *
 * @author pablo
 */
public class Vecinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] matriz = matrizRellenadaConFor();//Matriz creada y rellenada con metodo

        imprimirMatriz(matriz);

    }

    public static int[][] matrizRellenadaConFor() {
        int[][] matrizNumeros = new int[3][3];
        int numeros = 0;//creo el numero(contador)
        for (int i = 0; i < matrizNumeros.length; i++) {

            for (int j = 0; j < matrizNumeros[i].length; j++) {
                //Aqui llamo a la matriz con sus indices y metemos el numero con ++
                //Aqui puedo meter otros metodos para rellenar
                matrizNumeros[i][j] = numeros++;
                //Imprimo el resultado

            }

        }

        return matrizNumeros;
    }

    public static void imprimirMatriz(int[][] matrizPedir) {
        for (int i = 0; i < matrizPedir.length; i++) {
            //Dentro del for para recorrer las 2 parte, le meto la i
            for (int j = 0; j < matrizPedir[i].length; j++) {

                if (j != matrizPedir[i].length - 1) {

                    System.out.print("[" + matrizPedir[i][j] + "]" + " - ");
                } else {

                    System.out.println("[" + matrizPedir[i][j] + "]");
                }

            }

        }

    }
    
    public static int[][] adyacentes(int fila, int columna, int filaOrigen, int columnaOrigen){
        
        if(!(filaOrigen>=0 && filaOrigen <= fila -1 
                && columnaOrigen >= 0 && columnaOrigen<= columna-1)){
            
            
            
        }
        return null;
    }
}
