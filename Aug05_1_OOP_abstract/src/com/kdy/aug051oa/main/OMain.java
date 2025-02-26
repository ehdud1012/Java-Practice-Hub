package com.kdy.aug051oa.main;

import com.kdy.aug051oa.avengers.Avengers;
import com.kdy.aug051oa.avengers.Hulk;
import com.kdy.aug051oa.avengers.Ironman;

public class OMain {

	public static void main(String[] args) {
		
		// 자바는 객체를 만들어서 1회용 클래스도 생성 가능
		// 익명 내부 클래스 anonymous inner class
		Avengers a = new Avengers() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("방패 던지기");
			}
		};
		
		Ironman i = new Ironman("토니", 35, "자비스");
		i.printInfo();
		i.attack();
		i.eat();
		i.fly();
		
		System.out.println("-------------------------------");

		Hulk h = new Hulk("배너", 40, 88);
		h.printInfo();
		h.attack();
	}
}
