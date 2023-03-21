import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double ev1, ev2, ev3, media;
		
		System.out.print("Inserte la nota de la primera evaluacion: ");
		ev1=teclado.nextDouble();
		System.out.print("Inserte la nota de la segunda evaluacion: ");
		ev2=teclado.nextDouble();
		System.out.print("Inserte la nota de la tercera evaluacion: ");
		ev3=teclado.nextDouble();
		
		media = (ev1 + ev2 + ev3)/3;
		
		if(media<5){
			System.out.println("Suspendido");
		} else {
			System.out.println("Aprobado");
		}
		teclado.close();
		

	}

}
