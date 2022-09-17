package br.one.converter.temperature;

public enum TemperatureSymbol {
	
	CELSIUS("°C"), KELVIN("K"), FAHRENHEIT("°F");
	
	private String symbol;
	
	private TemperatureSymbol (String symbol) {
		this.symbol = symbol;
	}
	
	public String getSymbol() {
		return symbol;
	}
}
