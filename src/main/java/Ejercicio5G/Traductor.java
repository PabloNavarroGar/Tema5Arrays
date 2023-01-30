/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5G;

import java.util.Objects;

/**
 *
 * @author pablo
 */
public class Traductor {
    
    
    //Atributos
    
    private String idioma;
    private String palabraExtranjera;//2 objetos String que pide 
    private String palabraCastellano;

    public Traductor() {
    }

    public Traductor(String idioma, String palabraExtranjera, String palabraCastellano) {
        this.idioma = idioma;
        this.palabraExtranjera = palabraExtranjera;
        this.palabraCastellano = palabraCastellano;
    }

    

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getPalabraExtranjera() {
        return palabraExtranjera;
    }

    public void setPalabraExtranjera(String palabraExtranjera1) {
        this.palabraExtranjera = palabraExtranjera1;
    }

    public String getPalabraCastellano() {
        return palabraCastellano;
    }

    public void setPalabraCastellano(String palabraCastellano) {
        this.palabraCastellano = palabraCastellano;
    }

   
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.idioma);
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
        final Traductor other = (Traductor) obj;
        return Objects.equals(this.idioma, other.idioma);
    }

    //Existirá un método que servirá para guardar una entrada y recibirá
    //dos palabras (palabraExtranjera, palabraEspañol) para ir guardando traducciones
    
    public void introducirPalabras( String palabraExtranjera, String palabraEspanol) {

        
    }
    
}
