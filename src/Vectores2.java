import java.util.Scanner;

public class Vectores2 {

	public static void main(String[] args) {
		String palabras = "coche,cielo,esternocleidomastoideo,futbolista,trabajo,sistema,video,tutorial,videojuego,enchufe,ventilador,libreria,libro,lampara,cuadro,cargador,peluche";
		String[] diccionario = palabras.split(",");
		String adivinar;
		Scanner sc = new Scanner(System.in);
		final int MAXERR = 10;
		boolean seguir = true, ganar = true, mal = true;

		do {
			char tec;
			int error = 0;
			ganar = true;
			adivinar = diccionario[(int) (Math.random() * diccionario.length)];
			char[] usuario = new char[adivinar.length()];
			for (int i = 0; i < adivinar.length(); i++) {
				usuario[i] = '_';
			}
			System.out.println("Juego del ahorcado, intente adivinar la palabra, use solo minusculas");

			do {
				for (int i = 0; i < usuario.length; i++) {
					System.out.print(usuario[i] + " ");
				}
				tec = sc.next().charAt(0);
				if (tec >= 97 && tec <= 122) {
					if (adivinar.indexOf(tec) != -1) {
						usuario = comprobar(adivinar, tec, usuario);
					} else {
						System.err.println("Error");
						error++;
					}
					if (adivinar.equals(new String(usuario))) {
						System.out.println("Felicidades has ganado, la palabra es " + new String(usuario));
						ganar = false;
					}
					if (error == MAXERR) {
						System.out.println("Has perdido");
					}
				} else {
					System.out.println("Solo letras minusculas");
				}
			} while (error < MAXERR && ganar);

			do {
				mal = true;
				System.out.println("¿Quieres seguir jugando? Si/No");
				if (sc.nextLine().equals("No")) {
					seguir = false;
					mal = false;
				} else if (sc.nextLine().equals("Si")) {
					mal = false;
				}
			} while (mal);

		} while (seguir);

		sc.close();
	}

	private static char[] comprobar(String adivinar, char tec, char[] usuario) {
		char[] nuevausuario = new char[adivinar.length()];
		for (int i = 0; i < adivinar.length(); i++) {

			if (adivinar.charAt(i) == tec) {
				nuevausuario[i] = tec;
			} else if (usuario[i] != '_') {
				nuevausuario[i] = adivinar.charAt(i);
			} else {
				nuevausuario[i] = '_';
			}

		}
		System.out.println();
		return nuevausuario;
	}

}
