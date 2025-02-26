package com.kdy.aug202dt.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.kdy.db.manager.KdyDBManager;

// 평균가 
// 만든 라이브러리 사용
public class DTMain {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");
			String sql = "select avg(c_price) from AUG19_PRODUCT";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			rs.next();
			System.out.println(rs.getDouble("avg(c_price)"));
			
		} catch (Exception e) {
		}
		
		KdyDBManager.disconnectDB(con, pstmt, rs);
	}
}
