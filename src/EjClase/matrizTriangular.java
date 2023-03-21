package EjClase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class matrizTriangular {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		int[][] triangsup = new int[matriz.length][matriz[0].length];
		int[][] trianginf = new int[matriz.length][matriz[0].length];
		
		matriz=getMatrix(matriz);
		trianginf=getInf(matriz, trianginf);
		triangsup=getSup(matriz, triangsup);
		
		System.out.println("La matriz es: ");
		showMatrix(matriz);
		System.out.println();
		System.out.println();
		System.out.println("La triangular inferior es: ");
		showMatrix(triangsup);
		System.out.println();
		System.out.println();
		System.out.println("La triangular superior es: ");
		showMatrix(trianginf);
		
	}
	private static void showMatrix(int[][] matriz) {
		for(int i=0 ; i<matriz.length ; i++) {
			if(i!=0) {
				System.out.println();
			}
			for(int j=0 ; j<matriz[0].length ; j++) {
				System.out.print(matriz[i][j]+" ");
			}
		}
	}
	private static int[][] getInf(int[][] matriz, int[][] trianginf) {
		for(int j=0 ; j<matriz.length ;j++) {
			for(int i=0; i<matriz[0].length; i++) {
				if(i<=j) {
					trianginf[i][j]=matriz[i][j];
				}
			}
		}
		return trianginf;
	}
		private static int[][] getSup(int[][] matriz, int[][] triangsup) {
			for(int i=0 ; i<matriz.length ; i++) {
				for(int j=0; j<matriz[0].length; j++) {
					if(j<=i) {
						triangsup[i][j]=matriz[i][j];
					}
				}
			}
			return triangsup;
	}
	private static int[][] getMatrix(int[][] matriz) {
		Scanner sc= new Scanner(System.in);
		for(int i=0 ; i<matriz.length ; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				try {
					System.out.print("Inserte el numero en pos["+i+"]"+"["+j+"]: ");
					matriz[i][j]=sc.nextInt();
				}catch (InputMismatchException e) {
					System.err.println("Tipo de dato incorrecto");
					sc.nextLine();
					j--;
				}
			}
		}
		sc.close();
		return matriz;
		}

}

