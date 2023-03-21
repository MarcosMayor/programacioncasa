package trimestre2clase;

public class split {

	public static void main(String[] args) {
		String municipio = "Las palmas GC#700, Telde#400, Arucas#100, Ingenio#50, Santa Lucia#300, Aguimes#200";
		String[] muni = municipio.split(",");
		for (int i = 0; i < muni.length; i++) {
			String[] pob = muni[i].split("#");
			int num = Integer.parseInt(pob[1]);
			if (num > 450) {
				System.out.println("El municipio " + pob[0] + " con " + num + " habitantes es una gran ciudad");
			}
			// System.out.println(muni[i]);
		}
	}

}
