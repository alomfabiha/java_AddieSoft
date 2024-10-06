package class_10;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Example {

	public static void main(String[] args) {
		Queue<Integer> obj= new PriorityQueue<>();
		//inserting
		
		obj.add(1);
		obj.add(5);
		obj.add(3);
		obj.add(2);
		obj.add(7);
		
		System.out.println(obj);
		//poll and remove method work as same
		System.out.println("poll : "+obj.poll());
		//use FIFO structure
		System.out.println("After poll : "+obj);
		
		System.out.println("peek : "+obj.peek());
		
		System.out.println(obj);

	}

}
