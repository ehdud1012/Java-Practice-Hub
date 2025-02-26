package com.kdy.aug072ucs.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
// 안 유용한데 쓰일 수 있음
import java.util.Scanner;

// 통신 	- Socket 통신 (실시간) : 카톡
//		- HTTP 통신 (실시간X)  : 인터넷
//		IP주소	: 192.168.0.56 (시작 -> cmd -> ipconfig -> IPv4주소)
//		포트번호 	: 알아서 적으셈 (무슨 서비스 이용하는지)
//			1 ~ 65536 - 중 하나
//			IT 바닥에서 약속되어 이미 사용되고 있음 - 보통 2자리
//			새로운 서비스를 만들려면 - 3자리 이상


// 단점 
// 1) 띄어쓰기 X
// 2) 입출력 공간이 콘솔창 하나
// 3) 동시에 여러 작업 불가 - 상대방과 실시간 채팅 불가 
// 서버

public class UCSMain {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Scanner ci = new Scanner(System.in);
		try {
			ss = new ServerSocket(1012); // 1012번 포트를 써서 소켓서비스 시작 (서버 시작)
			System.out.println("서버 : 대기중");
			
			// 클라이언트가 접속할 때까지 프로그램 멈춰 
			// 서버 접속, 통신 채널이 s 
			Socket s = ss.accept();  
			System.out.println("서버 : 누가 접속");
			
			OutputStream os = s.getOutputStream(); // 보낼 빨대
			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			InputStream is = s.getInputStream();
			InputStreamReader isw = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isw);
			
			String msg;
			while (true) {
				System.out.println(br.readLine());

				System.out.print("뭐 : ");
				msg = ci.next(); // 콘솔창이라서 띄어쓰기 XX
				
				bw.write(msg + "\r\n");
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {ss.close();} catch (IOException e) {}
	}
}
