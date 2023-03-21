package trimestre2clase;

import java.util.Scanner;

public class vectores {

	public static void main(String[] args) {
		//final int NUM_ALU=4;
		//double[] notas= {7.25,10,1.25,5,6,7,8.75};
		//String[] alumnos=new String[NUM_ALU];
		Scanner sc=new Scanner(System.in);
		String[] alumnos= {"nombre1","nombre2","nombre3","nombre4","nombre5","nombre6","nombre7"};
		//System.out.println("Tienes "+notas.length+" calificaciones");
		
		//double suma=0;
		/*
		for(int i=0; i<alumnos.length;i++) {
			//System.out.println("Estoy en la nota del alumno "+(i+1)+" y saco un "+notas[i]);
			System.out.print("Dime el nombre del alumno "+(i+1));
			//suma=suma+notas[i];
			alumnos[i]=sc.nextLine();
		}
		//System.out.println("La nota media es "+suma/notas.length);
		for(int i=0; i<alumnos.length;i++) {
			System.out.println("Hola "+alumnos[i]);
		}
		*/
		for(String name:alumnos) {
			System.out.println("Hola "+name);
		}
		sc.close();
	}

}
