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
        //Variable 
       
        int[][] matriz = matrizRellenadaConFor();//Matriz creada y rellenada con metodo

        imprimirMatriz(matriz);

       
        matriz = adyacentes(matriz.length, matriz[0].length, 0, 0);
        System.out.println("3 posiciones");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

         matriz = adyacentes(matriz.length, matriz[0].length, 1, 0);
 
        System.out.println("5 posiciones");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
 
        matriz =adyacentes(matriz.length, matriz[0].length, 1, 1);
 
        System.out.println("8 posiciones");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
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

    public static int[][] adyacentes(int fila, int columna, int filaOrigen, int columnaOrigen) {
        //Esto significa que la fila y columna que voy a señalar esta DENTRO de la matriz
        if (!(filaOrigen >= 0
                && filaOrigen <= (fila - 1)
                && columnaOrigen >= 0
                && columnaOrigen <= (columna - 1))) {
            return null;
        }
        
        int numPosiciones;//siempre van a ser 3 5 y 8 
        //esto significa que solo puede ser en los casos anteriores(3,5,8)
        if (filaOrigen == 0 || filaOrigen == (fila - 1)) {
            if (columnaOrigen == 0 || columnaOrigen == (columna - 1)) {
                numPosiciones = 3;//Esto significa que estamos en las esquinas de la matriz
            } else {
                numPosiciones = 5;//Si no es una esquina sera 5 posiciones
            }
        } else {
            if (columnaOrigen == 0 || columnaOrigen == (columna - 1)) {
                numPosiciones = 5;//Esta arlrededor de 5
            } else {
                numPosiciones = 8;
            }
        }
        //Creamos la matriz
        int[][] posiciones = new int[numPosiciones][2];
        //Recorremos la matriz, -1-1 para empezar desde la 0 0
        
        int indicePosicion = 0;
        for (int i = -1; i <= 1; i++) {
            //Emperamos en -1 hasta el 1
            for (int j = -1; j <= 1; j++) {
                //Hay que evitar que ambos 0
                if ((i != 0 || j != 0)
                        && (filaOrigen + i) >= 0 
                        && (filaOrigen + i) <= (fila - 1)//Se le esta diciendo que estes dentro de la matriz, toda esta condicion
                        && (columnaOrigen + j) >= 0
                        && (columnaOrigen + j) <= (columna - 1)) {
                    posiciones[indicePosicion][0] = filaOrigen + i;
                    posiciones[indicePosicion][1] = columnaOrigen + j;
                    indicePosicion++;
                }

            }
        }

        return posiciones;

    }

}
