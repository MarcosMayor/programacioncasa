import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num1, num2;
		
		System.out.print("Inserte el primer numero:");
		num1=teclado.nextDouble();
		
		System.out.print("Inserte el segundo numero: ");
		num2=teclado.nextDouble();
		
		if(num1==num2) {
			System.out.println("Los numeros son iguales");
		} else {
			if(num1>num2) {
				System.out.println("El primer numero es mayor");
			} else {
			
				System.out.println("El segundo numero es mayor");
			}
		}
		teclado.close();
	}

}
