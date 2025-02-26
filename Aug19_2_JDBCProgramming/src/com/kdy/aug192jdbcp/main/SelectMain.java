package com.kdy.aug192jdbcp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectMain {
	public static void main(String[] args) {
		Connection con = null;
		Scanner ci = new Scanner(System.in);
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select 한 결과 / set 계열 XX
		try {
			// 연결
			String url = "jdbc:oracle:thin:@192.168.0.55:1521:xe"; 
			con = DriverManager.getConnection(url, "ehdud1012", "1012");
			String sql = "select * from aug19_product";
			pstmt = con.prepareStatement(sql);
			
			// 실행
			// pstmt.executeUpdate(); 
			// 		=> 영향받은 데이터수가 리턴 : insert / update / delete
			// pstmt.executeQuery(); - ResultSet
			//  	=> select 한 결과가 리턴 : Read
			
			rs = pstmt.executeQuery();  // 갯수 못셈 => for 문 불가
			
			// rs.next(); : 커서를 다음 데이터로, 갔는데 없으면 false (있으면 true)
			while (rs.next()) {
				// rs.getXXX("필드명")
				System.out.println(rs.getString("c_name"));
				System.out.println(rs.getInt("c_price"));
				System.out.println("-----------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {rs.close();} catch (SQLException e) {}
		try {pstmt.close();} catch (SQLException e) {}
		try {con.close();} catch (SQLException e) {}
		ci.close();
	}
}
