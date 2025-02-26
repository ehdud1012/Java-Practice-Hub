package com.kdy.aug055eh.calculator;
 
// 동생 의뢰
// 나눗셈 기능 	- 이 프로젝트에서만 사용될 기능인가?
//			- 온갖 프로젝트에 들어갈 기능

// 

//  실전
//  main : 사수
//  calculator : 나 
//  ==> 1) 방법으로 하기 ..^^
//  헉 ! 2)이 주력이래 ..!!
  
//  library
  
//  1) 직접처리
//		- 대응 방법까지 내장 -> 다른 프로젝트에서 사용하기가 ..
//		- 문제 발생에 대응을 신입이 하는가?

//		try {
// 			여길 try 	-> 문제 없으면 넘어가 
//					-> 예외가 있으면 catch 로
//		} catch (예외종류 e) {
//			// 대응
//
//		} catch (예외종류 e) {
//			// 대응
//		}	 finally {
//			예외 발생여부와는 상관없이 무조건 실행되는 부분
//			리턴보다 먼저 실행
//		}

//		y에 1 : 6 - 7 - 8 - (13 - 14 - 15) - 9
//		y에 0 : 6 - 7 - 8 으악 - 10 - 11 - (13 - 14 - 15) - 12

//	2) 미루기
//		throws

// try, throws 
//		무슨 코드가 위험한지 어떻게 아나
//		=> 	위험한 코드들은 예외처리를 안하면 에러 표시
//			처리를 안하고 싶어도 해야됨

public class Calculator {
	public static int divide(int x, int y) {
		try {
			int z = x/y;
			return z;
		} catch (Exception e) {
			System.out.println("야");
			return -999;
		} finally {
			System.out.println("끝");
		}
//		System.out.println("끝");
	}
	
	// divide2를 수행하다가 Arith 터진거는 divide2 호출한 쪽에서 처리하라고 미루기 
	public static int divide2(int x, int y) throws ArithmeticException {
		int z = x/y;
		return z;
	}
}
