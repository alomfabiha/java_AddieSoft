package class_3;

import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {
		int i,j,n;
		Scanner obj=new Scanner(System.in);
	   n=obj.nextInt();
	   for (i=1;i<=n;i++)
	   {
		   for (j=1;j<=i;j++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
}

}
