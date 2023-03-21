package trimestre2clase;

import java.util.StringTokenizer;

public class tokenizer {

	public static void main(String[] args) {
		String cosas="blanco azul rosa verde amarillo rojo naranja marron negro si cosa3";
		StringTokenizer stri= new StringTokenizer(cosas, "$");
		
		int numtokens=stri.countTokens();
		System.out.println("Hay "+numtokens+" cosas");
		
		while(stri.hasMoreTokens()) {
			System.out.println("token: "+stri.nextToken());
		}

	}

}
