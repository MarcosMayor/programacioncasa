package EjClase;

import java.util.Scanner;

//Programa que lea STRINGS (nombres de alumnos), 
//los guarda en vector y según los lee, 
//lo guarda ordenado (compareTo)
public class StringVectores {

	public static void main(String[] args) {
		String[] alumnos = new String[7];
		String aux="";
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<alumnos.length ; i++) {
			System.out.print("Inserte nombre: ");
			alumnos[i]=sc.nextLine();
		}
		
		for(int i=0; i<alumnos.length ; i++) {
			for(int j=i+1; j<alumnos.length;j++) {
				if( alumnos[i].compareTo(alumnos[j]) > 0 ) {
		            aux = alumnos[i];
		            alumnos[i] = alumnos[j];
		            alumnos[j] = aux;
		        }
			}
		}
		for(int i=0; i<alumnos.length ; i++) {
			System.out.println(alumnos[i]);
		}
		sc.close();
		
	}

}
