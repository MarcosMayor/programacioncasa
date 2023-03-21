package EjClase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class listAluAlt2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		ArrayList <String> nombre = new ArrayList<String>();
		ArrayList <Double> altura = new ArrayList<Double>();
		boolean seguir=true;
		
		while(seguir) {
			System.out.print("Inserte el nombre del alumno (# para salir): ");
			String name=sc.nextLine();
			if(name.equals("#")){
				seguir=false;
			} else {
				nombre.add(name);
				System.out.print("Ahora inserte la altura del alumno: ");
				altura.add(sc.nextDouble());
				sc.nextLine();
			}
			
		}
		Iterator<String> alu=nombre.iterator();
		Iterator<Double> alualtu=altura.iterator();
		while(alu.hasNext()) {
			System.out.println("El alumno "+alu.next()+" tiene una altura de "+alualtu.next());
		}
		
		int mayor=altura.indexOf(Collections.max(altura));
		System.out.print("La mayor altura es la de "+nombre.get(mayor)+" con "+altura.get(mayor));
		
		/*for(int i=0;i<nombre.size();i++) {
			System.out.println("Alumno: "+nombre.get(i)+"   Altura: "+altura.get(i));
		}*/

	}

}
