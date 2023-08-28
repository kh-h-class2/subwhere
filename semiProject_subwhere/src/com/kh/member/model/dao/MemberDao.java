package com.kh.member.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import static com.kh.common.model.vo.JDBCTemplate.*;
import com.kh.member.model.vo.Member;

public class MemberDao {
	
	private Properties prop = new Properties();
	
	public MemberDao() { 
		
		String filePath = MemberDao.class.getResource("/db/sql/member-mapper.xml").getPath();

		try {
			prop.loadFromXML(new FileInputStream(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Member loginMember(Connection conn, String memberId, String memberPwd) {
		// select문 => ResultSet객체 필요(한 행) = > Member 객체
		
				Member m = null;
				
				PreparedStatement pstmt = null;
				ResultSet rset = null;
				
				try {
					
					String sql = prop.getProperty("loginMember");
					
					pstmt = conn.prepareStatement(sql); // 미완성된 쿼리
					
					pstmt.setString(1, memberId);
					pstmt.setString(2, memberPwd);
					
					rset = pstmt.executeQuery();
					// pstmt 쿼리를 돌려서 rset에 담아라
					// 조회된 결과가 있다면 한 행 | 조회결과 없다고 하면 아무것도 안 담김
					
					if(rset.next()) {
						// new Member(~~) => 매개변수 생성자 생성
						// rset에는 db의 컬럼이 들어감 => get~ 가져올 때는 변수명이 아닌 컬럼명 그대로! 써야 함 => 오타나거나 없는 컬럼 쓰면 "부적절한 인덱스~" 오류 뜸
						m = new Member(rset.getInt("MEMBER_NO"),
									   rset.getString("MEMBER_NAME"),
									   rset.getString("MEMBER_ID"),
									   rset.getString("MEMBER_PWD"),
									   rset.getString("PHONE"), 
									   rset.getString("EMAIL"), 
									   rset.getString("NICKNAME"), 
									   rset.getString("STATUS"), 
									   rset.getString("ENROLL_DATE"),
									   rset.getString("PROFILE_IMG"));
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally {
					close(rset);
					close(pstmt);
				}
				
				return m;
	}	

}
