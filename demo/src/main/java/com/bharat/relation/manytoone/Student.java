package com.bharat.relation.manytoone;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	@OneToMany
	private List<Subject> list=new ArrayList<Subject>();
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Subject> getList() {
		return list;
	}
	public void setList(List<Subject> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", list=" + list + "]";
	}
	
}
