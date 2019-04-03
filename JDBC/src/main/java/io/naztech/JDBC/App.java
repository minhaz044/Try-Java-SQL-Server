package io.naztech.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import io.naztech.Services.DBCon;


/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	//String query="insert into student_m044(name,created_at) values ('Minhaz Uddin from APP.JAVA',GETDATE())";
    	String query2="Select * from student_m044";
    	Connection con=DBCon.getConnection();
    	System.out.println(con);
    	Statement stmt = con.createStatement();
    	ResultSet result=stmt.executeQuery(query2);
    	//System.out.println(result);
		
		  while(result.next()) { 
			  System.out.println("Id:"+result.getString("id") +"\t"+ "Name:"+result.getString("name"));
			  //log.info(); 
			  
		  }
	
    	
    	
    	

   	
     
    }
}
