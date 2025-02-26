package com.kdy.project01.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.kdy.project01.cafe.Cafe;
import com.kdy.project01.coffee.Coffee;
import com.kdy.project01.login.Login;
import com.kdy.project01.search.search;


public class ConsoleScreen {
	private Scanner inputSystem;
	public ConsoleScreen() {
		inputSystem = new Scanner(System.in);
	}
	
	public int loginMenu() {
		System.out.println("---------------------");
		System.out.println("1. 로그인하기");
		System.out.println("2. 계정 생성하기");
		System.out.println("---------------------");
		System.out.print("번호 입력 : ");
		return inputSystem.nextInt();
	}
	
	public String login_id() { 
		System.out.print("아이디 : ");
		return inputSystem.next();
	}
	
	public String login_pw() { 
		System.out.print("비밀번호 : ");
		return inputSystem.next();
	}
	
	public Login getLogin() {
		System.out.print("아이디 : ");
		String id = inputSystem.next();
		System.out.print("비밀번호 : ");
		String pw = inputSystem.next();
		return new Login(id, pw);
	}
	
	public void intro() {
		System.out.println("---------------------");
		System.out.println("카페뿐만 아니라 원하는 검색 결과 출력 가능 !");
		System.out.println("카페별 메뉴 가격 비교 / 메뉴 목록");
		System.out.println("직접 등록(매장, 메뉴) 후 재검색 가능 !");
		System.out.println("---------------------");
	}
	public int showMainMenu() {
		System.out.println("---------------------");
		System.out.println("1. 지도 검색");
		System.out.println("2. 등록된 매장 보기");
		System.out.println("3. 메뉴 검색");
		System.out.println("4. 매장 등록");
		System.out.println("5. 신메뉴 등록");
		System.out.println("6. 종료");
		System.out.println("---------------------");
		System.out.print("번호 입력 : ");
		return inputSystem.nextInt();
	}
	
	public void placePrint(ArrayList<search> searchs) {
		for (search cafeSearch : searchs) {
			System.out.print(cafeSearch.getPlace_name()+ ", ");
			System.out.print(cafeSearch.getRoad_address_name()+ ", ");
			System.out.println(cafeSearch.getDistance()+ "m");
			System.out.println("--------------------------------------");
		}
	}
	
	public int showSearchMenu() {
		System.out.println("---------------------");
		System.out.println("1. 매장으로 메뉴 검색");
		System.out.println("2. 메뉴 이름으로 검색");
		System.out.println("---------------------");
		System.out.print("메뉴 번호 입력 : ");
		return inputSystem.nextInt();
	}
	
	public String Searchword_s_m() { 
		System.out.print("검색 : ");
		return inputSystem.next();
	}
	
	public String Searchlocation() { 
		System.out.print("위치 (띄어쓰기 XXX, 정확한 주소) : ");
		return inputSystem.next();
	}
	
	public void CafePrint(ArrayList<Cafe> cafes) {
		for (Cafe cafe : cafes) {
			System.out.print(cafe.getName() + ", 점포수 : ");
			System.out.println(cafe.getStorenum());
			System.out.println("---------------------------------------------");
		}
	}
	public void CoffeePrint(ArrayList<Coffee> coffees) {
		for (Coffee coffee : coffees) {
			System.out.print(coffee.getC_name() + ", ");
			System.out.print(coffee.getName() + ", ");
			System.out.print(coffee.getPrice() + "원, ");
			System.out.print(coffee.getSize() + "ml, ");
			System.out.println(coffee.getCalorie() + "칼로리");
			System.out.println("---------------------------------------------");
		}
	}
	public Cafe getCafe() {
		System.out.print("매장명 : ");
		String name = inputSystem.next();
		System.out.print("점포수 : ");
		int storeNum = inputSystem.nextInt();
		return new Cafe(name, storeNum);
	}
	public Coffee getMenu() {
		System.out.print("메뉴명 : ");
		String name = inputSystem.next();
		System.out.print("가격 : ");
		int price = inputSystem.nextInt();
		System.out.print("용량 : ");
		int size = inputSystem.nextInt();
		System.out.print("열량 : ");
		int calorie = inputSystem.nextInt();
		System.out.print("카페명 : ");
		String c_name = inputSystem.next();
		return new Coffee(0, name, price, size, calorie, c_name);
	}
	
	public int getPageNo(int pageCount) {
		System.out.println("몇 페이지(1 ~ " + pageCount +") : ");
		return inputSystem.nextInt();
	}
	
	public void printResult(String result) {
		System.out.println(result);
	}
	
	public void bye() {
		inputSystem.close();
	}
}
