/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosMatricesRepasoVico;

/**
 *
 * @author samue
 */
public class Tren {
    //atributos Tren
    
    private int IdTren;
    private int numeroVagones;
    private int numeroPasajeros;

    public Tren(int IdTren, int numeroVagones, int numeroPasajeros) {
        this.IdTren = IdTren;
        this.numeroVagones = numeroVagones;
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getIdTren() {
        return IdTren;
    }

    public void setIdTren(int IdTren) {
        this.IdTren = IdTren;
    }

    public int getNumeroVagones() {
        return numeroVagones;
    }

    public void setNumeroVagones(int numeroVagones) {
        this.numeroVagones = numeroVagones;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tren{");
        sb.append("IdTren=").append(IdTren);
        sb.append(", numeroVagones=").append(numeroVagones);
        sb.append(", numeroPasajeros=").append(numeroPasajeros);
        sb.append('}');
        return sb.toString();
    }
    
}
