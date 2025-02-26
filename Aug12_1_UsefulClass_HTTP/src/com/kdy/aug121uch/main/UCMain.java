package com.kdy.aug121uch.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class UCMain {

	public static void main(String[] args) {
		
		HttpsURLConnection huc = null;
		Scanner ci = new Scanner(System.in);
		try {
			System.out.print("머 : ");
			String search = ci.next();
			search = URLEncoder.encode(search, "utf-8");
			String s = "https://dapi.kakao.com/v2/local/search/keyword.json?y=37.1712824&x=127.1044705&query=" + search;
			URL u = URI.create(s).toURL();
			huc = (HttpsURLConnection) u.openConnection();
			huc.addRequestProperty("Authorization", "KakaoAK e9f4bd4e350432ceafa6a59e824954d8");
			InputStream is = huc.getInputStream();
			
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(isr);
			JSONArray ja = (JSONArray) jo.get("documents");
			JSONObject loc;
			for (int i = 0; i < ja.size(); i++) {
				loc = (JSONObject) ja.get(i);
				System.out.println(loc.get("place_name"));
				System.out.println(loc.get("road_address_name"));
				System.out.println(loc.get("phone"));
				System.out.println(loc.get("distance"));
				System.out.println("--------------------------------");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
