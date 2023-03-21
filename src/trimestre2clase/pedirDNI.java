package trimestre2clase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pedirDNI {

	public static void main(String[] args) {
		String DNI,op="0";
		Scanner sc=new Scanner(System.in);
		int NIF=0;
		boolean seguir=true;
		do {
				System.out.print("Que vas a introducir DNI o NIF: ");
				op = sc.next();
				sc.nextLine();
		}while(!op.equals("DNI") && !op.equals("NIF"));
		
		if(op.equals("DNI")) {
			System.out.print("Inserte DNI: ");
			DNI = sc.nextLine();
			char c = DNI.charAt(DNI.length()-1);
			System.out.println("La letra es "+c);
		}else if (op.equals("NIF")){
			do {
				try {
					System.out.print("Inserte NIF: ");
					NIF = sc.nextInt();
					seguir=false;
				}catch(InputMismatchException h) {
					System.err.println("Tipo de dato incorrecto para NIF");
				}
			}while(seguir);
			int letra = NIF%23;
			switch(letra) {
			case 0:
				System.out.println("La letra es T");
				break;
			case 1:
				System.out.println("La letra es R");
				break;
			case 2:
				System.out.println("La letra es W");
				break;
			case 3:
				System.out.println("La letra es A");
				break;
			case 4:
				System.out.println("La letra es G");
				break;
			case 5:
				System.out.println("La letra es M");
				break;
			case 6:
				System.out.println("La letra es Y");
				break;
			case 7:
				System.out.println("La letra es F");
				break;
			case 8:
				System.out.println("La letra es P");
				break;
			case 9:
				System.out.println("La letra es D");
				break;
			case 10:
				System.out.println("La letra es X");
				break;
			case 11:
				System.out.println("La letra es B");
				break;
			case 12:
				System.out.println("La letra es N");
				break;
			case 13:
				System.out.println("La letra es J");
				break;
			case 14:
				System.out.println("La letra es Z");
				break;
			case 15:
				System.out.println("La letra es S");
				break;
			case 16:
				System.out.println("La letra es Q");
				break;
			case 17:
				System.out.println("La letra es V");
				break;
			case 18:
				System.out.println("La letra es H");
				break;
			case 19:
				System.out.println("La letra es L");
				break;
			case 20:
				System.out.println("La letra es C");
				break;
			case 21:
				System.out.println("La letra es K");
				break;
			case 22:
				System.out.println("La letra es E");
				break;
				
				
			}
			sc.close();
		}
		
	}

}
