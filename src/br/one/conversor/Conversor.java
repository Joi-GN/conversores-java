package br.one.conversor;

import javax.swing.JOptionPane;
import br.one.conversor.moeda.ConversorMoedas;

public class Conversor {

	public static void main(String[] args) {
		
		ConversorMoedas currencyConverter = new ConversorMoedas();
		
		while (true) {
			try {
				String selectedConverter = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Conversor de Moedas", "Conversor de Temperatura" }, "Escolha").toString();
				
				switch (selectedConverter) {
				case "Conversor de Moedas":
						String currency = JOptionPane.showInputDialog(
								null, "Escolha qual moeda:", "Menu", 
								JOptionPane.PLAIN_MESSAGE, null, 
								new Object[] {
										"Reais para Dólares americanos", 
										"Reais para Euros", 
										"Reais para Ienes",
										"Dólares americanos para Reais",
										"Dólares americanos para Euros",
										"Dólares americanos para Ienes",
										"Euros para Reais",
										"Euros para Dólares americanos",
										"Euros para Ienes",
										"Ienes para Reais",
										"Ienes para Dólares americanos",
										"Ienes para Euros",
										}, "Escolha").toString();
						double valueInput = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor para converter:"));
						String convertedValueMessage = currencyConverter.converterMoedas(currency, valueInput);
						JOptionPane.showMessageDialog(null, convertedValueMessage);
						break;
						
					case "Conversor de Temperatura":
						String unit = JOptionPane.showInputDialog(null, "Escolha qual unidade de medida:", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Kelvin", "Fahrenheit"}, "Escolha").toString();
						double temperatureInput = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor para converter:"));
						//TODO: chamar conversor de temperatura
						break;
				}
				int continueMenu = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Menu", JOptionPane.YES_NO_OPTION);
				if (continueMenu == JOptionPane.OK_OPTION) continue;
				else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				}
			} catch (NullPointerException exception) {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				break;
			}
		}
		
	}

}
