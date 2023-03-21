package Actividad5;

import java.util.Scanner;

public class Apartado2 {

	// Se introduce un número entero y se devuelve
	// el carácter que representa en el código ASCII.

	public static void main(String[] args) {

		int asc;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Inserte el codigo ASCII valido a mostrar: ");
			asc = sc.nextInt();
		} while (asc > 255 || asc < 0);

		char ascii = (char) asc;

		System.out.print("El valor de ascii  es: " + ascii);
		sc.close();

	}

}
