// 클래스명 중복 안됨
// 		- 하지만 OOP는 실생활 묘사인걸
// 		- 자바는 작업물 공유하는 문화도 있는데
//			=> 중복안되게 못함

// package : 클래스명이 중복될 때 구분할 수 있는 수단, 정리차원
//			모든 클래스는 패키지 안에 넣기

//		패키지명까지 중복되면 => 망한거임 ㅇㅇ;; -> 이건 진짜 중복안되게 잘 짓기
//		패키지명 짓는 문화 (*약속*)
//			회사명.		프로그램명.카테고리
//			com.soldesk.mspaint.product

// 객체 생성
//		패키지명.클래스명 변수명 = new 패키지명.생성자;

// 패키지명 생략 가능한 상황
//		- Java 의 기본패키지(java.lang) 소속
//		- 작업중인 클래스랑 같은 패키지 소속
//		- import 한 클래스


package com.kdy.aug021opi.main;

// import 
//		OMain2에서 Scanner 라고 쓰는거는 무조건 내꺼 (콘솔 입력 안쓸거면)
import com.kdy.aug021opi.product.Scanner;

public class OMain2 {
	public static void main(String[] args) {
		java.util.Scanner ci = new java.util.Scanner(java.lang.System.in);
		
		// 문자열 객체
//		java.lang.String s = new java.lang.String("안녕하세요");
		String s = new String("안녕하세요");
		java.lang.System.out.println();
		
		Scanner sc = new Scanner("캐논", 500000);
		
	}
}
