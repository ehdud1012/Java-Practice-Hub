package com.kdy.aug024opp.soldesk;

// 객체가 필요하긴 한가
//		필요없음 (멤버변수 X) : static 메소드 기반
//		필요함 (멤버변수 O) 
//			- 딱 하나 : 싱글톤
//			- 여러 개 : 작정하고 여러개를 만드는데 뭔가 자동화된거 필요
//						=> factory 패턴

// factory 패턴 

public class Student {
	private int number;
	private String name;
	private int age;
	
	// 1) 생성자를 protected / (default) : 다른 패키지(다른 프로그램)에서 못만들게
	// 2) 같은 패키지에 factory 역할을 할 클래스를 추가  ==> class LeeSangWoo 로
	Student() {
		// TODO Auto-generated constructor stub
	}

	protected Student(int number, String name, int age) {
		super();
		this.number = number;
		this.name = name;
		this.age = age;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.println(number);
		System.out.println(name);
		System.out.println(age);
	}
}
