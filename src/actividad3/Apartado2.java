package actividad3;

import java.util.Scanner;

public class Apartado2 {

	public static void main(String[] args) {
		double precio, preciototal = 0;
		final int igic = 7;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el importe a cambiar: ");
		precio = sc.nextDouble();

		preciototal = precio + ((precio * igic) / 100);
		System.out.println("El importe con IGIC es de " + preciototal);
		sc.close();
	}

}
