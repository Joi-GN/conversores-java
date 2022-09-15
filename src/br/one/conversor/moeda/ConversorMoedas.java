package br.one.conversor.moeda;

public class ConversorMoedas {
	
	private double exchangeRate;
	private String sign;
	
	public String converterMoedas (String currency, double value) {	
		
		switch (currency) {
		case "Reais para Dólares americanos": 
			this.exchangeRate = 5.1644;
			this.sign = "$";
			break;
		case "Reais para Euros": 
			this.exchangeRate = 5.1505;
			this.sign = "€";
			break;
		case "Reais para Ienes": 
			this.exchangeRate = 0.0360;
			this.sign = "¥";
			break;
		case "Dólares americanos para Reais":
			this.exchangeRate = 0.1936;
			this.sign = "R$";
			break;
		case "Dólares americanos para Euros":
			this.exchangeRate = 0.9974;
			this.sign = "$";
			break;
		case "Euros para Reais":
			this.exchangeRate = 0.1941;
			this.sign = "R$";
			break;
		case "Euros para Dólares americanos": 
			this.exchangeRate = 1.0027;
			this.sign = "$";
			break;
		case "Euros para Ienes": 
			this.exchangeRate = 0.0070;
			this.sign = "¥";
			break;
		case "Ienes para Reais": 
			this.exchangeRate = 27.7519;
			this.sign = "R$";
			break;
		case "Ienes para Dólares americanos": 
			this.exchangeRate = 143.3220;
			this.sign = "$";
			break;
		case "Ienes para Euros": 
			this.exchangeRate = 142.9652;
			this.sign = "€";
			break;
		}
		
		double conversionResult = value / exchangeRate;
		return String.format("O valor convertido fica por volta de %s %.2f", this.sign, conversionResult);
	}
}