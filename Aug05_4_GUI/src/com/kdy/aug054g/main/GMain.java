package com.kdy.aug054g.main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.kdy.aug054g.doctor.Doctor;

// 비만도 

public class GMain {
	public static void main(String[] args) {
		JFrame j = new JFrame("비만도 검사");
		
		// 객체들 배치 전략 (Layout)
		// GridLayout 4행 2열

		GridLayout g = new GridLayout(4, 2);
		
		j.setLayout(g);
		
		JLabel nameLB = new JLabel("이름 : ");
		j.add(nameLB);
		JTextField nameTF = new JTextField();
		j.add(nameTF);
		
		JLabel heightLB = new JLabel("키 :");
		j.add(heightLB);
		JTextField heightTF = new JTextField();
		j.add(heightTF);
		
		JLabel weightLB = new JLabel("몸무게 :");
		j.add(weightLB);
		JTextField weightTF = new JTextField();
		j.add(weightTF);
		
		JLabel resultLB = new JLabel();
		j.add(resultLB);
		JButton b = new JButton("확인");
		j.add(b);
		
		Doctor d = new Doctor(nameTF, heightTF, weightTF, resultLB);
		b.addActionListener(d);
		
		j.setSize(400, 300);
		j.setVisible(true);
		
		
	}
}
