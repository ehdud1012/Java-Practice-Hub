package com.kdy.aug211jl.snack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.kdy.db.manager.KdyDBManager;

// java.util.Date : 일반적
// java.sql.Date : DB작업 XX
// 		어차피 스프링 가면 java.util.Date 사용
// 		SQL에 to_date 함수가 있음
// 		java.sql.Date -> java.sql.Date 변환 자동 

public class SnackDAO {
	private int allSnackCount;
	private int snackPerPage;
	private static final SnackDAO SDAO = new SnackDAO();

	private SnackDAO() {
		setAllSnackCount(); // 한번 쓰면 변화가 있지 않는 이상 그대로니까 싱글턴 활용
		snackPerPage = 3;
	}

	public static SnackDAO getSdao() {
		return SDAO;
	}

	public String snackLeg(Snack s) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");

			// String -> Date : 자동으로 해줌
			String sql = "insert into aug21_snack values (aug21_snack_seq.nextval, ?, ?, ?, to_date(?, 'YYYY-MM-DD'), ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, s.getS_name());
			pstmt.setInt(2, s.getS_price());
			pstmt.setDouble(3, s.getS_weight());
			pstmt.setString(4, s.getS_exp2());
			pstmt.setString(5, s.getS_c_name());

			if (pstmt.executeUpdate() == 1) {
				allSnackCount++; // 등록 성공할 때만 1++
				System.out.println(allSnackCount);
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

	public ArrayList<Snack> snackGet(int page) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");

			// rownum 사용을 위해 계산식 세우기
			int start = (page - 1) * snackPerPage + 1;
			int end = page * snackPerPage;
			// end = (end > allSnackCount) ? allSnackCount : end; 굳이 계산할 필요 없음 어차피 데이터가 없어서 안나올테니까

			// rownum 사용
			String sql = "select * from (select rownum as rn, s_no, s_name, s_price, s_weight, s_exp, s_c_name from"
					+ "(select * from aug21_snack order by s_name, s_price)) where rn >= ? and rn <= ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();
			
			ArrayList<Snack> snacks = new ArrayList<Snack>();
			while (rs.next()) {
				snacks.add(new Snack(rs.getInt("s_no"), rs.getString("s_name"), rs.getInt("s_price"),
						rs.getDouble("s_weight"), rs.getDate("s_exp"), rs.getString("s_c_name")));
			}
			return snacks;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			KdyDBManager.disconnectDB(con, pstmt, rs);
		}

	}

	public void setAllSnackCount() { // 과자 갯수 세기 / DB서버 괴롭히지 말고, 싱글턴 활용하

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = KdyDBManager.connectDB("jdbc:oracle:thin:@192.168.0.55:1521:xe", "ehdud1012", "1012");
			String sql = "select count(*) from AUG21_SNACK";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			rs.next();
			allSnackCount = rs.getInt("count(*)"); // 한번만 세팅

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			KdyDBManager.disconnectDB(con, pstmt, rs);
		}
	}

	public int getPageCount() { // 페이지 계산
		return (int) Math.ceil(allSnackCount / (double) snackPerPage);
	}
}
