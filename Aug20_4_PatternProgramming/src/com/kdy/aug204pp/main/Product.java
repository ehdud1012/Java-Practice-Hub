package com.kdy.aug204pp.main;

// OOP빨 : 데이터 묶어

// DB 
//		열, column, field
//		행, row,	    record, data

// JavaBean Class
// VO (Value Object)
// DTO (Data/DB Transfer/Temp Object)
//  ==> product 생성자로 데이터 전송
public class Product {
	private int no; // 멤버변수, 속성, field
	private String name;
	private int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
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
	
}
