package thread_1;

import java.util.Scanner;

public class Namta {

	public static void main(String[] args) {
		System.out.println("enter a value between 1 to hundred ");
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		for(int i=1;i<=10;i++) {
			int result=N*i;
			System.out.println(N+" x "+i+" = "+result);
		}

	}

}
