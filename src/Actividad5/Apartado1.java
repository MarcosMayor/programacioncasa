package Actividad5;

import java.util.Scanner;

public class Apartado1 {
	
	// Dadas dos variables a y b de tipo entero, debes intercambiar los datos 
	//(en variables) y mostrar.
	
	public static void main(String[] args) {

		int a, b, aux = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Inserte el valor de a: ");
		a = sc.nextInt();

		System.out.print("Insert el valor de b: ");
		b = sc.nextInt();

		aux = a;
		a = b;
		b = aux;

		System.out.println("Ahora el valor de a es " + a + " y el de b es " + b);
		sc.close();
	}

}
