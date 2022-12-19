/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicionesApuntes;

/**
 *
 * @author pablo
 */
public class Coche {
    //4 ruedas
    private Rueda delanteraDerecha;
    private Rueda delanteraIzquierda;
    private Rueda traseraIzquierda;
    private Rueda traseraDerecha;
    //1 motor
    private Motor motor;
    //Puertas
    private Puerta puertaPiloto;
    private Puerta puertaCopiloto;
    
    //Ventana
    //
    private String matricula;

    public Coche(Rueda delanteraDerecha, Rueda delanteraIzquierda, Rueda traseraIzquierda, Rueda traseraDerecha, Motor motor, Puerta puertaPiloto, Puerta puertaCopiloto, String matricula) {
        this.delanteraDerecha = delanteraDerecha;
        this.delanteraIzquierda = delanteraIzquierda;
        this.traseraIzquierda = traseraIzquierda;
        this.traseraDerecha = traseraDerecha;
        this.motor = motor;
        this.puertaPiloto = puertaPiloto;
        this.puertaCopiloto = puertaCopiloto;
        this.matricula = matricula;
    }

    public Rueda getDelanteraDerecha() {
        return delanteraDerecha;
    }

    public void setDelanteraDerecha(Rueda delanteraDerecha) {
        this.delanteraDerecha = delanteraDerecha;
    }

    public Rueda getDelanteraIzquierda() {
        return delanteraIzquierda;
    }

    public void setDelanteraIzquierda(Rueda delanteraIzquierda) {
        this.delanteraIzquierda = delanteraIzquierda;
    }

    public Rueda getTraseraIzquierda() {
        return traseraIzquierda;
    }

    public void setTraseraIzquierda(Rueda traseraIzquierda) {
        this.traseraIzquierda = traseraIzquierda;
    }

    public Rueda getTraseraDerecha() {
        return traseraDerecha;
    }

    public void setTraseraDerecha(Rueda traseraDerecha) {
        this.traseraDerecha = traseraDerecha;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Puerta getPuertaPiloto() {
        return puertaPiloto;
    }

    public void setPuertaPiloto(Puerta puertaPiloto) {
        this.puertaPiloto = puertaPiloto;
    }

    public Puerta getPuertaCopiloto() {
        return puertaCopiloto;
    }

    public void setPuertaCopiloto(Puerta puertaCopiloto) {
        this.puertaCopiloto = puertaCopiloto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coche{" + "delanteraDerecha=" + delanteraDerecha + ", delanteraIzquierda=" + delanteraIzquierda + ", traseraIzquierda=" + traseraIzquierda + ", traseraDerecha=" + traseraDerecha + ", motor=" + motor + ", puertaPiloto=" + puertaPiloto + ", puertaCopiloto=" + puertaCopiloto + ", matricula=" + matricula + '}';
    }
    
    
    
}
