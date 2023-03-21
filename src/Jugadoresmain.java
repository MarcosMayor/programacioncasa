import java.util.StringTokenizer;

public class Jugadoresmain {

	public static void main(String[] args) {
		final String mal="Barcelona";
		final String bien="FC Barcelona";
		
		String entrada = "Messi, Barcelona,Argentina,55000.0$Modric, Real Madrid, Croacia, 52000.5$Iniesta,"+
				"Barcelona, España,275000.0$Stoichkov, Barcelona, Bulgaria, 752003.25$Ferrari,"+
				"Sassuolo, Italia,99999.9";
		String corregida = entrada.replaceAll(mal, bien);
		String[] separada=corregida.split("\\$");
		
		String[][] jugadores = fillMatrix(separada);
		showMatrix(jugadores);
		
		System.out.println();
		for(int i=0;i<jugadores.length;i++) {
			new Jugadores(jugadores[i][0].trim().toUpperCase().toUpperCase(),
						jugadores[i][1].trim().toUpperCase().toUpperCase(),
						jugadores[i][2].trim().toUpperCase().toUpperCase(),
						jugadores[i][3].trim().toUpperCase().toUpperCase());
		}
		
	showList();
	
	System.out.println();
	for(Jugadores Jug: Jugadores.listaJug) {
		if(Jug.getEquipo().equals(bien)) {
			double traspaso=Jug.Calcular_transfe(20);
			System.out.println("El traspaso de "+Jug.getEquipo()+" es de "+traspaso);
		}
	}
	
	for(int i=0; i<Jugadores.listaJug.size(); i++) {
		if(Jugadores.listaJug.get(i).getNacionalidad().equalsIgnoreCase("Italia")) {
			Jugadores.listaJug.remove(Jugadores.listaJug.get(i));
			i--;
		}
	}
	
	showList();
	
	System.out.println();	
	for(Jugadores Jug: Jugadores.listaJug) {
		if(Jug.getFicha()>100000) {
			System.out.println("La ficha de "+Jug.getNombre()+" es mayor de 100000");
		}
	}
	
	}

	private static void showList() {
		Jugadores.listaJug.forEach(Jug -> System.out.println(Jug.toString()));
	}

	private static String[][] fillMatrix(String[] separada) {
		StringTokenizer comas = new StringTokenizer(separada[0],",");
		String[][] jugadores= new String[separada.length][comas.countTokens()];
		
		for(int i=0;i<jugadores.length;i++) {
			comas = new StringTokenizer(separada[i],",");
			for(int j=0;j<jugadores[0].length;j++) {
				jugadores[i][j]=comas.nextToken();
			}
		}
		return jugadores;
	}

	private static void showMatrix(String[][] jugadores) {
		for(int i=0;i<jugadores.length;i++) {
			for(int j=0;j<jugadores[0].length;j++) {
				System.out.print(jugadores[i][j]+" ");			
			}
			System.out.println();
		}
	}

}
