package com.kh.member.model.service;

import java.sql.Connection;

import static com.kh.common.model.vo.JDBCTemplate.*;

import com.kh.common.model.vo.JDBCTemplate;
import com.kh.member.model.dao.MemberDao;
import com.kh.member.model.vo.Member;

public class MemberService {

	public Member loginMember(String memberId, String memberPwd) {
		
		Connection conn = getConnection();
		Member m = new MemberDao().loginMember(conn, memberId, memberPwd);

		//------------------------------------------------------------------
		
		close(conn);
		return m;
		
		
	}

}
