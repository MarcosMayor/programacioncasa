package EjClase;

import java.util.Scanner;

public class cifradooly {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		char[][] norma=
			{{'A','B','C','D','E'},
			{'F','G','H','I','J'},
			{'K','L','M','N','Ñ'},
			{'O','P','Q','R','S'},
			{'T','U','V','W','X'},
			{'Y','Z',' ','1','2'},
			{'4','5','6','7','8'},
			{'9','0',',','.','-'}};
		boolean seguir=true;
		while(seguir) {
			System.out.print("Desea cifrar o descifrar: ");
			String op=new String();	
			op=sc.nextLine();
			if(op.equals("cifrar")) {
				cifrado(norma, sc);
				seguir=false;
			} else if(op.equals("descifrar")) {
				descifrado(norma, sc);
				seguir=false;
			}else {
				System.err.println("Operacion incorrecta");
			}
		}
	}
	private static void cifrado(char[][] norma, Scanner sc) {
		System.out.print("Inserte la frase a cifrar: ");
		String frase=sc.nextLine();
		String chipre=new String();
		frase=frase.toUpperCase();
		int k=0;
		while(k<frase.length()) {
			for(int i=0 ; i<norma.length ; i++) {
				for(int j=0 ; j<norma[0].length ; j++) {
					if(norma[i][j]==frase.charAt(k)) {
						chipre+=Integer.toString(i)+Integer.toString(j);
						
					}
				}	
			}
			k++;
		}
		System.out.println(chipre);
	}
	private static void descifrado(char[][] norma, Scanner sc) {
		System.out.print("Inserte la frase a descifrar: ");
		String frase=sc.nextLine();
		String dechipre=new String();
		int pos=0;
		while(pos+2<=frase.length()) {
			dechipre+=norma[Character.getNumericValue(frase.charAt(pos))][Character.getNumericValue(frase.charAt(pos+1))];
			pos+=2;
		}
		System.out.println(dechipre);
	}
}
