package com.naztech.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import com.naztech.Services.Employee;

public class Main {
	


	public static void main(String[] args) {
		
		
		
		ArrayList<Employee> cseEmployeeList=new ArrayList<Employee>();
		cseEmployeeList.add(new Employee(1,"CSE"));
		cseEmployeeList.add(new Employee(2,"CSE"));
		cseEmployeeList.add(new Employee(3,"CSE"));
		cseEmployeeList.add(new Employee(4,"CSE"));
		cseEmployeeList.add(new Employee(5,"CSE"));
		
		
		
		ArrayList<Employee> bbaEmployeeList=new ArrayList<Employee>();
		bbaEmployeeList.add(new Employee(1,"BBA"));
		bbaEmployeeList.add(new Employee(2,"BBA"));
		bbaEmployeeList.add(new Employee(3,"BBA"));
		bbaEmployeeList.add(new Employee(4,"BBA"));
		bbaEmployeeList.add(new Employee(5,"BBA"));
		
		
		HashMap<String,ArrayList<Employee>> map=new HashMap();
		map.put("cse", cseEmployeeList);
		map.put("bba", bbaEmployeeList);
		
		System.out.println(map);
		
		
		HashMap<Integer,String> map1=new HashMap();
		
		map1.put(0,"Minhaz");
		map1.put(1, "Minhaz");
		map1.put(2,"Hello");
		map1.put(3, "How");
		map1.put(4,"Hi");
		map1.put(5, "How");		
		System.out.println("\nThis Is our OutPut:"+Frequency(map1));
		game();
		
		
	}
	public static HashMap<String,Integer> Frequency(HashMap<Integer,String> map) {
		
		HashMap<String,Integer> finalList=new HashMap();
		Set<Integer> key=map.keySet();
		for(int a:key)
		{
			if(!finalList.isEmpty()){
				if(finalList.containsKey(map.get(a))) {
					finalList.put(map.get(a),finalList.get(map.get(a))+1);	
				}else {
					finalList.put(map.get(a),1);
					
				}
			}else {
				finalList.put(map.get(a),1);
			}
		}
		return finalList;
	}
	
	public static void game() {
		System.out.println("Range:0-100 ");
		Random rand = new Random();
		Scanner myObj = new Scanner(System.in);
		int number=rand.nextInt(101);
		int choise=-1;
		System.out.println("My Current Choise: "+number);
		while((choise=myObj.nextInt())!=number) {
			System.out.println(  (choise>number)?"Input is Higher Then Number":"Input is Lower Then Number" );

		}
		System.out.println("Correct Answer!");
		
		
	}
	
	

	
	

}
