import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class Employee {

	public static void main(String[] args) {
		
		 String employeeName="Minhaz Uddin";
		 int employeeId=1;
		 double salary=30000.0;
		  String department="CSE";
		 String[] array={Integer.toString(employeeId),employeeName,Double.toString(salary),department};
		
		List<Integer> c= new ArrayList<>();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		c.add(5);
		c.add(6);
		c.add(7);
		c.add(8);
		c.add(9);
		c.add(10);
		c.add(1);
		c.add(12);
		
		for(int i:c) {
			System.out.println(i);
		}
		System.out.println("-------------------------------------------------------------------------");
		Comparator com=new Compare();
		Collections.sort(c,com);
		for(int i:c) {
			System.out.println(i);
		}
		
		Iterator e=c.iterator() ;
		System.out.println(e.next());
		
	
		
		ArrayList<String> list=new ArrayList<>();
		System.out.println(list);
		Collection<String> cal=new ArrayList();
		cal.add("Hello");
		cal.add("Hello");
		cal.add("Hello");
		for(String i:array) {
			list.add(i);
		}
		System.out.println("-------------------------------------------------------------------------");
		
		list.addAll(cal);
		list.addAll(0, cal);
		for(String i:list) {
			System.out.println(i);
		}
	
		System.out.println("List Size:"+list.size());
		for(String i:list) {
			System.out.println(i);
		}
		
		
		LinkedList<Integer> linklist=new LinkedList<Integer>();
		linklist.add(12);
		linklist.add(13);
		linklist.add(14);
		linklist.add(15);
		
		
		for(int i:linklist) {
			System.out.println(i);
		}
		System.out.println("---------------------------------from----------------------------------------");
		
		List<Integer> newlist=linklist;
		for(int i:newlist) {
			System.out.println(i);
		}
		System.out.println("------------Printing LinkList-------------------------------------------------------------");
		
		for(int i:linklist) {
			System.out.println(i);
		}
		System.out.println("------------Printing NewList-------------------------------------------------------------");
		
		newlist.clear();
		
		
		
		
		
		for(int i:newlist) {
			System.out.println(i);
		}
		System.out.println("----------------------------old list---------------------------------------------");

		//linklist.subList(1, 3).clear();
	
		for(int i:linklist) {
			System.out.println(i);
		}

		
		String[] l=list.toArray(new String[list.size()]);
	 	 int[] a= {1,2,3,4,5,6 }; 
	 	 for(String  i:list) {
	 		 System.out.println(i);
	 	 }
	 	
		
 		 System.out.println(l[0]);		
 		 
 		 
 		 for(int i=0;i<=5;++i) {
 			 System.out.println(i);
 		 }
		
		Stack<Integer> stack=new Stack<>();
		stack.push(140);
		stack.push(150);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		Queue<Integer> queue =new LinkedList<>();
		queue.add(10);
		queue.add(11);
		
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		
		
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
	}

}
