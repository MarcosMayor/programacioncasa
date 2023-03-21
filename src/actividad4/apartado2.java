package actividad4;
import java.util.Scanner;

public class apartado2 {
	
/*	public class edad {
		
		public static void main(String[] args) {
			
			Scanner teclado=new Scanner(System.out);	Error System.out en vez de System.in
			System.out.print("Indique la edad: ");
			edad= teclado.nextInt();					No se inicializa la variable edad
			
			if (edad<=18) {								Comprobacion del if esta al reves sería edad>=18
				System.out.println("Es mayor de edad");
			} else {
				System.out.println("Es menor de edad");
			}
			teclado.close();
		}
		
	}*/

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);	
		System.out.print("Indique la edad: ");
		int edad= teclado.nextInt();					
		
		if (edad>=18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
		teclado.close();
		}

	}

