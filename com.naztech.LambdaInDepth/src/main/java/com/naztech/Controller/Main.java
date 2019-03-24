package com.naztech.Controller;

import com.naztech.Dao.Greeter;
import com.naztech.Dao.Gretting;

public class Main {

	public static void main(String[] args) {
		
		Gretting gretting =()-> "Hello, This is a lembda Expression";

		Greeter gretter=( go)-> {return go.caller()+"Updated at Performer";};
		System.out.println(gretter.performer(gretting));		
		System.out.println(gretter.performer(()-> "Hello,This is a lembda Expression but with out any referance"));
	}
  
}
