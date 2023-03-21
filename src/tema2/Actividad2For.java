package tema2;

import java.util.Random;

public class Actividad2For {

	public static void main(String[] args) {
		Random rd=new Random();
		int num;
		
		for(int i=0; i<10;i++) {
			num=rd.nextInt();
			if(parimpar(num)) {
				System.out.println(num+ " par");
			} else { 
				System.out.println(num+ " impar");
			}
			
		}

	}

	private static boolean parimpar(int num) {
		return num%2==0;
	}

}
