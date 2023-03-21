package trimestre2clase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class cesar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String cod,end="";
		int semilla=-1,cambio,resto;
		
		System.out.print("Inserte la palabra a codificar: ");
		cod=sc.nextLine();
		do {
			try {
				System.out.print("Inserte la semilla para la codificación: ");
				semilla=sc.nextInt();
			}catch(InputMismatchException e) {
				System.err.println("Tipo de dato incorrecto");
				sc.nextLine();
			}
		}while(semilla<=0);
		
		for(int i=0;i<cod.length();i++) {
			cambio=cod.charAt(i);
			if(cambio==32) {
				end+=" ";
				continue;
			}
			cambio+=semilla;
			if(cambio>90&&cambio<97){
				resto=cambio-90;
				cambio=65+resto;
			} else if(cambio>122) {
				resto=cambio-122;
				cambio=97+resto;
			}
			end+=(char)cambio;
		}
		System.out.println(end);
		sc.close();
	}

}
