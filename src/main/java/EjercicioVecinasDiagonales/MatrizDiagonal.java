/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioVecinasDiagonales;

import java.util.Random;

/**
 *
 * @author samue
 */
public class MatrizDiagonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] matrizDiagonal = new int[4][4];//Matriz declarada y inicializada

        rellenarMatrizAleatorios(matrizDiagonal);//Metodos 
        System.out.println("La matriz es: ");
        
        imprimirMatriz(matrizDiagonal);

      
        System.out.println("La diagonal principal es :");
        imprimirDiagonalPrincipal(matrizDiagonal);
        System.out.println("\n");
        System.out.println("La diagonal secundaria es :");
                   
        imprimirDiagonalSecundaria(matrizDiagonal);
        
    }
    //metodo para imprimir la matriz
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
    //Metodo para imprimir la diagonal principal
    public static void imprimirDiagonalPrincipal(int[][] matrizPedir) {
        for (int i = 0; i < matrizPedir.length; i++) {
            //Solo hago un bucle for y dentro de el, un sout, el cual dentro de los
            //corchetes ponerle el interador en ambos.
          
            System.out.print(matrizPedir[i][i] + " ");
        }

    }
    
     public static void imprimirDiagonalSecundaria(int[][] matrizPedir) {
         int numero = matrizPedir.length -1;
         //Creamos una variable de int para igualarla al numero de la matriz
         for (int i = 0; i < matrizPedir.length; i++) {
            
      
          //A la hora de recorrer la matriz, introducimos la variable en la 2 casilla
          //de la matriz con --.
            System.out.print(matrizPedir[i][numero--] + " ");
        }

    }

    public static void rellenarMatrizAleatorios(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            //Usar array.lengt para medir todo
            for (int j = 0; j < matriz.length; j++) {
                //Aqui llamo al array con sus indices y metemos el numero con ++
                //Aqui puedo meter otros metodos para rellenar
                //Como en el parametro esta la matriz, no hace falta que la cree de nuevo, 

                matriz[i][j] = numeroEnteroRandom();
                //Imprimo el resultado

            }

        }
    }

    public static int numeroEnteroRandom() {

        Random random = new Random();
        int numero = random.nextInt(100 - 1 + 1) + 1;
        return numero;
    }
}
