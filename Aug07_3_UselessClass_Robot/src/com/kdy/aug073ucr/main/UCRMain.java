package com.kdy.aug073ucr.main;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class UCRMain {

	public static void main(String[] args) {
		try {
			Robot r = new Robot();
//			r.mouseMove(30, 1050);
			r.mouseMove(1000, 500);
			Thread.sleep(30);			
			r.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
			
			Thread.sleep(30);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_A);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
