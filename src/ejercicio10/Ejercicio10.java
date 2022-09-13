/*
 Pedir 10 números y escribir la suma total.
 */
package ejercicio10;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, suma=0;
        
        for (int i=1; i<=10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            
            suma += numero; //suma iterativa
            
        }
        System.out.println("La suma es: "+suma);
        
        
        
    }
    
}
