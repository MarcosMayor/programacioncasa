package calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;


public class Calculadora {
		
	int width = 400, heigth = 400;
	int butrows=4 , butcols=5;
	int rows=2 , cols=2;
	
		JFrame frame;
		JPanel panel;
		JPanel buttons;
		JLabel etiqueta;
		JLabel etiqueta2;
		JTextField entrada;
		JTextField salida;
		JButton button;
		
		public Calculadora() {
			ini_components();
			add_components();
			frame.setVisible(true);
		}
		
		private void add_components() {
			panel.add(etiqueta);
			panel.add(etiqueta2);
			panel.add(entrada);
			panel.add(salida);
			frame.add(panel, BorderLayout.NORTH);
			frame.add(buttons, BorderLayout.CENTER);
		}

		private void ini_components() {
			frame =  new JFrame();
			frame.setTitle("Calculadora");
			frame.setBounds(new Rectangle(width, heigth));
			frame.setLayout(new BorderLayout());
			frame.setLocationRelativeTo(null);
			
			panel=new JPanel();
			panel.setBackground(Color.LIGHT_GRAY);
			panel.setLayout(new GridLayout(rows,cols));
			
			buttons=new JPanel();
			buttons.setLayout(new GridLayout(butrows, butcols));
			
			entrada = new JTextField();
			entrada.setEditable(false);
			salida = new JTextField();
			salida.setEditable(false);
			
			etiqueta =  new JLabel("Operacion");
			etiqueta.setLabelFor(entrada);
			
			etiqueta2 =  new JLabel("Resultado");
			etiqueta2.setLabelFor(salida);
			
			
			String[][] matrix = {{"1","2","3","/",""},
								 {"4","5","6","*",""},
								 {"7","8","9","-",""},
								 {".","0","C","+","="}};
			
			for(int i =0; i<matrix.length;i++) {
				for(int j =0; j<matrix[0].length;j++) {
					button = new JButton(matrix[i][j]);
					final int temp1 = i;
					final int temp2 = j;
					if(matrix[i][j].equals("=")) {
						button.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								resolver(entrada.getText());
							}

							
						});
					}else if (matrix[i][j].equals("C")){
							button.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								try {
									entrada.setText(entrada.getText(0, entrada.getText().length()-1));
								} catch (BadLocationException e1) {
									
								};
							}

							
						});
					}else{
						button.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								entrada.setText(entrada.getText() + matrix[temp1][temp2]);
							}
							
						});
					}
					buttons.add(button);
				}
			}
			
		}

		public static void main(String[] args) {
			new Calculadora();

		}
		private void resolver(String text) {
			if(!Validar(text)) {
				salida.setText("Error");
			} else {
				double resultado =separar(text);
				salida.setText(Double.toString(resultado));
			}
			
		}

		private double separar(String text) {
			String[] separada = text.split("(?<=[-+*/])|(?=[-+*/])");
		    ArrayList <String> listaNumOp =  new ArrayList<String>();
			for (int i=0;i<separada.length;i++) {
		    	listaNumOp.add(separada[i]);
		    }
			double result=prioridad(listaNumOp);
			return result;
		}

		private double prioridad(ArrayList <String> listaNumOp) {
			for (int i=0;i<listaNumOp.size();i++) {
				if(listaNumOp.get(i).equals("*")||listaNumOp.get(i).equals("/")) {
					listaNumOp.set(i+1,operacion(listaNumOp.get(i),listaNumOp.get(i-1),listaNumOp.get(i+1)));
					listaNumOp.remove(i);
					listaNumOp.remove(i-1);
					i--;
				}
			}
			for (int i=0;i<listaNumOp.size();i++) {
				if(listaNumOp.get(i).equals("+")||listaNumOp.get(i).equals("-")) {
					listaNumOp.set(i+1,operacion(listaNumOp.get(i),listaNumOp.get(i-1),listaNumOp.get(i+1)));
					listaNumOp.remove(i);
					listaNumOp.remove(i-1);
					i--;
				}
			}
			double res =  Double.parseDouble(listaNumOp.get(0));
			return res;
		}

		private boolean Validar (String prueba) {
			Pattern pattern = Pattern.compile("^\\d+(\\.\\d+)?([+\\*-/]\\d+(\\.\\d+)?)*$");
			Matcher matcher = pattern.matcher(prueba);
			return matcher.matches();
		}

		private String operacion(String signo, String n1, String n2) {
				double num1,num2,res=0;  
			if (signo.equals("*")){
				num1 = Double.parseDouble(n1);
				num2 = Double.parseDouble(n2);
				res = num1*num2;
			}else 
				if (signo.equals("/")){
				num1 = Double.parseDouble(n1);
				num2 = Double.parseDouble(n2);
				res = num1/num2;
			}else 
				if (signo.equals("+")){
				num1 = Double.parseDouble(n1);
				num2 = Double.parseDouble(n2);
				res = num1+num2;
			}else 
				if (signo.equals("-")){
				num1 = Double.parseDouble(n1);
				num2 = Double.parseDouble(n2);
				res = num1-num2;
			}
			return Double.toString(res);
		}
	}

