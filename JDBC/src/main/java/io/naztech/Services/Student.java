package io.naztech.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import io.naztech.Dao.StudentDao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
@AllArgsConstructor
@ToString
@Slf4j
public class Student implements StudentDao{
	private Integer id=null;
	@Getter @Setter String name=null;
	@Getter @Setter String created_at=null;
	@Getter @Setter String updated_at=null;
	public Student(String name) {
	this.name=name;
	
		
	}
	@Override
	public Student insert() {
		try {
			String insertionQuery="insert into student_m044(name,created_at,updated_at) output inserted.id,inserted.name,inserted.created_at,inserted.updated_at values ('"+this.name+"',GETDATE(),"+this.updated_at+")";
			Connection con=DBCon.getConnection();
			Statement statement =con.createStatement();

			ResultSet result=statement.executeQuery(insertionQuery);
			 while(result.next()) 
			 { 
				this.id=Integer.parseInt(result.getString("id"));
				this.name=result.getString("name");
				this.created_at=result.getString("created_at");
				this.updated_at=result.getString("updated_at");
			}
			

		}catch(Exception e) {
			log.error("Insertion Failed:"+ e);
			return null;
		}
		return this;	
	}
	
	
	@Override
	public Student update() {
		try {
			String insertionQuery="update student_m044 Set name='"+this.name+"',updated_at=GETDATE() output inserted.id,inserted.name,inserted.created_at,inserted.updated_at  where id="+this.id+"";
			Connection con=DBCon.getConnection();
			Statement statement =con.createStatement();
			ResultSet result=statement.executeQuery(insertionQuery);
			 while(result.next()) 
			 { 
				this.id=Integer.parseInt(result.getString("id"));
				this.name=result.getString("name");
				this.created_at=result.getString("created_at");
				this.updated_at=result.getString("updated_at");
			}
		}catch(Exception e) {
			log.error("Insertion Failed:"+ e);
			return null;
		}
		return this;	
	}
	
	@Override
	public Boolean delete() {
		try {
			String insertionQuery="DELETE FROM student_m044 WHERE id="+this.id+"";
			Connection con=DBCon.getConnection();
			Statement statement =con.createStatement();
			int result=statement.executeUpdate(insertionQuery);
			if(result==1) {
				this.id=null;
				this.name=null;
				this.updated_at=null;
				this.created_at=null;
				return true;
				
			}else return false;
			

		}catch(Exception e) {
			log.error("Insertion Failed:"+ e);
			return false;
		}
			
	}		
	
	
	
	
	
	
	
	
	

}
