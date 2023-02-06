/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursividad;

/**
 *
 * @author pablo
 */
public class ImprimirNumeroFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //No se llama a si mismo
      
        System.out.println(factorialRecursivo(5));
        
        
       
    }

   public static int factorialRecursivo(int n){
       int numero = Math.abs(n);
       if(numero ==0 || numero == 1 ){
           
           return 1;
       } else{
           
           return numero*factorialRecursivo(numero-1);
       }
       
   }

    public static int factorial(int numero) {
        //Si el mnumero es igual a 0 se devuelve 1, si no el numero lo multiflicas por el factorial
        
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
        
      
    }
    
    public static int factorialVico(int n){
        int resultado = 1;
         int numero = Math.abs(n);
        for (int i = 0; i < numero; i++) {
            resultado*=1; 
            
        }
        
        return resultado;
    }
}
