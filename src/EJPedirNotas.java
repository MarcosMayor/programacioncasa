import java.util.Scanner;

public class EJPedirNotas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int ev1, ev2, ev3;
		double media;
		final int DIVISOR = 3;

		System.out.print("Inserte el valor de la primera evaluacion: ");
		ev1 = teclado.nextInt();
		System.out.print("Inserte el valor de la segunda evaluacion: ");
		ev2 = teclado.nextInt();
		System.out.print("Inserte el valor de la tercera evaluacion: ");
		ev3 = teclado.nextInt();

		media = (double) (ev1 + ev2 + ev3) / DIVISOR;
		System.out.println("La media es " + media);
		teclado.close();
	}
}
