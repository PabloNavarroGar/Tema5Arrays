/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicionesApuntes;

/**
 *
 * @author pablo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rueda di = new Rueda(225, "Michellin");
        Rueda dd = new Rueda(225, "Michellin");
        Rueda ti = new Rueda(225, "Michellin Low Cost");
        Rueda tf = new Rueda(225, "Michellin low Cost");
        Ventana ventanaPiloto=  new Ventana(false);
        Ventana ventanaCopiloto=  new Ventana(false);
        Puerta piloto = new Puerta(ventanaPiloto, false);
        Puerta copiloto = new Puerta(ventanaCopiloto, false);
        Motor motor = new Motor(95,false);
        
        Coche coche1 = new Coche(dd, ti,
                ti, tf, motor, copiloto, 
                copiloto,"123456YR");
        
        
        System.out.println(coche1);
        
        //HAY QUE IR AL REVES, va desde 
        coche1.getPuertaPiloto().getVentana().abrir();
        
        
      
        
        coche1.getMotor().arrancar();
    }
    
}
