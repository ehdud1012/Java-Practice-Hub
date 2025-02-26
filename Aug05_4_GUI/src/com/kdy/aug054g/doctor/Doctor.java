package com.kdy.aug054g.doctor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import org.w3c.dom.Text;

public class Doctor implements ActionListener{

	private JTextField nameTF;
	private JTextField heightTF;
	private JTextField weightTF;
	private JLabel resultLB;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}
	
	public Doctor(JTextField nameTF, JTextField heightTF, JTextField weightTF, JLabel resultLB) {
		super();
		this.nameTF = nameTF;
		this.heightTF = heightTF;
		this.weightTF = weightTF;
		this.resultLB = resultLB;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = nameTF.getText();
		
		double h = Double.parseDouble(heightTF.getText());
		double w = Double.parseDouble(weightTF.getText());
		
		double bmi = w / (h*h);
		
		String status = "저체중";
		if (bmi >= 25) status = "비만";
		else if (bmi >= 23) status = "과체중";
		else if (bmi >= 18.5) status = "정상";
		 
		String result = String.format("%.1f, %s씨는 %s", bmi, name, status);
		resultLB.setText(result);
	}

	
}
