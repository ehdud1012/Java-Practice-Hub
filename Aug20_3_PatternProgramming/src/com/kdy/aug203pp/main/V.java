package com.kdy.aug203pp.main;

import java.util.Scanner;

// View 
//	시용자 눈에 보이는
//	입력받고, 출력하고
//	프론트엔드 개발자, 디자이너

// V 		 : 콘솔창
// system.in : 콘솔창 -> 프로그램 빨대 (InputStream)
// Scanner 	 : InputStream 서포터 : 한번 닫으면 다시 사용 불가능 
public class V { 
	private Scanner inputSystem;
	
	public V() {
		inputSystem = new Scanner(System.in);
	}
	
	public int getX() {
		System.out.print("x : ");
		return inputSystem.nextInt();
	}
	
	public int getY() {
		System.out.print("y : ");
		return inputSystem.nextInt();
	}
	
	public void print(int z) {
		System.out.println(z);
	}
	public void bye() {
		inputSystem.close();
	}
}
