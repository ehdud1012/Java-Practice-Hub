package com.kdy.aug082uch.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

// parsing : 필요없는 부분 제거 나타내는 것

// HTML : 웹사이트 만드는 디자인 언어 

// 서로 데이터를 주고 받을 때 표준화된 형식이 있어야할 것
//		XML : 데이터를 HTML 모양으로 표현
//		JSON : 데이터를 JavaScript 모양으로 표현

// => XML parsing : java 에 XMLParsing만 해주는 클래스 없음
//					(안드로이드폰에 내장) kxml.jar
// XML 구성
//	<시작 태그> 글자 </종료 태그> ==> DOM (Document Object Model) 객체

// Java : 중앙제어시스템 (maven, grable)
public class UCMain2 {
	public static void main(String[] args) {
		HttpsURLConnection huc = null; // 서버 주소에 따라서 골라서 쓰기

		try {
			URL u = URI.create("https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4159061000").toURL();
			huc = (HttpsURLConnection) u.openConnection(); // 형변환해서 사용 : 서버 연결

			InputStream is = huc.getInputStream();

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8"); // xpp.setInput(isr);

			// 그게 (시작/글씨/종료) 뭐야?
			int what = xpp.getEventType();
			String tagName;
			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					if (tagName.equals("hour") || tagName.equals("temp") || tagName.equals("wfKor")) {
						xpp.next();
						what = xpp.getEventType();
						System.out.println(xpp.getText());
					}
				} else if (what == XmlPullParser.END_TAG) {
					tagName = xpp.getName();
					if (tagName.equals("wfKor")) {
						System.out.println("----------------");
					}
				}
				// tagName = "";

				xpp.next();
				what = xpp.getEventType();

//				if (what == XmlPullParser.START_TAG) {  // 가져온게 시작태그임?
//					System.out.println(xpp.getName());
//				}
//				else if (what == XmlPullParser.TEXT) {  // 가져온게 글자임?
//					// System.out.println(xpp.getText());
//				}
//				else if (what == XmlPullParser.END_TAG) {  // 가져온게 종료태그임?
//					System.out.println(xpp.getName());
//				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		huc.disconnect();
	}
}
