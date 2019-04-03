package io.naztech.Services;

import io.naztech.Dao.StudentDao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import java.sql.*;
@Getter
@Setter 
@AllArgsConstructor
@ToString
@Slf4j
public class Student implements StudentDao{
	Integer id;
	String fname;
	String lname;
	String dateOfBirth;
	public Student(Integer id) {
	this.id=id;
	
		
	}
	@Override
	public Student insert(Student s) {
		// TODO Auto-generated method stub
		//Class.forName(className);
		return this;
		
	}

}
