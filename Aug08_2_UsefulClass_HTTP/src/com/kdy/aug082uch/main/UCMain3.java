package com.kdy.aug082uch.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

// go.kr (정부 사이트)
//		data.go.kr
//		data.seoul.go.kr   // 쌤 키 값 :575a4655496b636839386f58586542
//		data.gg.go.kr

// 포털사이트 개발자 센터 ...

public class UCMain3 {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		HttpURLConnection huc = null;
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd	HH");
		String now2 = sdf.format(now);
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\KDY\\dust.csv", true);
			OutputStreamWriter ows = new OutputStreamWriter(fos, "utf-8"); // 인코딩 방식 utf-8
			bw = new BufferedWriter(ows);
			
			URL u = URI.create("http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/xml/RealtimeCityAir/1/25/").toURL();
			huc = (HttpURLConnection) u.openConnection(); // 형변환해서 사용 : 서버 연결

			InputStream is = huc.getInputStream();

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8"); // xpp.setInput(isr);

			// 그게 (시작/글씨/종료) 뭐야?
			int what = xpp.getEventType();
			String tagName = null;
			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				}
				else if (what == XmlPullParser.TEXT) {
					if (tagName.equals("MSRRGN_NM")) {
						bw.write(now2);
						bw.write(xpp.getText() + ", ");
					}
					else if (tagName.equals("MSRSTE_NM") || tagName.equals("PM10") || tagName.equals("PM25")) {
						bw.write(xpp.getText() + ", ");
					}else if (tagName.equals("IDEX_NM")) {
						bw.write(xpp.getText() + "\r\n");
						bw.flush();
					}
				}
				else if (what == XmlPullParser.END_TAG) {
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
