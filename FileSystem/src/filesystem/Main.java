/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author minhaz
 */
public class Main {
    public static void main(String[] args) {
        File file=new File("StudentInfo.txt");
        
ArrayList<Student> a=new ArrayList();
a.add(new Student(1,"Minhaz Uddin","09/09/196"));
a.add(new Student(1,"Minhaz Uddin","09/09/196"));
a.add(new Student(1,"Minhaz Uddin","09/09/196"));
a.add(new Student(1,"Minhaz Uddin","09/09/196"));        
        
        
       try{
          
           file.createNewFile();
         PrintWriter input=new PrintWriter(file);
         
            for(Student s:a)
           {
               input.print(s);
           }
           input.println(15);
           input.close();
           Scanner output=new Scanner(file);
           System.out.println(output.next()); 
          
           
       }catch(IOException e){
           System.out.println(e);
       }
        




/*
       try{
           
           FileOutputStream fos=new FileOutputStream(file,true);
           ObjectOutputStream oos=new ObjectOutputStream(fos);
           for(Student s:a)
           {
               oos.writeObject(s);
           }
            oos.writeObject(new Student(1,"Last Object","09/09/196"));
           oos.close();
           oos.close();
           
           
       }catch(Exception e){
           System.out.println(e);
       }
*/

ArrayList<Student> a2=new ArrayList();
/*
       try{
           
           FileInputStream fos=new FileInputStream(file);
           ObjectInputStream oos=new ObjectInputStream(fos);
           while(true){
               a2.add((Student)oos.readObject());
           }

           
           
       }catch(Exception e){
           System.out.println(e);
       }
   */     
      
                for(Student s:a2)
           {
               System.out.println(s.name);
           }  
       
       
       
    }

    
}
