package trimestre2clase;

public class perros {
	private static /*la hace global*/ int numperros=0;
	private int chip;
	private char raza;
	private String nombre;
	
	perros(){
		chip=0;
		raza=' ';
		nombre=" ";
		nuevoPerro();
	}
	public void setchip(int c) {
		chip=c;
	}
	public int getchip() {
		return(chip);
	}
	public static void nuevoPerro() {
		 numperros++;
	}
	public static void muestraPerros() {
		System.out.println("Numero de perros: "+numperros);
	}
}
