package com.kdy.project01.main;

import java.util.ArrayList;

import com.kdy.project01.cafe.Cafe;
import com.kdy.project01.cafe.CafeDAO;
import com.kdy.project01.coffee.Coffee;
import com.kdy.project01.coffee.CoffeeDAO;
import com.kdy.project01.login.Login;
import com.kdy.project01.login.LoginDAO;
import com.kdy.project01.search.search;
import com.kdy.project01.search.searchDAO;

public class Homecontroller {
	public static void main(String[] args) {
		ConsoleScreen cs = new ConsoleScreen();
		int menu;
		int search;
		String searchWord = null;
		String locaion = null;
		String result;
		
		Cafe ca;
		Coffee co;
		Login lg;
		ArrayList<Coffee> coffees;
		ArrayList<Cafe> cafes;
		ArrayList<search> searchs;
		int page;
		
		String id;
		String pw;
		Boolean idcheck;
		Boolean pwcheck;
		
		cs.intro();
		
		while (true) {
			menu = cs.loginMenu();
			if (menu == 1) {
				id = cs.login_id();
				idcheck = LoginDAO.getLdao().idCheck(id);
				if (idcheck) {
					pw = cs.login_pw();
					pwcheck = LoginDAO.getLdao().pwCheck(pw);
					if (pwcheck) {
						break;
					}
				}
			} else if (menu == 2) {
				lg = cs.getLogin();
				result = LoginDAO.getLdao().loginLeg(lg);
				cs.printResult(result);
			}
		}
		
		while (true) {
			menu = cs.showMainMenu();
			if (menu == 1) { // 지도 검색
				searchWord = cs.Searchword_s_m();
				locaion = cs.Searchlocation();
				searchs = searchDAO.getSdao().CafeSearch(searchWord, locaion);
				cs.placePrint(searchs);
			} else if (menu == 2) { // 등록된 매장 보기
				page = CafeDAO.getCpdao().getPageCount();
				page = cs.getPageNo(page);
				cafes = CafeDAO.getCpdao().registeredCafe(page);
				cs.CafePrint(cafes);
			} else if (menu == 3) { // 메뉴 검색
				search = cs.showSearchMenu();
				if (search == 1) { 
					searchWord = cs.Searchword_s_m();
					CoffeeDAO.getCpao().setAllMenuCount(searchWord);
					page = CoffeeDAO.getCpao().getPageCount();
					page = cs.getPageNo(page);
					coffees = CoffeeDAO.getCpao().searchCafe(searchWord, page);
					cs.CoffeePrint(coffees);
				}
				else if (search == 2) {
					searchWord = cs.Searchword_s_m();
					coffees = CoffeeDAO.getCpao().searchMenu(searchWord);
					cs.CoffeePrint(coffees);
				}
			} else if (menu == 4) { // 매장 등록
				ca = cs.getCafe();
				result = CafeDAO.getCpdao().cafeLeg(ca);
				cs.printResult(result);
			} else if (menu == 5) { // 신메뉴 등록
				co = cs.getMenu();
				result = CoffeeDAO.getCpao().coffeeLeg(co);
				cs.printResult(result);
			} else if (menu == 6) { // 종료
				break;
			}
		}
		searchDAO.getSdao().httpsBye();
		cs.bye();
	}
}
