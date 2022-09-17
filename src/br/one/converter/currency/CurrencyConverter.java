package br.one.converter.currency;

public class CurrencyConverter {
	
	private double exchangeRate;
	private String sign;
	
	public String converterMoedas (String currency, double value) {	
		
		switch (currency) {
		case "Reais para Dólares americanos": 
			this.exchangeRate = 5.1644;
			this.sign = CurrencySign.DOLAR.getSign();
			break;
		case "Reais para Euros": 
			this.exchangeRate = 5.1505;
			this.sign = CurrencySign.EURO.getSign();
			break;
		case "Reais para Ienes": 
			this.exchangeRate = 0.0360;
			this.sign = CurrencySign.IENE.getSign();
			break;
		case "Dólares americanos para Reais":
			this.exchangeRate = 0.1936;
			this.sign = CurrencySign.REAL.getSign();
			break;
		case "Dólares americanos para Euros":
			this.exchangeRate = 0.9974;
			this.sign = CurrencySign.EURO.getSign();
			break;
		case "Euros para Reais":
			this.exchangeRate = 0.1941;
			this.sign = CurrencySign.REAL.getSign();
			break;
		case "Euros para Dólares americanos": 
			this.exchangeRate = 1.0027;
			this.sign = CurrencySign.DOLAR.getSign();
			break;
		case "Euros para Ienes": 
			this.exchangeRate = 0.0070;
			this.sign = CurrencySign.IENE.getSign();
			break;
		case "Ienes para Reais": 
			this.exchangeRate = 27.7519;
			this.sign = CurrencySign.REAL.getSign();
			break;
		case "Ienes para Dólares americanos": 
			this.exchangeRate = 143.3220;
			this.sign = CurrencySign.DOLAR.getSign();
			break;
		case "Ienes para Euros": 
			this.exchangeRate = 142.9652;
			this.sign = CurrencySign.EURO.getSign();
			break;
		}
		
		double conversionResult = value / exchangeRate;
		return String.format("O valor convertido fica por volta de %s %.2f", this.sign, conversionResult);
	}
}