/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5F;

import java.util.Objects;

/**
 *
 * @author samue
 */
public class Soldado implements Comparable<Soldado> {
    //Usamos implements e imprementamos el Comparable Soldado y pinchamos en abstracto
    /*Crea la clase Soldado (nif, nombre, apellido1, apellido2 y edad) con 
    constructores, getters, setters, toString y método equals. Se entienden 
    que dos soldados son iguales si su nif es igual. 
*/
    
    //Atributos de la clase
        private int nif;
        private String nombre;
        private String apellido1;
        private String apellido2;

    public Soldado(int nif, String nombre, String apellido1, String apellido2) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public Soldado() {
    }
    

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Override
    public String toString() {
        return "Soldado{" + "nif=" + nif + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nif);
        return hash;
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
        final Soldado other = (Soldado) obj;
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public int compareTo(Soldado o) {
         return Integer.compare(this.nif, o.getNif());
    }

   

  
   
        
        
}
