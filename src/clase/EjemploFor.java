package clase;

import java.util.Scanner;

public class EjemploFor {

	public static void main(String[] args) {

		final int NUM_ALU = 5;

		Scanner sc = new Scanner(System.in);
		double suma = 0;

		for (int i = 0; i < NUM_ALU; i++) {
			System.out.print("Escribe tu nota de PRO: ");
			double nota = sc.nextDouble();
			System.out.println("Tu nota es " + nota);
			suma += nota;
		}
		System.out.println("La media en PRO es " + (suma / NUM_ALU));
		sc.close();
	}

}
