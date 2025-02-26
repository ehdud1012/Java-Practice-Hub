package com.kdy.aug121uch.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/json/CardBusStatisticsServiceNew/1/5/20151101/
// 2015.1.1 - 2024.8.1 버스운행정보 저장 (csv)

// ?? -> String 55줄
// 정통 형변환 
// 		- use_ymd = (String) station.get("USE_YMD");
// String 에서만 가능한 
// 		- use_ymd = station.get("USE_YMD").toString();
// +/- 연산자 사용
//		- use_ymd = station.get("USE_YMD")+"";

public class UCMain2 {
	public static void main(String[] args) {
		HttpURLConnection huc = null;
		BufferedWriter bw = null;

		try {
			FileOutputStream fos = new FileOutputStream("C:\\KDY\\bus2015.csv", true);
			OutputStreamWriter ows = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(ows);

			for (int month = 1; month < 13; month++) {
				for (int day = 1; day < 32; day++) {
					for (int start = 1; start < 41002; start += 1000) {
						String t = String.format("%d/%d/2015%02d%02d", start, start + 999, month, day);

						String s = "http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/json/CardBusStatisticsServiceNew/"
								+ t;
						URL u = URI.create(s).toURL();
						huc = (HttpURLConnection) u.openConnection(); // 형변환해서 사용 : 서버 연결

						InputStream is = huc.getInputStream();
						InputStreamReader isr = new InputStreamReader(is, "utf-8");
						BufferedReader br = new BufferedReader(isr);

						JSONParser jp = new JSONParser();
						JSONObject jo = (JSONObject) jp.parse(isr);
						JSONObject cbssn = (JSONObject) jo.get("CardBusStatisticsServiceNew");
						if (cbssn != null) {
							JSONArray ja = (JSONArray) cbssn.get("row");
							JSONObject station;
							// 변수 생김새에 낚이지 않기
							String use_ymd = null;
							for (int i = 0; i < ja.size(); i++) {
								station = (JSONObject) ja.get(i);
								use_ymd = station.get("USE_YMD") + "";
								bw.write(use_ymd.substring(0, 4) + ",");
								bw.write(use_ymd.substring(4, 6) + ",");
								bw.write(use_ymd.substring(6, 8) + ",");

								bw.write(station.get("RTE_NM") + ",");
								bw.write(station.get("SBWY_STNS_NM") + ",");
								bw.write(station.get("GTON_TNOPE").toString().replace(".0", ","));
								bw.write(station.get("GTOFF_TNOPE").toString().replace(".0", "\r\n"));
								bw.flush();
							}
						}
						System.out.println(t);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		huc.disconnect();
	}
}
