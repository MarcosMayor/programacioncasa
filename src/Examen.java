import java.util.InputMismatchException;
import java.util.Scanner;

//Opcion A
public class Examen {

	public static void main(String[] args) {
		double L = 0, M = 0, X = 0, J = 0, V = 0, S = 0, D = 0;
		final int DIAS = 7;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < DIAS; i++) { // Controlo la exepcion de tipo InputMismatch y que el usuario no introduzca
											// numeros negativos
			try {
				switch (i) {
				case 0:
					do {
						System.out.print("Inserte la cantidad de agua del Lunes (no puede ser negativo): ");
						L = sc.nextDouble();
					} while (L < 0);
					break;
				case 1:
					do {
						System.out.print("Inserte la cantidad de agua del Martes (no puede ser negativo): ");
						M = sc.nextDouble();
					} while (M < 0);
					break;
				case 2:
					do {
						System.out.print("Inserte la cantidad de agua del Miercoles (no puede ser negativo): ");
						X = sc.nextDouble();
					} while (X < 0);
					break;
				case 3:
					do {
						System.out.print("Inserte la cantidad de agua del Jueves (no puede ser negativo): ");
						J = sc.nextDouble();
					} while (J < 0);
					break;
				case 4:
					do {
						System.out.print("Inserte la cantidad de agua del Viernes (no puede ser negativo): ");
						V = sc.nextDouble();
					} while (V < 0);
					break;
				case 5:
					do {
						System.out.print("Inserte la cantidad de agua del Sabado (no puede ser negativo): ");
						S = sc.nextDouble();
					} while (S < 0);
					break;
				case 6:
					do {
						System.out.print("Inserte la cantidad de agua del Domingo (no puede ser negativo): ");
						D = sc.nextDouble();
					} while (D < 0);
					break;
				}
			} catch (InputMismatchException e) {
				System.err.println("Tipo de dato incorrecto.");
				i--;
				sc.nextLine();
			}
		}
		System.out.println(); // Separador

		switch (getMayor(L, M, X, J, V, S, D, DIAS)) {// Si son iguales solo muestra el primero
		case 0:
			System.out.println("El lunes es el dia que mas llovio.");
			break;
		case 1:
			System.out.println("El martes es el dia que mas llovio.");
			break;
		case 2:
			System.out.println("El miercoles es el dia que mas llovio.");
			break;
		case 3:
			System.out.println("El jueves es el dia que mas llovio.");
			break;
		case 4:
			System.out.println("El viernes es el dia que mas llovio.");
			break;
		case 5:
			System.out.println("El sabado es el dia que mas llovio.");
			break;
		case 6:
			System.out.println("El domingo es el dia que mas llovio.");
			break;
		}

		switch (getMenor(L, M, X, J, V, S, D, DIAS)) {// Si son iguales solo muestra el primero
		case 0:
			System.out.println("El lunes es el dia que menos llovio.");
			break;
		case 1:
			System.out.println("El martes es el dia que menos llovio.");
			break;
		case 2:
			System.out.println("El miercoles es el dia que menos llovio.");
			break;
		case 3:
			System.out.println("El jueves es el dia que menos llovio.");
			break;
		case 4:
			System.out.println("El viernes es el dia que menos llovio.");
			break;
		case 5:
			System.out.println("El sabado es el dia que menos llovio.");
			break;
		case 6:
			System.out.println("El domingo es el dia que menos llovio.");
			break;

		}
		double total = L + M + X + J + V + S + D;
		System.out.println("El total de litros recogidos en la semana es de " + total);

		System.out.println(); // Separador

		for (int i = 0; i < DIAS; i++) {
			if (i == 0) {
				System.out.println("El porcentaje del lunes es de " + (L * 100 / total));
			}
			if (i == 1) {
				System.out.println("El porcentaje del martes es de " + (M * 100 / total));
			}
			if (i == 2) {
				System.out.println("El porcentaje del miercoles es de " + (X * 100 / total));
			}
			if (i == 3) {
				System.out.println("El porcentaje del jueves es de " + (J * 100 / total));
			}
			if (i == 4) {
				System.out.println("El porcentaje del viernes es de " + (V * 100 / total));
			}
			if (i == 5) {
				System.out.println("El porcentaje del sabado es de " + (S * 100 / total));
			}
			if (i == 6) {
				System.out.println("El porcentaje del domingo es de " + (D * 100 / total));
			}
		}

		System.out.println(); // Separador
		final int LITROS = 30;
		for (int i = 0; i < DIAS - 2; i++) { // Solo aparece si es mayor a 30, no igual
			if (i == 0) {
				if (L > LITROS) {
					System.out.println("El lunes supero los 30L");
				}
			}
			if (i == 1) {
				if (M > LITROS) {
					System.out.println("El martes supero los 30L");
				}
			}
			if (i == 2) {
				if (X > LITROS) {
					System.out.println("El miercoles supero los 30L");
				}
			}
			if (i == 3) {
				if (J > LITROS) {
					System.out.println("El jueves supero los 30L");
				}
			}
			if (i == 4) {
				if (V > LITROS) {
					System.out.println("El viernes supero los 30L");
				}
			}
		}
		sc.close();
	}

	private static int getMayor(double L, double M, double X, double J, double V, double S, double D, final int DIAS) {
		double comprobar = 0;
		int mayor = 0;
		comprobar = L;
		for (int i = 1; i < DIAS; i++) {
			switch (i) {
			case 1:
				if (comprobar < M) {
					comprobar = M;
					mayor = i;
				}
				break;
			case 2:
				if (comprobar < X) {
					comprobar = X;
					mayor = i;
				}
				break;
			case 3:
				if (comprobar < J) {
					comprobar = J;
					mayor = i;
				}
				break;
			case 4:
				if (comprobar < V) {
					comprobar = V;
					mayor = i;
				}
				break;
			case 5:
				if (comprobar < S) {
					comprobar = S;
					mayor = i;
				}
				break;
			case 6:
				if (comprobar < D) {
					comprobar = D;
					mayor = i;
				}
				break;
			}
		}
		return mayor;
	}

	private static int getMenor(double L, double M, double X, double J, double V, double S, double D, final int DIAS) {
		double comprobar = 0;
		int menor = 0;
		comprobar = L;
		for (int i = 1; i < DIAS; i++) {
			switch (i) {
			case 1:
				if (comprobar > M) {
					comprobar = M;
					menor = i;
				}
				break;
			case 2:
				if (comprobar > X) {
					comprobar = X;
					menor = i;
				}
				break;
			case 3:
				if (comprobar > J) {
					comprobar = J;
					menor = i;
				}
				break;
			case 4:
				if (comprobar > V) {
					comprobar = V;
					menor = i;
				}
				break;
			case 5:
				if (comprobar > S) {
					comprobar = S;
					menor = i;
				}
				break;
			case 6:
				if (comprobar > D) {
					comprobar = D;
					menor = i;
				}
				break;
			}
		}
		return menor;
	}

}
