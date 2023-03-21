import java.util.Scanner;

public class BucleClase {

	public static void main(String[] args) {

		int numalu = 0, tope = 6;
		double nota, totalno = 0;
		Scanner sc = new Scanner(System.in);

		while (numalu < tope) {
			numalu++;
			System.out.print("Escribe tu nota: ");
			nota = sc.nextDouble();
			totalno += nota; // totalno = totalno + nota;
		}

		System.out.println("La nota media de la clase es " + totalno / numalu);
		sc.close();
	}

}
