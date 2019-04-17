package com.naztech.lambdaExp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.naztech.Dao.Calculator;

public class LambdaExpTest {

	@Test
	public void test() {
		Calculator add=(Number a,Number b)->{
			  return a.doubleValue() + b.doubleValue();
	  };
	  
	  	Calculator sub=(Number a,Number b)->{
		  return a.doubleValue() - b.doubleValue();
	  };
	  
	  
	  	Calculator mul=(Number a,Number b)->{
		  return a.doubleValue() * b.doubleValue();
	  };
	  @SuppressWarnings("finally")
	  Calculator div=(Number a,Number b)->{
		  Double result=null;
		  try {
			  result= a.doubleValue() / b.doubleValue();
			  System.out.println("gfdtfasdgfasd"+result);
		  }catch(ArithmeticException e){
			  System.out.println(e);
		  }finally {
			  return result;
		  }
	  	};	
	  	String a="Infinity";
		assertEquals((int)(add.calculate(10, 20)),30);
		assertEquals((int)(sub.calculate(10, 20)),-10);
		assertEquals((int)(mul.calculate(10, 20)),200);
		assertEquals((div.calculate(10, 0)),"Infinity" );
	}

}
