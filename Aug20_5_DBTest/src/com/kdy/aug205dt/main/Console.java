package com.kdy.aug205dt.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.kdy.aug205dt.product.Product;

public class Console {
	private Scanner inputSystem;
	
	public Console() {
		inputSystem = new Scanner(System.in);
	}
	
	public String getProduct() { 
		System.out.print("검색 : ");
		return inputSystem.next(); // 이 경우 하나의 값만 보내면 되니까 굳이 객체 이용안하고 하기 
								   // 필요할때 객체 사용
	}
	
	public void print(ArrayList<Product> products) {
		for (Product product : products) {
			System.out.println(product.getSearchName());
			System.out.println(product.getPrice());
			System.out.println("-------------------");
		}
	}
	
	public void bye() {
		inputSystem.close();
	}
}
