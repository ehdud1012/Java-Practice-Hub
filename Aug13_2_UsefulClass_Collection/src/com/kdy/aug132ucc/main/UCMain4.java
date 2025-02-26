package com.kdy.aug132ucc.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

// collection 
//	가변사이즈, 자료형 섞기 가능 (잘 안씀), 객체만 가능
//		List 계열 : 배열 ==> 주력
//		Set  계열 : 집합 - 중복을 없애버림[기본형만 해당], 순서 랜덤 ==> 잘 안씀
//		Map  계열 : (dict) 순서X, 키-값

public class UCMain4 {
	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<String, Double>();
		
		hm.put("탄수화물", 30.32);
		hm.put("지방", 3.32);
		hm.put("단백질", 13.132);
		hm.put("단백질", 53.132); // 같은 키에 넣으면 갱신
		
		System.out.println(hm.get("단백질"));
		
		Set<String> keys = hm.keySet(); // 키 값만 모아둔
		ArrayList<String> keys2 = new ArrayList<String>(keys);
		for (String k : keys2) {
			System.out.println(k);
			System.out.println(hm.get(k));
			System.out.println("-----------------");
		}
		
		// 비타민이라는 키 값이 있는가
		System.out.println(hm.containsKey("비타민")); 
	}
}
