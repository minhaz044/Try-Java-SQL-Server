package com.naztech.services;

import java.io.Serializable;

public class Student implements Serializable {
 public int age;
 public String Name;
@Override
public String toString() {
	return "Student [age=" + age + ", Name=" + Name + "]";
}
 
 
}
