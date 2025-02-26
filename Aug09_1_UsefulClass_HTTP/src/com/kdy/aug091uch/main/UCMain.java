package com.kdy.aug091uch.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.kdy.aug091uch.sc.StringCleaner;

// 네이버 뉴스 검색

// J3ex8lwJZO0JU8nonIoa
// oXpEo7AifR

// HTTP 통신
//	요청할 때 서버측에 보내주는 정보
//		- request parameter (주소에)
//		- request header	(내부적으로)

// 	https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%8F%84%EA%B2%BD%EC%88%98
//	통신방식://	서버주소		/	파일명	 ?  변수명 = 값    & 변수명 = 값 & 변수명 = 값 & 변수명 = 값 & ...

// 인터넷 주소 : 한글 XX -URL인코딩->

// 파일명.확장자
// 확장자 - MS진영에만 있는 사람 보기 좋으라고 붙인것
// .txt : 메모장
// .hwp : 한글파일이겠지 머 = 한글에서 잘 열리는 파일이겠지 머
// .xls : 엑셀
// .csv : 값들이 콤마(,)로 구분되어있겠지 머 ~ = 엑셀이 잘 열어주긴 해

public class UCMain {
	public static void main(String[] args) {

		HttpsURLConnection huc = null;
		BufferedWriter bw = null;
		try { // 실패 확률이 있는 부분부터 배치
			
			// 서버 연결
			String search = "도경수";
			search = URLEncoder.encode(search, "utf-8");
			String s = "https://openapi.naver.com/v1/search/news.xml?query=" + search;
			URL u = URI.create(s).toURL();
			huc = (HttpsURLConnection) u.openConnection();
			huc.addRequestProperty("X-Naver-Client-Id", "J3ex8lwJZO0JU8nonIoa");
			huc.addRequestProperty("X-Naver-Client-Secret", "oXpEo7AifR");
			InputStream is = huc.getInputStream();

			// 날짜 준비
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd	HH	");
			String now2 = sdf.format(new Date());
			
			// 파일 열기
			FileOutputStream fos = new FileOutputStream("C:\\KDY\\news.txt", true);
			OutputStreamWriter ows = new OutputStreamWriter(fos, "utf-8"); // 인코딩 방식 utf-8
			bw = new BufferedWriter(ows);

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");

			int what = xpp.getEventType();
			String tagName = null;
			boolean news = false;
			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					if (tagName.equals("item")) {
						news = true;
					}
				} else if (what == XmlPullParser.TEXT) {
					if (news) {
						if (tagName.equals("title")) {
							bw.write(now2);
							bw.write(StringCleaner.clean(xpp.getText()) + "\t");
						}
						else if (tagName.equals("description")) {
							bw.write(StringCleaner.clean(xpp.getText()) + "\r\n");
							bw.flush();
						}
					}
				} else if (what == XmlPullParser.END_TAG) {
					tagName = "";
				}
				xpp.next();
				what = xpp.getEventType();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		huc.disconnect();
		try {bw.close();} catch (Exception e) {}
	}
}
