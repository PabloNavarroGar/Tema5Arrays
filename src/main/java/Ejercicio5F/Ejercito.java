/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5F;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author samue
 */
public class Ejercito {

    private Set<Soldado> ejercito;//Importo la clase set, e introduzco dentro
    //de los corches la clase(Soldado) y compondra el ejercito

    public Ejercito() {
        this.ejercito = new HashSet<>();//Se introduce la clase HashSet en este punto
        //Para evitar duplicaciones
    }

    public void setEjercito(Set<Soldado> ejercito) {

        this.ejercito = ejercito;

    }

    //Meotod para saber cuando Soldados hay en el ejercito
    public Set<Soldado> getEjecito() {

        return ejercito;
    }

    //Cuantas unidades Conforman el Ejercito(Cantidad)
    public int miembrosDelEjercito() {

        return ejercito.size();
    }

    //Metodo para alistar un soldado
    public void alistarUnSoldado(Soldado s) {

        this.ejercito.add(s);
    }

    //Si un ejercito esta vacio
    public boolean estaVacio() {

        return ejercito.isEmpty();
    }

    //Metodo para saber si un soldado esta en el ejercito
    public boolean estaSoldado(int nif) {
        Soldado aux = new Soldado();
        aux.setNif(nif);
        return ejercito.contains(aux);
    }

//     public boolean estaSoldado2(String nif) {
//
//        boolean resultado = false;
//              Soldado auxiliar = new Soldado();
//                auxiliar.setNif(nif);
//
//            if (auxiliar.compareTo(nif)) {
//                resultado = true;
//
//            }
//            return resultado;
//        }
    //Metodo para salcar todos los soldados en array List
    public ArrayList<Soldado> sacarArrayListSoldado() {

        ArrayList<Soldado> soldados = new ArrayList<>();//Declaracion del ArrayList
        //Con el objeto Soldado

        //ForEach que se le pasa los soldados de la clase al ejercito
        for (Soldado soldado : ejercito) {
            soldados.add(soldado);//Se le añade a la ArryList los soldados
        }

        return soldados; //devuelvo el array(soldados)
    }

    public void desalistarSoldado(int nif) {

        Soldado auxiliar = new Soldado();
        //declaracion de un objeto auxiliar para ponerle el nic
        auxiliar.setNif(nif);
        ejercito.remove(auxiliar);

    }

    //public void desalistarSoldado2(int nif) {

        this.ejercito.remove(new Soldado(nif, "", "", ""));

    }

}
