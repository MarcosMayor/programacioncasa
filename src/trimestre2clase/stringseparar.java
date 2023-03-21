package trimestre2clase;

public class stringseparar {

	public static void main(String[] args) {
		String frase="En un lugar de la Mancha de cuyo nombre no quiero acordarme";
		int prim=0;
		
		for(int i =0; i<frase.length() ;i++) {
			if(frase.charAt(i)==' ') {
				System.out.println(frase.substring(prim,i));
				prim=i+1;
			}
			if(i==frase.length()-1) {
				System.out.print(frase.substring(prim,i+1));
			}               
		}
	}

}
