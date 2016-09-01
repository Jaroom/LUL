package com.abk.swing;


import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Example extends JFrame {

	Example(){

		this.setSize(300,300);
		this.setTitle("Learning Java Swing");
		initUI();
	}
	public void initUI()
	{
		final JTextField t= new JTextField();
		t.setText("Sebestian");
		t.setToolTipText("Enter your name here");
		t.setColumns(20);
		t.setHorizontalAlignment(JTextField.RIGHT);
		t.setEnabled(false);
		JButton b = new JButton("Say Hello!");
		JButton b1 = new JButton("Say Goodbye!");
		FlowLayout fl = new FlowLayout();
		getContentPane().setLayout(fl);
		getContentPane().add(t);
		getContentPane().add(b);
		getContentPane().add(b1);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hello "+t.getText());

			}
		});
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Good bye "+t.getText());
				System.exit(0);
			}
		});
		getContentPane().setVisible(true);
	}
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
	        
            @Override
            public void run() {
                Calculator ex = new Calculator();
                ex.setVisible(true);
            }
        });
	 }

}
