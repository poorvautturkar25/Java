package com.sunbeam.p2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame{
	
	JButton sumbitButton;
	JButton cancelButton;
	
	public Window () {
		this.setTitle("Components");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null); // do not apply any layout
		
		sumbitButton = new JButton("Smbit");
		sumbitButton.setBounds(50, 50, 80, 30);
		this.add(sumbitButton);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(150, 50, 80, 30);
		this.add(cancelButton);
		
		sumbitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Sumbit Button Clicked");
			}
		});
		
		cancelButton.addActionListener(e-> {
			System.out.println("Cancel Button Clicked");
		});
		
	}

}
