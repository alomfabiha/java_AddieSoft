package class_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_ArraySort_1 {

	public static void main(String[] args) {
		List<Integer> obj=new ArrayList<>();
		obj.add(1);
		obj.add(2);
		obj.add(5);
		obj.add(4);
		
		System.out.println(obj);
		Collections.sort(obj);;
		System.out.println(obj);
		Collections.reverse(obj);
		System.out.println(obj);
	}

}
