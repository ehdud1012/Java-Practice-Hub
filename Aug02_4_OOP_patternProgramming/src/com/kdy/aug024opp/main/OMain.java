package com.kdy.aug024opp.main;

import com.kdy.aug024opp.kdy.KimDoYoung;

public class OMain {
	public static void main(String[] args) {
		
		// KimDoYoung kdy = new KimDoYoung("김도영", 21, "경기도 화성시 동탄");
		
		KimDoYoung kdy = KimDoYoung.getKdy();
		kdy.print();
		
		KimDoYoung kdy2 = KimDoYoung.getKdy();
		kdy2.print();
		System.out.println("------------------------------------------");
		
		
		
	}
}
