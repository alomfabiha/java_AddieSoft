package class_3;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		float a,b,c;
		Scanner number = new Scanner(System.in);
		System.out.println("Value of the 1st number = ");
		a=number.nextInt();
		System.out.println("Value of the 2nd number = ");
		b=number.nextInt();
		System.out.println("Value of the 3rd number = ");
		c=number.nextInt();
		if (a>b) {
			System.out.println(" The max number is "+a);
			
			
		}
		else if (b>c) {
			System.out.println(" The max number is " +b);
		}

		else
			System.out.println(" The max number is "+c);
	
	}

}
