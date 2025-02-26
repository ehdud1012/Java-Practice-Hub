package com.kdy.project01.cafe;

public class Cafe {

	private String name;
	private int storenum;
	
	public Cafe() {
		// TODO Auto-generated constructor stub
	}

	public Cafe(String name, int storenum) {
		super();
		this.name = name;
		this.storenum = storenum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStorenum() {
		return storenum;
	}

	public void setStorenum(int storenum) {
		this.storenum = storenum;
	}
	
}
