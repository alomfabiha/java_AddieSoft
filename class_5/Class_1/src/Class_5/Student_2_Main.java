package Class_5;

public class Student_2_Main {

	public static void main(String[] args) {
		Student_2 [] std= new Student_2[2];
		std[0]= new Student_2("Fabiha",3);
		std[1]= new Student_2("Niaz",5);
		for(Student_2 st:std)
		{
			System.out.println(st.name+"  "+st.age);
		}
	}

}
