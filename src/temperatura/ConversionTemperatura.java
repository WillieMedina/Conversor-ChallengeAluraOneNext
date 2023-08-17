package temperatura;
import javax.swing.JOptionPane;

public class ConversionTemperatura extends JOptionPane {
	
	public void ConvertirTemperatura(){
		
		Object[] temp = {"°C a °F","°F a °C"};
		
		String tempSelect = (JOptionPane.showInputDialog(null,"Seleccione Temperaturas a Convertir",
								"ConversApp",
								JOptionPane.PLAIN_MESSAGE,null,
								temp,"")).toString();
		String tempInicial = tempSelect.substring(0,3);
		try {
			String tempIn = JOptionPane.showInputDialog("Ingrese Valor en " + tempInicial);
			
			
			double tempG = Double.parseDouble(tempIn);
			
			switch(tempSelect) {
				case "°C a °F":
					tempG = (tempG * 1.8)+32;
					TemperaturaFinal(tempG,tempSelect.substring(5));
					break;
				case "°F a °C ":
					tempG = (tempG - 32)*0.55;
					TemperaturaFinal(tempG,tempSelect.substring(5));
					break;
					}
			}catch(NumberFormatException ex) {
				System.out.println("error de valor");
				JOptionPane.showMessageDialog(null,"Valor No Valido");
				ConvertirTemperatura();
			}
		}
	 
	
	
	public void TemperaturaFinal(double valorTemp, String finalSimbol) {
		
		valorTemp=(double)Math.round(valorTemp*100d)/100;
		
		JOptionPane.showMessageDialog(null,"El resultado de su conversion es: "+ valorTemp +" "+finalSimbol);
	}
	
	
}
