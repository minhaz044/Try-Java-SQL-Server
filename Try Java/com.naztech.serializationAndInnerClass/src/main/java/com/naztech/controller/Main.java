package com.naztech.controller;

import com.naztech.services.InnerAnnomiousNestedClass;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		Student s=new Student();
		s.Name="Minhaz";
		s.age=22;
		File file=new File("File.txt");
		FileOutputStream fo=new FileOutputStream (file);
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		oo.writeObject(s);
		
	
		FileInputStream fi=new FileInputStream (file);
		ObjectInputStream oi=new ObjectInputStream(fi);
		Object o=(Student)oi.readObject();
		System.out.println(o.toString());
		*/
		InnerAnnomiousNestedClass n=new InnerAnnomiousNestedClass();
	   BB b=new BB() {
		   @Override
		public void show() {
			System.out.println("Hello How are you");
		}
	};
	  // AA a=new AA();
	}
	class AA{
		void gg() {
			
		}
	}
}
class BB{
	public void show() {
		
	}		
}
