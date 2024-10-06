package class_8_Exception_Handling;

public class Exception_3_main {

	public static void main(String[] args) {
	int a=10;
	int b=4;
	float c=3;
	try {
		float div=a/c;
		System.out.println("Divided "+div);
		
		try {
			int val=b/0;
			System.out.println("2nd try "+val);
		}catch(Exception e) {
			System.out.println("2nd catch");
		}
	}catch (ArithmeticException d) {
		System.out.println(d);
	}
	finally {
		System.out.println();
	}
	}

}
