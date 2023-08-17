package menuPrincipal;
import javax.swing.JOptionPane;

import ConversorDistancia.Distancias;
import moneda.OpcionesMonedas;
import temperatura.ConversionTemperatura;


public class MenuPrincipal extends JOptionPane {
	
	
	public static void main(String[] args) {
		
		OpcionesMonedas coin = new OpcionesMonedas();
		ConversionTemperatura temperatura = new ConversionTemperatura();
		Distancias distancia = new Distancias ();
		
		
		while(true) {
			
			
			Object[] input = {"Divisas","Temperaturas","Distancias"};
				
			String seleccionMenu = (JOptionPane.showInputDialog(null,"Seleccione Tipo de Conversion",
																	"ConversApp",
																	JOptionPane.PLAIN_MESSAGE,null,
																	input,"")).toString();
	
			
			try {
				switch (seleccionMenu) {
					case "Divisas":
						coin.Monedas();
						System.out.println("Opcion Divisas");
						break;
						
					case "Temperaturas":
						temperatura.ConvertirTemperatura();
						System.out.println("Opcion Temperatura");
						break;
					
					case "Distancias":
						distancia.ConvertidorDistancias();
						System.out.println("Opcion Distancias");
						break;
				
						}
				
				int confirmacion = JOptionPane.showConfirmDialog(null, "¿Deseas Realizar Otra Conversion?",
						"otro text",JOptionPane.YES_NO_OPTION);
				if (confirmacion==1){
					System.out.println("Cerrado");
					break;
			}
			
			}catch(NullPointerException exception) {
				System.out.println("Excepcion Menu Principal");
				}	
		}
	
			JOptionPane.showMessageDialog(null,"Programa Terminado");
	}
}