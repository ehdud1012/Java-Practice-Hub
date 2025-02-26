package com.kdy.aug051oa.human;

// 되는것
// 		class : 추상메소드 불가
//			멤버변수 / 멤버상수 / 일반 메소드 
//		abstract class : 객체 생성 불가
//			멤버변수 / 멤버상수 / 일반 메소드 / 추상메소드
// 		interface : 객체 생성 불가
//			멤버상수 / 추상메소드
public interface Human {
//	int a; // 멤버변수 XX
	
	static final int B = 3; // 상수 OO
	
//	public void c() {} // 일반 메소드 XX
	
	public abstract void eat(); // 추상메소드 OO
		
	
}
