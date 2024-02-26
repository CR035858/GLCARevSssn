package com.gl.ccms.labwk16d03dem1.model;

public class Library {
	

	private long id;
	private  String name;
	private String commaSeperatedBooknames;
	private String subject;
	private String publisher;
	
	public Library() {
		super();
	}

	public Library(long id, String name, String commaSeperatedBooknames, String subject, String publisher) {
		super();
		this.id = id;
		this.name = name;
		this.commaSeperatedBooknames = commaSeperatedBooknames;
		this.subject = subject;
		this.publisher = publisher;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCommaSeperatedBooknames() {
		return commaSeperatedBooknames;
	}

	public void setCommaSeperatedBooknames(String commaSeperatedBooknames) {
		this.commaSeperatedBooknames = commaSeperatedBooknames;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", commaSeperatedBooknames=" + commaSeperatedBooknames
				+ ", subject=" + subject + ", publisher=" + publisher + "]";
	}
	
	
}
