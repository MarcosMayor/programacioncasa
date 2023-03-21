package clase;

public class ClaseFor {

	public static void main(String[] args) {

		int tope = 5;

		//Incremento
		System.out.println("Incremento");
		for (int i = 0; i < 5; i++) {
			System.out.println("Tu contadora vale: " + i);
		}

		//decremento
		System.out.println("Decremento");
		for (int i = tope; i > 0; i--) {
			System.out.println("Tu contadora vale: " + i);
		}
		
		// incremento de 2
		System.out.println("Incremento de 2");
		for (int i = 0; i < 5; i = i + 2) {
			System.out.println("Tu contadora vale: " + i);
		}

		// decremento de 3
		System.out.println("Decremento de 3");
		for (int i = tope; i > 0; i = i - 3) {
			System.out.println("Tu contadora vale: " + i);
		}
	}

}
