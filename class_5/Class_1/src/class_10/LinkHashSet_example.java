package class_10;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkHashSet_example {

	public static void main(String[] args) {
		
		TreeSet<Integer> obj=new TreeSet<>();
 
		//data insert
		obj.add(7);
		obj.add(2);		
		obj.add(1);	
		obj.add(4);
		obj.add(5);
	//obj.add(null);
		
		//retreive
		System.out.println(obj);

		TreeSet<String> obj1=new TreeSet<>();
 
		//data insert
		obj1.add("doctor");
		obj1.add("car");		
		obj1.add("star");	
		obj1.add("hide");
		obj1.add("egg");
	//obj.add(null);
		
		//retreive
		System.out.println(obj1);
		

	}

}
