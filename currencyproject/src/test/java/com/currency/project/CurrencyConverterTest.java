package com.currency.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CurrencyConverterTest {

	@Test
	@DisplayName("Exchange zero money")
	void test0() {
		CurrencyExchange stationOne = new CurrencyExchange(0, "dollar");
		CurrencyExchange stationTwo = new CurrencyExchange(0, "yen");
		CurrencyExchange stationThree = new CurrencyExchange(0, "euro");

		assertEquals(0, stationOne.getMoney());
		assertEquals(0, stationTwo.getMoney());
		assertEquals(0, stationThree.getMoney());
		assertEquals("dollar", stationOne.getMoneyType());
		assertEquals("yen", stationTwo.getMoneyType());
		assertEquals("euro", stationThree.getMoneyType());
	}
	@Test
	@DisplayName("Exchange to Yen")
	void test1() {
		CurrencyExchange stationOne = new CurrencyExchange(1, "dollar");
		CurrencyExchange stationTwo = new CurrencyExchange(1, "inr");
		CurrencyExchange stationThree = new CurrencyExchange(1, "euro");
		
		stationOne.exchangeMoney("yen");
		stationTwo.exchangeMoney("yen");
		stationThree.exchangeMoney("yen");

		assertEquals(142, stationOne.getMoney());
		assertEquals(2, stationTwo.getMoney());
		assertEquals(158, stationThree.getMoney());
		assertEquals("yen", stationOne.getMoneyType());
		assertEquals("yen", stationTwo.getMoneyType());
		assertEquals("yen", stationThree.getMoneyType());
	}
	@Test
	@DisplayName("Exchange to euro")
	void test2() {
		CurrencyExchange stationOne = new CurrencyExchange(1, "dollar");
		CurrencyExchange stationTwo = new CurrencyExchange(1, "inr");
		CurrencyExchange stationThree = new CurrencyExchange(1, "yen");
		
		stationOne.exchangeMoney("euro");
		stationTwo.exchangeMoney("euro");
		stationThree.exchangeMoney("euro");

		assertEquals(0.91, stationOne.getMoney());
		assertEquals(0.01, stationTwo.getMoney());
		assertEquals(0.01, stationThree.getMoney());
		assertEquals("euro", stationOne.getMoneyType());
		assertEquals("euro", stationTwo.getMoneyType());
		assertEquals("euro", stationThree.getMoneyType());
	}
	@Test
	@DisplayName("Exchange to inr")
	void test3() {
		CurrencyExchange stationOne = new CurrencyExchange(1, "dollar");
		CurrencyExchange stationTwo = new CurrencyExchange(1, "euro");
		CurrencyExchange stationThree = new CurrencyExchange(1, "yen");
		
		stationOne.exchangeMoney("inr");
		stationTwo.exchangeMoney("inr");
		stationThree.exchangeMoney("inr");

		assertEquals(83.27, stationOne.getMoney());
		assertEquals(92.46, stationTwo.getMoney());
		assertEquals(0.59, stationThree.getMoney());
		assertEquals("inr", stationOne.getMoneyType());
		assertEquals("inr", stationTwo.getMoneyType());
		assertEquals("inr", stationThree.getMoneyType());
	}
	@Test
	@DisplayName("Exchange to Dollar")
	void test4() {
		CurrencyExchange stationOne = new CurrencyExchange(1, "inr");
		CurrencyExchange stationTwo = new CurrencyExchange(1, "euro");
		CurrencyExchange stationThree = new CurrencyExchange(1, "yen");
		
		stationOne.exchangeMoney("dollar");
		stationTwo.exchangeMoney("dollar");
		stationThree.exchangeMoney("dollar");

		assertEquals(0.01, stationOne.getMoney());
		assertEquals(1.11, stationTwo.getMoney());
		assertEquals(0.01, stationThree.getMoney());
		assertEquals("dollar", stationOne.getMoneyType());
		assertEquals("dollar", stationTwo.getMoneyType());
		assertEquals("dollar", stationThree.getMoneyType());
	}

}
