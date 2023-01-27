/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrdenacionBusqueda;

import java.util.Objects;

/**
 *
 * @author pablo
 */
public class Heroes implements Comparable<Heroes> {
    private String nombre;
    private int vida;
    private int costeDefinitiva;
    private String categoria;
    private String tipoArma;

    public Heroes(String nombre,int vida, int costeDefinitiva, String categoria, String tipoArma) {
        this.nombre = nombre;
        this.vida = vida;
        this.costeDefinitiva = costeDefinitiva;
        this.categoria = categoria;
        this.tipoArma = tipoArma;
    }

    public Heroes() {
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosteDefinitiva() {
        return costeDefinitiva;
    }

    public void setCosteDefinitiva(int costeDefinitiva) {
        this.costeDefinitiva = costeDefinitiva;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    @Override
    public String toString() {
        return "Heroes{" + "nombre=" + nombre + ", vida=" + vida + ", costeDefinitiva=" + costeDefinitiva + ", categoria=" + categoria + ", tipoArma=" + tipoArma + '}';
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nombre);
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
        final Heroes other = (Heroes) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public int compareTo(Heroes o) {
      return this.nombre.compareToIgnoreCase(o.nombre);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
    
    
    
    
}


