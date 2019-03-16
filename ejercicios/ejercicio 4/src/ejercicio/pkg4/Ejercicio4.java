
package ejercicio.pkg4;

import java.util.Scanner;


public class Ejercicio4 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float participacion,priexam,segexamen,examenfinal,notafinal;
        System.out.println("digite la nota de participante: ");
        participacion = entrada.nextFloat();
        System.out.println("digite la primera  nota del parcial: ");
        priexam = entrada.nextFloat();
        System.out.println("digite la segunda nota del parcial: ");
        segexamen = entrada.nextFloat();
        System.out.println("digite la nota final perreque: ");
        examenfinal = entrada.nextFloat();
        //sacando los calculos
        participacion *= 0.10f;
        priexam *= 0.25f;
        segexamen *= 0.25f;
        examenfinal *= 0.40f;
        
        notafinal = participacion + priexam + segexamen + examenfinal;
        
        //imprimiendo los resultados buuuu
        System.out.println("la nota final del alumno es: "+notafinal);
    }
    
}
