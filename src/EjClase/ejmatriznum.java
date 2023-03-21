package EjClase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejmatriznum {

	public static void main(String[] args) {
		int[][] numero= new int[8][3];
		int[][] cuadrado = new int[numero.length][numero[0].length];
		
		numero=getMatrix();
		
		for(int i=0 ; i<numero.length ; i++) {
			for(int j=0 ; j<numero[0].length ; j++) {
				cuadrado[i][j]=(int) Math.pow(numero[i][j], 2);
			}	
		}
		
		System.out.println();
		System.out.println("La matriz de numeros es ");
		showMatrix(numero);
		System.out.println();
		System.out.println();
		System.out.println("La matriz de cuadrados es ");
		showMatrix(cuadrado);
	}

	private static void showMatrix(int[][] numero) {
		for(int i=0 ; i<numero.length ; i++) {
			System.out.println();
			for(int j=0 ; j<numero[0].length ; j++) {
				System.out.print(numero[i][j]+" ");
			}
		}
	}

	private static int[][] getMatrix() {
		int[][] numero= new int[8][3];
		Scanner sc= new Scanner(System.in);
		for(int i=0 ; i<numero.length ; i++) {
			for(int j=0; j<numero[0].length; j++) {
				try {
					System.out.print("Inserte el numero en pos["+i+"]"+"["+j+"]: ");
					numero[i][j]=sc.nextInt();
				}catch (InputMismatchException e) {
					System.err.println("Tipo de dato incorrecto");
					sc.nextLine();
					j--;
				}
			}
		}
		sc.close();
		return numero;
	}

}
