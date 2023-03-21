package actividad6;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int posit = 0, num = 0;

		for (int i = 0; num >= 0; i++) {
			System.out.print("Inserte un numero :");
			num = sc.nextInt();
			posit = i;
		}
		System.out.println("El total de numeros intoducidos es " + posit);
		sc.close();
	}

}
