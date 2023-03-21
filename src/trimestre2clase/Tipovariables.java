package trimestre2clase;

import java.util.Scanner;

public class Tipovariables {

	public static void main(String[] args) {
		perros vp;
		Scanner teclado;
		
		for (int i=0;i<=5;i++) {
			System.out.println("Introduce un nº de chip: ");
			teclado=new Scanner(System.in);
			vp=new perros();
			vp.setchip(teclado.nextInt());
			System.out.println("Has grabado al perro: "+vp.getchip());
			vp.muestraPerros();
		}

	}

}
