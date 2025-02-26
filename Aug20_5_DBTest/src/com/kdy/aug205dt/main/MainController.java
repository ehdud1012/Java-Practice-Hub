package com.kdy.aug205dt.main;

import java.util.ArrayList;

import com.kdy.aug205dt.product.Product;
import com.kdy.aug205dt.product.ProductDAO;

public class MainController {
	public static void main(String[] args) {
		Console c = new Console();
		
		String searchWord = c.getProduct();
		ArrayList<Product> products = ProductDAO.getpDao().searchProgram(searchWord);
		c.print(products);
		c.bye();
	}
}
