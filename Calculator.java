package com.abk.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	Calculator(){

		this.setSize(600,600);
		this.setTitle("My Calculator");
		initUI();
	}
	private double currentInput= 0;
	private double answer =0;
	private double previousInput=0;
	private double memory=0;
	private void initUI() 
	{
		BorderLayout f = new BorderLayout();
		this.setLayout(f);
		JPanel answerPanel = new JPanel();
		JPanel keysPanel = new JPanel();
		JTextField t = new JTextField();
		t.setColumns(20);
		
		answerPanel.add(t);
		GridLayout g = new GridLayout(6, 4);
		keysPanel.setLayout(g);
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bMinus,bDivide,bMultiply,bEqual,b0,b00,bDecimal,brexit;
		b1= new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0 = new JButton("0");
		b00= new JButton("00");
		brexit= new JButton("Exit");
		bDecimal= new JButton(" . ");
		bAdd = new JButton("+");
		bMinus= new JButton("-");
		bDivide= new JButton("/");
		bMultiply= new JButton("X");
		bEqual= new JButton("=");
		keysPanel.add(b1);
		keysPanel.add(b2);
		keysPanel.add(b3);
		keysPanel.add(b4);
		keysPanel.add(b5);
		keysPanel.add(b6);
		keysPanel.add(b7);
		keysPanel.add(b8);
		keysPanel.add(b9);
		keysPanel.add(b0);
		keysPanel.add(b00);
		keysPanel.add(bAdd);
		keysPanel.add(bMinus);
		keysPanel.add(bDivide);
		keysPanel.add(bMultiply);
		keysPanel.add(bEqual);
		keysPanel.add(bDecimal);
		keysPanel.add(brexit);
		
		getContentPane().add(answerPanel,BorderLayout.WEST);
		getContentPane().add(keysPanel,BorderLayout.EAST);
		brexit.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Bye");
				System.exit(0);
			}
		});
	}
}

			
		
	
		
		
	


