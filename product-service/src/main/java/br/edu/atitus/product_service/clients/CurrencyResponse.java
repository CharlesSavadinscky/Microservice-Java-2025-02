package br.edu.atitus.product_service.clients;



public class CurrencyResponse {

	
	private Long is;
	
	private String source;
	
	private String target;
	
	private double conversionRate;
	
	private double convertedValue;
	
	private String enviroment;

	public Long getIs() {
		return is;
	}

	public void setIs(Long is) {
		this.is = is;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public double getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(double conversionRate) {
		this.conversionRate = conversionRate;
	}

	public double getConvertedValue() {
		return convertedValue;
	}

	public void setConvertedValue(double convertedValue) {
		this.convertedValue = convertedValue;
	}

	public String getEnviroment() {
		return enviroment;
	}

	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}

	
	
}
