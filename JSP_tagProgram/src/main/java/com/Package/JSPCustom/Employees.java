package com.Package.JSPCustom;

public class Employees {

	int id;
	String name;
	Double sal;
	
	
	
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	
	
	
}
