/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5G;

import java.util.ArrayList;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author pablo
 */
public class Traductor {

    //Atributos
    private SortedMap<String, String> palabras;

    public Traductor() {
        this.palabras = new TreeMap<>();//Para que salgan ordenadas Alfabeticamente
    }

    public SortedMap<String, String> getPalabras() {

        return palabras;
    }

    public void setPalabras(SortedMap<String, String> palabras) {
        this.palabras = palabras;
    }

    //Metodo para añadir dos strings a la MAP
    public void anadirPalabra(String palabraExtranjera, String palabraEspanol) {
        palabras.put(palabraExtranjera, palabraEspanol);
    }
    //metodo para borrar palabra

    public void borrarPalabraExtranjera(String palabraExtranjera) {
        palabras.remove(palabraExtranjera);
    }
    //Metodo para modificar palabras

    public void modificarPalabras(String palabraExtranjera, String nuevaPalabra) {
        palabras.remove(palabraExtranjera);
        palabras.put(palabraExtranjera, nuevaPalabra);
    }

    @Override
    public String toString() {
        return "Traductor{" + "palabras=" + palabras + '}';
    }

    public void imprimirPalaras() {

        for (String key : palabras.keySet()) {
            System.out.printf("Clave %s -- Objeto %s %n", key, palabras.get(key));
        }
    }
    //Metodo traducir una palabra

    public String traducir(String palabraExtranjera) {
        return palabras.get(palabraExtranjera);
    }

    //Obtener Palabras Extranjeras
    public ArrayList<String> sacarPalabrasExtranjeras() {

        ArrayList<String> extranjera = new ArrayList<>();//Declaracion del ArrayList
        //Con el objeto Soldado

        //ForEach que se le pasa los soldados de la clase al ejercito
        for (String palabra : palabras.keySet()) {
            extranjera.add(palabra);//Se le añade a la ArryList 
        }

        return extranjera; //devuelvo el arrayList
    }

    public ArrayList<String> sacarPalabrasEspanolas() {

        ArrayList<String> espanolas = new ArrayList<>();//Declaracion del ArrayList
        //Con el objeto Soldado

        //For each, que le pasa el string y llamamos la keyset, mucho oho, añadimos el objeto del traductor
        //y get el objeto 
        for (String palabra : palabras.keySet()) {
            espanolas.add(palabras.get(palabra));//Se le añade a la ArryList 
        }

        return espanolas; //devuelvo el array
    }

    //Obtener Palabras Españolas
}