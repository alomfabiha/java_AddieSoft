package class_8_Exception_Handling;

public class Exception_1_main {

	public static void main(String[] args) {
		String a="Kamal";
		//Object Interger;
		
		
		try {
			int b=Integer.parseInt(a);
			System.out.println(b);
		}catch (NumberFormatException d) {
		System.out.println(d.getMessage());
		}
	}

}
