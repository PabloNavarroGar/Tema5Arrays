/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Apuntes;

import java.util.Arrays;

/**
 *
 * @author pablo
 */
public class Tema5estructuras {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
         int [] numeros = {1,2,3,4,5,6,7,8,9,10,11,12};
         int pos= busquedaSecuencial(numeros, 10);
         busquedaSecuencial(numeros, 6);
         System.out.println("El numero se encuentra en la posicion " + pos);
         pos= busquedaSecuencial(numeros, 6);
         
         //BUSQUEDA BINARIA
         int posicion= Arrays.binarySearch(numeros, 5);
         
         System.out.println("La posicion del 5 es la = " +posicion);
         
          System.out.println("El numero se encuentra en la posicion " + pos);
        System.out.println("Elemento  indice 5 : " +numeros[5]);
        //Puedo recorreer cualquier elemento dentro del rango 0 y numeros.length -1
        //System.out.println("Elemento indice -1 "+numeros[12]);
        
        System.out.println("Tamaño del array numeros "+numeros.length);
        
        //Imprimimos todos los elementos del arratos
        
        for (int i = 0; i < numeros.length; i++) {
            //Va sumando la i, desde indice hasta el ultimo numero
            //mira el 0, i valdra 0 e ira sumando
            System.out.print("-"+numeros[i]);
        }
        System.out.println("\n-----------");
        //El for que mira los array
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            //Print para que salga en linea
            System.out.print(numero);
            
        }
        System.out.println("\n-----------");
        //foreach(izquierda recibe el dato es cuestion
        //parte derecha la estructura de datos(numeros)
        //Va iterando desde la posicion 0 en aux y entra en bucle
        //Debe de ser numero enteros
        //Nunca debo de usar indices en el foreach
        for(int aux:numeros){
            System.out.print(" - " +aux);
        }
        //Se cambia rel valor de 5 por el 90
        numeros[5]=90;
        
        System.out.println(" ");
        
        for (int i = 0; i < numeros.length; i++) {
            //Va sumando la i, desde indice hasta el ultimo numero
            //mira el 0, i valdra 0 e ira sumando
            System.out.print("-"+numeros[i]);
        }
        
    }
    
    
    public static int busquedaSecuencial(int [] array,int numeroBuscar){
        int indice = -1;
        //Recorremos el array completo
        
        for (int i = 0; i < array.length; i++) {
            if (numeroBuscar == array[i]){ //Lo he encontrado
                
                indice = i;//Garda la posicion para devoverla
                
                break;//Hacemos un break, para cuando salga poor primera vez se salga
                
                
            }
                
                
            
        }
        
        return indice;
        
    }
}
