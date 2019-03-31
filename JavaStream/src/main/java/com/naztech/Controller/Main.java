package com.naztech.Controller;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.naztch.Services.Person;
import com.naztech.Dao.Gender;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List<String> list=Arrays.asList("Minhaz","Uddin","Shipon","Das");
		System.out.println("Using Lambada Expression ");
		list.forEach(s->System.out.println(s));
		System.out.println("Using builtIn Method Reference ");
		list.forEach(System.out::println);
		System.out.println("Using Method Reference ");
		list.forEach(Main::print);
		System.out.println("---------printing Values Using Stream Api ");
		list.stream().map(x->x+"After Mapping").forEach(i->System.out.println(i));
		
		/*
		 * Intermadite Operation 
		 * 			Map
		 * 			Filter
		 * 			Sorted
		 *terMinal Operation
		 *			collect
		 *			forEach
		 *			Reduce 
		 * 
		 * 
		 */
		
		List<Person> p=Arrays.asList(
				new Person("Minhaz","Uddin","22",Gender.Male,"25000"),
				new Person("Micvnhaz","cvc","22",Gender.Male,"5000"),
				new Person("sdfvdsaf","Uddzvzxcvin","58",Gender.Female,"15000"),
				new Person("vzxccxv","vvv","12",Gender.Female,"35000"),
				new Person("vzxccxv","vvv","12",Gender.Male,"35000")
				);
		 
		System.out.println("---------After doing bla bla  ");
		List<Person> p1=null;
		p.stream().filter((s)->s.getFirstName().startsWith("s")).forEach(i-> System.out.println(i));
		/*
		 * Person/employee Total salary.
		 */
		int totalSalary=p.stream().map(i-> Integer.parseInt(i.getSalary())).reduce(0,(total,salary)->total+salary);
		System.out.println(totalSalary);
		/*
		 * Person/employee Whose salary is over 3000
		 */
		System.out.println("This is Our Employee list with salary less then 30000");
		p.stream().filter(i-> (Integer.parseInt(i.getSalary())>30000)).forEach(s->System.out.println(s));
		System.out.println("This is Our Employee list with salary less then 30000 And Who is Female ");
		p.stream().filter(i-> ((Integer.parseInt(i.getSalary())>30000)&& i.getGender()==Gender.Female)).forEach(s->System.out.println(s));
		System.out.println("This is Our Employee list with salary less then 30000 And Who is Male ");		
		p.stream().filter(i-> ((Integer.parseInt(i.getSalary())>30000)&& i.getGender()==Gender.Male)).forEach(s->System.out.println(s));
		String s1="Hello";
		Optional<String> ss1=Optional.ofNullable(s1);
		System.out.println(ss1);
		
		
		
		
	}
	static void  print(String s) {
		System.out.println(s);  
	}

}
