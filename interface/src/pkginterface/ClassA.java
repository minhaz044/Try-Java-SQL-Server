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
public class ClassA implements interfaceA,interfaceB {
    @Override
    public String grettings(){
        return "Hi";
    }
   @Override
    public String sayHello(){
        return "Hello";
    }
   @Override    
    public String sayBye(){
        return "ok,Bye,see you next time ";
    }

   @Override    
    public String askCondition(){
        return "How Are You?";
    
    }
   @Override    
    public String replayCondition(){
        return "I am Fine.And You?";
    }
    @Override
    public String condition(){
        return "I am Fine";
    }
    
    
}
