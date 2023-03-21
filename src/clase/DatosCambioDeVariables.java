package clase;

import java.util.Scanner;

public class DatosCambioDeVariables {

	public static void main(String[] args) {
		double n;
		int nredondeado;
		
		System.out.print("Escriba un numero decimal: ");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextDouble();
		nredondeado = (int)(n + 0.5);
		System.out.println("El numero redondeado es: " +nredondeado);
		teclado.close();
		
	}

}
