package moneda;

public class Moneda {
	double cantidad;
	double cambio;
	
	public Moneda() {
		this.cambio=1.09;
	}
	
	public Moneda(double cambio){
		this.cambio = cambio;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getCambio() {
		return cambio;
	}
	
	public double EurosDolares() {
		return (this.cantidad*this.cambio);
	}
	
	public double DolaresEuros() {
		return (this.cantidad/this.cambio);
	}
	
}
