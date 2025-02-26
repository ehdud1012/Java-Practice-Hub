package com.kdy.aug051oa.avengers;

// 어벤져스 : 형체가 없는 추상적인 개념

// abstract class 
//		형체가 없는 추상적인 개념
//		객체 생성 불가
//		추상메소드 하나라도 가지면 추상클래스여야 함
public abstract class Avengers {
	
	private String name;
	private int age;
	
	public Avengers() {
		// TODO Auto-generated constructor stub
	}

	public Avengers(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
	
	// 상속 쓰려고 만들었는데 내용은 ??
	
	// abstract 메소드 (추상메소드) : 내용 없는 메소드
	//		하위 클래스에서 반드시 오버라이딩해야됨
	public abstract void attack();
	
}
