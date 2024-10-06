package class_10;

import java.util.LinkedList;

public class LinkedList_1 {

	public static void main(String[] args) {
		LinkedList<Integer> obj=new LinkedList<>();
		obj.add(1);
		obj.addFirst(9);
		obj.addLast(3);
		System.out.println(obj);
		System.out.println(obj.get(1));
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		

	}

}
