package com.naztech.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.naztech.Dao.Greeter;
import com.naztech.Dao.Gretting;
import com.naztech.Services.Person;;
public class Main {

	public static void main(String[] args) {
		
		Gretting gretting =()-> "Hello, This is a lembda Expression";

		Greeter gretter=( go)-> {return go.caller()+"Updated at Performer";};
		System.out.println(gretter.performer(gretting));		
		System.out.println(gretter.performer(()-> "Hello,This is a lembda Expression but with out any referance"));
		List<Person> person =new ArrayList<>();
		person.add(new Person("Minhaz","b",22));
		person.add(new Person("Minhaz","f",22));
		person.add(new Person("Minhaz","c",22));
		person.add(new Person("Minhaz","a",22));
		person.add(new Person("Minhaz","l",22));
		person.add(new Person("Minhaz","d",22));		
		Collections.sort(person,(o1, o2)-> o1.getLastName().compareTo(o2.getLastName()));
		System.out.println(person);
		

	
	}
  
}
