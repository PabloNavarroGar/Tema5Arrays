/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentaCarListas;

import java.time.LocalDate;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author pablo
 */
public class Alquiler {
    
    private int alquierID;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private int duracion;
   
    private String alquilerID2;
    private static int contador=0;
    public Alquiler(Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio, int duracion) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.duracion = duracion;
        contador++;
        this.alquierID=contador;
    }

    public Alquiler(String AlquilerID, Cliente cliente, Vehiculo vehiculo, int duracion) {
        this.alquilerID2 = RandomStringUtils.random(4);
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = LocalDate.now();
        this.duracion = duracion;
    }
    

    public Alquiler() {
    }
    
    public int getAlquierID() {
        return alquierID;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setAlquierID(int alquierID) {
        this.alquierID = alquierID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alquiler{");
        sb.append("alquierID=").append(alquierID);
        sb.append(", cliente=").append(cliente);
        sb.append(", vehiculo=").append(vehiculo.getBastidor());
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", duracion=").append(duracion);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.alquierID;
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
        final Alquiler other = (Alquiler) obj;
        return this.alquierID == other.alquierID;
    }
            
    
}
