package com.kdy.aug023oe.computer;

public class NoteBook extends Computer {

	private int weight;
	
	public NoteBook() {
		// TODO Auto-generated constructor stub
	}

	public NoteBook(String cpu, int ram, int hdd, int weight) {
		super(cpu, ram, hdd);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(weight);
		// System.out.println(cpu);
		System.out.println(getRam());
		// private 는 상속이 안됨 - XX
		// cpu 는 원래 Computer 거
		// Notebook 은 Computer 외부라서 
		
	}
}
