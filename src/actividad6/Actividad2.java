package actividad6;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		int suma = 0, num;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Inserte un numero ");
			num = sc.nextInt();
			suma += num;
		} while (num != 0);
		System.out.println("La suma de los numeros introducidos es " + suma);
		sc.close();
	}

}
