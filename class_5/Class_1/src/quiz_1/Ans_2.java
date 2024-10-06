package quiz_1;

import java.util.Scanner;

public class Ans_2 {

	public static void main(String[] args) {
		int x,y;
		Scanner number = new Scanner(System.in);
		System.out.println("Input three value of your choice ");
	
		x=number.nextInt();
		 y=number.nextInt();
		 int sum=x+y;
		 int minus=x-y;
		 float div=x%y;
		 int mul=x*y;
System.out.println("sum = "+sum);
System.out.println("Minus= "+minus);
System.out.println("Div= "+div);
System.out.println("Multiplication = "+mul);
	}

}
