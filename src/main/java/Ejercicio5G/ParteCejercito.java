/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5G;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author samue
 */
public class ParteCejercito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Map<Integer, EjercitoMap> ejercitoMap = new HashMap();

        ejercitoMap.put(1, new EjercitoMap("Tierra"));
        ejercitoMap.put(2, new EjercitoMap("Mar"));
        ejercitoMap.put(3, new EjercitoMap("Aire"));
        
        //Llamamos a los ejercitos
        
        for (Map.Entry<Integer, EjercitoMap> filaMap : ejercitoMap.entrySet()) {
            Integer key = filaMap.getKey();
            EjercitoMap val = filaMap.getValue();
            
            
            System.out.println("Identificador: " + key + " Nombre: " + val);
        }
        
        
          
         System.out.println("Identificadores");

        //Esto devuelve el conjunto de claves unicas con keyset
        for (Integer key : ejercitoMap.keySet()) {

            System.out.println(key);

        }
        
        
          //Lista de nombres....Si me ide una lista....
        System.out.println("------Lista de edades con el arrayList");
        List<EjercitoMap>listaNombres= new ArrayList<>(ejercitoMap.values());
        
        for (EjercitoMap nombres : listaNombres) {
            System.out.println(nombres);
        }
        
        
    }

}
