package io.naztech.Services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentJUnityTest {


	
	@Test
	void test() {
		System.out.println("-------------------------------------Test Section-------------------------------------");
		Student s=new Student("Minhaz Uddin");
		assertEquals(s, s.insert());
		s.setName("Minhaz Uddin Ahmed");
		assertEquals(s, s.update()); 
		assertEquals(true,s.equals(Student.Search(s.getId())));
		assertEquals(true, s.delete());
		
		System.out.println("--------------------------------------------------------------------------");

		

		
	}

}
