package actividad6;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		int num,mayor=0,cont=7;
		Scanner sc= new Scanner(System.in);
		
		do {
			System.out.print("Inserte numero: ");
			num=sc.nextInt();
			if(num>mayor) {
				mayor=num;
			}
			cont--;
		}while(cont>0);
		System.out.println("El mayor es "+mayor);
		sc.close();
	}

}
