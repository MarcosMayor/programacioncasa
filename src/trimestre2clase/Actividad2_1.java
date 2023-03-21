package trimestre2clase;

import java.util.Scanner;

public class Actividad2_1 {

	public static void main(String[] args) {
		int[] energia= {0,0,0,0,0};
		int mayor=0,menor=0,total=0;
		String dato;
		Scanner sc=new Scanner (System.in);
		boolean seguir=true;
		
		do {
			dato="";
			System.out.print("Inserte la categoria energetica o Fin para acabar: ");
			dato=sc.nextLine();
			if(dato.equals("Fin")){
				seguir=false;
			} else {
				switch(dato) {
				case "A":
					energia[1]++;
					break;
				case "B":
					energia[2]++;
					break;
				case "C":
					energia[3]++;
					break;
				case "D":
					energia[4]++;
					break;
				case "E":
					energia[5]++;
					break;
				default:
					System.err.println("Dato incorrecto");
					break;
				}
				
			}
		}while (seguir);
		
		for(int i = 0; i<energia.length;i++) { //aprecia el ultimo que aparece
			if(energia[i]>mayor) {
				mayor=i;
			}
			total+=energia[i];
		}
		for(int i = 0; i<energia.length;i++) {//aprecia el ultimo que aparece
			if(energia[i]<menor) {
				menor=i;
			}
		}
		System.out.println("De las "+total+" viviendas visitadas "+energia[0]+" son de la categoria A, "+energia[1]+" son de la categoria B "+energia[2]+" son de la categoria C "+energia[3]+" son de la categoria D "+energia[4]+" son de la categoria E");
		System.out.println("Y la categoria mas usada es la "+mayor+" y la menos usada es la "+menor);
	}

}
