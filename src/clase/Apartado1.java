package clase;

import java.util.Scanner;

public class Apartado1 {

	public static void main(String[] args) {
		int sec = 0, hora = 0, min = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Inserte el numero de segundos mayor que 0: ");
			sec = sc.nextInt();
		} while (sec <= 0);

		System.out.print(sec + " segundos son:");
		while (sec >= 3600) {
			hora++;
			sec -= 3600;
		}
		while (sec >= 60) {
			min++;
			sec -= 60;
		}
		System.out.println(hora + " horas, " + min + " minutos y " + sec + " segundos.");
		sc.close();
	}

}
