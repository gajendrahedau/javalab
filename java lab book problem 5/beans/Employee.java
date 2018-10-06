package com.cg.labbook.lab5.beans;

public class Employee {
	int id;
	String name,designation,insuranceScheme;
	float salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String designation,
			String insuranceScheme, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
		this.salary = salary;
	}
	
	public Employee( int id,String name, String designation, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation="
				+ designation + ", insuranceScheme=" + insuranceScheme
				+ ", salary=" + salary + "]";
	}
	
}
