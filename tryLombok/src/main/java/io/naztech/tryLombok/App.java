package io.naztech.tryLombok;

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
    	Person p=new Person("Minhaz ","Uddin","101056");
    	log.info(p.getFname()+p.getLname());
    	log.debug(p.toString());
    	System.out.println("Debag: this is my debag section ");

        
    }
}
