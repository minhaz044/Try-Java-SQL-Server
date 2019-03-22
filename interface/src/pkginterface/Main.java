/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;


/**
 *
 * @author minhaz
 */
public class Main {
    public static void  main(String[] args){
        
    ClassA a=new ClassA();
    classB b=new classB();
    interfaceC c= ()-> {return "This is a Dumy Interface";};

 /*   interfaceC c=new interfaceC(){
        public String show(){
            return "This is a Dumy Interface";
        }
    };
    
    ----type of interfce---
    there are 3 types of interface
    Marker Interface:Blank Interface;
    SAM(single Abstract Method)/Functional Interface:only one Abstact method;
    Normal ;Multiple Method;
    
    */
    System.out.println( c.show());        
    System.out.println(a.grettings());        
    System.out.println(b.sayHello()); 
    System.out.println(a.askCondition()); 
    System.out.println(b.replayCondition()); 
    System.out.println(a.condition());    
    System.out.println(b.sayBye()); 
    System.out.println(a.sayBye()); 
    
    
    
        
    }
    
   
}
