package trimestre2clase;

import java.util.Scanner;

public class factrecur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print("Introduce el numero: ");
			num = sc.nextInt();
			if(num>0) {
				System.out.println("El factorial de "+num+" es "+factorial(num));
			}
		} while (true);
	}
	
	private static int factorial(int num) {
		System.out.println("Voy por "+num);
		if(num==0) {
			return 1;
		} else {
			return num*factorial(num-1);
		}
	}

}
