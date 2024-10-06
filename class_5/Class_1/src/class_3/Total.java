package class_3;

import java.util.Scanner;

public class Total {

	public static void main(String[] args) {
		int n;
		int sum=0;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter you number ");
		n=number.nextInt();

	if(n%2==0)
	{
		for(int i=0;i<=n;i=i+2) {
		sum=sum+i;
	}
	System.out.println("Sum of total even number "+ sum);	
    }
	else {
		for(int i=1;i<=n;i=i+2) {
			sum=sum+i;
	     }
		System.out.println("Sum of total odd number " + sum);	
	 }
	}
}
	

	

