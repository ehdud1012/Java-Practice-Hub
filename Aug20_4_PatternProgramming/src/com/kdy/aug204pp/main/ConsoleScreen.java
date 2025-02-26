package com.kdy.aug204pp.main;

import java.util.Scanner;

public class ConsoleScreen { // V
	private Scanner inputSystem;
	
	public ConsoleScreen() {
		inputSystem = new Scanner(System.in);
	}
	
	public Product getProduct() {
		System.out.print("품명 : ");
		String name = inputSystem.next();
		System.out.print("가격 : ");
		int price = inputSystem.nextInt();
		
		return new Product(0, name, price);
	}
	
	public void print(String result) {
		System.out.println(result);
	}
	
	public void bye() {
		inputSystem.close();
	}

}
