
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej3Matrices {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int modul=0, alu=0; 
		boolean seguir=true;
		String op="";
		final String SAL="#";
		do {
			try {
				System.out.println("Cuantos modulos van a ser?");
				modul=sc.nextInt();
				if(modul>0) {
					seguir=false;
				} else {
					System.err.print("Modulos insuficientes");
				}
			}catch (InputMismatchException e){
				System.err.println("Tipo de dato incorrecto");
				sc.nextLine();
			}
		}while(seguir);	
		seguir=true;
		do {
			try {
				System.out.println("Cuantos alumnos van a ser?");
				alu=sc.nextInt();
				if(alu>0) {
					seguir=false;
				} else {
					System.err.print("Alumnos insuficientes");
				}
			}catch (InputMismatchException e){
				System.err.println("Tipo de dato incorrecto");
				sc.nextLine();
			}
		}while(seguir);	
			
		
		String[][] matriz= new String[alu+1][modul+1]; //+1 ya que esta la casilla "Nombre"
		
		sc.nextLine();
		String nombre="Nombre";
		for(int i=0; i<modul;i++) {
			System.out.println("Inserte nombre de la asignatura "+(i+1));
			nombre+=" "+sc.nextLine().toUpperCase();
		}
		builder(matriz,nombre,0);
		
		for(int i=0; i<alu;i++) {
			System.out.println("Inserte el nombre del alumno "+(i+1));
			String alum=sc.nextLine().toUpperCase();
			int j=0;
			System.out.println("Inserte la nota de "+alum+" en ");
			while(j<modul) {
				System.out.print(matriz[0][j+1]+": ");
				alum+=" "+sc.nextLine();
				j++;
			}
			builder(matriz,alum,i+1);
		}
		showMatrix(matriz);
		
		System.out.println();
		seguir=true;
		do {
			System.out.print("De que modulo quiere saber la media?(# para salir): ");
			op=sc.nextLine();
			double media=0;
			if(!op.equals(SAL)) {
				for(int i=0;i<matriz[0].length;i++) {
					if(matriz[0][i].equalsIgnoreCase(op)) {
						media=media(matriz,i);
						System.out.println("La media de "+matriz[0][i]+" es "+media);
					}
				}
				if(media==0) {
					System.err.println("No se ha encontrado ese modulo");
				}
			}
		}while(!op.equals(SAL));
		
		sc.close();
	}
	private static String[][] builder(String[][] matriz, String ladrillo, int j) { //Metodo constructor
		StringTokenizer aux= new StringTokenizer(ladrillo);
		for(int i=0;i<matriz[0].length;i++) {
			if(aux.hasMoreTokens()) {
				matriz[j][i]=aux.nextToken();
			}
		}
		return matriz;
	}
	private static void showMatrix(String[][] matriz) {
		for(int i=0 ; i<matriz.length ; i++) {
			if(i!=0) {
				System.out.println();
			}
			for(int j=0 ; j<matriz[0].length ; j++) {
				System.out.print(matriz[i][j]+" ");
			}
		}
	}
	private static double media(String[][] matriz, int op) {
		double suma=0;
			for(int j=1 ; j<matriz.length ; j++) {
				suma+=Double.parseDouble(matriz[j][op]);
			}
			return (suma/(matriz.length-1));
		}
		
}

