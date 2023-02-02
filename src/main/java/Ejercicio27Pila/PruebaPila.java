/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio27Pila;

/**
 *
 * @author pablo
 */
public class PruebaPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila p1 = new Pila(5);
        
        
        p1.anadirElementoPush(1);
        p1.anadirElementoPush(2);
        p1.anadirElementoPush(3);
        p1.anadirElementoPush(4);
        p1.anadirElementoPush(5);
        
        
        System.out.println("El numero de elementos de la pila es de : "+p1.numeroElementosPila());
        
        if(!p1.estaVacia()){
            
            System.out.println("La pila tiene elementos");
        } else{
            
            System.out.println("La pila esta vacia");
        }
        
       
    }
    
}
