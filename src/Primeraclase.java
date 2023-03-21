import java.util.Scanner;

public class Primeraclase {

	public static void main(String[] args) {

		/*
		 * System.out.print("Escribe algo:"); Scanner teclado=new Scanner(System.in);
		 * String cadena = teclado.nextLine(); System.out.println(cadena);
		 * teclado.close();
		 */
/**/
		Scanner teclado = new Scanner(System.in);
		int base, altura;
		Double area;
		final int DIVISOR = 2;

		System.out.print("Introduce el valor de la base: ");
		base = teclado.nextInt();
		
		base=base+1; 
		System.out.println("Incremento de base "+base);
		base++;
		System.out.println("Incremento de base "+base);
		base+=1;
		System.out.println("Incremento de base "+base);
		
		System.out.print("Introduce el valor de la altura: ");
		altura = teclado.nextInt();

		area = (double) base *  altura / DIVISOR;
		System.out.println("EL area del triangulo es " + area);
		teclado.close();
	}

}
