/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;






/**
 *
 * @author gonza
 */
public class JavaApplication4 {

//---------muestra de datos por consola-------
    public static void main(String[] args) {
        /*Scanner entrada = new Scanner(System.in); //guardar los tipos de entrada
           float numero;
                System.out.println("digite un numero: ");     //hay que digitarlo con ,
          numero = entrada.nextFloat();                      //hay que cambiar la entrada segun que dato entre...
          System.out.println("el numero es: "+numero);
                */
       Scanner entrada = new Scanner(System.in);
       char letra;
        //String cadena;
       System.out.println("digite una cadena: ");
       //cadena = entrada.next(); sirve para guardar una cadena hasta el espacio
       //cadena = entrada.nextLine(); //Guarda cadenas + espacios
       letra = entrada.next().charAt(0);// lee solo el primer caracter
        System.out.println("la cadena es: "+letra);
        
        
    }
    
}
