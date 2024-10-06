package class_10;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Example {

	public static void main(String[] args) {
	//	Map<String,Integer> obj=new HashMap<>();
		Map<String,Integer> obj=new LinkedHashMap<>();
		obj.put("Apple", 20);
		obj.put("Orange", 20);

		System.out.println(obj);
		for(Map.Entry<String, Integer> sad:obj.entrySet()) {
			System.out.println(sad.getKey()+" "+sad.getValue());
		}
	}

}
