package com.sunbeam.p5;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class Window extends JFrame{
	
	JComboBox<String> comboBox;
	
	public Window(){
		super("ComboBox");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
		String [] arr = {"C","CPP" ,"JAVA" ,"Python"};
		//Model
		DefaultComboBoxModel<String> defaultComboBoxModel = new DefaultComboBoxModel<>(arr);
		
		//View
		comboBox = new JComboBox<>(defaultComboBoxModel);
		comboBox.setBounds(50, 50, 80, 30);
		this.add(comboBox);
		
		//Controller
		comboBox.addItemListener(e-> {
			System.out.println("Fav Lanuage : " + comboBox.getSelectedItem());
		});
	}

}
