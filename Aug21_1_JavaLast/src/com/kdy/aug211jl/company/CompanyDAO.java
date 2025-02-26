package com.kdy.aug211jl.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.kdy.db.manager.KdyDBManager;

public class CompanyDAO {

	private static final CompanyDAO CDAO = new CompanyDAO();
	private CompanyDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static CompanyDAO getCdao() {
		return CDAO;
	}
	
	public String companyLeg(Company c) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");
			String sql = "insert into aug21_company values (?, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, c.getCompanyName());
			pstmt.setString(2, c.getCompanyLoc());
			pstmt.setInt(3, c.getCompanyEmp());
			
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
	
	public ArrayList<Company> companyGet() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");
			String sql = "select * from aug21_company order by c_name";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ArrayList<Company> companys = new ArrayList<Company>();
			while (rs.next()) {
				companys.add(
					new Company(
						rs.getString("c_name"),
						rs.getString("c_location"),
						rs.getInt("c_employees")
					)
				); // 줄여쓰기
			}
			
			return companys;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			KdyDBManager.disconnectDB(con, pstmt, rs);
		}
		
	}
	
	
}
