package clase;

import java.io.IOException;

public class ejclasenombre {
	
	public static void main(String[] args) throws IOException {
		
		char c1 ,c2, c3, c4;
	
		System.out.print("Introduce tu nombre: ");
		c1 = (char) System.in.read();
		c2 = (char) System.in.read();
		c3 = (char) System.in.read();
		c4 = (char) System.in.read();
		
		System.out.println("Las 4 primeras letras son: "+c1+" "+c2+" "+c3+" "+c4);
	}
}
