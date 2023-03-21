package tema2;

public class Actividad1DoWhile {

	public static void main(String[] args) {
		int num=0;
		do {
			num++;
			if(mul5(num)) {
				continue;
			}
			System.out.print(num+" ");
		} while(num<300);

	}

	private static boolean mul5(int num) {
		return num%5==0;
	}

}
