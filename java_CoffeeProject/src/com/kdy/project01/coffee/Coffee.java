package com.kdy.project01.coffee;

public class Coffee {
	private int no;
	private String name;
	private int price;
	private int size;
	private int calorie;
	private String c_name;
	public Coffee() {
		// TODO Auto-generated constructor stub
	}
	public Coffee(int no, String name, int price, int size, int calorie, String c_name) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.size = size;
		this.calorie = calorie;
		this.c_name = c_name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
}
