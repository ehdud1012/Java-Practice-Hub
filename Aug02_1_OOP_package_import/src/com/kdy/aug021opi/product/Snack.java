package com.kdy.aug021opi.product;

public class Snack extends Product{
	String expDate;
	
	public Snack(String name, int price, String expDate) {
		super(name, price);
		this.expDate = expDate;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(expDate);
	}
}
