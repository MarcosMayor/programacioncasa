package clase;

import java.util.Scanner;

public class MatrizCategoria {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean seguir=true;
		//String[][] matriz= new String[2][6]; o
		String[][] matriz= {{"A","B","C","D","E","N"},
							{"0","0","0","0","0","0"}};
		
		showMatrix(matriz);
		
		do {
			System.out.print("Introduzca la categoria: ");
			Character caracter=sc.nextLine().charAt(0);
			//Control errores
			
			int c=0;
			while(!matriz[0][c].equalsIgnoreCase(caracter.toString())) {
				c++;
			}
			int valor=Integer.parseInt(matriz[1][c]);
			valor++;
			
			matriz[1][c]=matriz[1][c].valueOf(valor);
			System.out.print("¿Mas datos? (0 salir): ");
			int salida=sc.nextInt();
			sc.nextLine();
			if(salida==0) {
				seguir=false;
			}
		}while(seguir);
		
		showMatrix(matriz);
		sc.close();
	}

	private static void showMatrix(String[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
