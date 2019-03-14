/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradaysalidajoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author gonza
 */
public class EntradaysalidaJOptionPane {

   
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
      cadena = JOptionPane.showInputDialog("digite una cadena: ");// guarda un string atravez de una ventanita
      entero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
      letra = JOptionPane.showInputDialog("digite un caracter: ").charAt(0);
      decimal = Double.parseDouble(JOptionPane.showInputDialog("digite un decimall: "));
      
      
      JOptionPane.showMessageDialog(null,"la cadena es "+cadena);
      JOptionPane.showMessageDialog(null,"el numero entero es: "+entero);
      JOptionPane.showMessageDialog(null,"el carecter es: "+letra);
      JOptionPane.showMessageDialog(null,"el decimal es: "+decimal);//en JOptionPane en la parte de decimal se pone con . y no con ,
    }
    
    
    
}
