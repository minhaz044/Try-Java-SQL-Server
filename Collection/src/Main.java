
public class Main {
	public static void main(String[] args) {
		
		
		
		Student stu= new Student(1,"Minhaz Uddin","12345","CSE",3.87);
		String[] info=stu.returnInArray();
	
	
	 
		System.out.println(info[0].trim().startsWith("12")?"This Statement True":"This Statement False");
		System.out.println(info[1].trim().isEmpty()?"This String is Empty":"This String is not Empty");
		String name=info[1].toLowerCase();
		int indexNo=name.indexOf("C");
		String newName=name.replace("m","M");
        
		
		System.out.println(indexNo);
		System.out.println(info[0]);
		System.out.println(info[0]);
		System.out.println(name);
		System.out.println(newName);
		
		for(String i:stu.returnInArray()) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
