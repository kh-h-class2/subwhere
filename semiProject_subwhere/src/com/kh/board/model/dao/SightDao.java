package com.kh.board.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.board.model.vo.Sight;
import static com.kh.common.JDBCTemplate.*;
import com.kh.common.model.vo.PageInfo;

public class SightDao {

	private Properties prop = new Properties();
	
	public SightDao() {
		try {
			prop.loadFromXML(new FileInputStream(SightDao.class.getResource("/db/sql/sight-mapper.xml").getPath()));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public ArrayList<Sight> selectList(Connection conn, PageInfo pi) {
		
		ArrayList<Sight> list = new ArrayList<Sight>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectList");
		int startRow = (pi.getCurrentPage() - 1) * pi.getBoardLimit() +1;
		int endRow = startRow + pi.getBoardLimit() -1;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rset = pstmt.executeQuery();
			while(rset.next()) {
				list.add(new Sight(rset.getString("board_no"),
								   rset.getInt("station_no"),
								   rset.getString("title"),
								   rset.getString("content"),
								   rset.getDate("modify_date"),
								   rset.getString("dtn_name"),
								   rset.getString("status")
								   ));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		
		
		return list;
	}

	public int selectListCount(Connection conn) {
		int listCount = 0;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectListCount");
		
		try {
			pstmt= conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				listCount = rset.getInt("count");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		
		
		
		return listCount;
	}
	
	
	
	
}
