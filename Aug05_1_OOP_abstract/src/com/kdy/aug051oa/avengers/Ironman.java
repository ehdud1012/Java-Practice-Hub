package com.kdy.aug051oa.avengers;

import com.kdy.aug051oa.flyer.Flyer;
import com.kdy.aug051oa.human.Human;

// Object - Product - Computer - Notebook : 다단상속

// 다중 상속 : 언어마다 다른데 대부분 안됨 (자바 포함)
// 자바도 안됨 -> 정식 상속은 불가, 마이너버전 상속은 가능
// Ironman is a Avengers
// Ironman is a Human

public class Ironman extends Avengers implements Human, Flyer{

	private String computerName;
	
	public Ironman() {
		// TODO Auto-generated constructor stub
	}

	public Ironman(String name, int age, String computerName) {
		super(name, age);
		this.computerName = computerName;
	}
	
	public String getComputerName() {
		return computerName;
	}

	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(computerName);
	}
	
	@Override
	public void attack() {
		System.out.println("빔 발사");
	}

	@Override
	public void eat() {
		System.out.println("냠쩝");
	}

	@Override
	public void fly() {
		System.out.println("하늘을 날아요");
		
	}
	
	
}
