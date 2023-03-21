package Actividad5;

import java.io.IOException;
import java.util.Scanner;

public class Apartado4 {
	
	// Debes leer por teclado dos datos: la edad de un alumno y un carácter que
	// representa modalidad de acceso (los posibles valores serían: 
	//‘A’ acceso directo, ‘G grado medio, ‘P’ prueba de acceso). 
	// Según los valores debes mostrar los siguientes mensajes: Si es menor
	// de edad y accede de
	// forma directa debe mostrar “Pase por secretaría”. Y si es mayor de edad y
	// accede por grado medio
	// o por prueba de acceso se le debe mostrar “Solicite código en jefatura”. En
	// el resto de los casos
	// muestre “Las clases son en la R03, gracias”.
	
	public static void main(String[] args) throws IOException {
		
		int edad;
		char mod;
		Scanner sc=new Scanner (System.in);
		
		do {
		System.out.print("Inserte la edad del alumno: ");
		edad=sc.nextInt();
		
		}while (edad<=0);
		
		do {
			System.out.print("Inserte la modalidad de acceso A acceso directo, G grado medio, P prueba de acceso: ");
			mod=(char) System.in.read();
		} while(mod!='A' && mod!='G' && mod!='P');
		
		if(edad<18 && mod=='A') {
			System.out.println("Pase por secretaria.");
		} else if(edad>=18 && mod=='G') {
			System.out.println("Solicite codigo en jefatura.");
		} else {
			System.out.println("Las clases son en la R03, gracias.");
		}
		sc.close();
	}

}
