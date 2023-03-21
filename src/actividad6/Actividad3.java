package actividad6;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		int cont=5;
		double num,media=0;
		Scanner sc = new Scanner(System.in);
		
		while(cont>0) {
			System.out.print("Introduce numeros para la media: ");
			num=sc.nextInt();
			media+=num;
			cont--;
		}
		System.out.println("La media es "+ media/5);
		sc.close();
	}

}
