package com.naztch.Services;

import com.naztech.Dao.Gender;

public class Person {
	String firstName;
	String lastName;
	String age;
	Gender gender;
	String salary;
	
	public  String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Person(String firstName, String lastName, String age, Gender gender,String salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Person [Name=" + firstName + lastName + ", age=" + age + ", gender=" + gender
				+  "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
