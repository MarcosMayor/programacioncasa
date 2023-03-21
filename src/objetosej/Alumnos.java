package objetosej;

public class Alumnos {
	String Cial;
	String Nombre;
	Ciclos ciclo;
	
	public Alumnos(String cial, String nombre) {
		super();
		Cial = cial;
		Nombre = nombre;
	}
	public Alumnos(String cial, String nombre, Ciclos ciclo) {
		super();
		Cial = cial;
		Nombre = nombre;
		this.ciclo = ciclo;
	}
	public Ciclos getCiclo() {
		return ciclo;
	}
	public void setCiclo(Ciclos ciclo) {
		this.ciclo = ciclo;
	}
	public String getCial() {
		return Cial;
	}
	public void setCial(String cial) {
		Cial = cial;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
}
