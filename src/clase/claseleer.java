package clase;

import java.io.IOException;
import java.util.Scanner;

public class claseleer {
	/*
	 * Leer edad Leer municipio (V vecin, A arinaga, O otros) Si menor de edad ->
	 * venir al centro Si mayor de edad y (arinaga o vecindario) ir al parque Si
	 * mayor de edad y Otro municipio -> venir al centro
	 */
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int edad;
		char mun;

		do {
			System.out.print("Inserte su edad: ");
			edad = sc.nextInt();
		} while (edad <= 0);

		do {
			System.out.print("Inserte su municipio (V vecin, A arinaga, O otros): ");
			mun = (char) System.in.read();
		} while (mun != 'A' && mun != 'V' && mun != 'O' && mun != 'a' && mun != 'v' && mun != 'o');

		if (edad < 18 || mun == 'o' || mun == 'O') {
			System.out.println("Pal cole crack");
		} else {
			System.out.print("Pa casa crack");
		}

		sc.close();
	}

}
