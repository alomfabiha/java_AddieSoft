package class_12;

import java.util.ArrayList;
import java.util.List;

public class LinSearch_ArrayList_exm_2 extends LinnerSearch_exm_1 {

	public static void main(String[] args) {
		List<Integer> obj=new ArrayList<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		
		int tar=obj.get(1);
		int result=got(tar,obj);
		
		if(result==-1) {
			System.out.println("no value found ");
			
		}	else {
			System.out.println("result "+obj.get(result));
		}	
		

	}
	public static int got(int a,List<Integer> obj) {
		for(int i=0;i<obj.size();i++) {
			if(a==obj.get(i)) {
				return obj.get(i);
				
			}
			
		}
		return -1;
		
	}

}
