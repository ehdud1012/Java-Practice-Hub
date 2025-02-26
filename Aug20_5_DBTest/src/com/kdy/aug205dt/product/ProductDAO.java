package com.kdy.aug205dt.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.kdy.db.manager.KdyDBManager;

public class ProductDAO {
	
	private static final ProductDAO P_DAO = new ProductDAO();
	
	private ProductDAO() {
		
	}

	public static ProductDAO getpDao() {
		return P_DAO;
	}
	
	public ArrayList<Product> searchProgram(String searchWord) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");
			String sql = "select * from aug19_product where c_name like '%'||?||'%'";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, searchWord);
			rs = pstmt.executeQuery();
			
			// return rs; 이렇게 끝내도 되지만, 
			// V 담당자가 소화하지 못할 가능성 높음 (ResultSet이 특이하고, 사용방법이 복잡)
			//		==> 최대한 간단하게 끝내야함
			ArrayList<Product> products = new ArrayList<Product>();
			Product p;
			while (rs.next()) {
				p = new Product();
				p.setSearchName(rs.getString("c_name"));
				p.setPrice(rs.getInt("c_price"));
				products.add(p);
			}
			return products;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			KdyDBManager.disconnectDB(con, pstmt, null);
		}
		
	}
	
}
