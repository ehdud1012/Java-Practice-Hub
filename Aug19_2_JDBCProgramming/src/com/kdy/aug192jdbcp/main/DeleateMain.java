package com.kdy.aug192jdbcp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

// 삭제할 제품명
// 수정할 제품명

public class DeleateMain {

	public static void main(String[] args) {
		Connection con = null;
		Scanner ci = new Scanner(System.in);
		
		PreparedStatement pstmt = null;
		try {
			String url = "jdbc:oracle:thin:@192.168.0.55:1521:xe"; 
			con = DriverManager.getConnection(url, "ehdud1012", "1012");

			System.out.print("삭제할 품명 : ");
			String name = ci.next();
			String sql = "delete from aug19_product where c_name like '%'||?||'%'";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name); // 1번 물음표에 name 값 넣기
			int row = pstmt.executeUpdate();
			if (row >= 1) {
				System.out.println("삭제 성공");
			}
			
//			System.out.print("500원 인상할 품명 : ");
//			String name2 = ci.next();
//			String sql2 = "update aug19_product set c_price = c_price + 500 where c_name = ?";
//			pstmt = con.prepareStatement(sql2);
//			pstmt.setString(1, name2);
//			if (pstmt.executeUpdate() >= 1) { // 줄여쓰기
//				System.out.println("인상 성공");
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {pstmt.close();} catch (SQLException e) {} 
		try {con.close();} catch (SQLException e) {}
		ci.close();

	}

}
