/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringimutation;

/**
 *
 * @author minhaz
 */
public class StringImutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String a="Minhaz";
        String b="Minhaz";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        
        a+="Uddin";
        //b="Minhaz Uddin";
        System.out.println(a);
        System.out.println(b);
                
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
            
        
        

        
        
        
        
    }
    
}
