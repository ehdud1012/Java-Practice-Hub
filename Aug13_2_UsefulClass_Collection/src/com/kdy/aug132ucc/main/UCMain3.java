package com.kdy.aug132ucc.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;

import com.kdy.aug132ucc.student.Student;

//collection 
//	가변사이즈, 자료형 섞기 가능 (잘 안씀), 객체만 가능
//		List 계열 : 배열
//		Set  계열 : 집합 - 중복을 없애버림[기본형만 해당], 순서 랜덤 ==> 잘 안씀
//		Map  계열 : 

public class UCMain3 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("z");
		hs.add("ㅠ");
		hs.add("z");
		hs.add("ㅋ");
		hs.add("ㅋ");
		System.out.println(hs.size());
		
		// Set -> List 바꿔서 사용
		ArrayList<String> al = new ArrayList<String>(hs);
		for (String s : al) {
			System.out.println(s);
		}
		
		// 중복x, 순서?
		// 어차피 list로 바꿔서 쓰기에 정렬 가능
		HashSet<Student> students = new HashSet<Student>();
		students.add(new Student("홍길동", 10, 20, 30));
		students.add(new Student("김길동", 100, 25, 88));
		students.add(new Student("이길동", 0, 0, 0));
		students.add(new Student("이길동", 0, 0, 0));
		students.add(new Student("이길동", 0, 0, 0));
		
		Student s = new Student("최길동", 5, 5, 5);
		students.add(s);
		students.add(s);
		students.add(s);
		System.out.println(students.size());
		System.out.println("-------------------------------");
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while (lotto.size() < 6) {
			lotto.add(new Random().nextInt(45) + 1);
		}
		
		ArrayList<Integer> lotto2 = new ArrayList<Integer>(lotto);
		Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		lotto2.sort(c);
		
		for (int i = 0; i < lotto2.size(); i++) {
			System.out.println(lotto2.get(i));
		}
	}
}
