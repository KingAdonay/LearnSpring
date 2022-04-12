package com.adonay.firstspring.enterpriseapp;

public class Course {
	
	private int id;
	private String title;
	private String instractor;

	public Course(int id, String title, String instractor) {
		this.id=id;
		this.title=title;
		this.instractor=instractor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInstractor() {
		return instractor;
	}

	public void setInstractor(String instractor) {
		this.instractor = instractor;
	}
	
	

}
