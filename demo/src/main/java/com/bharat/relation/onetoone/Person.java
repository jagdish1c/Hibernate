package com.bharat.relation.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private String name;
	@OneToOne
	private PhoneNumber phonenumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PhoneNumber getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(PhoneNumber phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", phonenumber=" + phonenumber + "]";
	}

	
}
