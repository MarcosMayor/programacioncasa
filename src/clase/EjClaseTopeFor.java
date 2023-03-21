package clase;

import java.util.Scanner;

public class EjClaseTopeFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tope;

		System.out.print("Inserte el numero tope: ");
		tope = sc.nextInt();

		for (int i = 0; i <= tope; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " es multiplo de 2");
			}
			if (i % 5 == 0) {
				System.out.println(i + " es multiplo de 5");
			}
		}

		sc.close();

	}

}
