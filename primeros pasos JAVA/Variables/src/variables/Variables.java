/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author gonza
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final byte entero = 12; //-127:128 constante 
        
        short enterito = 129;//-32000:32000 aprox
        int enterote = 120000; //-2000000000:2000000000 apox
        long enteroposta = 100000000;//-9000000000000000:9000000000000000 aprox
        float Nflotante = 10.5f; //1.4e-045 a 3.4e+038... hay que agregar la f para que ejecutar
        double Ndecimal = 100.5;//4.9e-324 a 1.8e + 308.. ocupa mucho espacio en memoria(no hace falta la f)
        char caracter = 'a'; //un solo caracter
        boolean decision = true; // V o F 
        //agregando final la convertimos en constante 
        
        
                
                
                System.out.println("numero entero : "+entero);//el + junta
        
    }
    
}
