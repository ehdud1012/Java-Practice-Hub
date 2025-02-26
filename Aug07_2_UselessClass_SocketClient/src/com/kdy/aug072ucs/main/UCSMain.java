package com.kdy.aug072ucs.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

// 클라이언트

// 자기 컴 : 	진짜 내 IP주소 쓰기
// 			127.0.0.1 = 내 컴이라는 뜻
//			localhost

public class UCSMain {
	public static void main(String[] args) {
		
		Socket s = null;
		Scanner ci = new Scanner(System.in);
		try {
			// 서버 접속, 통신 채널이 s
			s = new Socket("192.168.0.57", 624);
//			s = new Socket("192.168.0.56", 1012); 
			System.out.println("클라이언트 접속 성공");
			
			OutputStream os = s.getOutputStream(); // 보낼 빨대
			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			InputStream is = s.getInputStream();
			InputStreamReader isw = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isw);
			
			String msg;
			while (true) {
				System.out.print("뭐 : ");
				msg = ci.next(); // 콘솔창이라서 띄어쓰기 XX
				
				bw.write(msg + "\r\n");
				bw.flush();
				
				System.out.println(br.readLine());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		ci.close();
		try {s.close();} catch (IOException e) {}
	}
} 
