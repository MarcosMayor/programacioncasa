package cuentasBancarias;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JOptionPane;

public class Banco {
	static ArrayList <Cuentas> listaCuentas =  new ArrayList<>();
	static Set <Clientes> listaClientes =  new HashSet<>();
	
	public static void main(String[] args) {
		int selection = JOptionPane.showOptionDialog(null, "Que operacion va a hacer en nuesto banco.",
				"MarcosBank S.A.", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, 
				new Object[] {"Crear Cuenta","Operacion Bancaria","Cancelar"}, "Cancelar" );

		if(selection==0) {
			selection = JOptionPane.showOptionDialog(null, "¿Ya se encuentra registrado en el banco?",
					"MarcosBank S.A.", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, 
					new Object[] {"Si","No"},"No");
			
			if(selection==1) {
				Clientes cliente =crearCliente();
				listaClientes.add(cliente);
				Cuentas cuenta = crearCuenta(cliente);
				listaCuentas.add(cuenta);
				operaciones(cuenta);
				
			} else if(selection==0){
				String dni;
				do {
					 dni=JOptionPane.showInputDialog("¿Cual es su DNI?");
					 dni=dni.toUpperCase();
					if(!checkDni(dni)) {
						JOptionPane.showMessageDialog(null, "Dato incorrecto");
					}
				}while(!checkDni(dni));
				Clientes cliente;
				cliente=buscarCliente(dni);
					if(cliente==null) {
						JOptionPane.showMessageDialog(null, "No existe ese cliente");
					} else {
						Cuentas cuenta = new Cuentas(cliente);
						operaciones(cuenta);
					}
			}
			
		}else if (selection==1) {
			selection = JOptionPane.showOptionDialog(null, "Seleccione entre el dni o Nº de Cuenta",
					"MarcosBank S.A.", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, 
					new Object[] {"DNI","Nº de cuenta"},"DNI");
			
			if(selection==0) {
				String dni;
				do {
					 dni=JOptionPane.showInputDialog("¿Cual es su DNI?");
					 dni=dni.toUpperCase();
					if(!checkDni(dni)) {
						JOptionPane.showMessageDialog(null, "Dato incorrecto");
					}
				}while(!checkDni(dni));
				Cuentas cuenta = buscarCuenta(listaCuentas, buscarCliente(dni));
				if(cuenta==null) {
					JOptionPane.showMessageDialog(null, "No existe esa cuenta");
				} else {
					operaciones(cuenta);
				}
				
			} else {
				String nCuenta ="";
				do {
					 nCuenta=JOptionPane.showInputDialog("¿Cual es su Nº de cuenta?");
					 nCuenta=nCuenta.toUpperCase();
					if(detectletra(nCuenta.substring(2))) {
						JOptionPane.showMessageDialog(null, "Dato incorrecto");
					}
				}while(detectletra(nCuenta.substring(2)));
				Cuentas cuenta = buscarCuenta(nCuenta);
				operaciones(cuenta);
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "Tenga un buen dia =)");
		}
	}
	
	private static Cuentas buscarCuenta(String nCuenta) {
		for(Cuentas cuenta: listaCuentas) {
			if(cuenta.getNumCuenta().equals(nCuenta)) {
				return cuenta;
			}
		}
		return null;
	}

