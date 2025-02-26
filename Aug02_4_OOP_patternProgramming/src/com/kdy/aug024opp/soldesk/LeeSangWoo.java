package com.kdy.aug024opp.soldesk;


// 2) 같은 패키지에 factory 역할을 할 클래스를 추가
public class LeeSangWoo {

	private int studentCount;
	private static final LeeSangWoo LSW = new LeeSangWoo();
	
	private LeeSangWoo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static LeeSangWoo getLsw() {
		return LSW;
	}
	
	// 3) 학생 객체를 찍어낼 메소드
	// 4) 자동화쪽은 프로그램마다 다름 / 패턴 XX
	public Student talk(String name, int age) {
		studentCount++;
		return new Student(studentCount, name, age);
	} 
	
}
