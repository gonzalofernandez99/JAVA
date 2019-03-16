
package ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {

   
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        float guillermo,luis,juan,total ;
       
       System.out.println("digite la cantidad que tiene guillermo");
    guillermo = entrada.nextFloat();
    luis = guillermo/2;
    juan =(guillermo+luis)/2;
    
    
    total = guillermo+luis+juan;
    
        System.out.println("la cantidad total que tiene es: "+total);
    }
    
    
}
