/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ArrayObjetos;

import java.util.Random;

/**
 *
 * @author samue
 */
public enum VehiculoModelo {
    SEAT_PANDA("Seat", "Panda", "48"),
    FORD_KUGA("Ford", "Kuga", "120"),
    CUPRA("Seat", "Cupra", "140");
    String marca;
    String modelo;
    String cilindrada;

    private VehiculoModelo(String marca, String modelo, String cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "VehiculoModelo{" + "marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + '}';
    }

    public static VehiculoModelo modeloAleatorio() {

        VehiculoModelo[] modelos = VehiculoModelo.values();
        int posicion = numeroAleatorio(
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                0, modelos.length);

        return modelos[posicion];

    }
    
     public static int numeroAleatorio(int minimo, int maximo) {
        int numeroColor = 0;

        Random random = new Random();

        int n = 10, m = 20;
        numeroColor = random.nextInt(m - n + 1) + n;
        return numeroColor;
    }
}
