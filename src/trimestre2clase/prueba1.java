package trimestre2clase;

import java.util.Scanner;

public class prueba1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = new String("Cosa de nombre");
		System.out.print("Buenas tardes, ponga el apellido: " );
		String apellido = sc.nextLine();

		apellido.substring(0,3);
		
		System.out.println("Probando "+ nombre.concat(" "+apellido));
		
		int lon=apellido.length();
		System.out.println("Es "+lon+" de larga");
		char car;
		
		try {
		for(int i=0; i<=lon ; i++) {
			car=apellido.charAt(i);
			System.out.println("Cosa de caracter en pos "+i+", " +car);
		}
		}catch(StringIndexOutOfBoundsException e) {
			System.err.println("Has puesto de mas, ojo.");
		}
		
		if (apellido.contains("si")) {
			System.out.println("Has confirmado con si en posicion "+apellido.indexOf("si"));
		}
		sc.close();
	}

}
