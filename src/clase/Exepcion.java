package clase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exepcion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int lado;
		int peri,area;
		
		boolean seguir=true;
		
		while(seguir) {
			try {
				System.out.print("Introduzca el lado: ");
				lado = sc.nextInt();
				
				seguir=false;
				
				double lado2=0;
				double peri2=perimetro();
				
				peri = perimetro(lado);
				area = area(lado);
				lado2=peri2+lado2;
				System.out.println("El perimetro del cuadrado es " + peri);
				System.out.println("Y el area es " + area);
			} catch (InputMismatchException e) {
				System.err.println("Cuidado tipo de dato incorrecto");
				sc.nextLine();
			}
		}
		sc.close();
	}

	private static double perimetro() {
		return 0;
	}

	private static int area(int lado) {
		int area;
		area=lado*lado;
		return area;
	}

	private static int perimetro(int lado) {
		int peri;
		peri=lado*4;
		return peri;
	}

}
