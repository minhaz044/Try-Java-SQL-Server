package Main;

import com.naztech.services.Student;


public class Main {
	public static void main(String[] args) throws Exception{
		Student s=new Student("1","Minhaz Uddin");
		System.out.println("S="+s);
		Student s2=(Student)s.clone();
		System.out.println("S2="+s2);
		s2.name="Hello";
		System.out.println("S="+s);
		System.out.println("S2="+s2);
	
	}

}
