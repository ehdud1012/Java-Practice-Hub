package com.kdy.aug204pp.main;

// MVC 패턴 - 기본
// DAO/DTO 패턴
// 		MVC 패턴인데
//		DAO에서 DB 관련 작업,
//		데이터를 DTO로 주고받는

// 한 프로젝트에 CMV 여러개 가능
// 프로그램 전체의 진입점 역할을 하는 C 
//		HomeController / MainController

public class HomeController {
	public static void main(String[] args) {
		ConsoleScreen cs = new ConsoleScreen();

		Product p = cs.getProduct();
		
		String result = ProductDAO.getInstance().reg(p);
		cs.print(result);
		
		cs.bye();
	}
}
