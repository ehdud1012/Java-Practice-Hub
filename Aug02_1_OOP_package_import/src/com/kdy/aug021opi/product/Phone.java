package com.kdy.aug021opi.product;

public class Phone extends Product {

	String os;
	

	
	public Phone(String name, int price, String os) {
		super(name, price);
		this.os = os;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(os);
	}
}
