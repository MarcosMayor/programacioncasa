package clase;

import java.util.Random;
import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("Salio el "+rd.nextInt(10));
		System.out.println("Salio el "+rd.nextInt(10));
		System.out.println("Salio el "+rd.nextInt(10));
		System.out.println("Salio el "+rd.nextInt(10));
		System.out.println("Salio el "+rd.nextInt(10));
		
		System.err.println("SI SOY");
		
		System.out.println("Con math es "+ (int)(Math.random()*10+1));
		System.out.println("Con math es "+ (int)(Math.random()*10+1));
		System.out.println("Con math es "+ (int)(Math.random()*10+1));
		System.out.println("Con math es "+ (int)(Math.random()*10+1));
		System.out.println("Con math es "+ (int)(Math.random()*10+1));
		
		sc.close();
	}

}
