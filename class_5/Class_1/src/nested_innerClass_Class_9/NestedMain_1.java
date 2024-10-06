package nested_innerClass_Class_9;

public class NestedMain_1 {

	public static void main(String[] args) {
		NestedClass.Inner_class_1 obj = new NestedClass.Inner_class_1();
		NestedClass obj1= new NestedClass();
		NestedClass.InnerClass2 obj2=obj1.new InnerClass2();
		System.out.println(obj2.sum1);
		System.out.println(obj.sum);
	}

}
