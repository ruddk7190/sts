package com.hb.ex01.model;

public class UserBean {
	private String id,pw;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", pw=" + pw + "]";
	}
	
	
}
