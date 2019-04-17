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

public class Student implements StudentDao {
	private static Connection connection = null;
	static {
		connection = DBCon.getConnection();
	}
	@Getter
	@Setter
	private Integer id = null;
	@Getter
	@Setter
	String name = null;
	@Getter
	@Setter
	String created_at = null;
	@Getter
	@Setter
	String updated_at = null;

	public Student(String name) {
		this.name = name;

	}

	private Student() {

	}

	public static Student Search(Integer id) {
		Student s044 = new Student();
		try {
			String insertionQuery = "Select * from student_m044 where id=" + id;
			// Connection con=DBCon.getConnection();
			Statement statement = connection.createStatement();

			ResultSet result = statement.executeQuery(insertionQuery);
			while (result.next()) {
				s044.id = Integer.parseInt(result.getString("id"));
				s044.name = result.getString("name");
				s044.created_at = result.getString("created_at");
				s044.updated_at = result.getString("updated_at");

			}
			return s044;

		} catch (Exception e) {
			log.error("Search Failed:" + e);
			return null;
		}

	}

	public Student Search() {
		if (this.id == null) {

			log.error("Invalid Sudent Id:Please Insert  a Student Id Before Search \n OR Use Static Search Method");
			return null;
		}
		try {
			String insertionQuery = "Select * from student_m044 where id=" + this.id;
			// Connection con=DBCon.getConnection();
			Statement statement = connection.createStatement();

			ResultSet result = statement.executeQuery(insertionQuery);
			while (result.next()) {
				this.id = Integer.parseInt(result.getString("id"));
				this.name = result.getString("name");
				this.created_at = result.getString("created_at");
				this.updated_at = result.getString("updated_at");
			}

		} catch (Exception e) {
			log.error("Search Failed:" + e);
			return null;
		}

		return this;
	}

	@Override
	public Student insert() {
		try {
			String insertionQuery = "insert into student_m044(name,created_at,updated_at) output inserted.id,inserted.name,inserted.created_at,inserted.updated_at values ('"
					+ this.name + "',GETDATE()," + this.updated_at + ")";
			// Connection con=DBCon.getConnection();
			Statement statement = connection.createStatement();

			ResultSet result = statement.executeQuery(insertionQuery);
			while (result.next()) {
				this.id = Integer.parseInt(result.getString("id"));
				this.name = result.getString("name");
				this.created_at = result.getString("created_at");
				this.updated_at = result.getString("updated_at");
			}

		} catch (Exception e) {
			log.error("Insertion  Failed:" + e);
			return null;
		}
		return this;
	}

	@Override
	public Student update() {
		try {
			String insertionQuery = "update student_m044 Set name='" + this.name
					+ "',updated_at=GETDATE() output inserted.id,inserted.name,inserted.created_at,inserted.updated_at  where id="
					+ this.id + "";
			// Connection con=DBCon.getConnection();
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(insertionQuery);
			while (result.next()) {
				this.id = Integer.parseInt(result.getString("id"));
				this.name = result.getString("name");
				this.created_at = result.getString("created_at");
				this.updated_at = result.getString("updated_at");
			}
		} catch (Exception e) {
			log.error("update Failed:" + e);
			return null;
		}
		return this;
	}

	@Override
	public Boolean delete() {
		try {
			String insertionQuery = "DELETE FROM student_m044 WHERE id=" + this.id + "";
			// Connection con=DBCon.getConnection();
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(insertionQuery);
			if (result == 1) {
				this.id = null;
				this.name = null;
				this.updated_at = null;
				this.created_at = null;
				return true;

			} else
				return false;

		} catch (Exception e) {
			log.error("delete Failed:" + e);
			return false;
		}

	}

	public boolean equals(Student obj) {

		return (this.created_at.equals(obj.created_at)  && this.id.equals(obj.id)  && this.name.equals(obj.name)
				&& this.updated_at.equals(obj.updated_at) );
	}
/*
	private Boolean strcom(String x, String y) {

		Integer l1 = x.length();
		Integer l2 = x.length();
		if (l1 != l2) {
			return false;
		} else {
			for (int i = 0; i < l1 / 2; i++) {
				if (x.charAt(i) != y.charAt(i) && x.charAt(l1 - 1 - i) == y.charAt(l1 - 1 - i)) {
					return false;
				}

			}
			return true;
		}

	}
*/
}
