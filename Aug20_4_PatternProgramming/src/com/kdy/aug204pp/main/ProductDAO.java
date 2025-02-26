 package com.kdy.aug204pp.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.kdy.db.manager.KdyDBManager;

// DAO (Data/DB Access Object)
//		M인데 DB 작업하는
// M : 실무에서 내가 작업할 곳
public class ProductDAO { // 대부분 싱글톤
	
	private static final ProductDAO PDAO = new ProductDAO();
	
	private ProductDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static ProductDAO getInstance() {
		return PDAO;
	}

	public String reg(Product p) { // 신입이 try-catch를? 상황상 어쩔수업씀
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");
			String sql = "insert into aug19_product values (aug19_product_seq.nextval, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getPrice());
			
			if (pstmt.executeUpdate() == 1) {
				// System.out.println("등록 성공"); // 이건 v인데!
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
