package com.kdy.aug024opp.kdy;

// static 멤버변수 : 객체들의 공통속성
// 나는 하나 -> static 쓸 상황 XX
//   ==> singleton 패턴

// singleton 패턴 : 오직 하나뿐인 객체

public class KimDoYoung {
	private String name;
	private int age;
	private String home;
	
	// 2) 내부에서 객체 하나만 생성 - 수정 불가능하게
	private static final KimDoYoung KDY = new KimDoYoung("김도영", 21, "동탄");
	
	// 1) 생성자들 private : 외부에서 객체 못만들게
	private KimDoYoung() {
		
	}

	public KimDoYoung(String name, int age, String home) {
		super();
		this.name = name;
		this.age = age;
		this.home = home;
	}
	
	// class
	// object / instance
	
	// 3) getter : getInstance 라는 이름도 꽤 씀
	public static KimDoYoung getKdy() {
		return KDY;
	}

	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(home);
	}
	
	
}
