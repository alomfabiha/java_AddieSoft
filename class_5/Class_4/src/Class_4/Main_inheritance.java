package Class_4;

public class Main_inheritance {

	public static void main(String[] args) {
		
		Student obj= new Student();
		obj.setName("Fabiha");
		obj.setAddress("Dhaka");
		obj.setEmail("fabihaalam96@gmail.com");
		obj.setMobile("0100890897");
		obj.setExamFee(12.322d);
		
		
		System.out.println(obj.getName());
		System.out.println(obj.getEmail());
		System.out.println(obj.getMobile());
		System.out.println(obj.getAddress());
		System.out.println(obj.getExamFee());
		
		Student obj2= new Student();
		
		obj2.setName("Niaz");
		obj2.setAddress("Dhaka");
		obj2.setEmail("niaz@gmail.com");
		obj2.setMobile("0100890897");
		obj2.setExamFee(12.322d);
		
		System.out.println("                                         ");
		System.out.println("                                         ");
		System.out.println(obj2.getName());
		System.out.println(obj2.getEmail());
		System.out.println(obj2.getMobile());
		System.out.println(obj2.getAddress());
		System.out.println(obj2.getExamFee());
	}

}
