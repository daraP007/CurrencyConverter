package com.currency.project;

public class CurrencyExchange {
	private double money;
	private String moneyType;
	
	
	public CurrencyExchange() {
		money = 0;
		moneyType = null;
	}
	
	public CurrencyExchange(int money, String type) {
		this.money = money;
		moneyType = type;
	}
	
	public double getMoney() {
		return money;
	}
	
	public String getMoneyType() {
		return moneyType;
	}
	
	public void setMoney(double money) {
		this.money = money;
	}
	
	public void setMoneyType(String moneyType) {
		this.moneyType = moneyType;
	}
	
	private void roundTwoDecimals() {
		double rounded = Math.round(money * 100.0) / 100.0;
		setMoney(rounded);
	}
	
	
	public double exchangeMoney(String type) {
		if (type.equalsIgnoreCase("yen")) {
			convertToYen();
			setMoneyType("yen");
		}else if (type.equalsIgnoreCase("dollar")) {
			convertToDollar();
			roundTwoDecimals();
			setMoneyType("dollar");
		}else if (type.equalsIgnoreCase("euro")) {
			convertToEuro();
			roundTwoDecimals();
			setMoneyType("euro");
		}else if (type.equalsIgnoreCase("inr")) {
			convertToInr();
			roundTwoDecimals();
			setMoneyType("inr");
		}
		return money;
	}
	
	
	/*
	 * This method converts the current currency the user has to the Indian Rupee currency.
	 */
	private void convertToInr() {
		if (getMoneyType().equalsIgnoreCase("dollar")) {
			setMoney(money * 83.269312);
		}else if(getMoneyType().equalsIgnoreCase("yen")) {
			setMoney(money * 0.58621668);
		}else if (getMoneyType().equalsIgnoreCase("euro")) {
			setMoney(money * 92.458851);
		}
		
	}
	

	private void convertToEuro() {
		if (getMoneyType().equalsIgnoreCase("dollar")) {
			setMoney(money * 0.90563392);
		}else if(getMoneyType().equalsIgnoreCase("yen")) {
			setMoney(money * 0.0063507069);
		}else if (getMoneyType().equalsIgnoreCase("inr")) {
			setMoney(money * 0.010818367);
		}
	}

	private void convertToDollar() {
		if (getMoneyType().equalsIgnoreCase("euro")) {
			setMoney(money * 1.1100754);
		}else if(getMoneyType().equalsIgnoreCase("yen")) {
			setMoney(money * 0.007036769);
		}else if (getMoneyType().equalsIgnoreCase("inr")) {
			setMoney(money * 0.012010197);
		}
	}
	
	private void convertToYen() {
		if (getMoneyType().equalsIgnoreCase("dollar")) {
			setMoney((double)Math.round(money* 142.11697));
		}else if(getMoneyType().equalsIgnoreCase("euro")) {
			setMoney((double)Math.round(money * 157.7457));
		}else if (getMoneyType().equalsIgnoreCase("inr")) {
			setMoney( (double) Math.round(money * 1.7059729));
		}
	}

}
