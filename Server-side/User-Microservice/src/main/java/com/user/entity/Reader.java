package com.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Reader {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int readerId;
	
	private String readerName;
	
	private String readerEmail;
	
	private String readerPassword;
	

	private int readerAge;
	
	private String readerNumber;
	
	public Reader() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reader(int readerId, String readerName, String readerEmail, String readerPassword, int readerAge,
			String readerNumber) {
		super();
		this.readerId = readerId;
		this.readerName = readerName;
		this.readerEmail = readerEmail;
		this.readerPassword = readerPassword;
		this.readerAge = readerAge;
		this.readerNumber = readerNumber;
	}

	public int getReaderId() {
		return readerId;
	}

	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}

	public String getReaderName() {
		return readerName;
	}

	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}

	public String getReaderEmail() {
		return readerEmail;
	}

	public void setReaderEmail(String readerEmail) {
		this.readerEmail = readerEmail;
	}

	public String getReaderPassword() {
		return readerPassword;
	}

	public void setReaderPassword(String readerPassword) {
		this.readerPassword = readerPassword;
	}

	public int getReaderAge() {
		return readerAge;
	}

	public void setReaderAge(int readerAge) {
		this.readerAge = readerAge;
	}

	public String getReaderNumber() {
		return readerNumber;
	}

	public void setReaderNumber(String readerNumber) {
		this.readerNumber = readerNumber;
	}
	
}
