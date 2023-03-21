package clase;

import java.util.Random;
import java.util.Scanner;

public class EjClaseConTiempo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int num,al=0,imp=0;
		
		do {
			System.err.print("Inserte un número positivo: ");
			num = sc.nextInt();
		}while (num<=0);
		
		System.out.println();
		while(num>0) {
			al=rd.nextInt(20)+1;
			System.out.println("Salio el "+al);
			if(al%2!=0) {
				imp++;
			}
			num--;
		}
		
		System.out.println();
		System.out.println("Los impares son "+imp);
		
		System.out.println();
		
		System.out.println("Tabla de multiplicar");
		for(int i=0 ; i<=10; i++) {
			System.out.println(imp + " x " + i + " = " + imp*i );
		}
		sc.close();
	}

}
