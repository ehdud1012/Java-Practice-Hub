package com.kdy.aug192jdbcp.main;

import java.sql.Connection;
import java.sql.DriverManager;

import oracle.jdbc.driver.OracleDriver;

// OracleDB 를 제어하는 점품 프로그램 -> sqlplus
// sqlplus는 cmd 기반이라 불편 -> 좀 편한 사제품 : eclipse
// Data source explorer 창은 Eclipse라는 프로그램으로 OracleDB를 제어하려고

// 프로그램 == 이클립스 ? ㄴㄴ

// 프로그램, DB서버 통신 => 다른 통신 사용 -> 근데 자바에 없음
// 		Socket 통신 (실시간) - x
// 		HTTP 통신 (요청-응답) - x

// DB서버 메이커 다양한데 통신방식은 같은데 드라이버가 달라서, Java쪽에서 다 만들어줄수가 없음
// 각 DB회사에서 드라이버를 만들어줌
// 우리가 가지고 있는 ojdbc8.jar : Java 1.8이상용 Java + OracleDB 드라이버

// **** ojdbc8.jar 추가 ****

public class ConnectMain {
	public static void main(String[] args) {
		Connection con = null;
		
		try {
			// OracleDriver 쓰렴 : 옛날 방식
			// Class.forName("oracle.jdbc.OracleDriver");
			
			// 양식이 DB메이커별로 다 다름
			// 서버 우클릭-> 맨아래-> Driver Properties
			String url = "jdbc:oracle:thin:@192.168.0.55:1521:xe"; 
			con = DriverManager.getConnection(url, "ehdud1012", "1012");
			System.out.println("연결성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {con.close();} catch (Exception e) {e.printStackTrace();}
	}
}
