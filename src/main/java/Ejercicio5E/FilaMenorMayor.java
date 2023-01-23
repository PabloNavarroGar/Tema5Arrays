/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5E;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class FilaMenorMayor {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("null")
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;//Opcion del menu
        int[][]matriz;
        int longitud;//Variable que ira dentro de como queremos que sea nuestra matriz
        Coordenada coordenada;//Coordenada creada, inicializada con el metodo de en
        //encontrarcoordeanda para que no este en null
        
        String menu="""
                    Coordeanada Matriz 3000
                    ------------------------
                    1.Opcion manual
                    2.Opcion automatica
                    
                    3.Salir del programa
                    
                    """;
        //Menu con 3 opciones, una para rellenar de forma manual la matriz y otra automaticamente
        do{
          
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

             switch (opcion) {
                case 1 -> {
                    longitud= filtrarNumeroEnteroJOptionPaneRango(3, 6, 
                            "Introduce la longitud de la matriz(Entre 3 y 6)");
                    matriz = new int[longitud][longitud];
                    rellenarMatrizDeFormaManual(matriz);
                    coordenada = encontrarNumeroCoordenada(matriz);
                    imprimirMatriz(matriz);
                    JOptionPane.showMessageDialog(null,"El numero esta en la posicion "+ coordenada.toString());
                }
                case 2 -> {
                    
                    longitud= filtrarNumeroEnteroJOptionPaneRango(3, 6, 
                            "Introduce la longitud de la matriz(Entre 3 y 6) ");
                    matriz = new int[longitud][longitud];
                    rellenarAutomaticamente(matriz);
                    coordenada = encontrarNumeroCoordenada(matriz);
                    imprimirMatriz(matriz); 
                    JOptionPane.showMessageDialog(null,"El numero esta en la posicion "+ coordenada.toString());
                   
                }
                case 3 -> {

                 break;
                }

             
                default ->
                    JOptionPane.showMessageDialog(null, "Opcion no valido,Repita otra accion");
            
             }
            
        }while(opcion !=3);//Mientras no sea la opcion 3, se repetira el bucle
    }
    //Metodo para rellenar la matriz de forma manual
    public static void rellenarMatrizDeFormaManual(int[][] matrizPedir) {
       
        for (int i = 0; i < matrizPedir.length; i++) {

            for (int j = 0; j < matrizPedir[i].length; j++) {

                matrizPedir[i][j] = pedirNumeroEnteroScaner("Introduce el numero de la posicion ["+i+"] y ["+j+"]" );
                //Se introduce la introduccion de los numero dentro del 2º for que recorre la 2º parte de la matri<
            }
        }

    }
    //Metodo pedir el entero, pongo un texto en el parametro para que pueda poner un mnesaje entre sus parentesis
    public static int pedirNumeroEnteroScaner(String texto) {
         //Pedir un numero entero por consola
        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        boolean seguir = true;
        do {

            System.out.println("Introduce el número");

            try {
                numero = entrada.nextInt();
                seguir = false;
            } catch (InputMismatchException ime) {
                System.out.println("Ha introducido un valor incorrecto, repita");
            }

            entrada.nextLine();
        } while (seguir);

        return numero;
    }
    
    //Metodo para imprimir la matriz
     public static void imprimirMatriz(int[][] matrizPedir) {

       
        for (int i = 0; i < matrizPedir.length; i++) {
            //Dentro del for para recorrer las 2 parte, le meto la [i]
            for (int j = 0; j < matrizPedir[i].length; j++) {

                if (j != matrizPedir[i].length - 1) {
                    System.out.print( " [" + matrizPedir[i][j] + "] " + " -  ");

                } else {
                    System.out.println( " [" + matrizPedir[i][j] + "] ");

                }

            }
          
           
        }

      
    }
     
     
     //Meotodo para encontrar un numero en la coordenada, llamaamos a la coordenada
     //Necesito antes los metodos de buscar un numeromayor o menor
     public static Coordenada encontrarNumeroCoordenada (int[][] matriz){
         //Declaro coordenada
         Coordenada c = new Coordenada(-1,-1);//introducimos coordenadas negativas
        
         
         for (int i = 0; i < matriz.length; i++) {
             
             
             
             c= buscarUnNumeroMayorFila(i, matriz);
             
             if(!comprobarSiEsMenorElNumero(c, matriz)){
                 if(i == matriz.length-1)
                   c.setFila(-1);
                 c.setColumna(-1);
             } else{
                 break;
                 
             }
             
            
         }
         
         
         return c;
         
     }
     
     //Metodo para buscar un numero mayor de la fila
     public static Coordenada buscarUnNumeroMayorFila(int fila,int[][]matriz){
         
        int numero=0;
        
        Coordenada c = new Coordenada(-1, -1);
        
         for (int i = 0; i < matriz.length; i++) {
             //Si la fila de la matriz es mayor al numero
             if(matriz[fila][i] > numero){
                 //El numero se iguala a esa fila
                 numero = matriz[fila][i];
                 //Llamamos los 2 set y poenmos las filas
                 c.setFila(fila);
                 c.setColumna(fila);
             }
             
         }
         return c;
     }
     
     
     public static boolean comprobarSiEsMenorElNumero(Coordenada c ,int[][] matriz){
         
         boolean resultado = true;
                 
         int numero = matriz[c.getFila()][c.getColumna()];
         
         for (int i = 0; i < matriz[c.getFila()].length; i++) {
             
             if(matriz[i][c.getColumna()] < numero){
                 resultado=false;
                 
                 break;
             }
             
         }
         return resultado;
         
     }
     
     //Metodo para rellenar automaticamente la matriz, le pasamos matriz por parametros
     public static void rellenarAutomaticamente(int [][] matriz){
         
         for (int i = 0; i < matriz.length; i++) {
             
             for (int j = 0; j < matriz[i].length; j++) {
                 
                 matriz [i][j] = numeroEnteroRandom(0,20);
                 
             }
         }
         
     }
     
      public static int numeroEnteroRandom(int minimo, int maximo) {

        Random random = new Random();
        int numero = random.nextInt(maximo - minimo + 1) + minimo;
        return numero;
    }
    
       public static int filtrarNumeroEnteroJOptionPane(String msj) {

        int numero = 0;
        boolean seguir = true;
        do {

            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(msj));
                seguir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Ha introducido un valor incorrecto, repita");
            }

        } while (seguir);

        return numero;
    }
       
       
        public static int filtrarNumeroEnteroJOptionPaneRango(int minimo, int maximo,String msj) {

        int numero = 0;
        boolean seguir = true;
        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(msj));
                if (numero >= minimo && numero <= maximo) {
                    seguir = false;
                } else {
                    JOptionPane.showMessageDialog(null, "El número debe estar entre " + minimo + " y " + maximo);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Ha introducido un valor incorrecto, repita");
            }
        } while (seguir);
        return numero;
    }
}
