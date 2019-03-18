package com.naztech.Controller;

import com.naztech.Dao.Calculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10.0/0.0);
		Calculator add=(Number a,Number b)->{
			  return a.doubleValue() + b.doubleValue();
	  };
	  	Calculator sub=(Number a,Number b)->{
		  return a.doubleValue() - b.doubleValue();
	  };
	  	Calculator mul=(Number a,Number b)->{
		  return a.doubleValue() * b.doubleValue();
	  };
	
	  Calculator div=(Number a,Number b)->{
		  Double result=null;
		  try {
			  result= a.doubleValue() / b.doubleValue();
		  }catch(Exception e){
			  System.out.println(e);
		  }finally {
			  return result;
		  }
	  	};		  
	   System.out.println((int)(add.calculate(10, 20)));
	   System.out.println((int)(sub.calculate(10, 20)));
	   System.out.println((int)(mul.calculate(10, 20)));
	   System.out.println((div.calculate(10, 0)));
	}

}
