package trimestre2clase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lista2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> lista = new ArrayList<String>();
		ArrayList<String> lista2 = new ArrayList<>();

		String dato = "";
		while (!dato.equalsIgnoreCase("quit")) {
			System.out.print("Nombre alumno (quit sales): ");
			dato = sc.nextLine();
			if (!dato.equalsIgnoreCase("quit")) {
				lista.add(dato);
				lista2.add(dato);
			}
		}

		System.out.println("Tiene " + lista.size() + " alumnos en lista");

		ShowList(lista);
		System.out.println();
		ShowList(lista2);
		
		System.out.println("Victor está en la posicion "+lista.indexOf("a"));
		
		//Collection frequency cae 
		Collections.sort(lista);
		ShowList(lista);
		
		System.out.println("Tienes "+Collections.frequency(lista, "aa")+" Ana");
	}

	private static void ShowList(List<String> lista) {
		for (String item : lista) {
			System.out.print(item + "  ");
		}
	}

}
