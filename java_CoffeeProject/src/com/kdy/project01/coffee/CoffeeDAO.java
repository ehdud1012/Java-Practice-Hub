package com.kdy.project01.coffee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.kdy.db.manager.KdyDBManager;
import com.kdy.project01.main.ConsoleScreen;

public class CoffeeDAO {
	private int allMenuCount;
	private int MenuPerPage;

	private static final CoffeeDAO CPAO = new CoffeeDAO();

	private CoffeeDAO() {
		MenuPerPage = 3;
	}

	public static CoffeeDAO getCpao() {
		return CPAO;
	}

	public ArrayList<Coffee> searchCafe(String searchWord, int page) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");
			int start = (page - 1) * MenuPerPage + 1;
			int end = page * MenuPerPage;

			String sql = "select * from (select rownum as rn, m_no, m_name, m_price, m_size, m_calorie, m_c_name "
					+ "from (select * from kdy01_coffeemenu "
					+ "where m_c_name = (select c_name from kdy01_coffeecompany "
					+ "where c_name like '%'||?||'%') order by m_name)) " + "where rn >= ? and rn <= ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, searchWord);
			pstmt.setInt(2, start);
			pstmt.setInt(3, end);
			rs = pstmt.executeQuery();
			ArrayList<Coffee> coffees = new ArrayList<Coffee>();
			while (rs.next()) {
				coffees.add(new Coffee(rs.getInt("m_no"), rs.getString("m_name"), rs.getInt("m_price"),
						rs.getInt("m_size"), rs.getInt("m_calorie"), rs.getString("m_c_name")));
			}
			return coffees;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			KdyDBManager.disconnectDB(con, pstmt, null);
		}
	}

	public ArrayList<Coffee> searchMenu(String searchWord) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");

			String sql = "select * from kdy01_coffeemenu where m_name like '%'||?||'%' order by m_name";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, searchWord);
			rs = pstmt.executeQuery();
			ArrayList<Coffee> coffees = new ArrayList<Coffee>();
			while (rs.next()) {
				coffees.add(new Coffee(rs.getInt("m_no"), rs.getString("m_name"), rs.getInt("m_price"),
						rs.getInt("m_size"), rs.getInt("m_calorie"), rs.getString("m_c_name")));
			}
			return coffees;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			KdyDBManager.disconnectDB(con, pstmt, null);
		}

	}

	public void setAllMenuCount(String searchWord) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ConsoleScreen cs = new ConsoleScreen();
		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");
			String sql = "select count(*) from kdy01_coffeemenu "
					+ "where m_c_name = (select c_name from kdy01_coffeecompany "
					+ "where c_name like '%'||?||'%') order by m_name";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, searchWord);
			rs = pstmt.executeQuery();
			rs.next();
			allMenuCount = rs.getInt("count(*)"); // 한번만 세팅
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			KdyDBManager.disconnectDB(con, pstmt, rs);
		}
	}

	public String coffeeLeg(Coffee c) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");

			// String -> Date : 자동으로 해줌
			String sql = "insert into kdy01_coffeemenu values (kdy01_coffeemenu_seq.nextval, ?, ?, ?, ?, ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, c.getName());
			pstmt.setInt(2, c.getPrice());
			pstmt.setInt(3, c.getSize());
			pstmt.setInt(4, c.getCalorie());
			pstmt.setString(5, c.getC_name());

			if (pstmt.executeUpdate() == 1) {
				allMenuCount++;
				// System.out.println(allMenuCount);
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

	public int getPageCount() { // 페이지 계산
		return (int) Math.ceil(allMenuCount / (double) MenuPerPage);
	}
}
