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
        Collections.sort(paises);//Hay que ordenarlos primero
        
        paises.forEach(System.out::println);//Imprimicion de datos del arrayList
        
        System.out.println("---------------");
        //Ordenacion usando comparator (proporcionamos el criterio)
        //Mediante una lambda

        //Metodo para en vez de hacer todoe le percal, se puedehacer con el comparator
        Comparator<Pais> criterioPoblacion = (p1, p2) -> Long.compare(p1.getPoblacion(), p2.getPoblacion());
        Comparator<Pais> criterioSuperficie = (p1, p2) -> Long.compare(p1.getSuperficie(), p2.getSuperficie());
        Comparator<Pais> criterioNombre = (p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre());
        //Esto es lo mismo que hemos hecho en la clase
        Collections.sort(paises, criterioPoblacion.reversed());
        
        paises.forEach(System.out::println);
        System.out.println("----Por Superficie-----");
        Collections.sort(paises, criterioSuperficie);
        
        paises.forEach(System.out::println);
        
        System.out.println("-----Por coleccionesmultiples");
        //Esto sirve que antes tenemos que crear el Comparator como hemos hecho arriba
        //Se pueden crear como lo queramos siempre y cuando 
        Collections.sort(paises, criterioSuperficie.thenComparing(criterioNombre));
        
         
        //Ordena la lista de paise por superficie y luego por poblacion x2
        System.out.println("Por superficie fusionada con poblacion, de mayor a menor");
        Collections.sort(paises, criterioSuperficie.thenComparing(criterioPoblacion).reversed());
        
        
        paises.forEach(System.out::println);
        
        System.out.println("------------Busquedas binarias----------");
        System.out.println("Lista en orden natural por su nombre...");
        //Las busquedas las haces por mitades
        // Búsqueda por orden natural (por nombre)--lo decide el programador o jege
        //La lista donde buscar la informacion debe estar ordenada previamente
        //Segun el criterio dle ordne natural (nombre)--> Comparable en Pais
        Collections.sort(paises);//Siempre hay que ordenar, por el busqueda binaria
        paises.forEach(System.out::println);
        Pais objetoBuscar = new Pais();
       
        objetoBuscar.setNombre("Portugal");//Lista ordenada por nombre
        
        int posicion = Collections.binarySearch(paises, objetoBuscar);
        
        System.out.println("Portugal esta n la posicion " + posicion);
        
        //Si intento buscar en la lista con un valor que no es nombre se puede obtener
        //Una posicion erronea
        
        posicion = Collections.binarySearch(paises, objetoBuscar, criterioPoblacion);
        System.out.println(posicion);
        
        
        System.out.println(" Ordenacio y busqueda por poblacion");
        
        Collections.sort(paises,criterioPoblacion);
        paises.forEach(System.out::println);
        
        objetoBuscar = new Pais();
        objetoBuscar.setPoblacion(146);
        
        posicion = Collections.binarySearch(paises, objetoBuscar, criterioPoblacion);
        
        System.out.println("El pais que tiene 146 millones de habitanes es "+ paises.get(posicion));
        
        
       
    }
}
