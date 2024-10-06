package class_10;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Exmple {

	public static void main(String[] args) {
		//creation of hash set
		HashSet<String> obj= new HashSet<>();
		//Data insert
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add("Lichy");
		obj.add("Guava");
		
		//duplicate value doesn't print
		obj.add("Apple");
		
		//Data retrieve
		System.out.println(obj);
		
		//data remove
		obj.remove("Apple");
		//data receive after remove
		System.out.println(obj);
		
		//containt method return true false, ase ki nai tai answer kore
		System.out.println("contain "+obj.contains("Lemon"));
		
		//size method to know the size 
		System.out.println("Size : "+obj.size());
		
		//data clear kora 
		/*
		 * obj.clear(); System.out.println("clear "+obj);
		 */
		//is empty method , kichu ase ki na sheta janar jonno
		System.out.println("asholei ki empty "+obj.isEmpty());
		
		//iterator use korle obj er same data type dite hoi
		//use Iterator
		Iterator<String> it=obj.iterator();
		
		//Difference  between do while loop
		
		/*
		 * While loop checks the condition before the execution of the statement(s)
		 * whereas the do-while loop ensures that the statement(s) is executed at least
		 * once before evaluating the condition
		 */
		while(it.hasNext()) {
			System.out.println(it.next());

		}
		//iterator use na kore shudhu for loops diye o kora jay
		//for(data_type make_random_object:object_from_class ){ print random_object}
		
		for (String st:obj) {
			System.out.println("          "+st);
		}
	}

}
