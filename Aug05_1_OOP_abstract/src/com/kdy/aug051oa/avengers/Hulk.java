package com.kdy.aug051oa.avengers;

public class Hulk extends Avengers{

	private int pantsSixe;
	
	public Hulk() {
		// TODO Auto-generated constructor stub
	}

	public Hulk(String name, int age, int pantsSixe) {
		super(name, age);
		this.pantsSixe = pantsSixe;
	}
	
	public int getPantsSixe() {
		return pantsSixe;
	}

	public void setPantsSixe(int pantsSixe) {
		this.pantsSixe = pantsSixe;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(pantsSixe);
	}
	
	@Override
	public void attack() {
		System.out.println("주먹질하기");
	}
}
