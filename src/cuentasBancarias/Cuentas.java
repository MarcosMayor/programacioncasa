package cuentasBancarias;

import java.util.Random;

public class Cuentas {
	Clientes usuario;
	String numCuenta;
	double saldo;
	double limite;
	
	public Cuentas(Clientes usuario) {
		super();
		this.usuario = usuario;
		this.saldo=0;
		this.limite = 0;
		numCuenta="BA";
		Random random = new Random();
		
		for (int i = 0; i < 14; i++){
	        int num = random.nextInt(10) + 0;
	        numCuenta += num;
	    }
	  }

	public Clientes getUsuario() {
		return usuario;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String toString() {
		return "El titular con " + usuario.toString() + ", tiene la cuenta " + numCuenta + ", con un saldo de " 
				+ saldo + " y un limite de " + limite;
	}
	
}
