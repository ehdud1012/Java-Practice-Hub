package com.kdy.aug203pp.main;

// singleton 패턴 : only one 객체
// factory 패턴	 : 대놓고 여러개 찍는데, 그와중에 무언가 자동화

// MVC패턴 (실무)	 : 파일을 나눠서 작업
//		어떤 파일 하나는 M/V/C 중에 하나의 역할만 하도록
//		Model : 비즈니스 로직 [실제 계산] (백엔드 개발자)
//		View : 실제 사용자 눈에 보이는 (프론트엔드 개발자, 디자이너)
//		Controller : 흐름 제어 [상황 판단 후 M,V 소환] (PL급 개발자)
//					 농구로 치면 포인트 가드

// 개발 프로젝트 : 수많은 사람들과 함께
// 하나의 파일은 혼자 하는게 편함

//-----------------------------------------------------------
// Controller 
//		상황 판단해서 M/V 소환
//		프로그램 전체의 진입점 = main
//		리더급 개발자
public class C {
	public static void main(String[] args) {
		V v = new V();
		int x = v.getX();
		int y = v.getY();
		int z = M.calculate(x, y);
		v.print(z);
		v.bye();
	}
}
