package io.naztech.io.naztech.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;

import Services.Consumer;
import Services.Function;
import Services.Predicate;
import Services.Supplier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*---------------------Predicate Functional Interface ----------------------*/
    	/* ----------------Using Anonymous Class--------------------- */
        Predicate<String> p=new Predicate<String>() {

			public Boolean test(String t) {
				return t.length()>10;
			}
        };
        System.out.println(p.test("Hello World"));
        /*--------------Using Lambda Expression---------------------*/
        Predicate<String> p1=(t)-> t.length()>10;
        System.out.println( p1.test("Hello World"));
        /*-----------------------------------------------------------*/
            
        
        
        
         
    	/*---------------------Consumer Functional Interface ---------*/
    	/* ----------------Using Anonymous Class--------------------- */
        List<Integer> l=new ArrayList();
        Consumer<List> c=new Consumer<List>() {
			public void add(List t) {
				t.add(10);
			}
        };
        c.add(l);
        System.out.println(l);
        /*--------------Using Lambda Expression---------------------*/
        Consumer<List> c1=(t)->t.add(20);
        c1.add(l);
        System.out.println(l);
       /*-----------------------------------------------------------*/
        
        
     	/*---------------------Function Functional Interface ---------*/
     	/* ----------------Using Anonymous Class--------------------- */
         Function<Double,Integer> f=new Function<Double,Integer>() {
 			@Override
        	 public Integer convert(Double t) {
 			 return t.intValue();
 			}
         };
     
         System.out.println(f.convert(20.35));
         /*--------------Using Lambda Expression---------------------*/
         Function<Double,Integer> f1=(t)->t.intValue();
         System.out.println(f1.convert(30.53));
        /*-----------------------------------------------------------*/
         
      	/*---------------------Supplier  Functional Interface ---------*/
      	/* ----------------Using Anonymous Class--------------------- */
          Supplier<String> s=new Supplier<String>() {
        	  
			@Override
			public String get() {
				return "Hello Grettings";
			}
  		
          };
      
          System.out.println(s.get());
          /*--------------Using Lambda Expression---------------------*/
          Supplier<String> s1=()->"Hello Grettings";
          System.out.println(s1.get());
         /*-----------------------------------------------------------*/
                    
        
        
        
    }
}
