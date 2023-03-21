import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, resto;
		
		System.out.print("Inserte numero a dividir: ");
		num=teclado.nextInt();
		
		resto=num%7;
		
		if(resto==0) {
			System.out.println("Es divisible");
		} else {
			System.out.println("No es divisible");
		}
		teclado.close();
	}

}
