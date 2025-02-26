package com.kdy.aug071ucio.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 파일 읽어오기

public class UCMain2 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			// FileReader : InputStreamReader 개조형
			// 장치 -> 프로그램 : 2byte
			FileReader fr = new FileReader("C:\\KDY\\0807.txt");
			br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
