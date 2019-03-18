package collectionT;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		/*
		 * java.util.List<String> list1 = new ArrayList<String>(); list1.add("turag");
		 */
		LinkedList<String> list1 = new LinkedList<String>(); 
		list1.add("turag");
		list1.add("10");
		list1.add("ooo");
		
		
		list1.addFirst("first e print hobe");
		list1.addLast("last e print hobe");

		for(String x: list1) {
			System.out.println(x); //for each loop
		}
		
		
	}

}
