package com.kdy.aug023oe.computer;

// javaBean, DTO, VO
public class Computer {
	// 1) 멤버변수
	private String cpu;
	private int ram;
	private int hdd;
	
	// 2-1) 기본 생성자
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	// 2-2) 오버로딩된 생성자 : C + S + a
	public Computer(String cpu, int ram, int hdd) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	// 3) getter, setter : C + S + s
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	
	// 4) 기타 메소드
	public void print() {
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
	}
}
