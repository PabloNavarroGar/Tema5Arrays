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
public enum VehiculoColor {
    ROJO, AZUL, VERDE, AMARILLO;

    public static VehiculoColor colorAleatorio() {

        VehiculoColor[] colores = VehiculoColor.values();
        int posicion =numeroAleatorio(0, colores.length);

        return colores[posicion];

    }

    public static int numeroAleatorio(int minimo, int maximo) {
        int numeroColor = 0;

        Random random = new Random();

        int n = 10, m = 20;
        numeroColor = random.nextInt(m - n + 1) + n;
        return numeroColor;
    }
}
