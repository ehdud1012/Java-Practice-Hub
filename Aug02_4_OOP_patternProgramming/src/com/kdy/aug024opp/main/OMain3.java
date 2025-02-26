package com.kdy.aug024opp.main;

import com.kdy.aug024opp.car.Car;
import com.kdy.aug024opp.car.Carfactory;

public class OMain3 {

	public static void main(String[] args) {
		
		Car c1 = Carfactory.made(1);
		c1.print();
		System.out.println("--------------------------");
		
		Car c2 = Carfactory.made(3);
		c2.print();
		
		System.out.println("--------------------------");
		
		Car c3 = Carfactory.made(2);
		c3.print();
		
		System.out.println("--------------------------");
	}
}
