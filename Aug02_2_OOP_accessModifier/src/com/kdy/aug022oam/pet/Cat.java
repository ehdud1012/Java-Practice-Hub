package com.kdy.aug022oam.pet;

// access modifier (접근제한자)
// 		멤버들의 접근을 제어
//		- public	: 어디서든 다 사용
//		- protected	: 같은 패키지 or 다른패키지인데 상속관계 
//				Tester3에서 오류 => 실무자만 알고 있음
//				==> 그냥 같은 패키지에서만!
//				그래서 protected 와 default 가 같아져버림

//		- (default) : 같은 패키지
//		- private	: 이 클래스 내부에서만

// => 조절해서 쓰기 ^ㅁ^/

public class Cat {
	String name;
	int age;
	
	public int a;
	protected int b;
	int c;
	private int d;
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	} 
	
	public void print() {
		System.out.println(name);
		System.out.println(age);
	}
}
