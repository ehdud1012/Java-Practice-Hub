package com.kdy.aug192jdbcp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain {
	public static void main(String[] args) {

		Connection con = null;
		Scanner ci = new Scanner(System.in);
		
		PreparedStatement pstmt = null;
		try { // 실패 확률 높은 순
			// 연결 
			String url = "jdbc:oracle:thin:@192.168.0.55:1521:xe"; 
			con = DriverManager.getConnection(url, "ehdud1012", "1012");

			// 데이터 확보
			System.out.print("품명 : ");
			String name = ci.next();
			System.out.print("가격 : ");
			int price = ci.nextInt();
			
			// sql ; 빼고, 자바변수 들어갈 자리는 ?로 
			String sql = "insert into aug19_product values (aug19_product_seq.nextval, ?, ?)";
			
			// sql 완성 -> sql을 서버로 전송 -> 원격 실행 -> 결과
			// 총괄처리해주는 매니저 : PreparedStatement
			pstmt = con.prepareStatement(sql);
			
			// sql 완성
			pstmt.setString(1, name); // 1번 물음표에 name 값 넣기
			pstmt.setInt(2, price);
			
			// sql을 서버로 전송 -> 원격 실행 -> 데이터 몇개가 영향
			int row = pstmt.executeUpdate();
			
			if (row == 1) {
				System.out.println("등록 성공");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 닫는 순서 중요 PreparedStatement -> Connection
		try {pstmt.close();} catch (SQLException e) {} 
		try {con.close();} catch (SQLException e) {}
		ci.close();
	}
}
