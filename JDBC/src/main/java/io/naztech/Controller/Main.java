package io.naztech.Controller;

import io.naztech.Services.Student;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Main {

	public static void main(String[] args) {
		
		Student s=new Student("Hello Uddin delete");
		s.insert();
		System.out.println(s.toString());
		s.setName("I am Minhaz 102");
		s.update();
		System.out.println(s.toString());
		s.delete();
		System.out.println(s.toString());

		
	
		
	}
}
