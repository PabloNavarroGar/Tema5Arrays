/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RentaCarListas;

import java.time.LocalDate;

/**
 *
 * @author tomas
 */
public class EjemploVehiculoEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Modelo x = Modelo.SEAT_CUPRA;
//        System.out.println(" ");
//        Modelo aleatorio = Modelo.getAleatorio();
//        System.out.println(Modelo.getAleatorio());
//        System.out.println("color" + Color.getAleatorio());
        //Vehiculo v = new Vehiculo();
        //System.out.println(v);
//        System.out.println("-----Muestra del Catalogo------");
//        CatalogoVehiculos catalogo = new CatalogoVehiculos(10);
//        System.out.println(catalogo);
//
//        catalogo.borrarVehiculo(catalogo.getListaVehiculos()[3]);
//
//        System.out.println("DESPUES DE BORRAR EL VEHICULO");
//        System.out.println("Numero de Vehiculos en el catalogo despue sde borrar " + catalogo.getNumeroVehiculos());
//
//        System.out.println(catalogo);
//
//        Vehiculo aux = new Vehiculo();
//        aux.setBastidor("123456");
//        catalogo.anadirVehiculo(aux);
//
//        System.out.println("Nº de Vehiculos en el catalogo" + catalogo.getNumeroVehiculos());
//
//        System.out.println(catalogo);
//        
//        
//        aux.setBastidor("99999");
//        
//        catalogo.anadirVehiculo(aux);
//        
//        
//        System.out.println("Nº de Vehiculos en el catalogo"+catalogo.getNumeroVehiculos());
//        
//        
//        System.out.println(catalogo);
//
//        Cliente c1 = new Cliente("Juan", "Palomo");
//        
//        System.out.println(c1);
//        
//        
//        System.out.println("--------CATALOGO DE CLIENTES------------");
//        CatalogoCliente clientes = new CatalogoCliente(10);
//        System.out.println("Nº del catalaogot de los clientes "+clientes.getNumeroCLientes());
//        System.out.println(clientes);
//        System.out.println("------------------------------------------");
//         CatalogoCliente clientes2 = new CatalogoCliente(10);
//        System.out.println("Nº del catalaogot de los clientes "+clientes2.getNumeroCLientes());
//        System.out.println(clientes2);
//        
//        
//        Cliente cli = clientes.buscarCliente("9");
//        System.out.println(" ");
//        System.out.println(" ");
//        System.out.println("-----------CATALOGO DE VEHICULOS-----------------");
//        //CATALOGO DE VEHICULOS
//        CatalogoVehiculos catalogo = new CatalogoVehiculos(15);//creacion del objetco catalogo
//        //En el vemos como se crea el tamaño el cual abarcara 15 vehiculos
//        catalogo.mostrarCatalogo();//
//        Vehiculo [] array = catalogo.getListaVehiculos();
//        array[0].setBastidor("123A");
//        catalogo .mostrarCatalogo();
//        Vehiculo v = new Vehiculo();
//        v.setBastidor("123A");
//        System.out.println(v);
//        
//        System.out.println(" ");
//        int posisiconVehiculoArray = catalogo.buscarVehiculo(v);
//        System.out.println("Posición " + posisiconVehiculoArray);
//        catalogo.borrarVehiculo(catalogo.getListaVehiculos()[4]);
//        System.out.println("------------------ DESPUES DE BORRAR ------------------");
//        catalogo .mostrarCatalogo();

    
        CatalogoVehiculos cv = new CatalogoVehiculos(10);
        CatalogoCliente cc = new CatalogoCliente(10);
         
        
        System.out.println(cv);
        
        System.out.println(cc);
      
       
       
        System.out.println("Metodo de buscarCliente");
        Cliente c = cc.buscarCliente("3");
        System.out.println(c);
        System.out.println("-------------------");
        System.out.println("Metodo de buscarVehiculo");
         Vehiculo v1 = cv.buscarVehiculo("1");
         
         System.out.println(v1);
       
        

        
        Alquiler a = new Alquiler(c, v1, LocalDate.now(), 1);
      
        
        CatalogoAlquiler ca = new CatalogoAlquiler(10);
       
        ca.anadirAlquiler(a);
        
       
        
        
        
        
 
      
        
        
        
       //e1.registarAlquiler(String nif,String Vehiculo, LocalDate.now(), 45);
    }

}
