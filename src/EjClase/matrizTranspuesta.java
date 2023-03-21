package EjClase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class matrizTranspuesta {

	public static void main(String[] args) {
		int fila,col;
		System.out.print("Inserte el numero de filas: ");
		fila=getInt();
		System.out.print("Inserte el numero de columnas: ");
		col=getInt();
		int[][] matriz = new int[fila][col];
		int[][] traspuesta = new int[col][fila];

		matriz=getMatrix(matriz);
		traspuesta=transponer(matriz, traspuesta);
		
		System.out.println("La matriz es: ");
		showMatrix(matriz);
		System.out.println();
		System.out.println();
		System.out.println("La traspuesta es: ");
		showMatrix(traspuesta);
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

	private static int[][] transponer(int[][] matriz, int[][] traspuesta) {
		for(int i=0 ; i<matriz.length ; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				traspuesta[j][i]=matriz[i][j];
			}
		}
		return traspuesta;
	}

	private static int getInt() {
		Scanner sc=new Scanner (System.in);
		int num=0;
		boolean seguir=true;
		do {
			try {
			num=sc.nextInt();
			seguir=false;
			}catch (InputMismatchException e) {
			System.err.println("Tipo de dato incorrecto");
			sc.nextLine();
			}
		}while(seguir);
		return num;
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
