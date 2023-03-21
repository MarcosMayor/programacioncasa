package trimestre2clase;

public class StringVsBuffer {

	public static void main(String[] args) {
		String nombre = new String("CIFP Villa de Aguimes");
		String nombre2 = new String(" CIFP Villa de Aguimes");
		StringBuffer nombreb = new StringBuffer("CIFP Villa de Aguimes");
		
		//nombre.set			string no se puede
		//nombreb.setLength(5); cambia tamaño
		/*nombre.toLowerCase()
		  nombre.toUpperCase()
		  nombre.equalsIgnoreCase()*/
		int ln = nombre.length();
		int ln2 = nombre2.length();
		int lnb=nombreb.length();
		
		System.out.println("Longitud -> String: " +ln+ ",  String2: "+ln2);
		
		nombre2=nombre2.trim(); // trim quita los espacios (por delante y detras)
		ln = nombre.length();
		ln2 = nombre2.length();
		System.out.println("Longitud -> String: " +ln+ ",  String2: "+ln2);
		
		if(!nombre.equals(nombre2)) {
			System.out.println("No son iguales");
		}
		
		System.out.println("Longitud -> String: " +ln+ ",  StringBuffer: "+lnb);
		
		if(!nombre.equals(nombreb)) {
			System.out.println("No son iguales");
		}
		nombre=nombre.concat(", Alcorac 50");
		nombreb.append(", Alcorac 50");
		
		System.out.println("Concatenacion -> String: "+nombre);
		System.out.println("StringBuffer: "+nombreb);
	}

}
