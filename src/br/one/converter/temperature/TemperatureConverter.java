package br.one.converter.temperature;

public class TemperatureConverter {
	
	String symbol;
	double result;

	public String converterTemperatura (String unit, double temperature) {
		
		switch (unit) {
		case "Célsius para Kelvin":
			result = temperature + 273.15;
			symbol = TemperatureSymbol.KELVIN.getSymbol();
			break;
		case "Célsius para Fahrenheit":
			result = (temperature * 9 / 5) + 32;
			symbol = TemperatureSymbol.FAHRENHEIT.getSymbol();
			break;
		case "Kelvin para Célsius":
			 result = temperature - 273.15;
			 symbol = TemperatureSymbol.CELSIUS.getSymbol();
			break;
		case "Kelvin para Fahrenheit":
			result = (temperature - 273.15) * 9 / 5 + 32;
			symbol = TemperatureSymbol.FAHRENHEIT.getSymbol();
			break; 
		case "Fahrenheit para Célsius":
			result = (temperature - 32) * 5 / 9;
			symbol = TemperatureSymbol.CELSIUS.getSymbol();
			break;
		case "Fahrenheit para Kelvin":
			result = (temperature - 32) * 5 / 9 + 273.15;
			symbol = TemperatureSymbol.KELVIN.getSymbol();
			break;
		}
		
		return String.format("A temperatura convertida fica %.2f %s", result, symbol);
	}
	
}
