package com.cp.onlinemovieticketsystem.dto;

import java.math.BigInteger;

public class Screen {
	String screenName;
	long screenId;
	long rows;
	long columns;
	public Screen(String screenName,long screenId,long rows,long columns)
	{
		this.screenName=screenName;
		this.screenId=screenId;
		this.rows=rows;
		this.columns=columns;
	}
	
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public long getScreenId() {
		return screenId;
	}
	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}
	public long getRows() {
		return rows;
	}
	public void setRows(long rows) {
		this.rows = rows;
	}
	public long getColumns() {
		return columns;
	}
	public void setColumns(long columns) {
		this.columns = columns;
	}

}
