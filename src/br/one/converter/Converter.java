package br.one.converter;

import javax.swing.JOptionPane;

import br.one.converter.currency.CurrencyConverter;
import br.one.converter.temperature.TemperatureConverter;

public class Converter {

	public static void main(String[] args) {
		
		String selectedConverter;
		String option = null;
		boolean invalidValue = false;
		
		CurrencyConverter currencyConverter = new CurrencyConverter();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		
		while (true) {
			try {
				selectedConverter = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Conversor de Moedas", "Conversor de Temperatura" }, "Escolha").toString();
				
				switch (selectedConverter) {
				case "Conversor de Moedas":
						option = JOptionPane.showInputDialog(
								null, "Escolha qual moeda:", "Menu", 
								JOptionPane.PLAIN_MESSAGE, null, 
								new Object[] {
										"Reais para Dólares americanos", 
										"Reais para Euros", 
										"Reais para Ienes",
										"Reais para Libras Esterlinas", 
										"Reais para Peso Argentino",
										"Reais para Peso Chileno",
										"Dólares americanos para Reais",
										"Euros para Reais",
										"Ienes para Reais",
										"Libras Esterlinas para Reais",
										"Peso Argentino para Reais",
										"Peso Chileno para Reais",
										}, "Escolha").toString();
						break;
						
					case "Conversor de Temperatura":
						option = JOptionPane.showInputDialog(
								null, "Escolha qual unidade de medida:", "Menu", 
								JOptionPane.PLAIN_MESSAGE, null, 
								new Object[] {
										"Célsius para Kelvin",
										"Célsius para Fahrenheit",
										"Kelvin para Célsius",
										"Kelvin para Fahrenheit", 
										"Fahrenheit para Célsius",
										"Fahrenheit para Kelvin"
										}, "Escolha").toString();
						break;
				}
				
				do {
					String valueInput =  JOptionPane.showInputDialog("Insira um valor para converter:");
					
					if (valueInput.matches("^[0-9]+$")) {
						double input = Double.parseDouble(valueInput);
						String convertedValueMessage = null;
						switch (selectedConverter) {
						case "Conversor de Moedas":
							convertedValueMessage = currencyConverter.converterMoedas(option, input);	
							break;
						case "Conversor de Temperatura":
							convertedValueMessage = temperatureConverter.converterTemperatura(option, input);
							break;
						}
						JOptionPane.showMessageDialog(null, convertedValueMessage);
						invalidValue = false;
					} else {
						invalidValue = true;
						JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido");
					}
				} while (invalidValue);
				
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