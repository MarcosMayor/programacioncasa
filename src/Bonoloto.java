import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Bonoloto {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		ArrayList<Integer> bonoloto =  new ArrayList<Integer>();
		ArrayList<Integer> apuesta =  new ArrayList<Integer>();
		String[] premio = {"45%","24%","12%","19%","4€","3€"};
		int reintegro, complementario;
		final int precio = 3;
		int total=0;
		
		generarBono(bonoloto);
		complementario=generateRandom(49);
		reintegro=generateRandom(9);
		bonoloto.sort(null);
		
		bonoloto.add(complementario);
		bonoloto.add(reintegro);
		
		//genera cantidad de personas jugando aleatoriamente
		int njug=generateRandom(10000);
		total =precio*njug;
		
		System.out.print("Haga la apuesta");
		apuesta(apuesta, sc);
		
		System.out.println();
		System.out.println("Se han recaudado las apuestas, hay un total de "+total+"euros en juego.");
		
		System.out.println();
		System.out.println("Su apuesta es ");
		showList(apuesta);	
		total+=precio;
		
		System.out.println();
		System.out.println("El numero ganador ha sido: ");
		showList(bonoloto);
		
		System.out.println();
		int indice=check(apuesta, bonoloto);
		double ganado;
		
		if(indice==-1) {
			System.out.println("No ha sido premiado =(");
		} else {
			if(premio[indice].charAt(premio[indice].length()-1)=='%') {
				int oper=Integer.parseInt(premio[indice].substring(0,premio[indice].length()-1));
				ganado=(total*oper)/100;
				System.out.println("Ha ganado "+ganado+"€ =D");
			} else {
				System.out.println("Ha ganado "+premio[indice].substring(0,premio[indice].length()-1)+"euros =)");
			}
		}
			
	}

	private static int check(ArrayList<Integer> apuesta, ArrayList<Integer> bonoloto) {
		int acierto=0,rein=0,compl=0;
		for(int check: apuesta) {
			if(bonoloto.contains(check) && apuesta.indexOf(check)<apuesta.size()-2) {//size -2 es complementario
				acierto++;
			} else if(bonoloto.contains(check) && apuesta.indexOf(check)==apuesta.size()-2) {
				compl++;
			} else if(bonoloto.contains(check) && apuesta.indexOf(check)==apuesta.size()-1){//size -1 es reintegro
				rein++;
			}
		}
		
		return casos(acierto,compl, rein);
	}

	private static int casos(int acierto,int compl, int rein) {
		switch(acierto) {
			case(6):
				return 0;
			case(5):
				if(compl==1) {
					return 1;
				}else {
					return 2;
				}
			case(4):
				return 3;
			case(3):
				return 4;
			case(2):
				if(rein==1) {
					return 5;
				} else {
					return -1;
				}
				
			case(1):
				if(rein==1) {
					return 5;
				} else {
					return -1;
				}
			
			case(0):			
				if(rein==1) {
					return 5;
				} else {
					return -1;
				}
		}
		return 0;
	}

	private static void showList(ArrayList<Integer> bonoloto) {
		for(int impress: bonoloto) {
			System.out.print(impress+" ");
		}
	}
	
	private static ArrayList<Integer> generarBono(ArrayList<Integer> bonoloto){
		for(int i=0; i<6; i++) {
			 int random = generateRandom(49);
			 if(!bonoloto.contains(random)) { //no se puede repetir  
				  bonoloto.add(random);
			 }else {
				 i--; //asi que salta y -1 iteracion 
			 }
		}
		return bonoloto;
	}

	private static int generateRandom(int limite) {
		Random r = new Random();
		int random = r.nextInt(limite)+1;
		return random;
	}
	
	private static ArrayList<Integer> apuesta(ArrayList<Integer> apuesta, Scanner sc){
		System.out.println("Inserte 6 numeros (1-49) el complementario (1-49) y el reintegro (1-9)");
		for(int i=0; i<=7;i++) {
			int num=entrada(sc, i);
			if(!apuesta.contains(num) || i>=6) {
				apuesta.add(num);
			}else {
				System.err.println("No se puede repetir numeros");
				i--;
			}
			if(i==5) {
				apuesta.sort(null);
			}
		}
		return apuesta;
	}

	private static int entrada(Scanner sc,int i) {
		int num=0;
		int lim=49;
		if(i==6) {
			System.out.print("Inserte el complementario: ");
		} else if(i==7) {
			System.out.print("Inserte el reintegro: ");
			lim=9;
		} else {
			System.out.print("Numero "+(i+1)+": ");
		}
		try {
			num = sc.nextInt();
			if (num <= 0 || num > lim) {
				System.err.println("Numero no valido");
				sc.nextLine();
				num = entrada(sc,i);
			}
		} catch (InputMismatchException e) {
			System.err.println("Tipo de dato no valido");
			sc.nextLine();
			entrada(sc,i);
		}
		return num;
	}

}
