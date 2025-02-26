package com.kdy.aug021opi.main;
import java.util.Scanner;

import com.kdy.aug021opi.product.Phone;
import com.kdy.aug021opi.product.Snack;

// 클래스명 중복 안됨
// 		- 하지만 OOP는 실생활 묘사인걸
// 		- 자바는 작업물 공유하는 문화도 있는데
//			=> 중복안되게 못함
// package : 클래스명이 중복될 때 구분할 수 있는 수단   =====> OMain2 로
public class OMain {
	public static void main(String[] args) {
		Snack s = new Snack("새우깡", 2000, "내일");
		s.print();
		System.out.println("------------------------------------");
		
		Phone p = new Phone("갤23", 500000, "안드로이드"); 
		p.print();
		System.out.println("------------------------------------");
		
		// Scanner c = new Scanner("캐논", 600000); 중복 안댐
		// c.print();
		
		System.out.println("------------------------------------");
		
		Scanner ci = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = ci.next();
		System.out.println(name);
		
	}
}
