package io.naztech.Services;

import java.sql.Connection;
import java.sql.DriverManager;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DBCon {
	
	private static Connection connection=null;
	public static Connection getConnection() {
		
		//Connection connection=null;
		if(connection==null) {
			try {
		    	String url="jdbc:sqlserver://vNTDACWSSQLD002:1433;databaseName=DEV_TEST;";
		    	String password="dev_test_dbo123";
		    	String user="dev_test_dbo";
		    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    	connection=DriverManager.getConnection(url, user, password);
		        
			}catch( Exception e){
				log.error("DataBse Connection Failed:"+ e);
				connection=null;
			}
			return connection;
		}else {
			return connection;
		}

        
	}


	
	
	
	
	
	
	
	
}
/*
 * public DBCon() { if(this.connection==null) { this.connection=getConnection();
 * }
 * 
 * }
 */
/*	public Boolean close() {
	if(this.connection!=null) {
		try {
			this.connection.close();
			return true;
		}catch(Exception e) {
			return false;
		}
		
	
	}else return true;
	 




}
*/