package com.kdy.db.manager;
	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// AOP적 관섬 : DB작업떄마다 공통되는 부분 있는거 정리
// OOP빨 : 코드 재사용 -> 라이브러리 제작
// java

// 라이브러리 : 최대한 일반적으로 (다양한 상황에 쓰일 수 있게)

public class KdyDBManager {
	// 연결 안되면 대응은 상황마다 다를테니
	public static Connection connectDB(String url, String id, String pw) throws SQLException {
		return DriverManager.getConnection(url, id, pw);
	}
	
	// 안닫히면 대응 ?
	// select -> con, pstmt, rs
	// insert -> con, pstmt, X
	// insert -> rs없음 -> null ==> 이것도 잡히게 그냥 Exception
	public static void disconnectDB(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {rs.close();} catch (Exception e) {}
		try {pstmt.close();} catch (Exception e) {}
		try {con.close();} catch (Exception e) {}
	}
}
