package trimestre2clase;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListVectores {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Pos 0 nombre, pos1 altura
		ArrayList<String[]> milist=new ArrayList<>();
		boolean seguir=true;
		
		while(seguir) {
			System.out.println("Dime el nombre ");
			String name=sc.nextLine();
			System.out.println("Dime la altura ");
			String heigth=sc.nextLine();
			String[]vect=builder(name, heigth);
			milist.add(vect);
			System.out.print("Acaba? (0 si,1 no): ");
			int op=sc.nextInt();
			if(op==0) {
				seguir=false;
				
			}
			sc.nextLine();
		}
		for (String[] alu:milist) {
			for (int i=0;(i+1)<alu.length;i++) {
				System.out.println("La altura de "+alu[i]+" es de "+alu[i+1]);
			}
		}
		
	}
	private static String[] builder(String nom, String alt) {
		String[] vect= new String[2]; 
		for (int i = 0; (i+1)<vect.length; i++) {
				vect[i] = nom;
				vect[i+1]=alt;
		}
		return vect;
	}

}
