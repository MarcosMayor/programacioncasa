package actividad3;

import java.util.Scanner;

public class Apartado3 {

	public static void main(String[] args) {
		double dinero, total;
		int op;
		final double cons=166.386;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la operacion a realizar (1-Pasar de Euros a Pesetas, 2-Pasar de Pesetas a Euros): " );
		op=sc.nextInt();
		while(op<1|| op>2) {
			System.out.println("Introduce un numero valido (1o2)");
			op=sc.nextInt();
		}
		System.out.print("Introduce el importe a cambiar: ");
		dinero=sc.nextDouble();
		
		if(op==1) {
			total=dinero*cons;
			System.out.println("Tiene " + total + "Pesetas" );
		} else {
			total=dinero/cons;
			System.out.println("Tiene " + total + "Euros" );
		}
		sc.close();
	}

}
