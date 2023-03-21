package trimestre2clase;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<>();

		String dato = "";
		while (!dato.equalsIgnoreCase("quit")) {
			System.out.print("Nombre alumno (quit sales): ");
			dato = sc.nextLine();
			if (!dato.equalsIgnoreCase("quit")) {
				lista.add(dato);
			}
		}

		System.out.println("Tiene " + lista.size() + " alumnos en lista");

		for (String item : lista) {
			System.out.print(item + "  ");
		}
	}

}
