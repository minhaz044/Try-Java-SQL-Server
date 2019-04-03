package io.naztech.Dao;

import io.naztech.Services.Student;


public interface StudentDao {
	Student  insert(Student s) ;
	default Student delete(Student s) {
		
		
		return null;
	}
	default Student update(Student s) {
		return null;
	}

}
