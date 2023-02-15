/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosMatricesRepasoVico;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author samue
 */
public class Trenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        int[][] matrizTrenes={
            
            {121,56,20,34},
            {122,90,0,0},
            {123,40,30,0},
            {123,40,30,0}
        
        };
        //Creacion del map
        Map<Integer,Tren> mapTrenes = new HashMap<>();
        //Meto un for each con un array que cuente las id,vagones y pasajeros
        //Esto es mas facil para recorrer matrices, con los arrays
        for(int[]fila: matrizTrenes){
            int idTren = fila[0];
            int numeroVagones = 0;
            int numeroPasajeros = 0;
            //Condicion para que lea las filas del array y con la condicion de que si encuentra un 0 ya deja de contar los vagones
            //Ponemos el 1 para que cuente desde la  casilla 1 y no SUME el codigo
            for (int i = 1; i < fila.length; i++) {
                if(fila[i]==0){
                    break;
                }
                numeroVagones++;//Cuenta el numero de vagones  , 
                //en el momento que ve un 0 dejad e contar
                numeroPasajeros += fila[i];
                
            }
            
            //Declaro el objetvo tren y lo meto en el hascode
            Tren tren = new Tren(idTren, numeroVagones, numeroPasajeros);
            mapTrenes.put(idTren, tren);
  
            
        }
        
        //for para imprimir la matriz con los trenes, con la map
        for (Tren tren : mapTrenes.values()) {
            
            System.out.println("ID Tren: "+ tren.getIdTren());
            
            System.out.println("Numero de Vagones del Tren: "+ tren.getNumeroVagones());
            
            System.out.println("Numero de pasajeros totales: "+ tren.getNumeroPasajeros());
            System.out.println("##################################################");
        }
    }
    
}
