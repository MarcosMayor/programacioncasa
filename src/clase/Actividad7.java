package clase;

import java.io.IOException;

public class Actividad7 {

	public static void main(String[] args){
		int catA=0, catB=0, catC=0, catN=0, visit=0;
		final char FIN ='#';
		boolean cont=true;
	
		while(cont) {
			char ener = getEner();
			if(ener=='A') {
				visit++;
				catA++;
			}
			if(ener=='B') {
				visit++;
				catB++;
			}
			if(ener=='C') {
				visit++;
				catC++;
			}
			if(ener=='N') {
				visit++;
				catN++;
			}
			if(ener==FIN) {
				cont=false;
			}
			
		}
		try {
			System.out.println("Ha visitado "+visit+" casas y hay "+catA+ " de categoria A, un "+catA*100/visit+ "%, "+catB+" de categoria B, un " 
				+catB*100/visit+"%, " +catC+ " de categoria C, un "+catC*100/visit+"% y " + catN+" sin categoria, un "+catN*100/visit+"%");
		} catch (ArithmeticException e) {
			System.err.println("Se ha producido una divison por 0");
		}
		

	}

	private static char getEner() {
		char ener=0;
		do {
			
			try {
				System.out.print("Inserte valor energetico de la casa (A,B,C o N para ninguna y # para acabar): ");
				do{
					ener= (char)System.in.read();
				}while(ener=='\n'||ener=='\r'||ener=='±'||ener=='º'||ener=='ª');
			}catch(IOException e) {
				System.err.println("Dato no valido");
			}
			
		}while(ener!='A'&&ener!='B'&&ener!='C'&&ener!='N'&&ener!='#');
		return ener;
	}

}
