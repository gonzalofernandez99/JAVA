
package ejercicio.pkg2;

import java.util.Scanner;


public class Ejercicio2 {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,nota3,suma ;
        
        System.out.println("Digite tres calificaciones: ");
        nota1 = entrada.nextFloat();
       nota2 = entrada.nextFloat();
    
       nota3 = entrada.nextFloat();
       
       suma = nota1+nota2+nota3;
    
        System.out.println("la suma es: "+suma);
    }
    
}
