/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystem;

import java.io.Serializable;


/**
 *
 * @author minhaz
 */
public class Student implements Serializable{
    int id;
    String name;
    String dateOfBirth;
    Student(int id,String name,String dateOfBirth){
       this.id=id;
       this.name=name;
       this.dateOfBirth=dateOfBirth;
        
    }

    
}
