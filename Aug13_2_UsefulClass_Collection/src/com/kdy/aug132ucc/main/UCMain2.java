package com.kdy.aug132ucc.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

import com.kdy.aug132ucc.student.Student;

// [] : 몇명인지 몰라
// 
public class UCMain2 {
	public static void main(String[] args) {
		// 파일 내용 찍기
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\KDY\\student.csv");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);

			ArrayList<Student> students = new ArrayList<Student>(); // Student도 객체
			String line = null;
			while ((line = br.readLine()) != null) {
				students.add(new Student(line));
			}
			System.out.println("--------------------------");
			// 총 학생 수
			System.out.println(students.size());
			System.out.println("--------------------------");

			// 두번째 학생의 국어 점수
			System.out.println(students.get(1).getKor());
			System.out.println("--------------------------");
			
			// 첫번째 학생의 모든 정보
			students.get(0).printInfo();
			System.out.println("--------------------------");
			// 꼴등 학생 모든 정보
			Comparator<Student> total = new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					Integer o1Total = o1.getKor() + o1.getEng() + o1.getMat();
					Integer o2Total = o2.getKor() + o2.getEng() + o2.getMat();
					return o1Total.compareTo(o2Total);
				}
			};
			students.sort(total);
			students.get(0).printInfo();
			
			System.out.println("--------------------------");
			
			// 이름 가나다 순
			Comparator<Student> name = new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					String o1Name = o1.getName();
					String o2Name = o2.getName();
					return o1Name.compareTo(o2Name);
				}
			};
			students.sort(name);
			System.out.println("--------------------------");
			
			for (Student student : students) {
				student.printInfo();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {br.close();} catch (Exception e) {}
	}
}
