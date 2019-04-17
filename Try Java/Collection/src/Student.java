
public class Student {
	private int id;
	private String name;
	private String password;
	private String department;
	private double cgpa;
	String infoArray[]=new String[5];

	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String[] returnInArray() {
		
		this.infoArray[0]= Integer.toString(this.id);
		this.infoArray[1]=this.name;
		this.infoArray[2]=this.password;
		this.infoArray[3]=this.department;
		this.infoArray[4]=Double.toString(this.cgpa);
		return infoArray;

		
	}
	public Student(int id, String name, String password, String department, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.department = department;
		this.cgpa = cgpa;
		
	}
	
	

}
