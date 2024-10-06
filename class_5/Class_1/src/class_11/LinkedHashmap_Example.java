package class_11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap_Example extends Map_example {

	public static void main(String[] args) {
	    Map<String, Integer> obj=new LinkedHashMap<>();
		
			//Data insert
			 
			 obj.put("hi", 1);
			 obj.put("hello", 2);
			 obj.put("bonjoure", 3);
			 obj.put("Arigato", 4);
			 obj.put("Hola", 5);
			 System.out.println(obj);
			 
			 //get one value
			 System.out.println("Get value of hello "+obj.get("hello"));
			 
			 //check key is present
			 if(obj.containsKey("Hola")) {
				 System.out.println("This key is present :) ");
			 }
			 
			 else { 
				 System.out.println("This key is not present :) ");
			 }
			 
			 //replace one value
			 obj.replace("bonjoure", null);
			 
			 System.out.println("After Replace bonjoure's value :"+obj);
			
			 //To print Key
			 
				for(String obj1:obj.keySet()) {
					System.out.println("key "+obj1);
				}
				
				 //To print Value
				
				for(Integer obj2:obj.values()) {
					System.out.println("Value "+obj2);
				}
				 
	}

}
