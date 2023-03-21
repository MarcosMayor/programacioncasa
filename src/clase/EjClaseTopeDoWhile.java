package clase;

import java.util.Scanner;

public class EjClaseTopeDoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tope, num = 0;
		
		do {
		System.out.print("Inserte el numero tope: ");
		tope = sc.nextInt();
		}	while (tope < 0);
	
		do {
		
			if (num % 2 == 0) {
				System.out.println(num + " es multiplo de 2");
			}
			if (num % 5 == 0) {
				System.out.println(num + " es multiplo de 5");
			}
			num++;
		} while (num <= tope);
		
		sc.close();
	}

}

