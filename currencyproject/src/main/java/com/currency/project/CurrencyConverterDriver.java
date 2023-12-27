package com.currency.project;

import java.util.Scanner;

public class CurrencyConverterDriver {
	
	public static void main(String[] args) {
		CurrencyExchange station = new CurrencyExchange();
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("please enter the money you want to exchange");
		
		double money = myScan.nextDouble();
		station.setMoney(money);
		
		System.out.println("what type of currency is it?");
		String moneyType = myScan.next();
		station.setMoneyType(moneyType);
		
		System.out.println("The money you want to exchange is " + station.getMoney() + " " + station.getMoneyType());
		
		System.out.println("what is the money type you want to exchange");
		String newType = myScan.next();
		station.exchangeMoney(newType);
		
		System.out.println("The money returned is " + station.getMoney() + " " + station.getMoneyType());
	
	}
}
