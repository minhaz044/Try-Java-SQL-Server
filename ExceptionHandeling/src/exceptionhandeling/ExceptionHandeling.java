/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandeling;

import java.util.Scanner;

/**
 *
 * @author minhaz
 */
public class ExceptionHandeling {

    /**
     * @param args the command line arguments
     */
/*        
        Throwable
                -Exception
                        -Checked
                            -IOException
                            -SQLException
                         
                        -Unchecked
                            RuntimeException
                
                -Error    
        
 */ 
    public static void main(String[] args) {

      int i,k=0,j;
      i=8;
      j=0;

      Scanner n=new Scanner(System.in);
      
      int a=n.nextInt();
        System.out.println(a);
      
      try
      {
        k=i/j;
      }
      catch(ArithmeticException e){
         System.out.println("Can't Divide By Zero");
      }
        System.out.println(k);
        
        
    }
    
}
