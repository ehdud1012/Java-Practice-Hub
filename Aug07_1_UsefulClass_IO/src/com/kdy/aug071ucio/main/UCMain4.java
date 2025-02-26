package com.kdy.aug071ucio.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// FileReader, FileWriter : 인코딩 방식 쓰는 생성자 존재 (올해 초)
// 		=> 최신버전에 추가됨 = 회사에서 낮은 버전을 사용할 가능성 높음
//		===> 3,4번 방식을 하는게 좋음

public class UCMain4 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\KDY\\0807.txt");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {br.close();} catch (IOException e) {}
	}
}
