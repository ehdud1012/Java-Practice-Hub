package com.kdy.aug211jl.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.kdy.aug211jl.company.Company;
import com.kdy.aug211jl.snack.Snack;

public class ConsoleScreen {
	
	private Scanner inputSystem;
	
	public ConsoleScreen() {
		inputSystem = new Scanner(System.in);
	}
	
	public int showMainMenu() {
		System.out.println("---------------------");
		System.out.println("1. 회사등록");
		System.out.println("2. 회사조회");
		System.out.println("3. 과자등록");
		System.out.println("4. 과자조회");
		System.out.println("...");
		System.out.println("10. 종료");
		System.out.println("---------------------");
		System.out.print("머 : ");
		return inputSystem.nextInt();
	}
	
	public Company getCompany() {
		System.out.println("회사명 : ");
		String companyName = inputSystem.next();
		System.out.println("위치 : ");
		String companyLoc = inputSystem.next();
		System.out.println("직원 수 : ");
		int companyEmp = inputSystem.nextInt();
		return new Company(companyName, companyLoc, companyEmp);
	}
	public void companyPrint(ArrayList<Company> companys) {
		for (Company company : companys) {
			System.out.println(company.getCompanyName());
			System.out.println(company.getCompanyLoc());
			System.out.println(company.getCompanyEmp());
			System.out.println("-----------------");
		}
		
	}
	
	public Snack getSnack() {
		System.out.print("이름 : ");
		String s_name = inputSystem.next();
		System.out.print("가격 : ");
		int s_price = inputSystem.nextInt();
		System.out.print("중량 : ");
		double s_weight = inputSystem.nextDouble();
		System.out.print("유통기한 : ");
		String s_exp = inputSystem.next();
		System.out.print("제조사 : ");
		String s_c_name = inputSystem.next();
		return new Snack(0, s_name, s_price, s_weight, s_c_name, s_exp);
	}
	
	public void SnackPrint(ArrayList<Snack> snacks) {
		for (Snack snack : snacks) {
			System.out.print(snack.getS_name() + ", ");
			System.out.print(snack.getS_price() + ", ");
			System.out.print(snack.getS_weight() + ", ");
			System.out.print(snack.getS_exp() + ", ");
			System.out.println(snack.getS_c_name());
			System.out.println("---------------------------------------------");
		}
	}
	
	public int getPageNo(int pageCount) {
		System.out.println("몇 페이지(1 ~ " + pageCount +") : ");
		return inputSystem.nextInt();
	}
	
	public void print(String result) {
		System.out.println(result);
	}
	
	public void bye() {
		inputSystem.close();
	}
}
