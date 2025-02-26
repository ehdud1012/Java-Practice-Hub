package com.kdy.project01.cafe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import com.kdy.db.manager.KdyDBManager;
import com.kdy.project01.main.ConsoleScreen;

public class CafeDAO {
	private int allCafeCount;
	private int cafePerPage;
	
	private static final CafeDAO CpDAO = new CafeDAO();
	
	private CafeDAO() {
		setAllCafeCount();
		cafePerPage = 3;
	}

	public static CafeDAO getCpdao() {
		return CpDAO;
	}
	public void setAllCafeCount() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ConsoleScreen cs = new ConsoleScreen();
		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");
			String sql = "select count(*) from kdy01_coffeecompany";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			allCafeCount = rs.getInt("count(*)"); // 한번만 세팅
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			KdyDBManager.disconnectDB(con, pstmt, rs);
		}
	}
	public int getPageCount() { // 페이지 계산
		return (int) Math.ceil(allCafeCount / (double) cafePerPage);
	}
	
	
	
	public ArrayList<Cafe> registeredCafe(int page) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");

			int start = (page - 1) * cafePerPage + 1;
			int end = page * cafePerPage;
			String sql = "select * from (select rownum as rn, c_name, c_storenum from ( select * from kdy01_coffeecompany)) where rn >= ? and rn <= ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();
			ArrayList<Cafe> cafes = new ArrayList<Cafe>();
			while (rs.next()) {
				cafes.add(new Cafe(rs.getString("c_name"), rs.getInt("c_storenum")));
			}
			return cafes;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			KdyDBManager.disconnectDB(con, pstmt, null);
		}
	}
	public String cafeLeg(Cafe c) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");

			// String -> Date : 자동으로 해줌
			String sql = "insert into kdy01_coffeecompany values (?, ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, c.getName());
			pstmt.setInt (2, c.getStorenum());

			if (pstmt.executeUpdate() == 1) {
				allCafeCount ++;
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
