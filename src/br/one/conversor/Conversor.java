package br.one.conversor;
import javax.swing.JOptionPane;

import br.one.conversor.moeda.TesteConversorMoedas;

public class Conversor {

	public static void main(String[] args) {
		
		while (true) {
			String selectedConverter = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Conversor de Moedas", "Conversor de Temperatura" }, "Escolha").toString();
			switch (selectedConverter) {
				case "Conversor de Moedas":
					String currency = JOptionPane.showInputDialog(null, "Escolha qual moeda:", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Dólares americanos", "Euros", "Ienes"}, "Escolha").toString();
					double valueInput = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor em Reais para converter"));
					// TODO: chamar conversor de moeda
					break;
				case "Conversor de Temperatura":
					String unit = JOptionPane.showInputDialog(null, "Escolha qual unidade de medida:", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Kelvin", "Fahrenheit"}, "Escolha").toString();
					double temperatureInput = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor em Celsius para converter"));
					//TODO: chamar conversor de temperatura
					break;
			}
		}
		
	}

}
