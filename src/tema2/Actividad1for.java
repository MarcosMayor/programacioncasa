package tema2;

public class Actividad1for {

	public static void main(String[] args) {
		for(int i=1;i<=300;i++) {
			if(mul5(i)) {
				continue;
			}
			System.out.print(i+ " ");
		}
	}

	private static boolean mul5(int i) {
		return i%5==0;
	}

}
