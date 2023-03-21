package trimestre2clase;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;//Ordena

public class Lista3Set {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<String> lista = new TreeSet<String>();

		String dato = "";
		while (!dato.equalsIgnoreCase("quit")) {
			System.out.print("Nombre alumno (quit sales): ");
			dato = sc.nextLine();
			if (!dato.equalsIgnoreCase("quit")) {
				lista.add(dato);
			}
		}

		System.out.println("Tiene " + lista.size() + " alumnos en lista");

		ShowList(lista);
		System.out.println();
	}

	private static void ShowList(Set<String> lista) {
		for (String item : lista) {
			System.out.print(item + "  ");
		}
	}

}
