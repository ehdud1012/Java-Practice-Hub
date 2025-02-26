package com.kdy.aug023oe.main;

import java.util.Scanner;

import com.kdy.aug023oe.computer.Computer;
import com.kdy.aug023oe.computer.NoteBook;
import com.kdy.aug023oe.drink.Coffee;

// encapsulation (캡슐화)

public class OMain {
	public static void main(String[] args) {
		NoteBook n = new NoteBook("i5-1234", 16, 500, 3);
		n.print();
		
		System.out.println("-------------------------");
		
		Coffee c = new Coffee("아메리카노", 4000);
		c.print();
		
		System.out.println("-------------------------");
		
		// c.price = 5000;
		c.print();
		System.out.println("-------------------------");

		Scanner ci = new Scanner(System.in);
		System.out.print("수정할 가격 : ");
		// c.price = ci.nextInt(); 직접 접근 XX
		c.setPrice(ci.nextInt()); // 그 통로를 통해서만 가능
		System.out.println(c.getPrice());
		c.print();
	}
}
