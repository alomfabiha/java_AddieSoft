package Class_5;

public class Student_1_Main {

	public static void main(String[] args) {
		Student_1 [] std= new Student_1[2];
		std[0]= new Student_1("Fabiha",3);
		std[1]= new Student_1("Niaz",5);
		for(Student_1 st:std)
		{
			System.out.println(st.getName()+"  "+st.getAge());
		}
	}

}
