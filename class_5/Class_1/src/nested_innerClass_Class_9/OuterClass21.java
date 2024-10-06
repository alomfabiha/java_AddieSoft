package nested_innerClass_Class_9;

public class OuterClass21 {
	
	int i=1;
	int n=100;
	
	class InnerClass22
	{
		int odd=0;
		int even=0;
		
		void display() {
		 for (int j=i;j<=n;j++) {
			 if(j%2==0) {
				 even=even+j;
			 }
			 else {
				 odd=odd+j;
			}
		 }
		 System.out.println("Sum of even "+even);
		 System.out.println("Sum of odd "+odd);
		 
	 }
	}

}
