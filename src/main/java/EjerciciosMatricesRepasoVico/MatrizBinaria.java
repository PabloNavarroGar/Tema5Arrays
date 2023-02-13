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
public class MatrizBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] matriz = generarMatriz(5);
        
        imprimirMatriz(matriz);
        
        int[] resultado = encontrarCasilla(matriz);
        if(resultado !=null){
            
            System.out.println("El primero cero esta esta en (" + resultado[0] +", " + resultado[1] + ") ");
        }else{
            
            System.out.println("No hay zeros en las esquinas");
        }
    }

    public static int[][] generarMatriz(int n) {

        int[][] matriz = new int[n][n];
         int minimo = 0, maximo = 1;
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(maximo - minimo + 1) + minimo;
            }
        }

        return matriz;
    }

    public static int[] encontrarCasilla(int[][] matriz) {
        int aux = matriz.length;
        for (int i = 0; i < aux; i++) {
            for (int j = 0; j < aux; j++) {
                if (matriz[i][j] == 0) {
                    if ((i > 0 && matriz[i - 1][j] == 1) || (i < aux - 1 && matriz[i + 1][j] == 1)
                            || (j > 0 && matriz[i][j - 1] == 1) || (j < aux - 1 && matriz[i][j + 1] == 1)) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;

    }

    public static void imprimirMatriz(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
