/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.salida;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class MenuSalida {

  @SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
 
		read = new Scanner (System.in);
		int Seleccion = 0; //Primer Menu 
		int Abonar = 0;
 
 do {
		System.out.println("\n Que sale hoy ?");
                System.out.println("\n 1.Jueves");
		System.out.println("\n 2.Viernes");
		System.out.println("\n 3.Sabado");
		System.out.println("");
        System.out.print("Ingrese Opción: ");
		Seleccion = read.nextInt();
		switch (Seleccion){
		case 1:
			int Juernes = 0;
	do {
				System.out.println(" Ingreso a su salidita del juernes");
				System.out.println(" Que va a Realizar...");
				System.out.println("\n 1.Krigaren(posbilemente no entres).");
				System.out.println("\n 2.Kika(tenes que andar muy gede)");
				System.out.println("\n 3.Lobbers(me gusta baratito).");
				System.out.println("\n 4. Te confundistes de dia ? Apreta esta opcion boludaso.");
				Juernes = read.nextInt();
			switch (Juernes){
			case 1: System.out.println("Seleccionastes Krigaren vas a gastar un aprox de 600 mangitos (saladito no? )."); break;
			case 2: System.out.println("Selecionastes Kika, estas loco mostro esta opcion nunca fue activada aun."); break;
			case 3: System.out.println("Selecionastes Lobbers I like papa tu billetera esta feliz :)."); break ;
			default: System.out.println("Selecciono Volver Atras.");
			}
 
}while (Juernes<3) ;
			break;
		case 2:
			int Viernes = 0;
			System.out.println("Ingreso a su salidita de viernes");
			do {
				System.out.println(" Donde queres salir mostri ?.");
				System.out.println("\n 1.Barcito(tranqui papa asi me gusta).");
				System.out.println("\n 2.KIKA(Segui intentando porque hay mas chances que huracan salga camepon de la libertadores )");
				System.out.println("\n 3.Belliving (o como mierda se escribe, esta lleno de tinchos pelotudos).");
				System.out.println("\n 4. Te confundistes ? apreta aca bobo.");
				 System.out.println("");
                 System.out.print("Ingrese Opción: ");
				Viernes = read.nextInt();
			switch (viernes){
			case 1: System.out.println("Selecionastes SabaD*ki."); break;
			case 2: System.out.println("Recistal de Milli melsa papa (famosita que salio en la tele gilaso )"); break;
			case 3: System.out.println("Cualquier bolichito (total gastas en todo lo mismo, menos en capi que gastas 70 pesitos)."); break ;
			default: System.out.println("Saliendo..."); break;
			}
			}while (Viernes <3);
		}
	}while (Seleccion <3);
		}
}
