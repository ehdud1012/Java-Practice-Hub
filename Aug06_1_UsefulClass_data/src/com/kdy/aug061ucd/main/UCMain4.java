package com.kdy.aug061ucd.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 책 안쓰는 이유, 코드 안외우는 이유

// 만든 기능이 세월이 흘러 그 기능이 안맞는 때가 옴 ex) 날짜, H/W
// 		=> 업그레이드 or 삭제 후 신제품
// deprecated : 업그레이드 or 삭제하고 신제품을 만들 계획이 있음
//  			유예기간 (다음버전에 없어질 수도 있음)
//				==> 그래서 쓰지마셈


// 버전 
//	1.5.12
//	1 : major 버전
//	5.12 : minor 버전 (앞자리가 바뀔수록 크게 바뀜)

//	0.x.x : 프로그램 미완성
//	1.0.0 : 프로그램 완성

//	1.0.1 : 업그레이드는 됐는데 체감은 안됨
//	1.1.0 : 체감되는 업그레이드
//	2.0.0 : 새로운 프로그램 (완전 바뀜)

// 우리가 쓰는 자바 : 1.8 -> 1.17 (이 두개가 주력)

public class UCMain4 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		// 다 따로
		System.out.println(now.getYear()); // 년 : 자바가 1996년에 만들어서 2000년대를 생각안함
		System.out.println(now.getMonth()); // 월 : 배열처럼 0부터 시작해서
		System.out.println(now.getDate()); // 일
		
		// 통합(마음대로)
		// Date -> String
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM/dd");
		String now2 = sdf.format(now);
		System.out.println(now2);
		
		// 특정 시간
		try {
			String xmas = "2023-12-25";
			// String -> Date
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
			Date xmas2 = sdf2.parse(xmas);
			System.out.println(xmas2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
