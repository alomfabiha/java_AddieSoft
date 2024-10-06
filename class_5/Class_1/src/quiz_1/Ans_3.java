package quiz_1;

import java.util.Scanner;

public class Ans_3 {

	public static void main(String[] args) {
	
			int i;
			System.out.println("***Even***");
			for(i=1; i<=100;i++) {
				
				if(i%2 == 0 ) {
					System.out.print(" "+i);
				}
			
				}
			System.out.println(" ");
			
			System.out.println("*****ODD*****");
			
			
			for(i=1; i<=100;i++) {
				
				if(i%2 != 0 ) {
					System.out.print(" "+i);
				}
			
				
			}
			


}
}
