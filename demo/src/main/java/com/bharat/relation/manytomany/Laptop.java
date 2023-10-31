package com.bharat.relation.manytomany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Laptop {
	@Id
	private int id;
	private String name;
	@ManyToMany
	private List<Student> student=new  ArrayList<Student>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getList() {
		return student;
	}
	public void setList(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", list=" + student + "]";
	}
	
}
