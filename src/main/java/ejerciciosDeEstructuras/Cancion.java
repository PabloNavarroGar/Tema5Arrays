/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosDeEstructuras;

import java.time.LocalDate;
import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author samue
 */
public class Cancion {
    //Atributos

    String titulo;
    String cantante;
    String discografica;

    public Cancion() {
        this.titulo = RandomStringUtils.randomAlphabetic(3);
        this.cantante = RandomStringUtils.randomAlphanumeric(1);
        this.discografica = RandomStringUtils.randomAlphabetic(4);

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.titulo);
        hash = 59 * hash + Objects.hashCode(this.cantante);
        hash = 59 * hash + Objects.hashCode(this.discografica);

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
        final Cancion other = (Cancion) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.cantante, other.cantante)) {
            return false;
        }
        return Objects.equals(this.discografica, other.discografica);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getDiscografica() {
        return discografica;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cancion{");
        sb.append("titulo=").append(titulo);
        sb.append(", cantante=").append(cantante);
        sb.append(", discografica=").append(discografica);

        sb.append('}');
        return sb.toString();
    }

}
