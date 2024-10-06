package class_12;

import java.util.ArrayList;
import java.util.List;

public class LinnerSearch_exm_1 {

	public static void main(String[] args) {
		
		List<Integer> obj=new ArrayList<>();
		obj.add(5);
		obj.add(8);
		obj.add(3);
		obj.add(9);
		obj.add(2);
		int target=obj.get(1);
		liner(target,obj);
		
	}
	
	public static void liner(int a,List<Integer> obj) {
		
		for(int i=0;i<obj.size();i++) {
			if(a==obj.get(1)) {
				System.out.println("target "+a);
				break;
			}			
		}
			
	}

	public static void liner(int a,List<Integer> obj) {
		
		for(int i=0;i<obj.size();i++) {
			if(a==obj.get(1)) {
				System.out.println("target "+a);
				break;
			}			
		}
			
	}

}
