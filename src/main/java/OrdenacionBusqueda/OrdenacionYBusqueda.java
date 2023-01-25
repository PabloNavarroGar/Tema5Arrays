/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrdenacionBusqueda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author pablo
 */
public class OrdenacionYBusqueda {
    
    public static void main(String[] args) {
        
        List<Pais> paises = new ArrayList<>();
        
        paises.add(new Pais("España", 46, 505_400, "Euro"));
        paises.add(new Pais("Portugal", 23, 25_400, "Euro"));
        paises.add(new Pais("EEUU", 146, 1_505_400, "Dólar Americano"));
        paises.add(new Pais("Italia", 46, 505_400, "Euro"));
        paises.forEach(System.out::println);//Imprimir un arrayList

        System.out.println("-------------------");
        //Ordenar por nombre 
        Collections.sort(paises);
        
        paises.forEach(System.out::println);
        
        System.out.println("---------------");
        //Ordenacion usando comparator (proporcionamos el criterio)
        //Mediante una lambda

        //Metodo para en vez de hacer todoe le percal, se puedehacer con el comparator
        Comparator<Pais> criterioPoblacion = (p1, p2) -> Long.compare(p1.getPoblacion(), p2.getPoblacion());
        Comparator<Pais> criterioSuperficie = (p1, p2) -> Long.compare(p1.getSuperficie(), p2.getSuperficie());
        Comparator<Pais> criterioNombre = (p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre());
        Collections.sort(paises, criterioPoblacion.reversed());
        
        paises.forEach(System.out::println);
        System.out.println("----Por Superficie-----");
        Collections.sort(paises, criterioSuperficie);
        
        paises.forEach(System.out::println);
        
        System.out.println("-----Por coleccionesmultiples");
        Collections.sort(paises, criterioSuperficie.thenComparing(criterioNombre));
        
    }
}
