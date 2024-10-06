package Class_7_interface;

public class Interface_12 implements Interface_11{

	@Override
	public int value_1(int a, int b) {
		int sum=a+b;
		System.out.print("Sum = ");
		return sum;
	}

	@Override
	public void value_2() {
		
		System.out.println("My name is fabiha");
	}

	@Override
	public String value_3(String name, String roll) {
		// TODO Auto-generated method stub
		return name+" "+roll;
	}

	@Override
	public double value_4(double a, double b) {
		double mul=a*b;
		return mul;
	}


}
