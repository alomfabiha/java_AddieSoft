package quiz_1;

import java.util.Scanner;

public class Ans_1 {

	private static final String Scanner = null;

	public static void main(String[] args) {
		int x,y,z;
		Scanner number = new Scanner(System.in);
		System.out.println("Input three value of your choice ");
	
		x=number.nextInt();
		 y=number.nextInt();
		 z=number.nextInt();
		if(x>y && x>z ) {
		System.out.println(" The max number is " +x);
		//System.out.println("the max number is )+x;
		}
		else if (y>x&&y>z)
		{
			System.out.println(" The max number is " +y);
			
		}
		else {
			System.out.println(" The max number is " +z);
		}
		
		
		
			if(x<y && x<z ) {
				System.out.println(" The min number is " +x);
				//System.out.println("the max number is )+x;
				}
				else if (y<x&&y<z)
				{
					System.out.println(" The min number is " +y);
					
				}
				else {
					System.out.println(" The min number is " +z);
				}
		
		
	}

}
