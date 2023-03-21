public class ActividadString1 {

	public static void main(String[] args) {
		String frase1 = "  Invertir: ola k ase";
		String frase2 = "Nombre: Pepa Pig  ";
		String frase3 = "  Escribir: esta frase la tendremos que escribir en esta hoja  ";
		String comando1 = "", comando2 = "", comando3 = "", valor1 = "", valor2 = "", valor3 = "";

		System.out.println(frase1);
		System.out.println(frase2);
		System.out.println(frase3);

		System.out.println();// separador

		frase1 = frase1.trim();
		frase2 = frase2.trim();
		frase3 = frase3.trim();
		System.out.println(frase1);
		System.out.println(frase2);
		System.out.println(frase3);

		System.out.println();// separador

		if (frase1.contains(":")) {
			System.out.println("La frase 1 contiene ':'");
			comando1 = frase1.substring(0, frase1.indexOf(":"));
			valor1 = frase1.substring(frase1.indexOf(":") + 1, frase1.length());
			valor1 = valor1.trim();
		}
		if (frase2.contains(":")) {
			System.out.println("La frase 2 contiene ':'");
			comando2 = frase2.substring(0, frase2.indexOf(":"));
			valor2 = frase2.substring(frase2.indexOf(":") + 1, frase2.length());
			valor2 = valor2.trim();
		}
		if (frase3.contains(":")) {
			System.out.println("La frase 3 contiene ':'");
			comando3 = frase3.substring(0, frase3.indexOf(":"));
			valor3 = frase3.substring(frase3.indexOf(":") + 1, frase3.length());
			valor3 = valor3.trim();
		}

		System.out.println();// separador
		System.out.println("frase1 -> comando: " + comando1 + " | valor: " + valor1);
		System.out.println("frase2 -> comando: " + comando2 + " | valor: " + valor2);
		System.out.println("frase3 -> comando: " + comando3 + " | valor: " + valor3);

		System.out.println();// separador
		System.out.println("Frase1 -> " + operacion(comando1, valor1));
		System.out.println("Frase2 -> " + operacion(comando2, valor2));
		System.out.println("Frase3 -> " + operacion(comando3, valor3));

	}

	private static String operacion(String comando, String valor) {
		String end = "", saludo = "Hola ";
		final String INV = "Invertir", NOM = "Nombre", ESC = "Escribir", reemplazar = "una", reemplazado = "esta";
		
		if (comando.equals(INV)) {
			for (int i = valor.length() - 1; i >= 0; i--) {
				end = end + valor.charAt(i);
			}
			end = end.toUpperCase();
		}
		if (comando.equals(NOM)) {
			end = saludo.concat(valor);
		}
		if (comando.equals(ESC)) {
			end = valor.replace(reemplazado, reemplazar);
		}
		return end;
	}

}
