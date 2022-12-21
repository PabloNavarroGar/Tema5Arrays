/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentaCarListas;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author pablo
 */
public class Cliente {

    private String nombre;
    private String apellidos;
    private String nif;
    private static int contador = 0;

    public Cliente() {
        this.nombre = RandomStringUtils.randomAlphabetic(3);
        this.apellidos = RandomStringUtils.randomAlphabetic(3);;
        contador++;
        this.nif = String.valueOf(contador);
    }

    public Cliente(String nombre, String apellidos, String nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;

        this.nif = nif;

    }

   
    
    

//    private static String generarNIF() {
//        //Declaramos los char de las letras
//
//        //Generamos una char poniendo en orden las letras
//        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
//        //Usamos las dependecias lag para seleccionar la funcion del  random con 8 digittos
//        String nif = RandomStringUtils.randomNumeric(8);
//        //Declaramos el nif y numero de letra
//        int nifnumero;
//
//        int numeroLetra;
//        //System.out.println("El numero generados son: " + numero);
//        //Hacemos parse para equivaler el String con el int
//        nifnumero = Integer.parseInt(nif);
//        //Tengo el nif con el parse del numero
//        //division del nif entre 23 
//        numeroLetra = nifnumero % 23;
//
//       
//        //devuelvo el String del numero aleatorio junto con el char letra y el numero de la letra
//        return nif + letras[numeroLetra];
    //}
    //Getter y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.nif);
        return hash;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.nif, other.nif);
    }

}
