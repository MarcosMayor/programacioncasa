import java.util.Scanner;

public class ActividadString2 {

	public static void main(String[] args) {
		StringBuffer libro = new StringBuffer(), autor = new StringBuffer(), reversa = new StringBuffer();
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Inserte el titulo del libro: ");
		libro.append(sc.nextLine());
		System.out.print("Inserte el nombre del autor: ");
		autor.append(sc.nextLine());
		
		libro.append(", "+autor);
		
		System.out.println();//separador
		System.out.println(libro);
		
		reversa.append(libro);
		reversa.reverse();
		System.out.println();//separador
		System.out.println(reversa);
		
		libro.replace(libro.indexOf(","),libro.indexOf(",")+1, " escrito por");
		System.out.println();//separador
		System.out.println(libro);
		
		sc.close();
	}

}
