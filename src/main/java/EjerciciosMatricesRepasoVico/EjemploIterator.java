/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosMatricesRepasoVico;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author pablo
 */
public class EjemploIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(10);
        conjunto.add(30);
        conjunto.add(20);

        for (Integer numerico : conjunto) {

            System.out.println("Elemento :" + numerico);
//        if(numerico == 20){
//            
//            conjunto.remove(20);
//            //Si hacmeos estos sale una expecion, 
//no se puede eliminar una coleccion mientras se reocrre
//            //
//        }
        }
        System.out.println("Se a usado Iterador para quitar el 20");
        Iterator<Integer> it = conjunto.iterator();
        while(it.hasNext()){
            
            Integer numerico = it .next();
            if(numerico == 20){
                
                it.remove();
                //borra de la coleccion por debajo de la coleccion el ultimo elemento
                //del set
            }
            
        }
        
        conjunto.forEach(System.out::println);
    }

}
