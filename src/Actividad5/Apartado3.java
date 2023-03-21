package Actividad5;

public class Apartado3 {

	// El salario mínimo interprofesional del 2022 es 1166,67 €.
	// Si se planifica una subida del 5,9 %
	// para el próximo año ¿cuál sería el nuevo salario mínimo?

	public static void main(String[] args) {

		final double SUBIDA = 5.9;
		final double SAL_MIN = 1167.67;
		double salario;

		salario = SAL_MIN + (SAL_MIN * (SUBIDA / 100));

		System.out.println("El nuevo salario es de " + salario);

	}

}
