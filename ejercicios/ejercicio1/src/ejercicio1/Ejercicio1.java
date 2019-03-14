/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero1,numero2,suma,resta,mult,div,resto;
        
        System.out.println("Dogite dos numeros: ");
        
     
       numero1 = entrada.nextFloat();
       numero2 = entrada.nextFloat();
       
       suma = numero1+numero2;
       resta = numero1-numero2;
       mult = numero1*numero2;
       div = numero1/numero2;
       resto = numero1%numero2; // divide y luego muestra el resto %
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+mult);
        System.out.println("la division es: "+div);
        System.out.println("el resto es: "+resto);
        

                
        
        
        
        
    }
    
}
