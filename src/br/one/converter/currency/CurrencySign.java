package br.one.converter.currency;

public enum CurrencySign {
	
	REAL("R$"), DOLAR("$"), EURO("€"), IENE("¥"), LIBRA("£"), PESO("$");
	
	private String sign;
	
	private CurrencySign (String sign) {
		this.sign = sign;
	}
	
	public String getSign() {
		return sign;
	}
}