package com.kdy.aug025op.main;

import com.kdy.aug025op.human.Guard;
import com.kdy.aug025op.human.Human;
import com.kdy.aug025op.human.Student;

// 변수 : 데이터 담는 그릇
// 자료형 : 그릇 종류
// 그릇 종류에 안맞는거 못씀

// polymorphism (다형성)
//		상위타입 변수에 하위타입 객체 담기 가능
//		최종적으로는 하위타입 객체
public class OMain {
	
	public static Human make(int a) {
		if (a==1) {
			return new Student();
		}
		return new Guard();
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		
		// 휴먼 안에 학생을 담음
		Human h = new Student();
		// h는 휴먼일까 학생일까
		//		학생
		h.print();
		
		h = new Guard();
		h.print();
		
		
		
	}
}
