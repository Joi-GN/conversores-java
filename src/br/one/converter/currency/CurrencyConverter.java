package br.one.converter.currency;

public class CurrencyConverter {
	
	private double exchangeRate;
	private String sign;
	
	public String converterMoedas (String currency, double value) {	
		
		switch (currency) {
		case "Reais para Dólares americanos": 
			this.exchangeRate = 5.25;
			this.sign = CurrencySign.DOLAR.getSign();
			break;
		case "Reais para Euros": 
			this.exchangeRate = 5.26;
			this.sign = CurrencySign.EURO.getSign();
			break;
		case "Reais para Ienes": 
			this.exchangeRate = 0.037;
			this.sign = CurrencySign.IENE.getSign();
			break;
		case "Reais para Libras Esterlinas":
			this.exchangeRate = 6;
			this.sign = CurrencySign.LIBRA.getSign();
			break;
		case "Reais para Peso Argentino":
			this.exchangeRate = 0.037;
			this.sign = CurrencySign.PESO.getSign();
			break;
		case "Reais para Peso Chileno":
			this.exchangeRate = 0.0057;
			this.sign = CurrencySign.PESO.getSign();
			break;
		case "Dólares americanos para Reais":
			this.exchangeRate = 0.19;
			this.sign = CurrencySign.REAL.getSign();
			break;
		case "Euros para Reais":
			this.exchangeRate = 0.19;
			this.sign = CurrencySign.REAL.getSign();
			break;
		case "Ienes para Reais": 
			this.exchangeRate = 27.21;
			this.sign = CurrencySign.REAL.getSign();
			break;
		case "Libras Esterlinas para Reais": 
			this.exchangeRate = 0.17;
			this.sign = CurrencySign.REAL.getSign();
			break;
		case "Peso Argentino para Reais": 
			this.exchangeRate = 27.33;
			this.sign = CurrencySign.REAL.getSign();
			break;
		case "Peso Chileno para Reais": 
			this.exchangeRate = 175.62;
			this.sign = CurrencySign.REAL.getSign();
			break;
		}
		
		double conversionResult = value / exchangeRate;
		return String.format("O valor convertido fica por volta de %s %.2f", this.sign, conversionResult);
	}
}