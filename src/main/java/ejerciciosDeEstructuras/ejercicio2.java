/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDeEstructuras;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Escribe un programa para leer la altura de un número determinado de personas
        y calcular la altura media. El número de personas se pide por teclado y debe ser
        entero un entero mayor que cero. Posteriormente el programa irá pidiendo la altura,
        en cm, de cada una de las personas y las guardará en una estructura de almacenamiento.
        Si la altura leída no es positiva, el programa la pasará a número positivo. También es
        necesario saber cuántas personas tienen una altura superior a la media e inferior a la media. 
         */
        Scanner teclado = new Scanner(System.in);
        
        int [] media ={};
        for (int i = 0; i < 5; i++) {
            int altura = 0;
           
            
            //si no es positivo, lo pasa a positivo
            altura = Math.abs(altura);
            do {
                try {

                    System.out.println("Introduce altura de la persona, en centimetros ");

                    altura = teclado.nextInt();

                    break;
                } catch (InputMismatchException ime) {
                    System.out.println("Dato Invalido,vuelva a introducirlo");
                    teclado.nextLine();
                }
            } while (altura > 0);

        }
        
        
         //foreach(izquierda recibe el dato es cuestion
        //parte derecha la estructura de datos(numeros)
        //Va iterando desde la posicion 0 en aux y entra en bucle
        
        for(int altura:media){
            System.out.print(" - " +altura);
        }

    }

}
