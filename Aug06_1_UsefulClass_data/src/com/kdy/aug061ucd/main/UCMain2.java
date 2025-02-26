package com.kdy.aug061ucd.main;

// 기본형이 heap 에 데이터가 있어야 하는 경우가 존재

// Wrapper Class
//		기본형에 해당하는 객체
//		기본형 비슷한데 첫글자가 대문자
//			Double
// 			Boolean
// 			Integer
public class UCMain2 {
	public static void main(String[] args) {
		int a = 10;						// stack 에 저장
		Integer aa = new Integer(10);	// heap 에 저장 / stack 에는 번지값
		
		// 기본형 -> 객체형 : 생성자
		// 자동으로 해줌 : autoboxing
		double b = 1.23;
		Double bb = new Double(b); // deprecated : 쓰지마
		
		// 객체형 -> 기본형 : 변수.(자료형)Value
		// 자동으로 해줌 : autounboxing
		double bbb = bb.doubleValue();
		
		boolean c = true;
		Boolean cc = c; // 자동
		boolean ccc = cc;
		
		int i = 10;
		Integer ii = 10; // 둘이 다름 
	
		// 어디서 데이터 가져오면 다 String
		String s = "30.5";
		// String -> 기본형 : 힝 못가 ㅠㅅㅠ
		// String -> 객체형 : 객체형.parse객체형(변수);
		Double ss = Double.parseDouble(s);
		// 객체형 -> 기본형
		double sss = ss; // 이건 자동이니까
		
		// 최종 ==>
		String s2 = "55";
		int s22 = Integer.parseInt(s2);
		
		// 기본형 -> String : 기본형 + "";
		int d = 20;
		String dd = d + ""; // = String.format("%d",d);
	}
}
