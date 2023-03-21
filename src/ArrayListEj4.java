import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayListEj4 {

	public static void main(String[] args) {
		String choco = "Mars-1,05#Twix-0,99#Bounty-1,20#Lion-1,25";
		ArrayList<String[]> chocolatinas = new ArrayList<>();
		StringTokenizer frase = new StringTokenizer(choco, "#");
		Scanner sc = new Scanner(System.in);

		while (frase.hasMoreTokens()) {
			String[] aux = new String[2];
			StringTokenizer token = new StringTokenizer(frase.nextToken(), "-");
			int pos = 0;
			while (token.hasMoreTokens()) {
				aux[pos] = token.nextToken();
				pos++;
			}
			chocolatinas.add(aux);
		}

		for (String[] imprim : chocolatinas) {
			System.out.println("La chocolatina " + imprim[0] + " cuesta " + imprim[1]);
		}
		System.out.println();
		boolean seguir = true;
		do {
			System.out.print("Que chocolatina desea buscar?(# para salir): ");
			String usuario = sc.next();
			if (!usuario.equals("#")) {
				if (check(chocolatinas, usuario).equalsIgnoreCase("-1")) {
					System.out.println("No existe");
				} else {
					System.out.println("El precio es " + check(chocolatinas, usuario));
				}
			} else {
				seguir = false;
			}
		} while (seguir);
		sc.close();
	}

	private static String check(ArrayList<String[]> chocolatinas, String usuario) {
		for (String[] imprim : chocolatinas) {
			if (usuario.equalsIgnoreCase(imprim[0])) {
				return imprim[1];
			}
		}
		return "-1";
	}

}
