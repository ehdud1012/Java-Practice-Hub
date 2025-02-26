package com.kdy.aug211jl.company;

public class Company {
	private String companyName;
	private String companyLoc;
	private int companyEmp;
	public Company() {
		// TODO Auto-generated constructor stub
	}
	public Company(String companyName, String companyLoc, int companyEmp) {
		super();
		this.companyName = companyName;
		this.companyLoc = companyLoc;
		this.companyEmp = companyEmp;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyLoc() {
		return companyLoc;
	}
	public void setCompanyLoc(String companyLoc) {
		this.companyLoc = companyLoc;
	}
	public int getCompanyEmp() {
		return companyEmp;
	}
	public void setCompanyEmp(int companyEmp) {
		this.companyEmp = companyEmp;
	}
	
}
