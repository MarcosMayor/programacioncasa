package actividad3;

import java.util.Scanner;

public class Apartado1 {

	public static void main(String[] args) {
		double num1, num2, res = 0;
		int op;
		Scanner sc = new Scanner(System.in);

		System.out.print("Inserte la operacion a realizar (suma-1, resta-2, multiplicacion-3 o division-4): ");
		op = sc.nextInt();

		while (op > 4 || op < 1) {
			System.out.println("El numero de la operacion no es valido, inserte un numero entre 1 y 4");
			op = sc.nextInt();
		}

		System.out.print("Inserte el primer operando: ");
		num1 = sc.nextDouble();

		System.out.print("Inserte el segundo operando: ");
		num2 = sc.nextDouble();

		switch (op) {
		case 1:
			res = num1 + num2;
			break;
		case 2:
			res = num1 - num2;
			break;
		case 3:
			res = num1 * num2;
			break;
		case 4:
			res = num1 / num2;
			break;
		}
		System.out.println("El resultado de la operacion es: " + res);
		sc.close();
	}

}
