package com.currency.project;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CurrencyConverterGui extends CurrencyExchange {
	private JFrame frame;
	private JPanel panel;
	private JTextField moneyInput;
	private JComboBox currencyList;
	private JButton convertButton;
	
	public CurrencyConverterGui() {
		frame = new JFrame();
		currencyList = new JComboBox<>(new String[] {"dollar", "yen","inr", "euro"});
		convertButton = new JButton("Convert");
		moneyInput = new JTextField();
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(currencyList);
		panel.add(convertButton);
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.add(moneyInput,BorderLayout.WEST);
		frame.setTitle("Currency Exchange Station");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		
		
	}
}
