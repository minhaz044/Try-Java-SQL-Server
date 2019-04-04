package io.naztech.Dao;

import io.naztech.Services.Student;

public interface StudentDao {
	Student  insert() ;
	default Boolean delete() {
	System.out.println("Warning : Delete Is Not Implemented");
		
		return null;
	}
	default Student update() {
		System.out.println("Warning : Delete Is Not Implemented");
		
		return null;
	}

}
