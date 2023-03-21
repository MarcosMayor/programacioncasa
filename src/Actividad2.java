import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double horas, sueldo;
		
		System.out.print("Inserte el numero de horas trabajadas: ");
		horas=teclado.nextDouble();
		
		sueldo = horas * 15;
		
		System.out.println("El empleado ha cobrado " + sueldo + " euros.");
		teclado.close();
	}

}
