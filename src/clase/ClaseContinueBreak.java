package clase;

import javax.swing.JOptionPane;

public class ClaseContinueBreak {

	public static void main(String[] args) {
		String result="";
		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero: "));
		if(num%2==0) {num--;}
		bucle:
			for(int k=num; k>0;k-=2) {
				if(k%3==0) {continue bucle;}
				result=result+" "+k;
			}
		JOptionPane.showMessageDialog(null, "El resultado es"+ result);
	}

}
