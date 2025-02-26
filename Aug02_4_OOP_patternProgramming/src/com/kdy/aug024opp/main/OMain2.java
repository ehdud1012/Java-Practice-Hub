package com.kdy.aug024opp.main;

import com.kdy.aug024opp.soldesk.LeeSangWoo;
import com.kdy.aug024opp.soldesk.Student;

public class OMain2 {
	public static void main(String[] args) {
		LeeSangWoo lsw = LeeSangWoo.getLsw();
		
		Student s1 = lsw.talk("홍길동", 20);
		s1.print();
		
		System.out.println("----------------------------------");
		Student s2 = lsw.talk("김길동", 30);
		s2.print();
	}
}
