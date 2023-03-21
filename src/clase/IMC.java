package clase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		double weight = 0, height = 0, imc;
		Scanner sc = new Scanner(System.in);
		boolean go = true;

		do {
			weight = getWeight(weight, sc, go);

			if (weight >= 0) {
				go = true;

				height = getHeight(height, sc, go);

				if (height >= 0) {

					imc = calculaIMC(weight, height);
					
					if (imc >= 0 && imc <= 18.49) {
						System.out.println(imc + " Peso Bajo");
					}
					if (imc >= 18.5 && imc <= 24.9) {
						System.out.println(imc + " Peso Normal");
					}
					if (imc >= 25 && imc <= 29.9) {
						System.out.println(imc + " Sobrepeso");
					}
					if (imc >= 30 && imc <= 34.9) {
						System.out.println(imc + " Obesidad Leve");
					}
					if (imc >= 35 && imc <= 39.9) {
						System.out.println(imc + " Obesidad Media");
					}
					if (imc >= 40) {
						System.out.println(imc + " Obesidad Morbida");
					}
				}
			}
			go = true;
			System.out.println();
		} while (weight > 0 && height > 0);

		System.out.print("Acabo");
		sc.close();

	}

	private static double getHeight(double height, Scanner sc, boolean go) {
		while (go) {
			try {
				System.out.print("Introduce altura en Metros: ");
				height = sc.nextDouble();
				go = false;
			} catch (InputMismatchException e) {
				System.err.println("Tipo de dato incorrecto");
				sc.nextLine();
			}
		}
		return height;
	}

	private static double getWeight(double weight, Scanner sc, boolean go) {
		while (go) {
			try {
				System.out.print("Introduce peso: ");
				weight = sc.nextDouble();
				go = false;
			} catch (InputMismatchException a) {
				System.err.println("Tipo de dato incorrecto");
				sc.nextLine();
			}
		}
		return weight;
	}

	private static double calculaIMC(double weight, double height) {
		return weight / (height * height);
	}

}
