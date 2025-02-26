package com.kdy.aug081uch.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// 통신 	- Socket 통신 (실시간) : 카톡
//			IP주소	: 192.168.0.56 (시작 -> cmd -> ipconfig -> IPv4주소)
//			포트번호 	: 알아서 적으셈 (무슨 서비스 이용하는지)
//			1 ~ 65536 - 중 하나
//			IT 바닥에서 약속되어 이미 사용되고 있음 - 보통 2자리
//			새로운 서비스를 만들려면 - 3자리 이상
//		--------------------------------------------------- ^ 8/7

//		- HTTP 통신 (실시간X)  : 인터넷
// 			자바에 HTTP 통신 관련 클래스 X => 만들어야함
//			apache.org 에서 .jar 파일 사용 (자바는 공유하는 문화이기 때문에)
//				HTTP 서버는 가져와서 사용  / 클라이언트만 작업

// Http 통신 : request -> response (요청하면 답을 주는 것)
//	- Get 방식 (기본)
//	- Post 방식

public class UCMain {
	public static void main(String[] args) {
		try {
			DefaultHttpClient dhc = new DefaultHttpClient();
			
			// Get 방식 요청 객체
			HttpGet hg = new HttpGet("https://soldesk.com/");  // 서버 주소
			HttpResponse hr = dhc.execute(hg);
		
			// 응답 내용
			HttpEntity he = hr.getEntity();
			
			InputStream is = he.getContent();
			InputStreamReader isw = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isw);

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
