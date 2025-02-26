package com.kdy.aug056eh.main;

import java.util.Scanner;

import com.kdy.aug055eh.calculator.Calculator;

public class EHMain {
	public static void main(String[] args) {
		Scanner ci = new Scanner(System.in);
		
		System.out.print("총 가격 : ");
		int price = ci.nextInt();
		System.out.print("중량 : ");
		int weight = ci.nextInt();
		System.out.println("-----------------------------");
		
		int result1 = Calculator.divide(price, weight);
		System.out.printf("g당 가격 : %d원\n", result1);
		System.out.println("-----------------------------");
		
		try {
			int result2 = Calculator.divide2(price, weight);
			System.out.printf("g당 가격 : %d원\n", result2);
		} catch (Exception e) {
			System.out.println("0은 들어갈 수 없습니다.");
		}
	}
}
