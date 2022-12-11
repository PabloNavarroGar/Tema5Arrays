/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayObjetos;

import java.util.Objects;

/**
 *
 * @author samue
 */
public class Vehiculo {

    private String bastidor;
    private String matricula;
    private VehiculoColor color;//Enum de Color
    private VehiculoModelo modelo;//Enum de Modelo

    public Vehiculo(String bastidor, String matricula, VehiculoColor color, VehiculoModelo modelo) {
        //Se pone en el constructor los Enum.
        this.bastidor = bastidor;
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public VehiculoColor getColor() {
        return color;
    }

    public void setColor(VehiculoColor color) {
        this.color = color;
    }

    public VehiculoModelo getModelo() {
        return modelo;
    }

    public void setModelo(VehiculoModelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.bastidor);
        hash = 43 * hash + Objects.hashCode(this.matricula);
        hash = 43 * hash + Objects.hashCode(this.color);
        hash = 43 * hash + Objects.hashCode(this.modelo);
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
        final Vehiculo other = (Vehiculo) obj;
        if (!Objects.equals(this.bastidor, other.bastidor)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        return this.modelo == other.modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "bastidor=" + bastidor + ", matricula=" + matricula + ", color=" + color + ", modelo=" + modelo + '}';
    }
}
