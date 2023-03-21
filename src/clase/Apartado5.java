package clase;

import java.util.Scanner;

public class Apartado5 {

	public static void main(String[] args) {
		int lado1 = 0, lado2 = 0, lado3 = 0, cont = 0;
		Scanner sc = new Scanner(System.in);
		do {

			do {
				System.out.print("Inserte el primer lado del triangulo (mayor que 0):");
				lado1 = sc.nextInt();
			} while (lado1 <= 0);
			do {
				System.out.print("Inserte el segundo lado del triangulo (mayor que 0):");
				lado2 = sc.nextInt();
			} while (lado2 <= 0);
			do {
				System.out.print("Inserte el tercer lado del triangulo (mayor que 0):");
				lado3 = sc.nextInt();
			} while (lado3 <= 0);

			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Es un triangulo equilatero");
			} else if (lado2 == lado3 || lado2 == lado1 || lado1==lado3) {
				System.out.println("Es un triangulo isosceles");
			} else {
				System.out.println("Es un triangulo escaleno");
			}
			do {
				System.out.print("Quieres introducir otro triangulo? 1 para si y 0 para no: ");
				cont = sc.nextInt();
			} while (cont > 1 || cont < 0);
		} while (cont == 1);
		System.out.println("Fin");
		sc.close();
	}

}
