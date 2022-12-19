/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentaCarListas;

/**
 *
 * @author pablo
 */
public class Empresa {
    private String nombre;
    private String cif;
    private CatalogoCliente cc;
    private CatalogoVehiculos cv;
    private CatalogoAlquiler ca;

    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
        this.cv = new CatalogoVehiculos(100);
        this.cc = new CatalogoCliente(100);
        this.ca = new CatalogoAlquiler(100);
    }
          
    public void registrarCliente(Cliente cli){
        
        
        
    }
    
    public void registrarVehiculo(Vehiculo v){
        
        
        
    }
    
    public boolean registrarAlquiler (Alquiler a){
        
        return true;
    }
    
    public boolean registrarAlquiler (String nif,String Bastidor,int nDias ){
        
        return true;
    }
    
    
    
    public Cliente buscarCliente(String nif){
        
        return null;
        
    }
    
    public Vehiculo buscarVehiculo(String bastidor){
        
        return null;
    }
    
}
