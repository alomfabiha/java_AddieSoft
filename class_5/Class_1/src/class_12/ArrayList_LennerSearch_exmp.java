package class_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_LennerSearch_exmp {

	public static void main(String[] args) {
		List<Integer> obj=new ArrayList<>();
		
        System.out.println("Please enter a 10 value : ");  
        Scanner INPUT = new Scanner(System.in);
         for(int i=0;i<10;i++) {  
    	        obj.add(INPUT.nextInt()); 
    	       
       }
         System.out.println(obj);
		
		int target=obj.get(3);
		lineer(target,obj);
		
	}
	//external method use ex
	public static void lineer(int a,List<Integer> obj) {
		for(int i=0;i<obj.size();i++) {
			if(a==obj.get(3)) {
				System.out.println("target "+a);
				break;
			}
		}		
	}
}
