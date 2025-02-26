package com.kdy.aug201a.main;

import com.kdy.aug201a.human.Human;

// PP : 절차지향
// OOP : 객체지향 : 리얼월드를 묘사 -> 유지보수에 용이

// AOP (Aspect Oriented Programming) : 관점 지향 프로그래밍 ==> 현대
//		객체지향 버전업
// 		OOP을 다른 관점으로
//		공통된거 정리
public class Amain {
	public static void main(String[] args) {
		Human h = new Human();
		h.goAcademy();
		h.goMart();
		h.goPark();
	}
}
// ==> 19-2로 가서 정리