package com.kdy.aug122uct.main;

import javax.swing.JFrame;
import javax.swing.JTextArea;

// 2) Runnable 인터페이스를 구현하는 클래스
public class KdyThread2 implements Runnable{

	@Override
	public void run() {
		JFrame jf = new JFrame();
		JTextArea jta = new JTextArea();
		jf.add(jta);
		jf.setSize(200,200);
		jf.setLocation(200,0);
		jf.setVisible(true);
		
		for (int i = 0; i < 8; i++) {
			jta.append("^ㅁ^/\r\n");
			
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
