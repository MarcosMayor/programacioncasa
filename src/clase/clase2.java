package clase;

import java.util.Scanner;

public class clase2 {

	public static void main(String[] args) {
		int n;
		double nreal;
		
		System.out.print("Escriba un numero entero: ");
		Scanner teclado= new Scanner(System.in);
		n=teclado.nextInt();
		//nreal=double (n+0.2);  	No necesita convertir la variable
		//							Es un ensanchamiento y puede sumaro otro decimal
		nreal = n+0.2;
		System.out.print("El numero redondeado es: "+ nreal);
		teclado.close();

	}

}
