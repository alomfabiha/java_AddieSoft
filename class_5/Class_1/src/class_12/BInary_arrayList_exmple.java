package class_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BInary_arrayList_exmple {

	public static void main(String[] args) {
        List<Integer> obj=new ArrayList<>();
		
        System.out.println("Please enter 10 sequence value : ");  
        Scanner input = new Scanner(System.in);
         for(int i=0;i<10;i++) {  
    	        obj.add(input.nextInt()); 
    	       
       }
         //System.out.println(obj);
         
         int target=obj.get(3);
     	
     	int result= search(obj,target);
    	if(result==-1) {
    		System.out.println("not found");
    	}
    	else {System.out.println("Value is : "+result);
    	
    	  }
    }
        
    	public static int search(List<Integer> obj1,int searchValue) {
    		
    		int start=0;
    		int end=obj1.size()-1;
    		while(start<=end) {
    			int mid=(start+end)/2;
    			
    			
    			if(searchValue >obj1.get(mid)) {
    				start=mid+1;
    				System.out.println(start);
    			}
    			
    			else if (searchValue<obj1.get(mid)) {
    				end=mid-1;
    				System.out.println(end);
    			}
    			else {
    			System.out.println("index is "+mid);
    			return obj1.get(mid);
    			}
    		}
    		
    		return -1;
    		
    	}

}
