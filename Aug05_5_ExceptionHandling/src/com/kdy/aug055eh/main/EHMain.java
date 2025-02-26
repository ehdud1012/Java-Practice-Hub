package com.kdy.aug055eh.main;

import java.io.FileReader;
import java.util.Scanner;

import com.kdy.aug055eh.calculator.Calculator;

// 한국어 -번역(coding)-> .java
// .java -번역(compile)-> .class (기계어)    // 여기서 번역이 안되서 에러
// .class -압축(archive)-> .jar

// error : 	java 문법에 안맞게 써서 기계어로 번역 불가능한 상태
//			최종 산출물 안나옴 => 개발자 잘못

// warning : 지저분한 소스 (필요없는거 생성 , 정리 안한거)
//			 최종 산출물 잘 나옴, 실행 문제 없음 => 개발자 잘못

// exception : 프로그램 완성, 실행 잘 되고
//			   실행할 때 외부적 요인으로 정상 실행 안되는 상태
//			   개발자 잘못은 아님, 근데 처리해줄 수 있는게 개발자뿐...
//			   ==> 개발자가 대비는 해둬야됨

/*
	try {
	// 여길 try 	-> 문제 없으면 넘어가 
	//			-> 예외가 있으면 catch 로
	} catch (예외종류 e) {
		// 대응
	
	} catch (예외종류 e) {
		// 대응
	} finally {
		예외 발생여부와는 상관없이 무조건 실행되는 부분
		리턴보다 먼저 실행
	}
*/
// 동생 의뢰
// 수학에는 나누기 0은 없음
// 프로그램 문제는 없음
// 하지만 동생이 지식이 없음 : exception
public class EHMain {
	public static void main(String[] args) {
		Scanner ci = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = ci.nextInt();
		System.out.print("y : ");
		int y = ci.nextInt();
		System.out.println("-----------------------------");
		
		int[] ar = {123,3,4,58};
		
		int result = Calculator.divide(x, y);
		System.out.println(result);
		
		try {
			int result1 = Calculator.divide2(x, y);
			System.out.println(result1);
		} catch (Exception e) {
			System.out.println("?");
		}
		
		// cc가 없을 수도 있잖아 
//		FileReader fr = new FileReader("cc");
	}
}
