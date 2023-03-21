package actividad4;

import java.util.Scanner;

public class apartado1 {

	/*public class cuadrado {
	
		public static void main(String[] args) 
		
		{
			
			int num=2      				Falta ; y solo hace el cuadrado de 2
		
			resul=num*num; 				No se inicializa la variable resul
			System.out.print.ln("El cuadrado es: " + resul);
		}
		
	}*/
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		double num;
		double resul;
		
		System.out.print("Introduce el numero: ");
		num=sc.nextDouble();
		
		resul=num*num;
	
		System.out.println("El cuadrado es: " + resul);
		sc.close();
	}
}
