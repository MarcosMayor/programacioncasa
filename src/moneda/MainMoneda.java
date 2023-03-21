package moneda;

import javax.swing.JOptionPane;

public class MainMoneda {

	public static void main(String[] args) {
		int selecion = JOptionPane.showOptionDialog(null, "¿Ha cambiado el valor de la moneda?",
				"Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
				null, new Object[] {"Si", "No"}, "No");
		
		if(selecion==0) {
			double cambio=0;
			String aux;
			do {
				try {
					aux = JOptionPane.showInputDialog("¿Cual es el valor actual?");
					if(aux!=null) {
						cambio = Double.parseDouble(aux);
					}
					if(cambio<=0) {
						JOptionPane.showMessageDialog(null, "Dato incorrecto");
					}
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Tipo de dato incorrecto");
				}
			}while(cambio<=0);
			Moneda dinero =  new Moneda(cambio);
			cambio(dinero);
		} else {
			Moneda dinero = new Moneda();
			cambio(dinero);
		}
	}

	private static void cambio(Moneda dinero) {
		int opcion = pregunta();
		dinero.setCantidad(preguntarDinero()); ;
		if (opcion==0) {
			double res = dinero.EurosDolares();
			JOptionPane.showMessageDialog(null, dinero.getCantidad()+" euros son "+String.format("%.2f ", res)+" dolares");
		} else {
			double res = dinero.DolaresEuros();
			JOptionPane.showMessageDialog(null, dinero.getCantidad()+" dolares son "+String.format("%.2f ", res)+" euros");
		}
	}

	private static double preguntarDinero() {
		double dinero=0;
		String aux;
		do {
			try {
				aux = JOptionPane.showInputDialog("¿Cuanto quiere cambiar?");
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
		return dinero;
	}

	private static int pregunta() {
		int opcion=JOptionPane.showOptionDialog(null, "¿Quiere intercambiar Dolares a Euros o Euros a Dolares?", 
				"Cambio de moneda", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
				new Object[] {"Dolar a Euro", "Euro a dolar"}, null);
		return opcion;
	}

}
