package com.bharat.relation.manytomany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Student {
	@Id
	private int id;
	private String name;
	@ManyToMany(mappedBy = "student")
	private List <Laptop> list=new ArrayList<Laptop>();
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
	public List<Laptop> getList() {
		return list;
	}
	public void setList(List<Laptop> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", list=" + list + "]";
	}
	
	
}
