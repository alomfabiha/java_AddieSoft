package thread_1;

import java.util.Scanner;

public class Weird {

	public static void main(String[] args) {
		System.out.println("enter a value between 1 to hundred ");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		if(n%2==0) {
		if(n>=2&& n<=5) {
			System.out.println("not weired");
			
		}
		else if(n>=6 && n<=20) {
			System.out.println("Weired");
		}
		else {System.out.println(" weired");
		
		}
		
		
		}
		
       else {
			
			System.out.println("odd weired");
		}
		
		

	}

}
