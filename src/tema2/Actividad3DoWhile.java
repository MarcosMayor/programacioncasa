package tema2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad3DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int asc=0;
		boolean mal=true;
		
		while(mal==true) {
		try {
			asc = leernum(sc);
			mal =false;
		} catch (InputMismatchException e) {
			System.err.println("Inserte un valor numerico");
			sc.nextLine();
		}
		}
		do{
			System.out.println(asc + " - "+ (char)asc);
			asc-=4;
		}while(asc>0);
		
		
	}

	private static int leernum(Scanner sc) {
		int asc;
		do{
			System.out.print("Inserte el valor ASCII entre 0 y 255: ");
			asc=sc.nextInt();
		}while(asc<0 || asc>255);
		return asc;
	}
}

