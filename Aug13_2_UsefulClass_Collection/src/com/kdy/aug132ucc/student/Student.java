package com.kdy.aug132ucc.student;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public Student(String line) {
		String[] line2 = line.split(","); // / 기준으로 배열로 만들어버리기
		name = line2[0];
		kor = Integer.parseInt(line2[1]);
		eng = Integer.parseInt(line2[2]);
		mat = Integer.parseInt(line2[3]);
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
	}
}
