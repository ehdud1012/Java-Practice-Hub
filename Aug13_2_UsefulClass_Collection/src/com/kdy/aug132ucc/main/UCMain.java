package com.kdy.aug132ucc.main;

import java.util.ArrayList;
import java.util.Comparator;

// 자바에서는 (배열 -> 컬렉션) 이걸 할 줄 알아야 잘하는것
 
// 데이터들 [] (배열)
//		만들 때 사이즈를 알아야함, 고정까지 됨
//		자료형 섞기 불가  => 사실 단점 아님 ㅎ 어차피 잘 안섞음
//		인덱스 기반 -> 의미를 파악하기가 어려워 ㅠ.ㅠ
//		=> 간단한 데이터 몇개일 때 사용하는 정도

// collection 
//	가변사이즈, 자료형 섞기 가능 (잘 안씀), 객체만 가능
//		List 계열 : 배열
//		Set  계열 : 
//		Map  계열

// <클래스명> : generic -> 자료형 제한 (객체명만 넣기)
public class UCMain {
	public static void main(String[] args) {
		// String 만 가능한 리스트
		ArrayList<String> as = new ArrayList<String>(); 
		
		ArrayList<Integer> ai = new ArrayList<Integer>(); 
		ai.add(50); // int -> Integer로 autoboxing 해서 넣음
		ai.add(30);
		ai.add(1230);
		ai.add(1);
		
		for (Integer v : ai) {
			System.out.println(v);
		}
		System.out.println("--------------------");
		ai.add(999); // 배열로는 못하는 것
		ai.add(1, 888); // 값 추가 : 1번 자리에 888넣고 뒤로 한칸씩 밀리기
		ai.set(3, 777); // 값 수정 : 3번 자리 777로 수정
		ai.remove(4); // 값 삭제
		
		// 정렬 // 버블소트인듯? 정확히 모름
		// Comparator 인터페이스를 구현하는 클래스 객체를 생성 
		Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2); // 오름차순
				// return o2.compareTo(o1); // 내림차순
			}
		};
		ai.sort(c);
		
		for (int i = 0; i < ai.size(); i++) {
			System.out.println(ai.get(i));
		}
		
		
		
//		ArrayList al = new ArrayList(); // 사이즈 적은적 없음
//		al.add(10);
//		al.add(true);
//		System.out.println(al.size());
//		al.add("ㅠ.ㅠ");
//		al.add(10.55);  // ==> 배열 단점 다 삭제
//		System.out.println(al.size());
//		System.out.println(al.get(0));
//		System.out.println(al.get(1));
//		System.out.println(al.get(2));
//		System.out.println(al.get(3));
		
		
	}
}
