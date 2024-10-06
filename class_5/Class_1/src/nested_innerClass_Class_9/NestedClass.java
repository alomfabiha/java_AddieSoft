package nested_innerClass_Class_9;
public class NestedClass{
	static int a =10;
	static int b=8;
	
	static class Inner_class_1 {
		int sum=a+b;
		//System.out.println(sum);
	}
	class InnerClass2{
		Inner_class_1 obj=new Inner_class_1();
		int sum1=obj.sum+a;
	}
}



