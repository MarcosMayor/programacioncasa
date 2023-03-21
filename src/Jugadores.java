import java.util.ArrayList;

public class Jugadores {
	String nombre;
	String Equipo;
	String Nacionalidad;
	Double ficha;
	static ArrayList<Jugadores> listaJug =  new ArrayList<Jugadores>();
	
	public Jugadores(String nombre, String equipo, String nacionalidad, String ficha) {
		super();
		this.nombre = nombre;
		Equipo = equipo;
		Nacionalidad = nacionalidad;
		this.ficha = Double.parseDouble(ficha);
		listaJug.add(this);
	}
	public String getNombre() {
		return nombre;
	}
	public String getEquipo() {
		return Equipo;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public Double getFicha() {
		return ficha;
	}
	public void setListaJug(ArrayList<Jugadores> listaJug) {
		this.listaJug = listaJug;
	}
	public Double Calcular_transfe(int t){
		return ((ficha*t)/100);
	}
	@Override
	public String toString() {
		return "Nombre=" + nombre + " Equipo=" + Equipo + " Nacionalidad=" + Nacionalidad + " ficha="
				+ ficha;
	}
	
}
