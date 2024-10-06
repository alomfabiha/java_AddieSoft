package class_3;

import java.util.Scanner;

public class Total_Even_Odd {

	public static void main(String[] args) {
		int n;
		int sumOdd=0;
		int sumEven=0;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter you number ");
		n=number.nextInt();
		for(int i=0; i<=n;i++)
		{
			if (i%2==0) 
			{
				sumEven=sumEven+i;
			}
			else 
			{
				sumOdd=sumOdd+i;
			}
		}
		
		System.out.println("Total of even number " +sumEven);
		System.out.println("Total of Odd number " +sumOdd);
	}

}
