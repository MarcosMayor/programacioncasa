package clase;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Random rd = new Random();
		int usu=0, cpu=0;
		boolean mal = true;
		
		while(mal) {
			try {
				do{
					System.out.println("Para jugar inserte el numero de: (1) piedra, (2) papel y (3) tijera");
					usu=sc.nextInt();
					mal=false;
				}while(usu<=0 || usu>3);
			} catch (InputMismatchException e) {
				System.err.print("No ha introducido un numero");
				sc.nextLine();
			}
		}
		
		cpu = rd.nextInt(3)+1;
		
		switch(usu){
		case 1:
			switch(cpu) {
			case 1:
				System.out.println("Piedra vs Piedra: empate");
				break;
			case 2:
				System.out.println("Piedra vs Papel: pierdes");
				break;
			case 3:
				System.out.println("Piedra vs Tijera: ganas");
				break;
		}
		break;
		
		case 2:
			switch(cpu) {
			case 1:
				System.out.println("Papel vs Piedra: ganas");
				break;
			case 2:
				System.out.println("Papel vs Papel: empate");
				break;
			case 3:
				System.out.println("Papel vs Tijera: pierdes");
				break;
		}
			break;
		
		case 3:
			switch(cpu) {
			case 1:
				System.out.println("Tijera vs Piedra: pierdes");
				break;
			case 2:
				System.out.println("Tijera vs Papel: ganas");
				break;
			case 3:
				System.out.println("Tijera vs Tijera: empate");
				break;
			}
			break;
		}
		sc.close();
	}
}
