package clase;

import java.util.Scanner;

public class CalculadoraExepcion {

	public static void main(String[] args) {
		int num1, num2, res = 0;
		int op;
		Scanner sc = new Scanner(System.in);

		System.out.print("Inserte la operacion a realizar (suma-1, resta-2, multiplicacion-3 o division-4): ");
		op = sc.nextInt();

		while (op > 4 || op < 1) {
			System.out.println("El numero de la operacion no es valido, inserte un numero entre 1 y 4");
			op = sc.nextInt();
		}

		boolean mal = true;

		while (mal == true) {
			System.out.print("Inserte el primer operando: ");
			num1 = sc.nextInt();

			System.out.print("Inserte el segundo operando: ");
			num2 = sc.nextInt();

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
				try {
					res = num1 / num2;
					mal = false;
					break;
				} catch (ArithmeticException e) {
					System.err.println("No se puede dividir entre 0.");
					sc.nextLine();
				}
			}
		}
		System.out.println("El resultado de la operacion es: " + res);
		sc.close();
	}

}
