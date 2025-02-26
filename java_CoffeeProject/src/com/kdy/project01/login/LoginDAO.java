package com.kdy.project01.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.kdy.db.manager.KdyDBManager;

public class LoginDAO {
	
	private static final LoginDAO LDAO = new LoginDAO();
	private LoginDAO() {
		// TODO Auto-generated constructor stub
	}
	public static LoginDAO getLdao() {
		return LDAO;
	}
	
	public Boolean idCheck(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");
			String sql = "select count(l_ID) from kdy01_login where l_ID = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			rs.next();
			if (rs.getInt("count(l_ID)") == 1) {
				return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
			
		} finally {
			KdyDBManager.disconnectDB(con, pstmt, rs);
		}
	}
	
	public Boolean pwCheck(String pw) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");
			String sql = "select count(l_PW) from kdy01_login where l_PW = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pw);
			rs = pstmt.executeQuery();
			rs.next();
			if (rs.getInt("count(l_PW)") == 1) {
				return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
			
		} finally {
			KdyDBManager.disconnectDB(con, pstmt, rs);
		}
	}
	
	public String loginLeg(Login l) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");

			String sql = "insert into kdy01_login values (?, ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, l.getId());
			pstmt.setString(2, l.getPw());

			if (pstmt.executeUpdate() == 1) {
				return "등록 성공";
			}
			return "등록 실패";

		} catch (Exception e) {
			e.printStackTrace();
			return "등록 실패";
		} finally {
			KdyDBManager.disconnectDB(con, pstmt, null);
		}
	}
}
