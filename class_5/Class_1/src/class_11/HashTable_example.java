package class_11;

import java.util.Hashtable;
import java.util.Map;

public class HashTable_example {

	public static void main(String[] args) {
		
		
		//Diference between hash_table and hash_map is : hash_table null value accept kore na ar hash_map kore
		Map<String,Integer> obj= new Hashtable<>();
		
		 obj.put("Hi", 1);
		 obj.put("Hello", 2);
		 obj.put("Bonjoure", 3);
		 obj.put("Arigato", 4);
		 obj.put("Hola", 5);
		 System.out.println(obj);
		 
		 //get one value
		 System.out.println("Get value of Hello "+obj.get("Hello"));
		 
		 //check key is present
		 if(obj.containsKey("Hola")) {
			 System.out.println("This key is present :) ");
		 }
		 
		 else { 
			 System.out.println("This key is not present :) ");
		 }
		 
		 //replace one value
		 obj.replace("Bonjoure", 5);
		 
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
