package actividad6;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		double salario,media=0;
		int mayorde=0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 10; i>0;i--) {
			System.out.print("Inserte el sueldo: ");
			salario=sc.nextInt();
			media+=salario;
			if(salario>1500) {
				mayorde++;
			}
		}
		System.out.print("La media es " + media/10 +" y hay " + mayorde + " sueldos mayores de 1500"  );
		sc.close();
	}

}
