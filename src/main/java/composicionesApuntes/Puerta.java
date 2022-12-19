/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicionesApuntes;

/**
 *
 * @author pablo
 */
public class Puerta {
    
    
    

    private Ventana ventana;
    private boolean estado;

    public Puerta(Ventana ventana, boolean estado) {
        this.ventana = ventana;
        this.estado = estado;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    public boolean getEstado() {
        return estado;
    }

   public void abrir(){
        this.estado=true;
    }
    public void cerrar(){
        
        this.estado=false;
    }

    @Override
    public String toString() {
        return "Puerta{" + "ventana=" + ventana + ", estado=" + estado + '}';
    }
    
    
    
    
}
