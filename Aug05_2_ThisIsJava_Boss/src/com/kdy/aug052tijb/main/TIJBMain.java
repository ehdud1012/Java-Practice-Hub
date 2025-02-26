package com.kdy.aug052tijb.main;

import com.kdy.aug052tij.avengers.Ironman;

// 업무 지시를 말로만 해서 문제 발생
// 팀장이 추상 메소드를 만들어서 팀원한테 주면 문제 없음
// 추상메소드 쓰려면 
//		추상클래스 - 상속 라인을 막음
//		인터페이스 - O
// => 팀장이 인터페이스를 만들어 주면서 업무지시

public class TIJBMain {
	public static void main(String[] args) {
		Ironman i = new Ironman();
		i.shoot();
	}
}
