package com.bharat.relation.onetomany;
import java.util.ArrayList;
import java.util.List;

import com.bharat.relation.onetomany.Phonenumber;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Person {
	@Id
	private String name;
	@OneToMany
	private List<Phonenumber> phonenumber = new ArrayList<Phonenumber>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Phonenumber> getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(List<Phonenumber> phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", phonenumber=" + phonenumber + "]";
	}
	
	 
	
	
	 
	
}

