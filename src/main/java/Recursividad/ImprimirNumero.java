/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursividad;

/**
 *
 * @author pablo
 */
public class ImprimirNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirNumeroRecursivo(5);
    }
    
    public static void imprimirNumeroRecursivo (int numero){
        System.out.println(numero);
        
        if(numero >0){//se llama a si mismo en escalera y luego devuelve los numeros
        imprimirNumeroRecursivo( numero-1);
       
        }
         System.out.println(numero);
    }
}
