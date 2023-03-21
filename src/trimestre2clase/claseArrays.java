package trimestre2clase;

import java.util.Scanner;

public class claseArrays {

	public static void main(String[] args) {
		//String[] alumno= {"Nombre1","Nombre2","Nombre3","Nombre4","Nombre5"};
		final int ALU=7;
		Scanner sc=new Scanner(System.in);
		String[] alumno=new String[ALU];
		
		for(int i=0; i<alumno.length; i++){
			System.out.print("Porfaplas introduce el nombre del alumno "+(i+1)+" : ");
			/*String nombre=sc.nextLine();
			alumno[i]=nombre;*/
			alumno[i]=sc.nextLine();
			System.out.println("Alumno nº "+(i+1)+": "+alumno[i]);
		}
		sc.close();
	}

}
