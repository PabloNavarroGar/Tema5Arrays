/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5G;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author pablo
 */
public class MapVico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //El hascode, hace que la key sea la que sea unica
        //Declaracion e iniciacion del map
        //recibe un String y UN OBJETO
        Map<String, Integer> nombreEdades = new HashMap();

        nombreEdades.put("Pablo", 25);//Mete a Pablo y la edad
        nombreEdades.put("Pablo", 55);//Actualiza la edad de pablo

        nombreEdades.put("Vico", 55);
        nombreEdades.put("Lucas", 25);
        System.out.println("Nº de elementos del map: " + nombreEdades.size());

        for (Map.Entry<String, Integer> filaMap : nombreEdades.entrySet()) {
            String key = filaMap.getKey();
            Integer val = filaMap.getValue();
            //Cambios los object por String y el Integer

            System.out.println("Key: " + key + " value: " + val);

        }

        System.out.println("Conjunto de claves únicas-----");

        //Esto devuelve el conjunto de claves unicas con keyset
        for (String key : nombreEdades.keySet()) {

            System.out.println(key);

        }
        System.out.println("--------------------");
        System.out.println("Conjunto de values---");
        //Meter las edades en una collecciin
        Collection<Integer> coleccionDeEdades = nombreEdades.values();

        for (Integer edad : coleccionDeEdades) {
            System.out.println(edad);
        }
        
        
        //Lista de edades....Si me ide una lista....
        System.out.println("------Lista de edades con el arrayList");
        List<Integer>listaEdades= new ArrayList<>(nombreEdades.values());
        
        for (Integer edades : listaEdades) {
            System.out.println(edades);
        }
        
        
    }

}
