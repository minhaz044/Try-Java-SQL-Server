package com.naztech.services;

public class Student  implements Cloneable   {
	public String name="15";
	public String id="10";
	public Student(String i,String n){
		this.name=n;
		this.id=i;
	}
	public Student() {
		
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
}
