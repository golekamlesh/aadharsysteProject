package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//@Data
@Entity
public class Adhaar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String adhaarname;
	private String adhaaraddressString;
	private String adhaardobString;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAdhaarname() {
		return adhaarname;
	}
	public void setAdhaarname(String adhaarname) {
		this.adhaarname = adhaarname;
	}
	public String getAdhaaraddressString() {
		return adhaaraddressString;
	}
	public void setAdhaaraddressString(String adhaaraddressString) {
		this.adhaaraddressString = adhaaraddressString;
	}
	public String getAdhaardobString() {
		return adhaardobString;
	}
	public void setAdhaardobString(String adhaardobString) {
		this.adhaardobString = adhaardobString;
	}
	public Adhaar(int aid, String adhaarname, String adhaaraddressString, String adhaardobString) {
		this.aid = aid;
		this.adhaarname = adhaarname;
		this.adhaaraddressString = adhaaraddressString;
		this.adhaardobString = adhaardobString;
	}
	public Adhaar() {

	}
	
	
	
	
	
	
}