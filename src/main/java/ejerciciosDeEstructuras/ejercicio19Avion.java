/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDeEstructuras;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class ejercicio19Avion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[][] avionPablo = new String[25][4];//Declaro e inicio matriz
        rellenarMatriz(avionPablo);//Rellenamos matriz

        //Menu de la aplicacion
        String menu = """
                    [1]-Ver Asientos del Avion
                    ------------------------
                    [2]-Reversar asiento
                    ------------------------
                    [3]-Cancelar reserva
                    ------------------------
                    [4]-Salir del Programa
                    ------------------------
                    Introduce el numero de la opcion
                                        
                    """;

        int opcionMenu = 0;
        //Bucle que contiene el menu, y el switch para las opciones
        do {
            opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcionMenu) {
                case 1 -> {
                    JOptionPane.showMessageDialog(null, imprimirMatrizDelAvion(avionPablo));
                }
                case 2 -> {

                    reservarAsiento(avionPablo);
                }
                case 3 -> {

                    CancelarAsiento(avionPablo);
                }

                case 4 -> {

                    JOptionPane.showMessageDialog(null, "Saliendo del programa");
                }
                default ->
                    JOptionPane.showMessageDialog(null, "Repita otra accion");

            }

        } while (opcionMenu != 4);

    }

    //Se va a crear la matriz, la cual sera todo String con la letra O,
    //que simboliza que esta libre el asiento y luego una `X`la cual indicara
    //qa que el asiento estara reservado
    //Pasamos la matriz por parametros
    public static void rellenarMatriz(String[][] matrizPedir) {
        String[][] matrizRellenada = new String[25][4];
        String letra = "O";
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < matrizPedir[i].length; j++) {

                matrizPedir[i][j] = "O";
            }
        }

    }

    public static String[][] rellenarMatriz2() {
        String[][] matrizRellenada = new String[25][4];//Declaro e inicio la matriz que se pasara por
        //El metodo
        String letra = "O";//String que tendra la matriz.
        for (int i = 0; i < 10; i++) {
            //Recorro la matriz
            for (int j = 0; j < matrizRellenada[i].length; j++) {

                matrizRellenada[i][j] = letra;//Introducimos la letra en las casillas
            }
        }
        return matrizRellenada;//Devuelvo la matriz
    }

    public static String imprimirMatrizDelAvion(String[][] matrizPedir) {

        String matrizAsientos = "";//Declaro String como tipo de datos que contendra la Matriz
        for (int i = 0; i < matrizPedir.length; i++) {
            //Dentro del for para recorrer las 2 parte, le meto la [i]
            for (int j = 0; j < matrizPedir[i].length; j++) {
                
                //Se le suma la matriz
                    matrizAsientos += " [" + matrizPedir[i][j] + "] " + "   ";

                

            }
            //Salto de linea que se la sumara cada vez que recorra
            matrizAsientos += "\n";
        }

        return matrizAsientos;
    }

    public static void reservarAsiento(String[][] matrizPedir) {

        //Variable que tienen los numero sd ela fila y columna
        int fila = 0;
        int columna = 0;
        //Metodo para introducir 2 enteros que seleccioaran una 1 y una columna
        fila = pedirNumeroEnteroJOptionRango(1, 25, "Introduce la fila donde esta el asiento");
        columna = pedirNumeroEnteroJOptionRango(1, 4, "Introduce la columna donde esta el asiento");

       
        //condicion que si dada una casilla de la matriz, si tiene un X, estara reservado y saldra un mensaje, si no, lo cambia a X de reservado
        if (matrizPedir[fila][columna].equals("X")) {

            JOptionPane.showMessageDialog(null, "El asiento ya  esta reservado, pruebe con otro");

        } else {

            matrizPedir[fila][columna] = "X";

        }
    }

    //Mismo proceso que reservar, pero invierto las letras
    public static void CancelarAsiento(String[][] matrizPedir) {

        //Variable que tienen los numero sd ela fila y columna
        int fila = 0;
        int columna = 0;

        fila = pedirNumeroEnteroJOptionRango(1, 25, "Introduce la fila donde esta el asiento");
        columna = pedirNumeroEnteroJOptionRango(1, 4, "Introduce la columna donde esta el asiento");

      
        //condicion que si dada una casilla de la matriz, si tiene un X, sale un mensaje, si no, lo cambia a X de reservado
        if (matrizPedir[fila][columna].equals("O")) {

            JOptionPane.showMessageDialog(null, "El asiento esta libre, pruebe con otro");

        } else {

            matrizPedir[fila][columna] = "O";

        }
    }

    public static int pedirNumeroEnteroJOptionRango(int minimo, int maximo, String texto) {

        int numero = 0;
        boolean seguir = true;
        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(texto));
                if (numero >= minimo && numero <= maximo) {
                    seguir = false;
                } else {
                    JOptionPane.showMessageDialog(null, "El número debe estar entre el " + minimo + " y el " + maximo);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Valor incorrecto, repita");
            }
        } while (seguir);
        return numero;
    }
}
