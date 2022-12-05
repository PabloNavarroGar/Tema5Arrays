/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDeEstructuras;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        //Array creado e inicializado con 10 casillas, el nombre del array, va
        //dentro de los metodos que tienen como parametro el array
        int[] enteros = new int[10];

        //LLamo el metodo con el array del creado en el  main, para que se muestre
        // e introduzca los numeros.
        arrayEnteros(enteros);

        
        System.out.println("------Array-------");
        //Se muestra el array llamando al metodo
        mostrarArray(enteros);

        System.out.print("\n------------------");
        //Se llama el metodo con el array en parametros
        System.out.println(" ");
        //Metodo que llama al los numeros positivos
        numeroPositivos(enteros);

        System.out.println("-------------");
        //Metodo que llama a los numeros negativos

        numeroNegativos(enteros);

        System.out.println("-------------");

        numeroDeCeros(enteros);

        System.out.println("--------------");
        //Media de los positivos
        mediaPositivos(enteros);

        System.out.println("-------------");

        mediaNegativos(enteros);
    }

    public static void arrayEnteros(int[] enteros) {
        Scanner teclado = new Scanner(System.in);
        //Con este bucle for para arrays, por cada entero del indice , se va introduciendo
        //la cantidad que hemos señalado en el main, en este caso 10 numeros
        for (int i = 0; i < enteros.length; i++) {

            boolean repetir = true;
            do {
                System.out.println("Introduce el número entero " + (i + 1));

                enteros[i] = teclado.nextInt();
                try {

                    // La calificación es válida. Imprimo y salgo del bucle
                    repetir = false;
                } catch (InputMismatchException ime) {
                    // En caso de error
                    System.out.println("No es un numero entero");
                    // Limpieza del buffer
                    teclado.nextLine();
                }
            } while (repetir);

        }

    }

    public static int numeroPositivos(int[] enteros) {
        int positivos = 0;
        //Declaramos los positivos
        for (int i = 0; i < enteros.length; i++) {
            //MUY importante comparar los numeros del array con su indice, 
            //si el numero del indice es mayor a 0 es positivo
            if (enteros[i] > 0) {
                positivos++;
            }

        }

        System.out.println("Hay un total de  " + positivos + " positivos  en el array");

        return positivos;
    }

    public static int numeroNegativos(int[] enteros) {
        int negativos = 0;
        //Declaramos los positivos
        for (int i = 0; i < enteros.length; i++) {
            //MUY importante comparar los numeros del array con su indice, 
            //si el numero del indice es mayor a 0 es positivo
            if (enteros[i] < 0) {
                negativos++;
            }

        }
        //salida de datos
        System.out.println("Hay un total de  " + negativos + " negativos  en el array");

        return negativos;
    }

    public static int numeroDeCeros(int[] enteros) {
        int ceros = 0;
        //Declaramos los positivos
        for (int i = 0; i < enteros.length; i++) {
            //MUY importante comparar los numeros del array con su indice, 
            //si el numero del indice es mayor a 0 es positivo
            if (enteros[i] == 0) {
                ceros++;
            }

        }
        //Salida de datos
        System.out.println("Hay un total de  " + ceros + " ceros  en el array");

        return ceros;
    }

    public static void mostrarArray(int[] enteros) {
        int indiceArray = 0;
        //Creamos el for para que vaya leyendo desde el indice 0 todos los
        //numeros y luego dentro del for hacemos la salida de datos
        for (int i = 0; i < enteros.length; i++) {
            indiceArray = enteros[i];
            //Salida de datos

            System.out.print(indiceArray + "  ");
        }

    }

    public static void mediaPositivos(int[] enteros) {

        double mediaPositivos;
        int sumaPositivos = 0;
        //Metemos el metodo de los numeros positivos para que tome la cantidad 
        //de positivos que hemos puesto en el array
        int positivos = numeroPositivos(enteros);
        //Se sumam los positivos
        sumaPositivos += positivos;

        //Hacemos la media
        mediaPositivos = sumaPositivos / positivos;
        //Salida de datos
        System.out.println("La media de los positivos es de = " + mediaPositivos);

    }

    public static void mediaNegativos(int[] enteros) {

        double mediaNegativos;
        int sumaNegativos = 0;
        //Metemos el metodo de los numeros negativos para que tome la cantidad 
        //de positivos que ehmos puesto en el array
        int negativos = numeroNegativos(enteros);

        sumaNegativos += negativos;

        //Hacemos la media
        mediaNegativos = sumaNegativos / negativos;
        //Salida de datos
        System.out.println("La media de los positivos es de = " + mediaNegativos);

    }
}
