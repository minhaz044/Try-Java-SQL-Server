
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> studentList=new ArrayList<Student>(); 
		studentList.add(new Student(5,"M"));
		studentList.add(new Student(4,"Z"));
		studentList.add(new Student(1,"X"));
		studentList.add(new Student(18,"D"));
		studentList.add(new Student(0,"C"));
		studentList.add(new Student(2,"N"));
		studentList.add(new Student(3,"O"));
		Collections.sort(studentList,new SortById());
		for(Student s:studentList) {
			System.out.println(s.getId());
		}
		Collections.sort(studentList,new SortByName());
		for(Student s:studentList) {
			System.out.println(s.getName());
		}		
	}
}
