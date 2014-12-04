package com.yudi.project.hrd.util;

import java.io.Serializable;
import java.util.List;

public class JsonObject<T> implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -3406769186706129994L;

	int iTotalRecords;

	int iTotalDisplayRecords;

	int sEcho;

	String sColumns;

	List<T> aaData;

	public int getiTotalRecords() {
		return iTotalRecords;
	}

	public void setiTotalRecords(int iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}

	public int getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}

	public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}

	public int getsEcho() {
		return sEcho;
	}
	
	public void setsEcho(int sEcho) {
		this.sEcho = sEcho;
	}
	

	public String getsColumns() {
		return sColumns;
	}

	public void setsColumns(String sColumns) {
		this.sColumns = sColumns;
	}
	
	public List<T> getAaData() {
		return aaData;
	}
	
	public void setAaData(List<T> aaData) {
		this.aaData = aaData;
	}

	
}
