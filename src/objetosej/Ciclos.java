package objetosej;

public class Ciclos {
	String nombre;
	String Tipo;
	String codPicel;
	
	public Ciclos(String nombre,String codPincel, String tipo) {
		this.codPicel=codPincel;
		this.nombre = nombre;
		Tipo = tipo;
	}
	public String getCodPicel() {
		return codPicel;
	}

	public void setCodPicel(String codPicel) {
		this.codPicel = codPicel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
}
