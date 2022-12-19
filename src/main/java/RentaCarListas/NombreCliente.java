/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package RentaCarListas;

import java.util.Random;

/**
 *
 * @author pablo
 */
public enum NombreCliente {
    
    JUAN,MARCOS,SAMUEL,TOMAS,PABLO,NACHO,LAURA,EVA,MARIA,ANA;
    //Metodo para poner un nombre aleatorio escrito a los de arriba, 
    //Se crea el metodo, se usara la variable Cliente en el array
    public static NombreCliente getNombreAleatorio(){
        Random r = new Random();
        //Generá un array de todos los colores del enum. Se pone el nombre del enum como array,
        //y luego cliente
        NombreCliente[] cliente = NombreCliente.values();

        int posicion = r.nextInt(0,cliente.length);
        //Devuelvo el nombre segun la posición en la que este el numero random
        return cliente[posicion];
    }
}
