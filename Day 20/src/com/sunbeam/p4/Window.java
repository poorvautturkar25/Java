package com.sunbeam.p4;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Window extends JFrame {
	JLabel lableGender;
	JRadioButton radioButtonMale;
	JRadioButton radioButtonFemale;
	ButtonGroup radiogroup;

	public Window() {
		super("RadioButtons");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null); // do not apply any layout

		lableGender = new JLabel("Gender :");
		radioButtonMale = new JRadioButton("Male");
		radioButtonFemale = new JRadioButton("Female");

		lableGender.setBounds(50, 50, 80, 30);
		radioButtonMale.setBounds(140, 50, 80, 30);
		radioButtonFemale.setBounds(230, 50, 80, 30);

		radiogroup = new ButtonGroup();
		radiogroup.add(radioButtonFemale);
		radiogroup.add(radioButtonMale);

		this.add(lableGender);
		this.add(radioButtonMale);
		this.add(radioButtonFemale);

		radioButtonMale.addChangeListener(e -> {
			if (radioButtonMale.isSelected())
				System.out.println("Male is selected");
		});

		radioButtonFemale.addChangeListener(e -> {
			System.out.println("Female is selected");
		});
	}

}
