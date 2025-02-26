package com.kdy.aug122uct.main;

import javax.swing.JFrame;
import javax.swing.JTextArea;

// 멀티스래드 만들기

// 1) Thread 를 상속받는 클래스 - 흠
public class KdyThread extends Thread {

	@Override
	public void run() {
		super.run();
		
		JFrame jf = new JFrame();
		JTextArea jta = new JTextArea();
		jf.add(jta);
		jf.setSize(200,200);
		jf.setVisible(true);
		
		
		for (int i = 0; i < 8; i++) {
			jta.append("ㅠ.ㅠ\r\n");
			
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
