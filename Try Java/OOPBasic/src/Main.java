
public class Main {
	 static int sum(int ...a) {
		int sum=0;
		for(int i:a) {
			sum+=i;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Person p=new Person(1,"Minhaz Uddin",23,"Male","Tongi ,Gazipur,Dhaka");
		
		p.setName("Minhaz Uddin"); System.out.println(p.toString());
		 
		Human h=new Human(1,"Minhaz Uddin",23,"Male","Tongi ,Gazipur,Dhaka","N/A","N/A","N/A");
		System.out.println(h.toString());
		System.out.println(h.study());
		System.out.println(h.exam());
		EmployeeDetails employee1=new EmployeeDetails();
		System.out.println(employee1.attendance());
		
		
		
		
		ClassCounter c1=new ClassCounter();
		ClassCounter c2=new ClassCounter();
		ClassCounter c3=new ClassCounter();
		ClassCounter c4=new ClassCounter();
		ClassCounter c5=new ClassCounter();
		c5=null;
		System.out.println(c1.count());
		
		
		
		
		/*
		 * System.out.println(p.getId()); System.out.println(p.getName());
		 * System.out.println(p.getAge()); System.out.println(p.getGender());
		 * System.out.println(p.getAddress());
		 */
		
		
		
	}
	
	
	

}
