package class_11;

import java.util.HashMap;
import java.util.Map;

public class Map_example {

	public static void main(String[] args) {
		/*
		 *                      key || value 
		 * key cannot be duplicate  || value cannot be duplicate
		 * 
		 * key same hole 2nd bar value insert e value replace korbe
		 * map is a interface.
		 * key || value pair akare value insert kore by using put();
		 * 
		 * 		 
		 * */
		Map<String, Integer> obj=new HashMap<>();
		
		//Data insert
		 obj.put("1.kam", 2);
		 obj.put("2.kaz", 2);
		 obj.put("3.kazi", 2);
		 obj.put("4.jimi", 2);
		 obj.put("5.huu", 2);
		 obj.put("5.huu", 9);
		 //one null value accepted not more than that
		 obj.put(null, null);
		 
		 System.out.println(obj);
		 
		 //data remove
		 obj.remove("2.kaz");
		 System.out.println("After remove : "+obj);
		 
		 //get value key er value return kore 
		 System.out.println("get value for 5.huu  is   "+obj.get("5.huu"));
		 
		 
		 //replace method put valuer moto kaj kore
		 //REPLACE e shudhu value change kora jay
		 obj.replace("5.huu", 6);
		 System.out.println("After rePLACE : "+obj);
		 
		 //for(Class here its "Map"+(.Entry<Data type ja age diye hoise> akta object declare :age class e je object chilo.entrySet(){
		 //  System.out.println(obj.getKey()+" "+obj.getValue);}
		 //column print korte for lopps use korte hobe
		 for(Map.Entry<String, Integer> data:obj.entrySet()) {
			 
			 System.out.println(data.getKey()+" "+data.getValue());
		 }

	}

}
