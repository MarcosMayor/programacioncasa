package clase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimulacroExamen {

	public static void main(String[] args) {
		double num=0, uva = 0, fresa = 0, pera = 0, manzana = 0, total = 0;
		final int PORCENTAJE = 70;
		Scanner sc = new Scanner(System.in);
		boolean bad;

		do {
			bad=true;
			while (bad) {
				try {// Obtencion del dato de uvas con gestion de error de tipo de dato
					System.out.print("Inserte los kilos de uvas(negativo para acabar): ");
					num = sc.nextDouble();
					if(num>=0) {
						uva+=num;
					}
					bad = false;
				} catch (InputMismatchException e) {
					System.err.println("Tipo de dato incorrecto.");
					sc.nextLine();
				}
			}
			if (num >= 0) {

				bad = true;
				while (bad) {
					try {// Obtencion del dato de fresas con gestion de error de tipo de dato
						System.out.print("Inserte los kilos de fresas(negativo para acabar): ");
						num = sc.nextDouble();
						if(num>=0) {
							fresa+=num;
						}
						bad = false;
					} catch (InputMismatchException e) {
						System.err.println("Tipo de dato incorrecto.");
						sc.nextLine();
					}
				}
				if (num >= 0) {

					bad = true;
					while (bad) {
						try { // Obtencion del dato de peras con gestion de error de tipo de dato
							System.out.print("Inserte los kilos de peras(negativo para acabar): ");
							num = sc.nextDouble();
							if(num>=0) {
								pera+=num;
							}
							bad = false;
						} catch (InputMismatchException e) {
							System.err.println("Tipo de dato incorrecto.");
							sc.nextLine();
						}
					}
					if (num >= 0) {
						bad = true;
						while (bad) {
							try {// Obtencion del dato de manzana con gestion de error de tipo de dato
								System.out.print("Inserte los kilos de manzanas(negativo para acabar): ");
								num = sc.nextDouble();
								if(num>=0) {
									manzana+=num;
								}
								bad = false;
							} catch (InputMismatchException e) {
								System.err.println("Tipo de dato incorrecto.");
								sc.nextLine();
							}
						}
					}
				}
			}
			System.out.println();//separador
			System.out.println("Siguiente");
			} while (num >= 0);
			System.out.println(); // separador

			// Cuando sean iguales solo aparece el ultimo mayor
			if (uva > fresa && uva > pera && uva > manzana) {
				System.out.println("Las Uvas tienen la mayor cantidad de kilos");
			} else {
				if (fresa > pera && fresa > manzana) {
					System.out.println("Las Fresas tienen la mayor cantidad de kilos");
				} else {
					if (pera > manzana) {
						System.out.println("Las Peras tienen la mayor cantidad de kilos");
					} else {
						System.out.println("Las Manzanas tienen la mayor cantidad de kilos");
					}
				}
			}

			System.out.println(); // Separador

			// Cuando sean iguales solo aparece el ultimo menor
			if (uva < fresa && uva < pera && uva < manzana) {
				System.out.println("Las Uvas tienen la menor cantidad de kilos");
			} else {
				if (fresa < pera && fresa < manzana) {
					System.out.println("Las Fresas tienen la menor cantidad de kilos");
				} else {
					if (pera < manzana) {
						System.out.println("Las Peras tienen la menor cantidad de kilos");
					} else {
						System.out.println("Las Manzanas tienen la menor cantidad de kilos");
					}
				}
			}

			System.out.println(); // Separador

			total = uva + fresa + pera + manzana;
			System.out.println("El total de fruta recogido es de " + total + " kilos.");

			System.out.println(); // Separador

			if (uva > (total * PORCENTAJE / 100)) {
				System.out.println("Las uvas han superado el 70% del total");
			}
			if (fresa > (total * PORCENTAJE / 100)) {
				System.out.println("Las fresas han superado el 70% del total");
			}
			if (pera > (total * PORCENTAJE / 100)) {
				System.out.println("Las peras han superado el 70% del total");
			}
			if (manzana > (total * PORCENTAJE / 100)) {
				System.out.println("Las manzanas han superado el 70% del total");
			}
			
		
		sc.close();
	}

}
