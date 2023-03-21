package cuentasBancarias;

public class Clientes {
	String nif;
	String nombre;
	int telefono;
	
	public Clientes(String nif) {
		super();
		this.nif = nif;
	}

	public String getNif() {
		return nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String toString() {
		if(this.nombre==null) {
			return "Dni: " + nif;
		}
		return "Dni: " + nif + " de nombre: "+ nombre;
	}
	
	
}
