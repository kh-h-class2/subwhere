package com.kh.board.model.vo;

import java.sql.Date;

public class Sight {

	private String boardNo;
	private int boardWriter;
	private int stationNo;
	private String title;
	private String content;
	private int count;
	private Date createDate;
	private Date ModifyDate;
	private String dtnName;
	private String address;
	private String transport;
	private String holiday;
	private String runtime;
	private String hashtag;
	private String status;
	
	public Sight(){}
	
	public Sight(String boardNo, int boardWriter, int stationNo, String title, String content, int count,
			Date createDate, Date modifyDate, String dtnName, String address, String transport, String holiday,
			String runtime, String hashtag, String status) {
		super();
		this.boardNo = boardNo;
		this.boardWriter = boardWriter;
		this.stationNo = stationNo;
		this.title = title;
		this.content = content;
		this.count = count;
		this.createDate = createDate;
		ModifyDate = modifyDate;
		this.dtnName = dtnName;
		this.address = address;
		this.transport = transport;
		this.holiday = holiday;
		this.runtime = runtime;
		this.hashtag = hashtag;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Sight [boardNo=" + boardNo + ", boardWriter=" + boardWriter + ", stationNo=" + stationNo + ", title="
				+ title + ", content=" + content + ", count=" + count + ", createDate=" + createDate + ", ModifyDate="
				+ ModifyDate + ", dtnName=" + dtnName + ", address=" + address + ", transport=" + transport
				+ ", holiday=" + holiday + ", runtime=" + runtime + ", hashtag=" + hashtag + ", status=" + status + "]";
	}
	public String getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(String boardNo) {
		this.boardNo = boardNo;
	}
	public int getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(int boardWriter) {
		this.boardWriter = boardWriter;
	}
	public int getStationNo() {
		return stationNo;
	}
	public void setStationNo(int stationNo) {
		this.stationNo = stationNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModifyDate() {
		return ModifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		ModifyDate = modifyDate;
	}
	public String getDtnName() {
		return dtnName;
	}
	public void setDtnName(String dtnName) {
		this.dtnName = dtnName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTransport() {
		return transport;
	}
	public void setTransport(String transport) {
		this.transport = transport;
	}
	public String getHoliday() {
		return holiday;
	}
	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public String getHashtag() {
		return hashtag;
	}
	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Sight(String boardNo, int stationNo, String title, String content, Date modifyDate, String dtnName,
			String status) {
		super();
		this.boardNo = boardNo;
		this.stationNo = stationNo;
		this.title = title;
		this.content = content;
		ModifyDate = modifyDate;
		this.dtnName = dtnName;
		this.status = status;
	}
	
	
	
	
}
