package com.kdy.aug061ucd.main;

import java.util.Scanner;
import java.util.StringTokenizer;

public class UCMain3 {
	public static void main(String[] args) {
		Scanner ci = new Scanner(System.in);
		System.out.print("숫자 (a,b,c, ...) : ");
		String s = ci.next();
		int sum = 0;
		
//		데이터가 많을 경우 과부화올 가능성 높음 StringTokenizer 사용하기
//		int a;
//		String[] sAr = s.split(",");
//		for (int i = 0; i < sAr.length; i++) {
//			try {
//				a = Integer.parseInt(sAr[i]);
//				sum += a;
//			} catch (NumberFormatException e) {
//				
//			}
//		}
//		System.out.println(sum);
		 
		StringTokenizer st = new StringTokenizer(s,",");
		
		while (st.hasMoreTokens()) {
			try {
				sum += Integer.parseInt(st.nextToken());
			} catch (NumberFormatException e) {
				
			}
		}
		System.out.println(sum);
	}
	
}
