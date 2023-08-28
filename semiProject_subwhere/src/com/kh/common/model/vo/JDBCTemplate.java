package com.kh.common.model.vo;

import java.beans.Statement;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTemplate {
	
	// 1. Connection 객체 생성한 후 해당 Connection 객체를 반환시켜주는 getConnection 메소드
		public static Connection getConnection() {
			
			Connection conn = null;
			
			Properties prop = new Properties(); // Map 계열 컬렉션 (key-value)
			
			// 읽어들이고자 하는 classes 폴더 내에 driver.properties 파일의 물리적인 경로
			String filePath = JDBCTemplate.class.getResource("/db/driver/driver.properties").getPath();
			// C://05_server-workspace2/jsp/WebContent/classes/db/driver.properties
			
			try {
				prop.load(new FileInputStream(filePath));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			
			try {
				// jdbc driver 등록
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				Class.forName(prop.getProperty("driver"));
		
				// 접속하고자 하는 db의 url, 계정명, 비밀번호 제시해서 Connection 객체 생성
				//conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SERVER", "SERVER");
				
				
				conn = DriverManager.getConnection(prop.getProperty("url"),
												   prop.getProperty("username"),
												   prop.getProperty("password"));
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			return conn;
			
		}
		
		
		// 2_1. Connection 객체 전달받아서 commit 시켜주는 commit 메소드
		public static void commit(Connection conn) {
			try {
				if(conn != null && !conn.isClosed()) {
					conn.commit();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		// 2_2. Connection 객체 전달받아서 rollback 시켜주는 rollback 메소드
		public static void rollback(Connection conn) {
			try {
				if(conn != null && !conn.isClosed()) {
					conn.rollback();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		// 3_1. Connection 객체 전달받아서 반납시켜주는 close 메소드
		public static void close(Connection conn) {
			try {
				if(conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		// 3_2. PreparedStatement 객체 전달받아서 반납시켜주는 close 메소드
				public static void close(PreparedStatement pstmt) { // 위에거 오버로딩 메소드(이름은 같고 매개변수만 다름)
					try {
						if(pstmt != null && !pstmt.isClosed()) {
							pstmt.close();
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
		
		
		// 3_3. ResultSet 객체 전달받아서 반납시켜주는 close 메소드
		public static void close(ResultSet rset) { // 위에거 오버로딩 메소드(이름은 같고 매개변수만 다름)
			try {
				if(rset != null && !rset.isClosed()) {
					rset.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

}
