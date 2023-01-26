/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OrdenacionBusqueda;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author pablo
 */
public class GaleriaDeHeroes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         List<Heroes> heroes = new ArrayList<>();
         
         heroes.add(new Heroes("Zarya",425, 90, "Tanque", "Energia"));
         heroes.add(new Heroes("Widowmaker",200, 75, "Ataque", "Bala"));
         heroes.add(new Heroes("Lucio",200, 100, "Apoyo", "Proyectil"));
         heroes.add(new Heroes("Rammatra",450, 85, "Tanque", "Proyectil"));
         heroes.add(new Heroes("Roadhog",700, 80, "Tanque", "Proyectil"));
         heroes.add(new Heroes("Cassidy",225, 80, "Ataque", "Bala"));
         heroes.add(new Heroes("Symmetra",200, 90, "Ataque", "Energia"));
         heroes.add(new Heroes("Ana",200, 90, "Apoyo", "Bala"));
         heroes.add(new Heroes("Moira",200, 90, "Apoyo", "Energia"));
         heroes.add(new Heroes("Junkrat",200, 85, "Ataque", "Proyectil"));
         heroes.add(new Heroes("Zenyatta",200, 95, "Apoyo", "Proyectil"));
                
         
         //Ordenar por nombre 
        Collections.sort(heroes);//Hay que ordenarlos primero
        
         heroes.forEach(System.out::println);//Imprimicion de datos del arrayList
         
         System.out.println("-----------------------------------------");
         //Comparadores
         Comparator<Heroes> criterioNombre = (p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre());
         Comparator<Heroes> criterioVida= (p1, p2) -> Long.compare(p1.getVida(), p2.getVida());
         Comparator<Heroes> criterioCategoria = (p1, p2)-> p1.getCategoria().compareToIgnoreCase(p2.getCategoria());
         Comparator<Heroes> criterioCosteDefinitiva = (p1, p2) -> Long.compare(p1.getCosteDefinitiva(), p2.getCosteDefinitiva());
         
         System.out.println("-----Heroes ordenados por nombre------");
         
         Collections.sort(heroes, criterioNombre);
         
         heroes.forEach(System.out::println);
         
         System.out.println("\n");
         System.out.println("\n");
         
         System.out.println("-----Heroes ordenados por su vida, de mayor a menor--------");
         
         Collections.sort(heroes, criterioVida.reversed());
         
         heroes.forEach(System.out::println);
         
         System.out.println("\n");
         System.out.println("\n");
         
         System.out.println("-----Heroes ordenados por su coste coste de habilidad-----");
         
         
         Collections.sort(heroes, criterioCosteDefinitiva.reversed());
         
         heroes.forEach(System.out::println);
         
         
         System.out.println("\n");
         System.out.println("\n");
         
         System.out.println("-----Heroes ordenados por su Categoria-----");
         
         
         Collections.sort(heroes, criterioCategoria.reversed());
         
         heroes.forEach(System.out::println);
         
         System.out.println("\n");
         System.out.println("\n");
         
         System.out.println("-----Heroes ordenados por su -----");
         
         
         Collections.sort(heroes, criterioCategoria.reversed());
         
         heroes.forEach(System.out::println);
         
         
         
         
    }
    
}
