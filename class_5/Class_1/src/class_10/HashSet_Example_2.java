package class_10;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Example_2 {

	public static void main(String[] args) {
		//creation of hash set
				HashSet<String> obj= new HashSet<>();
				//Data insert
				obj.add("carrot");
				obj.add("Letuce");
				obj.add("Brinjel");
				obj.add("Radish");
				obj.add("Potato");
				obj.add("Tomato");
				obj.add("Cabage");
				
				System.out.println(obj);
				
				
				//contains
				if(obj.contains("pampkin")!=true){
					System.out.println("This vegetable is not here");
				}
				
				else {
					System.out.println("This vegetable is here");
				}
				obj.add("         Pumpkin");
				//System.out.println("Contains is "+obj.contains("Pumpkin"));
				Iterator<String> it=obj.iterator();
				
				
                
				while(it.hasNext()) {
					System.out.println("     "+it.next());
				}
				//System.out.println("***********");
			
	}

}
