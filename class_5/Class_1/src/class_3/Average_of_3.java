
package class_3;
import java.util.Scanner;
public class Average_of_3 {

	public static void main(String[] args) {
		int a,b,c;
		double avg;
		
		Scanner number = new Scanner(System.in);
		System.out.println("Value of the 1st number = ");
		a=number.nextInt();
		System.out.println("Value of the 2nd number = ");
		b=number.nextInt();
		System.out.println("Value of the #rd number = ");
		c=number.nextInt();
		avg=(a+b+c)/3d;
		System.out.println("Average of 3 numbers = "+avg);
		
		//int a = (x+y+z)/3;
		//System.out.println("Average of 3 number = "+ a);
		// TODO Auto-generated method stub

	}

}
