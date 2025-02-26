package com.kdy.project01.search;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Comparator;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class searchDAO {
	
	private static final searchDAO SDAO = new searchDAO();
	private HttpsURLConnection huc;
	
	public searchDAO() {
		huc = null;
	}
	
	public static searchDAO getSdao() {
		return SDAO;
	}
	
	public ArrayList<search> CafeSearch(String search, String location) {
		String x = null;
		String y = null;
		try {
			location = URLEncoder.encode(location, "utf-8");
			String s = "https://dapi.kakao.com/v2/local/search/address.json?query=" + location;
			URL u = URI.create(s).toURL();
			huc = (HttpsURLConnection) u.openConnection();
			huc.addRequestProperty("Authorization", "KakaoAK e9f4bd4e350432ceafa6a59e824954d8");
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(isr);
			JSONArray ja = (JSONArray) jo.get("documents");
			JSONObject loc = (JSONObject) ja.get(0); 
			x = (String) loc.get("x");
			y = (String) loc.get("y");
			
			
			search = URLEncoder.encode(search, "utf-8");
			String s1 = "https://dapi.kakao.com/v2/local/search/keyword.json?size=5&sort=distance&y="+ y +"&x="+ x +"&query=" + search;
			URL u1 = URI.create(s1).toURL();
			huc = (HttpsURLConnection) u1.openConnection();
			huc.addRequestProperty("Authorization", "KakaoAK e9f4bd4e350432ceafa6a59e824954d8");
			InputStream is1 = huc.getInputStream();
			InputStreamReader isr1 = new InputStreamReader(is1, "utf-8");

			JSONParser jp1 = new JSONParser();
			JSONObject jo1 = (JSONObject) jp1.parse(isr1);
			JSONArray ja1 = (JSONArray) jo1.get("documents");
			JSONObject loc1;
			ArrayList<search> searchs = new ArrayList<search>();
			for (int i = 0; i < ja1.size(); i++) {
				loc1 = (JSONObject) ja1.get(i);
				searchs.add(
						new search(loc1.get("place_name"), loc1.get("road_address_name"), 
										loc1.get("phone"), loc1.get("distance"))
						);
			}
			return searchs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public void httpsBye() {
		 if (this.huc != null) {
		        this.huc.disconnect();
		    }
	}
}
