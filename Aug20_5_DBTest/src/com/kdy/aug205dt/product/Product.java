package com.kdy.aug205dt.product;

public class Product {
	private int no;
	private String searchName;
	private int price;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int no, String searchName, int price) {
		super();
		this.no = no;
		this.searchName = searchName;
		this.price = price;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSearchName() {
		return searchName;
	}
	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
