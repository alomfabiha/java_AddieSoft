package class_3;

import java.util.Scanner;

public class Namta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int i,n,num;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter you number ");
		n=number.nextInt();
		for(i=1; i<=10;i++)
		{
			num=i*n;
			System.out.println(n +" x "+i" = "num);
		}
	}

}
