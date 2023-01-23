/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5E;

import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class ElArbolito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int altura;
        
        String[][] arbol;
        
        altura = filtrarNumeroEnteroJOptionPaneRango(2, 10, "Introduce la altura de la copa del arbol");
        
        arbol=crearMatrizDelArbil(altura);
        rellenMatrizArbol(arbol);
        
        System.out.println(imprimirMatrizArbol(arbol));
        
    }
    
    
    //Metodo para rellenar el arbol
    public static void rellenMatrizArbol(String[][] arbolMatriz){
        
        int numero= arbolMatriz[0].length/2;
        int numeroAux;
        
        for (int i = 0; i < arbolMatriz.length; i++) {
            
            numeroAux = numero -i;
            
            
            for (int j = 0; j < arbolMatriz[i].length; j++) {
                
                if(numeroAux >= 0){
                    
                    arbolMatriz[i][numeroAux+j] ="1";
                }
                
                if(j + numeroAux == arbolMatriz[i].length -1 - numeroAux){
                    break;
                    
                }
                
            }
            
            if (i == arbolMatriz.length-2 || i == arbolMatriz.length -1){
                
                arbolMatriz[i][(arbolMatriz[i].length/2)] ="1"; 
            }
        }
        
        
    }
    
    
    
    public static String imprimirMatrizArbol(String[][] arbolMatriz){
        
        String texto ="";
        
        for (int i = 0; i < arbolMatriz.length; i++) {
            for (int j = 0; j < arbolMatriz[i].length; j++) {
              
                if(arbolMatriz[i][j]== null){
                    
                    texto += "";
                    
                } else{
                    
                    texto += arbolMatriz[i][j];
                }
                
            }
            texto+="\n";
        }
        return texto;
    }
    
    public static String[][] crearMatrizDelArbil(int alturaArbol){
        
        final int ALTURA_MINIMA=2;
        final int ALTURA_MAXIMA=10;
        final int ANCHURA_MINIMA=2;
        final int TRONCO=2;
        String[][] resultado;
        
        resultado= new String[alturaArbol+TRONCO][ANCHURA_MINIMA+(alturaArbol-ANCHURA_MINIMA)* 2];
        
        return resultado;
    }
    
     public static int filtrarNumeroEnteroJOptionPaneRango(int minimo, int maximo,String mensaje) {

        int numero = 0;
        boolean seguir = true;
        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                if (numero >= minimo && numero <= maximo) {
                    seguir = false;
                } else {
                    JOptionPane.showMessageDialog(null, "El número debe estar entre " + minimo + " y " + maximo);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Ha introducido un valor incorrecto, repita");
            }
        } while (seguir);
        return numero;
    }
    
    
}