	private static void operaciones(Cuentas cuenta) {
		 int seleccion = JOptionPane.showOptionDialog(null, "Selecione la operacion a realizar", "MarcosBank S.A",
					JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Ver todas las cuentas asociadas",
							"Hacer un ingreso", "Hacer una retirada","Pedir un límite","Cancelar"}, "Ver todas las cuentas asociadas");
		 switch(seleccion) {
		 	case 0:
			 verCuentas(cuenta);
			 operaciones(cuenta);
			 break;
		 	case 1: 
			 ingresar(cuenta);
			 operaciones(cuenta);
			 break;
		 	case 2:
			 retirar(cuenta);
			 operaciones(cuenta);
			 break;
		 	case 3: 
			 limite(cuenta);
			 operaciones(cuenta);
			 break;
		 	case 4:
		 		main(null);
		 }
		
	}

	private static void limite(Cuentas cuenta) {
		int selection = JOptionPane.showOptionDialog(null, "¿Desea preguntar para cambiar su limite?",
				"MarcosBank S.A.", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, 
				new Object[] {"Si","No"},"No");
		
		if(selection == 0) {
			String aux ="";
			double limite=0;
			do {
				try {
					aux = JOptionPane.showInputDialog("¿Cuanto quiere establecer el nuevo limite?");
					if(aux!=null) {
						limite =Double.parseDouble(aux);
					}
					if(limite<=0 ) {
						JOptionPane.showMessageDialog(null, "Dato incorrecto");
					}
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Tipo de dato incorrecto");
				}
			}while(limite<=0);
			Random rand =  new Random();
			int r =  rand.nextInt(2);
			if(r==0) {//Creo un aleatorio para simular una persona que te deniegue o acepte el limite
				JOptionPane.showMessageDialog(null, "Cambio de limite denegado");
			} else {
				double limiteCuenta = cuenta.getLimite();
				limiteCuenta+=limite;
				cuenta.setLimite(limiteCuenta);
				JOptionPane.showMessageDialog(null, "Cambio de limite aceptado, su nuevo limite es "+cuenta.getLimite()+" euros");
			}
		
		}
		
	}

	private static void retirar(Cuentas cuenta) {
		double dineroCuenta = cuenta.getSaldo();
		String aux ="";
		double dinero=0;
		do {
			try {
				aux = JOptionPane.showInputDialog("¿Cuanto quiere retirar?");
				if(aux!=null) {
					dinero =Double.parseDouble(aux);
				}
				if(dinero<=0 ) {
					JOptionPane.showMessageDialog(null, "Dato incorrecto");
				}
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Tipo de dato incorrecto");
			}
		}while(dinero<=0);
		if(dinero>cuenta.getLimite() && cuenta.getLimite()!=0) {
			JOptionPane.showMessageDialog(null, "No tiene permitido extraer dinero");
			
		} else if(dineroCuenta<dinero){
			JOptionPane.showMessageDialog(null, "No tiene suficiente dinero");
		}else if (dineroCuenta>=dinero) {
			dineroCuenta-=dinero;
			cuenta.setSaldo(dineroCuenta);
			JOptionPane.showMessageDialog(null, "Su saldo es ahora de "+cuenta.getSaldo()+" euros");
		}
			
	}

	private static void ingresar(Cuentas cuenta) {
		double dineroCuenta = cuenta.getSaldo();
		String aux ="";
		double dinero=0;
		do {
			try {
				aux = JOptionPane.showInputDialog("¿Cuanto quiere ingresar?");
				if(aux!=null) {
					dinero =Double.parseDouble(aux);
				}
				if(dinero<=0 ) {
					JOptionPane.showMessageDialog(null, "Dato incorrecto");
				}
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Tipo de dato incorrecto");
			}
		}while(dinero<=0);
		dineroCuenta+=dinero;
		cuenta.setSaldo(dineroCuenta);
		JOptionPane.showMessageDialog(null, "Su saldo es ahora de "+cuenta.getSaldo()+" euros");
	}

	private static void verCuentas( Cuentas cuenta) {
		String output = "";
		for(Cuentas buscar: listaCuentas) {
			if(buscar.getUsuario().getNif().equals(cuenta.getUsuario().getNif())) {
				output+=buscar.toString()+"\n";
			}
		}
		JOptionPane.showMessageDialog(null, output);
		
		
	}

	private static Cuentas buscarCuenta(ArrayList <Cuentas> listaCuentas, Clientes cliente) {
		for(Cuentas cuenta: listaCuentas) {
			if(cuenta.getUsuario().getNif().equals(cliente.getNif())) {
				return cuenta;
			}
		}
		return null;
		
	}
	private static Clientes buscarCliente( String dni) {
		for(Clientes cliente: listaClientes) {
			if(cliente.getNif().equals(dni)) {
				return cliente;
			}
		}
		JOptionPane.showMessageDialog(null, "No hay ningun cliente registrado con ese dni");
		return null;
	}

	private static Cuentas crearCuenta(Clientes cliente) {
		Cuentas cuenta = new Cuentas(cliente);
		return cuenta;
	}

	private static Clientes crearCliente() {
		Clientes cliente;
		String dni =JOptionPane.showInputDialog("Digame su DNI por favor");
		dni=dni.toUpperCase();
		if(!checkDni(dni)) {
			cliente=crearCliente();
		} 
		cliente=new Clientes(dni);
		int selection;
		do{
			 selection= JOptionPane.showOptionDialog(null, "¿Quiere añadir algun dato mas?",
					"MarcosBank S.A.", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, 
					new Object[] {"Nombre","Telefono","No"}, "No" );
			if(selection==1 || selection==0) {
				cliente = extra(cliente, selection);
			}
		}while(selection!=2);
		
		return cliente;
	}

	private static boolean checkDni(String dni) {
		if(dni.length()!=9 && (dni.charAt(dni.length()-1)>90 || dni.charAt(dni.length()-1)<65)) {
			return false;
		} else {
			if(detectletra(dni.substring(0,dni.length()-1))) {
				return false;
			}
		}
		return true;
	}

	private static boolean detectletra(String frase) {
		for(int i=0; i<frase.length(); i++) {
			if(frase.charAt(i)<48 || frase.charAt(i)>57) {
				return true;
			}
		}
		return false;
	}

	private static Clientes extra(Clientes cliente, int selection){
		if(selection==0) {
			String nombre =JOptionPane.showInputDialog("Digame su nombre");
			nombre=nombre.toUpperCase();
			cliente.setNombre(nombre);
		} else if (selection==1) {
			String tlf;
			do {
				 tlf=JOptionPane.showInputDialog("Digame su telefono");
				 if(detectletra(tlf) || tlf.length()!=9) {
					 JOptionPane.showMessageDialog(null, "Dato incorrecto");
				 }
			}while(detectletra(tlf) || tlf.length()!=9);
			int telefono=Integer.parseInt(tlf);
			cliente.setTelefono(telefono);
		}
		return cliente;
	}

}
