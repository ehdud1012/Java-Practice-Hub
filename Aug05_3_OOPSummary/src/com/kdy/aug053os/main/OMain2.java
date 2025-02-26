package com.kdy.aug053os.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.kdy.aug053os.hero.Hulk;

// 클래스 만들지 말고 X
// OMain 과 비교하며 하기
// JAVA GUI
public class OMain2 {
	public static void main(String[] args) {
		// 타이틀이 지구는 JFrame
		JFrame j = new JFrame("지구");
		
		// 텍스트가 홍길동인 JButton
		JButton t = new JButton("홍길동");
		
		// 텍스트가 홍길동인 JTextField
		//JTextField f = new JTextField("홍길동");
		// 그냥 JFileChooser
		//JFileChooser c = new JFileChooser();
		
		j.add(t);
		
		Hulk h = new Hulk();
		
		t.addActionListener(h); // == 찜
		// 버튼 누르면 찜
		// 꽥 - 공격
		// 클릭 ->  actionPerformed
		
		j.setSize(500, 300);
		j.setVisible(true);
		
	}
}