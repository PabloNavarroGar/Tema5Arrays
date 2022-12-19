/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicionesApuntes;

/**
 *
 * @author pablo
 */
public class Rueda {
    
    
    private double diametro;
    
    private String marcaNeumatico;

    public Rueda(double dametro, String marcaNeumatico) {
        this.diametro = dametro;
        this.marcaNeumatico = marcaNeumatico;
    }

    public String getMarcaNeumatico() {
        return marcaNeumatico;
    }

    public void setMarcaNeumatico(String marcaNeumatico) {
        this.marcaNeumatico = marcaNeumatico;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double dametro) {
        this.diametro = dametro;
    }

    @Override
    public String toString() {
        return "Rueda{" + "dametro=" + diametro + ", marcaNeumatico=" + marcaNeumatico + '}';
    }
    
    
}
