package EjClase;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

/*Actividad 3. Matrices.
Desarrolla en java el código para los siguientes requerimientos:
Se van a almacenar en una matriz las calificaciones de los alumnos. La primera fila (0), será la que
contiene las cabeceras o etiquetas (Nombre del alumn@ y módulos):
Nombre , PRO, BAE, SSF, LND
Las filas corresponderán a un registro por cada alumn@, es decir, su nombre y las calificaciones en
cada módulo (deberán almacenarse como String en este caso, las notas que al ser Double
necesitarán luego ser parseadas => Double.parseDouble(string) para hacer cálculos con ellas.
Luisa, 5.5, 4.0, 7.8, 8.0
Pedro, 9.0, 8.0, 9.5, 9.0
Se debe:
(a) Solicitar cuántos módulos se van a grabar y cuántos alumnos para dar la dimensión
inicial a la matriz.
(b) Leer todos los datos y mostrarlos al final de la introducción.
(c) Solicitar al usuario de qué módulo quiere conocer la media y mostrarla (tantas veces
como se solicite).*/
public class Ej3Matrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos modulos van a ser?");
		int modul = sc.nextInt();
		System.out.println("¿Cuantos alumnos van a ser?");
		int alu = sc.nextInt();
		String[][] matriz = new String[alu + 1][modul + 1];
		boolean bucle = true;

		sc.nextLine();
		String nombre = "Nombre";
		for (int i = 0; i < modul; i++) {
			System.out.println("Inserte nombre de la asignatura " + (i + 1));
			nombre += " " + sc.nextLine();
		}
		builder(matriz, nombre, 0);

		for (int i = 0; i < alu; i++) {
			System.out.println("Inserte el nombre del alumno " + (i + 1));
			String alum = sc.nextLine();
			int j = 0;
			while (j < modul) {
				System.out.println("Inserte la nota de " + matriz[0][j+1] + " del alumno");
				alum += " " + sc.nextLine();
				j++;
			}
			builder(matriz, alum, i + 1);
		}
		showMatrix(matriz);

		do {
			System.out.println("De que modulo quiere saber la media? -1 para salir: ");
			for (int j = 1; j < matriz[0].length; j++) {
				System.out.println("[" + j + "]" + " " + matriz[0][j]);
			}

			boolean seguir = true;
			int op = 0;
			do {
				try {
					do {
						op = sc.nextInt();
						if (op==-1) {
							System.err.println("No hay esa cantidad de modulos");
						} else if (op > modul || op < 0) {
							bucle = false;
						} else {
							seguir = false;
						}
					} while (seguir);
				} catch (InputMismatchException e) {
					System.err.println("Tipo de dato incorrecto");
					sc.nextLine();
				}

			} while (seguir);
			System.out.println("La media de "+matriz[0][op]+" es "+media(matriz, op, alu));
		} while (bucle);
		sc.close();
	}

	private static String[][] builder(String[][] matriz, String ladrillo, int j) {
		StringTokenizer aux = new StringTokenizer(ladrillo);
		for (int i = 0; i < matriz[0].length; i++) {
			if (aux.hasMoreTokens()) {
				matriz[j][i] = aux.nextToken();
			}
		}
		return matriz;
	}

	private static void showMatrix(String[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			if (i != 0) {
				System.out.println();
			}
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
	}

	private static double media(String[][] matriz, int op, int alu) {
		double aux = 0;
		for (int i = 1; i < matriz.length; i++) {
			aux += Double.parseDouble(matriz[i][op]);
		}
		return aux / alu;
	}

}
