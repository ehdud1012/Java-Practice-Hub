package com.kdy.aug071ucio.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// 이게 실전 앞에건 버려 !

// 전자기기 : 전기가 흐르거나 안흐르거나
//		ㅋ가 저장되는게 아니고 -인코딩-> 전기 신호로 바꿔서 저장 (2진수)
//			사람이 보려면 전기 신호 -디코딩-> ㅋ

// 인코딩 (encoding) : 데이터를 전기 신호의 형태로 바꾸는것
// 디코딩 (decoding) : 전기 신호 ㅎㅇ태의 데이터 원상복구
//		ㅋ -인코딩-> 1001 -디코딩-> ㅋ

// 인코딩 방식이 여러 개 
// 	ㅋ -a-> 1111 -a-> ㅋ
// 	ㅋ -b-> 0101 -c-> 뷁 (깨짐)
//	==> 인코딩 방식과 디코딩 방식이 같아야함

// 인코딩 방식
//		utf-8		: 전세계적으로 주력
//		euc-kr 		: 국내 2인자 (utf-8 다음)
//		iso-8859-1 	: MS쪽에서 기본으로 많이 (요즘은 utf-8)

public class UCMain3 {
	public static void main(String[] args) {
		Scanner ci = new Scanner(System.in);
		System.out.print("뭐 : ");
		String s = ci.next();
		System.out.println("---------------------");
		System.out.println(s);
		
		BufferedWriter bw = null;
		
		try {
			// OutputStream 개조형 : 1byte
			// 글자개념 X
			FileOutputStream fos = new FileOutputStream("C:\\KDY\\0807.txt", true);
			OutputStreamWriter ows = new OutputStreamWriter(fos, "utf-8"); // 인코딩 방식 utf-8
			bw = new BufferedWriter(ows);
			bw.write(s + "\r\n");
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		try {
//			bw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		==> 쓸데없이 기니까 / 가독성 따윈 필요 X
		try {bw.close();} catch (IOException e) {}
		
		ci.close();
	}
}
