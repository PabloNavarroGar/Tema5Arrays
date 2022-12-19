/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package RentaCarListas;

import java.util.Random;

/**
 *
 * @author tomas
 */
public enum Modelo {
    //Declaracion de los enum
     SEAT_PANDA("Seat", "Panda", "48"),
     FORD_KUGA("Ford", "Kuga", "120"),
     SEAT_CUPRA("Seat", "Cupra", "95");
    
    String marca;
    String modelo;
    String cilindrada;
        //Constructor provado del modelo
    private Modelo(String marca, String modelo, String cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }
    //Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Modelo{");
        sb.append("marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", cilindrada=").append(cilindrada);
        sb.append('}');
        return sb.toString();
    }
    //Método para coger un 
    public static Modelo getAleatorio(){
        Random r = new Random();
        Modelo[] modelos = Modelo.values();//generá un array de todos los modelos del enum. 
//        for( int i = 0; i<modelos.lenght; i++){
//        System.out.println(modelos[i])
//        }
            //se declara la variable con el random. su int y entre 0 y los modelos que hay que son 3
        int posicionValida = r.nextInt(0,modelos.length);
        return modelos[posicionValida];
        
    }

    
    
    
}
