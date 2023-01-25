/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioVecinasDiagonales;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo
 */
public class VecinasVico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] matriz = {
            {4, 6, 3, 2},
            {5, 9, 7, 6},
            {4, 4, 1, 1},
            {0, 3, 6, 8}

        };
        mostar(matriz);
        List<Casillas > listaCasillas = casillasVecinas(1, 1, matriz);
        for (Casillas casilla : listaCasillas){
            //Metodo para ver el contenido de las casillas dadas
            System.out.println(casilla);
        }

    }

    public static void mostar(int[][] m) {
        for (int[] fila : m) {//Por cada fila que tenga m
            for (int valor : fila) {//Por cada elemento que hay en la fila

                System.out.print(valor + " ");
            }

            System.out.println("");
        }

    }

    public static List<Casillas> casillasVecinas(int fila, int columna, int[][] m) {
        List<Casillas> lista = new ArrayList<>();
        // Comprobamos fila y columna para que sean validas 
        if (filaValida(fila, m) && columnaValida(columna, m)) {
            //Recorremos fila anterior a la casilla hasta la fila posterios
            for (int i = fila - 1; i < fila + 1; i++) {

                if (filaValida(i, m)) {
                    //Si alguna fila no es valida, no la mira
                    //Recorremos columna anterior a la casilla hasta columna posterior

                    for (int j = columna - 1; j < columna + 1; j++) {
                        //Si alguna columna no es valida , no la mira
                        if (columnaValida(j, m)) {
                            if (i == fila && j == columna) {

                                continue;
                            }
                            System.out.println("Casilla " + i + " " + j);
                            lista.add(new Casillas(i, j, m[i][j]));

                        }

                    }

                }
            }

        }

        return lista;
    }

    public static boolean filaValida(int fila, int[][] matriz) {

        return fila >= 0 && fila < matriz.length;
    }

    public static boolean columnaValida(int columna, int[][] matriz) {

        return columna >= 0 && columna < matriz.length;
    }

}
