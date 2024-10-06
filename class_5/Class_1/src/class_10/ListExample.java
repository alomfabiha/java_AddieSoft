package class_10;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> obj=new ArrayList<>();
		//ArrayList<String> obj1=new ArrayList<>();
		obj.add("1.Fabiha");
		obj.add("2.Niaz");
		obj.add("3.Beauty");
		obj.add("4.Momo");
		obj.add("5.Meem");
		System.out.println(obj.size());
		for(String li:obj) {
			System.out.println(li);
		}
		System.out.println(obj);
		System.out.println(obj.get(2));
		obj.set(3, "4.Moinul");
		System.out.println(obj);
		for(String li:obj) {
			System.out.println(li);
		}
		System.out.println(obj.get(0));
	}

}
