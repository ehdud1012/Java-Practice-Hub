package com.kdy.aug062ucio.main;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

// 입출력

// Java :  규칙의 언어 -> 평온, 융통성이 없을 정도로 체계화, 통일된 시스템
// Stream : Jave 특유의 통일된 시스템 / 모든 입출력 장치에 붙어놓은 빨대

// Stream 급 빨대 (정식용어 XX)
// 		Reader/Writer 급 빨대
//			Buffered 급 빨대

// 기본형 : 	java 가 IO장치에 Stream 급 빨대를 붙어놨음
//			근데 용량작아서 덧씌워서 씀 (Stream 급 < Reader/Writer 급 < Buffered 급)

//	- InputStream : 장치 -> 프로그램 : 1byte씩 ==> 1번으로는 한글자(2byte)도 안댐
//		InputStreamReader : 2bytes
//			BufferedReader : 1String (line 단위) =>  어쨋든 큼

//	- OutputStream : 프로그램 -> 장치 : 1byte씩
//		OutputStreamWriter : 2bytes
//			BufferedWriter : 1String (line 단위) =>  어쨋든 큼

// 개조형 예시
//		FileReader : InputStreamReader 개조, 파일처리하기 쉽게
//		PrintStream : OutputStream 개조, 용이한 메소드를 추가

public class UCMain {
	public static void main(String[] args) {
		
		// System.out : 콘솔창에 붙어있던 (프로그램 -> 콘솔창) 빨대
		PrintStream ps = System.out;
		ps.println("z");
		
		// System.in : 콘솔창에 붙어있던 (콘솔창 -> 프로그램) 빨대
		InputStream is = System.in; // Scanner 에서 썼던
		
		// 1.5 때 추가된, InputStream 사용 도와주는 존재
		Scanner isSupporter = new Scanner(is);
		
	}
}
