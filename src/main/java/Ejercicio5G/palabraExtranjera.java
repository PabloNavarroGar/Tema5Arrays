/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5G;



import java.util.Objects;



/**
 *
 * @author samue
 */
public class palabraExtranjera implements Comparable <palabraExtranjera> {
    
        //Atributos
    
        private String palabraEx;

    public palabraExtranjera(String palabraEx) {
        this.palabraEx = palabraEx;
    }

   
    public String getPalabraEx(){
        
        return palabraEx;
    }
    
    public void setPalabraEx(String palabra){
        
        this.palabraEx = palabra;
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.palabraEx);
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
        final palabraExtranjera other = (palabraExtranjera) obj;
        return Objects.equals(this.palabraEx, other.palabraEx);
    }
    
    
        
    @Override
    public int compareTo(palabraExtranjera o) {
        
         return this.palabraEx.compareToIgnoreCase(o.getPalabraEx());
    }
        
  
}
