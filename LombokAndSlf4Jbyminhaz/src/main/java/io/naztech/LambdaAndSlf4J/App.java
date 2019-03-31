package io.naztech.LambdaAndSlf4J;

import io.naztech.Services.Person;
import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 *
 */
@Slf4j
public class App 
{
    public static void main( String[] args )
    {
       Person p=new Person("Minhaz Uddin",23);
        System.out.println(p.getName());
        log.info("Name: "+p.getName());
     
       
    }
}
