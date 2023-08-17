package ConversorDistancia;

import javax.swing.JOptionPane;

public class Distancias extends JOptionPane {

	
	public void ConvertidorDistancias(){
		
		Object[] distanciaObject = {"mi a km","km a mi"};
		String distanciaSelect = (JOptionPane.showInputDialog(null,"Seleccione Distancias a Convertir",
								"ConversApp",
								JOptionPane.PLAIN_MESSAGE,null,
								distanciaObject,"")).toString();
		
		String distanciaInicial = distanciaSelect.substring(0,2);
		try {
			String distanciaIn = JOptionPane.showInputDialog("Ingrese Valor en " + distanciaInicial);
			
			
			double distanciaOut = Double.parseDouble(distanciaIn);
			
			
			switch (distanciaSelect) {
				
				case "mi a km":
					distanciaOut = distanciaOut * 1.609;
					DistanciaFinal(distanciaOut,"Millas");
					break;
				case "km a mi":
					distanciaOut = distanciaOut / 1.609;
					DistanciaFinal(distanciaOut,"Kilometros");
					break;		
				}
		  }catch(NumberFormatException exp) {
				System.out.println("error de valor");
				JOptionPane.showMessageDialog(null,"Valor No Valido");
				ConvertidorDistancias();
		  }
	}
	
	public void DistanciaFinal(double valorDistancia,String distanciaFinal) {
		
		valorDistancia=(double)Math.round(valorDistancia*100d)/100;
		
		JOptionPane.showMessageDialog(null,"El resultado de su conversion es: "+ valorDistancia +" "+distanciaFinal);

	}
}
