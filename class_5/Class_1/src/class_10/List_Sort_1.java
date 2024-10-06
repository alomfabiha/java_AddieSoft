package class_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class List_Sort_1 {

	public static void main(String[] args) {
	//	List<Integer> obj=Arrays.asList(5,4,6,11,9,2);
		List<Integer> obj =new ArrayList<>();
		/*
		 * //*********Direct value*********** 
		 * 
		 * System.out.println("Enter your value :");
		 * Scanner sc=new Scanner(System.in);
		 *  obj.add(sc.nextInt());
		 * System.out.println(obj);
		 * 
		 *  
		 *  //Direct value for multiple time*********
		 */		
		for(int i=0; i<5;i++) {
			System.out.println("Enter your "+i+" index value");
			Scanner scc=new Scanner(System.in);
			obj.add(scc.nextInt());
			
		}
		Collections.sort(obj);
		System.out.println(obj);
		
		Collections.reverse(obj);
		System.out.println(obj);
		//System.out.println(obj);
		//Collections.sort(obj);
		//System.out.println(obj);

	}

}
