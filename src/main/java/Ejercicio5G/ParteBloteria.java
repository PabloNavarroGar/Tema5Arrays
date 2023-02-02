/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5G;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author pablo
 */
public class ParteBloteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Map<String, Double> loteria = new HashMap<>();
       
        //Metodos
        rellenarMap(loteria);


        imprimiMap(loteria);
        
        verPremio(loteria);

    }
    //Le pasamos el Map en el parametro
    public static void verPremio(Map<String,Double>loteria) {
        System.out.println("Ingrese el número de décimo:");
        Scanner input = new Scanner(System.in);
        String numero = input.nextLine();//Introducimos numero
        //Llamamos a la loteria,contains y le enlazamos el la variable del numero
        if (loteria.containsKey(numero)) {
            System.out.println("El premio asociado al número " + numero + " es: " + loteria.get(numero));
        } else {
            System.out.println("No se encontró un premio asociado al número " + numero);
        }

    }
    
    public static void rellenarMap(Map<String,Double>loteria){
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {

            //Relenamos la MAP 1000 veces en la i.
            
            String numero = RandomStringUtils.randomNumeric(5);

            double premio = Math.round(random.nextDouble() * 1000);

            loteria.put(numero, premio);
        }
        
        
        
    }
    public static void imprimiMap(Map<String,Double>loteria){
        
         for (Map.Entry<String, Double> filaMap : loteria.entrySet()) {
            String key = filaMap.getKey();
            Double val = filaMap.getValue();

            System.out.println("Numero: " + key + " Premio: " + val);
        }
        
        
    }

}
