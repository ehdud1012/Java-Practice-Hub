package com.kdy.aug201a.human;

public class Human {
	public void ready() {
		System.out.println("씻고");
		System.out.println("옷입고");
		System.out.println("엘베");
	}
	public void goAcademy() {
		// System.out.println("학원가유"); => 제대로 작성해보자
		ready();
		System.out.println("버스타고");
		System.out.println("내려서 조금 걸어");
		System.out.println("학원 도착 !");
	}
	public void goMart() {
		// System.out.println("마트가유");
		ready();
		System.out.println("차끌고");
		System.out.println("주차하면");
		System.out.println("마트 도착 !");
	}
	public void goPark() {
		// System.out.println("공원가유");
		ready();
		System.out.println("걸어가면");
		System.out.println("공원 도착 !");
	}
}
