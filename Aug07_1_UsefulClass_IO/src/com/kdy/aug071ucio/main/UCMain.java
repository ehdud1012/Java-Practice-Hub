package com.kdy.aug071ucio.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// RAM :  저장장치 -변수 형태로 임시 저장
// HDD : 저장장치 - 파일 형태로 영구 저장

// Windows 	: \로 구분 
//			  대소문자 구별 X
//			  C: 로 시작

// Linux	: /로 구분
//			  대소문자 구별 O
//			  /로 시작

public class UCMain {
	public static void main(String[] args) {
	Scanner ci = new Scanner(System.in); // 얘도 빨대라서 닫아야함
		System.out.print("뭐 : ");
		String s = ci.next();
		System.out.println("---------------------");
		System.out.println(s);
		
		BufferedWriter bw = null;
		try {
			// FileWriter : OutputStreamWriter 개조형, 파일처리하기 쉽게
			// 프로그램 -> 장치 : 2bytes
			
//			FileWriter fw = new FileWriter("C:\\KDY\\0807.txt"); // 파일은 만들어줌 / 폴더는 안만들어줌 - 있는거 사용
			FileWriter fw = new FileWriter("C:\\KDY\\0807.txt", true); // 전에 거 안지우고 붙여서 쓰기
			bw = new BufferedWriter(fw);
			
			bw.write(s + "\r\n"); // \n 만 적었을 경우 깨질 위험 있음
			bw.flush(); // 빨대 용량만큼 안채워도 강제 전송 
			// 용량을 안채웠을 경우 안적으면 파일에 안적힘
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			bw.close(); // 닫아야 다른 프로그램에서 사용 가능
						// 연관된 것 중 하나만 닫으면 다 처리됨 (bw or fw)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		ci.close();
	}
}
