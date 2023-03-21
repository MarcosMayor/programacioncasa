package tema2;

import java.util.Random;

public class Actividad2While {
	public static void main(String[] args) {
		Random rd=new Random();
		int num=0,rdnum;
	
		while(num<10) {
			num++;
			rdnum=rd.nextInt();
			if(parimpar(rdnum)) {
				System.out.println(rdnum+ " par");
			} else { 
				System.out.println(rdnum+ " impar");
			}
		}
	}

	private static boolean parimpar(int rdnum) {
		return rdnum%2==0;
	}
}
