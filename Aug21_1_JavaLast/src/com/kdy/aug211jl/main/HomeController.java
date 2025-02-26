package com.kdy.aug211jl.main;

import java.util.ArrayList;

import com.kdy.aug211jl.company.Company;
import com.kdy.aug211jl.company.CompanyDAO;
import com.kdy.aug211jl.snack.Snack;
import com.kdy.aug211jl.snack.SnackDAO;

public class HomeController {
	public static void main(String[] args) {
		ConsoleScreen cs = new ConsoleScreen();
		int menu;
		Company c;
		Snack s;
		String result;
		ArrayList<Company> companys;
		ArrayList<Snack> snacks;
		int page;
		while (true) {
			menu = cs.showMainMenu();
			if (menu == 1) {
				c = cs.getCompany();
				result = CompanyDAO.getCdao().companyLeg(c);
				cs.print(result);
			} else if (menu == 2) {
				companys = CompanyDAO.getCdao().companyGet();
				cs.companyPrint(companys);
			} else if (menu == 3) {
				s = cs.getSnack();
				result = SnackDAO.getSdao().snackLeg(s);
				cs.print(result);
			} else if (menu == 4) {
				page = SnackDAO.getSdao().getPageCount();
				page = cs.getPageNo(page);
				snacks = SnackDAO.getSdao().snackGet(page);
				cs.SnackPrint(snacks);
			} else if (menu == 10) {
				break;
			}
		}

		cs.bye();
	}
}
