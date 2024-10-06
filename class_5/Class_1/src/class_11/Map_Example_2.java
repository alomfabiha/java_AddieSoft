package class_11;

import java.util.HashMap;
import java.util.Map;

public class Map_Example_2 {

	public static void main(String[] args) {
          Map<String, Integer> obj=new HashMap<>();
		
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
		
		 //To print line by line 
		 for(Map.Entry<String, Integer> data:obj.entrySet()) {
			 System.out.println("Key is = "+ data.getKey()+" & Value is = "+data.getValue());
			 
		 }
	}

}
