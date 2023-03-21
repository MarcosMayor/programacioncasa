package trimestre2clase;

import java.util.Scanner;

public class Burbuja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] letras = { "Afecto", "Vino", "Perder", "Seco", "Enero", "Amotinarse" };
		int[] num = { 23, 6, 64, 67, 7, 27 };
		burbuja(letras);
		burbuja(num);
		showMatrix(letras);
		System.out.println();
		showMatrix(num);
	}

	public static void burbuja(int[] trabajar) {
		int aux;
		for (int i=0; i<trabajar.length-1; i++) {
			for (int j=0; j<trabajar.length-i-1; j++) {
				if (trabajar[j+1] < trabajar[j]) {
					aux = trabajar[j+1];
					trabajar[j+1]=trabajar[j];
					trabajar[j]=aux;
				}
			}
		}
	}
		public static void burbuja(String[] trabajar) {
			String aux;
			for (int i=0; i<trabajar.length-1; i++) {
				for (int j=0; j<trabajar.length-i-1; j++) {
					if (trabajar[j+1].compareToIgnoreCase(trabajar[j])<0 ) {
						aux = trabajar[j+1];
						trabajar[j+1] = trabajar[j];
						trabajar[j] = aux;
					}
				}
			}
	}
		private static void showMatrix(String[] matriz) {
			
				for (int j = 0; j < matriz.length; j++) {
					System.out.print(matriz[j] + " ");
				}
			
		}
		private static void showMatrix(int[] matriz) {
			
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[j] + " ");
			}
		
	}

}
