package moneda;

import javax.swing.JOptionPane;


public class OpcionesMonedas extends JOptionPane {
	
	
	public void Monedas() {
		Object[] seleccion = {"USD a COP","COP a USD","EUR a COP","COP a EUR","USD a EUR","EUR a USD"};
		String seleccionado = (JOptionPane.showInputDialog(null,"Seleccione Tipo de Conversion",
															"ConversApp",
															JOptionPane.PLAIN_MESSAGE,null,
															seleccion,"")).toString();
		String monedaInicial = seleccionado.substring(0,3);
		
		try {
			String valor = JOptionPane.showInputDialog("Ingrese Valor en " + monedaInicial);
			
			double monto1 = Double.parseDouble(valor);
			
			
			double total1;
			
			switch(seleccionado) {
				
			case "USD a COP":
				total1 = monto1 * 4123;
				conversionInterna(total1,seleccionado.substring(6));
				break;
			case "COP a USD":
				total1 = monto1 / 4123;
				conversionInterna(total1,seleccionado.substring(6));
				break;
			case "EUR a COP":
				total1 = monto1 * 4492;
				conversionInterna(total1,seleccionado.substring(6));
				break;
			case "COP a EUR":
				total1 = monto1 / 4492;
				conversionInterna(total1,seleccionado.substring(6));
				break;
			case "USD a EUR":
				total1 = monto1 * 0.92;
				conversionInterna(total1,seleccionado.substring(6));
				break;
			case "EUR a USD":
				total1 = monto1 / 0.92;
				conversionInterna(total1,seleccionado.substring(6));
				break;
			
		}
		
		}catch(NumberFormatException ex) {
			System.out.println("error de valor");
			JOptionPane.showMessageDialog(null,"Valor No Valido");
			Monedas();
		}
		
		
	}
	
	
	public void conversionInterna(double valorA, String valorB ) {
		
		valorA=(double)Math.round(valorA*100d)/100;
		
		JOptionPane.showMessageDialog(null,"El resultado de su conversion es: "+ valorA+" "+valorB);
		
	}
	
}
