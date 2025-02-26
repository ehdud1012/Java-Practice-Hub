package com.kdy.aug061ucd.main;

import java.io.StreamTokenizer;
import java.util.StringTokenizer;

// 
public class UCMain {
	public static void main(String[] args) {
//		String s = new String("zz"); // 원래 문법
		
		String s = "훈련과정 수기 출석부"; // 기본형 아님
		
		// 찾아서 쓰기 ** 영어
		// s에서 두번째 글자
		System.out.println(s.charAt(1));
		
		// 수기의 위치
		System.out.println(s.indexOf("수기"));
		
		// 총 글자수
		System.out.println(s.length());
		
		// 출석부로 끝나는지
		System.out.println(s.endsWith("출석부"));
		
		// 훈련이란 말이 들어있는지
		System.out.println(s.contains("훈련"));
		
		// 훈련과정을 수업으로 바꿔서
		System.out.println(s.replace("훈련과정", "수업"));
		
		// 찾기 애매
		// 형식 잡아서 문자열 생성
		String s2 = String.format("pi : %.2f\n", 3.1456);
		System.out.println(s2);
		
		
		// String : 수정불가능한 문자열 객체
		// 이런식으로 문자열 붙이기 - XXX / 번지수 변경됨 그전 번지는 GC
		String s3 = "zzz";
		s3 = s3.concat("ggg"); 
		s3 += "dd";
		s3 += "bb";
		System.out.println(s3);
		
		// 수정가능한 문자열 객체 
		// 문자열 대량으로 붙이기
		StringBuffer sb = new StringBuffer("ㅎㅎㅎ");
		sb.append("ㅋㅋㅋ"); // 번지수 교체없이 변경가능
		
		// StringBuffer -> String
		String s4 = sb.toString();
		System.out.println(s4);
		
		// 문자열 분리 // 무조건 XX => 유리하다는거임
		// 비정형 데이터 - 두번째 자리 있는게 의미 없 ==> 분리 필요 없음
		String s5 = "뭐가 있음 뿌우우"; 
		StringTokenizer st = new StringTokenizer(s5," "); // 띄어쓰기에 따라 분리
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken()); 
//		System.out.println(st.nextToken()); 
//		==> while 문으로 
		while(st.hasMoreTokens()) { // 아직 다음게 있니?
			System.out.println(st.nextToken());
		}
		
		// 정형 데이터
		String s6 = "2024/08/06/17/20"; 
		String[] s6ar = s6.split("/"); // / 기준으로 배열로 만들어버리기
		System.out.println(s6ar[1]);

	}
}
