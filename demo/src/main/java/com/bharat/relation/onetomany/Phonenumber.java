package com.bharat.relation.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Phonenumber {
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
	@Override
	public String toString() {
		return "Phonenumber [number=" + number + ", telecomCompanyName=" + telecomCompanyName + "]";
	}
	
}
