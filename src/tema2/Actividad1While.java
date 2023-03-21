package tema2;

public class Actividad1While {

	public static void main(String[] args) {
		int num=0;
		while(num<300) {
			num++;
			if(mul5(num)) {
				continue;
			}
			System.out.print(num+" ");
		}

	}

	private static boolean mul5(int num) {
		return num%5==0;
	}

}
