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
public class palabraEspanola {
    
    private  String palabraEs;

    public palabraEspanola(String palabraEs) {
        this.palabraEs = palabraEs;
    }
    
     

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.palabraEs);
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
        final palabraEspanola other = (palabraEspanola) obj;
        return Objects.equals(this.palabraEs, other.palabraEs);
    }

    @Override
    public String toString() {
        return "palabraEspanola{" + "palabraEs=" + palabraEs + '}';
    }

    public String getPalabraEs() {
        return palabraEs;
    }

    public void setPalabraEs(String palabraEs) {
        this.palabraEs = palabraEs;
    }
    
    
}
