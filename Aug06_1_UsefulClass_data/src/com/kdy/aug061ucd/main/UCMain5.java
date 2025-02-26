package com.kdy.aug061ucd.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UCMain5 {
	public static void main(String[] args) {
		// 나이 계산
//		String year = birthday.substring(0, 4);
//		int year2 = Integer.parseInt(year);
//		System.out.println(year2);
		
		try {
			Date now = new Date();
			String birthday = "2004/10/12";
			// str -> date
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			Date birthday2 = sdf.parse(birthday);
			
			// date -> str
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
			String birthyear = sdf2.format(birthday2);
			String curYear = sdf2.format(now);
			
			int birthyear2 = Integer.parseInt(birthyear);
			int curYear2 = Integer.parseInt(curYear);
			
			System.out.println(curYear2 - birthyear2 + 1);
			
			SimpleDateFormat sdf3 = new SimpleDateFormat("E");
			String yoil = sdf3.format(birthday2);
			System.out.println(yoil);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
