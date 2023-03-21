package clase;

import java.io.IOException;

public class clase3 {

	public static void main(String[] args) throws IOException {
		
		char michar;
		int valchar;
		
		michar = (char) System.in.read();
		valchar = System.in.read();
		
		System.out.print("Hola mundo " + michar + " y su valor ascii es " + valchar);
	}

}
