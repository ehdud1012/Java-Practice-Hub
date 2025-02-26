package com.kdy.aug211jl.snack;

import java.sql.Date;

public class Snack {
	private int s_no;
	private String s_name;
	private int s_price;
	private double s_weight;
	private Date s_exp;
	private String s_c_name;
	
	private String s_exp2;
	
	public Snack() {
		// TODO Auto-generated constructor stub
	}

	public Snack(int s_no, String s_name, int s_price, double s_weight, Date s_exp, String s_c_name) {
		super();
		this.s_no = s_no;
		this.s_name = s_name;
		this.s_price = s_price;
		this.s_weight = s_weight;
		this.s_exp = s_exp;
		this.s_c_name = s_c_name;
	}

	public Snack(int s_no, String s_name, int s_price, double s_weight, String s_c_name, String s_exp2) {
		super();
		this.s_no = s_no;
		this.s_name = s_name;
		this.s_price = s_price;
		this.s_weight = s_weight;
		this.s_c_name = s_c_name;
		this.s_exp2 = s_exp2;
	}

	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getS_price() {
		return s_price;
	}

	public void setS_price(int s_price) {
		this.s_price = s_price;
	}

	public double getS_weight() {
		return s_weight;
	}

	public void setS_weight(double s_weight) {
		this.s_weight = s_weight;
	}

	public Date getS_exp() {
		return s_exp;
	}

	public void setS_exp(Date s_exp) {
		this.s_exp = s_exp;
	}

	public String getS_c_name() {
		return s_c_name;
	}

	public void setS_c_name(String s_c_name) {
		this.s_c_name = s_c_name;
	}

	public String getS_exp2() {
		return s_exp2;
	}

	public void setS_exp2(String s_exp2) {
		this.s_exp2 = s_exp2;
	}

	
}
