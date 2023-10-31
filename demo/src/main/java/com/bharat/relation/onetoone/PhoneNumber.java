package com.bharat.relation.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class PhoneNumber {
	@Id
	private int number;
	private String telecomCompanyName;


	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTelecomCompanyName() {
		return telecomCompanyName;
	}
	public void setTelecomCompanyName(String telecomCompanyName) {
		this.telecomCompanyName = telecomCompanyName;
	}
	
}
