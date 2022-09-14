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
					double input = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor em reais para converter"));
			}
		}
		
	}

}
