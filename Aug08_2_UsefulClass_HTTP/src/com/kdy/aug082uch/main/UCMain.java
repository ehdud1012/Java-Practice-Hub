package com.kdy.aug082uch.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

// - HTTP 통신 (실시간X)  : 인터넷
//		자바에 HTTP 통신 관련 클래스가 없었음 => 지금은 있다는 소리 ^ㅁ^
//		==> 자바는 (요청, 응답, Get) 등의 코드 생략이 있어서 처음 보기에는 1번이 좋음

public class UCMain {
	public static void main(String[] args) {
		
		// HttpURLConnection huc = null;
		HttpsURLConnection huc = null; // 서버 주소에 따라서 골라서 쓰기
		
		try {
			String s = "https://sdgn-djvemfu.tplinkdns.com/";
			// URL u = new URL(s); // 바뀜 ==>
			URL u = URI.create(s).toURL();
			huc = (HttpsURLConnection) u.openConnection(); // 형변환해서 사용 : 서버 연결

			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		huc.disconnect();
	}
}
