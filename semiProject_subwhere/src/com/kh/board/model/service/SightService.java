package com.kh.board.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.board.model.dao.SightDao;
import com.kh.board.model.vo.Sight;
import com.kh.board.model.vo.Uploadfile;

import static com.kh.common.JDBCTemplate.*;
import com.kh.common.model.vo.PageInfo;

public class SightService {

	public ArrayList<Sight> selectList(PageInfo pi) {
		
		Connection conn = getConnection();
		ArrayList<Sight> list = new SightDao().selectList(conn, pi);
		close(conn);
		
		
		return list;
	}

	public int selectListCount() {
		Connection conn = getConnection();
		int listCount = new SightDao().selectListCount(conn);
		
		close(conn);
		
		return listCount;
	}

	public int insertSightBoard(Sight s, ArrayList<Uploadfile> list) {
		
		Connection conn = getConnection();
		int result1 = new SightDao().insertSightBoard(conn,s);
		
		
		
		return 0;
	}

	

}
