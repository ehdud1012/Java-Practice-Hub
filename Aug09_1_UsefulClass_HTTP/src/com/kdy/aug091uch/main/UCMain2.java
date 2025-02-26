package com.kdy.aug091uch.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.kdy.aug091uch.sc.StringCleaner;

//https://api.openweathermap.org/data/2.5/weather?lat=37.1712824&lon=127.1044705&appid=baff8f3c6cbc28a4024e336599de28c4
// ==> 한국 버전 https://api.openweathermap.org/data/2.5/weather?lat=37.1712824&lon=127.1044705&appid=baff8f3c6cbc28a4024e336599de28c4&units=metric&lang=kr

//https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}
// 위도 - latitude / 경도 - long 

// 우리집
//!3d37.1712824!4d127.1044705!


// XML -> JSON (후속 기술 ==> 훨씬 나음) - 주력

// 서로 데이터를 주고 받을 때 표준화된 형식이 있어야할 것
// XML : 데이터를 HTML DOM 객체 형태로 표현
//		eXtended Markup Languege

// JSON : 데이터를 JavaScript 객체 형태로 표현
// 		Java Script Object 

//												배열				객체
// java 		: 저급언어 					int[] ar = {};  Dog d = new dog; ...
// javaScript 	: 고급언어 - 변수형 안적어도 알아서 	var ar = [];	var d = {name : "후추" , age = 3};

public class UCMain2 {
	public static void main(String[] args) {
		HttpsURLConnection huc = null;
		BufferedWriter bw = null;
		try {
			URL u = URI.create("https://api.openweathermap.org/data/2.5/weather?lat=37.1712824&lon=127.1044705&appid=baff8f3c6cbc28a4024e336599de28c4&units=metric&lang=kr").toURL();
			huc = (HttpsURLConnection) u.openConnection();
			
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			FileOutputStream fos = new FileOutputStream("C:\\KDY\\owmWeather.txt");
			OutputStreamWriter ows = new OutputStreamWriter(fos, "utf-8"); // 인코딩 방식 utf-8
			bw = new BufferedWriter(ows);
			
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd	HH	");
			String now2 = sdf.format(new Date());
			
			// XmlPullParser : 하나씩 꺼내서 처리하고 다음 (무식한 스타일) => 대용량 데이터 감당 가능
			// JSONParser	 : 전체를 한번에 다 받아옴, get 을 써서 직접 찾아가는 스타일 => 대용량? 
			
			// JSON parsing 
			// json-simple.jar
			JSONParser jp = new JSONParser();
			
			// 제일 앞에 있는게 {	=> 객체	JSONObject jo = (JSONObject) jp.parse(isr);
			// 제일 앞에 있는게 [	=> 배열	JSONArray  ja = (JSONArray) jp.parse(isr);
			
			// 전체를 다 받아와서 jo 에 저장
			JSONObject jo = (JSONObject) jp.parse(isr); // 형변환
			
			JSONObject m = (JSONObject) jo.get("main");
			bw.write(now2);
			bw.write(m.get("temp") + ",");
			bw.write(m.get("feels_like") + ",");
			bw.write(m.get("humidity") + ",");
			
			JSONArray w = (JSONArray) jo.get("weather");
			JSONObject w0 = (JSONObject) w.get(0);
			bw.write(w0.get("description") + "\r\n");
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		huc.disconnect();
	}
}
