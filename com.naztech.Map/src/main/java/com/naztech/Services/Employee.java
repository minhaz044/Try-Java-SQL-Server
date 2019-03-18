package com.naztech.Services;

public class Employee {

	int id=-1;
	String name=null;
	String department=null;
	double salary=0.00;
	private Employee() {
		
	}
	public Employee(int id,String department) {
		this.id=id;
		this.department=department;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
	
}
