package class_10;

import java.util.HashSet;
import java.util.Set;

public class SetPckage {

	public static void main(String[] args) {
	
Set<Integer> obj=new HashSet<>();	
HashSet<Integer> obj1=new HashSet<Integer>();
obj.add(2);
obj1.add(3);
obj.remove(0);
//obj.equals(2);
boolean isResult=obj.equals(obj1);
System.out.println(isResult);

System.out.println(obj);
System.out.println(obj.contains(2));
System.out.println(obj.isEmpty());
	
	}

}
