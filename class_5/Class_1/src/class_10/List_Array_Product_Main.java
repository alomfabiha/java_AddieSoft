package class_10;

import java.util.ArrayList;
import java.util.List;

public class List_Array_Product_Main {

	public static void main(String[] args) {
		List<List_Array_Product> products= new ArrayList<>();
		
		
		products.add(new List_Array_Product("Apple", "Fruits", 3, 300, 3*300));
		products.add(new List_Array_Product("Orage", "Fruits", 3, 300, 3*300));
		products.add(new List_Array_Product("Banana", "Fruits", 3, 300, 3*300));
		products.add(new List_Array_Product("Berry", "Fruits", 3, 300, 3*300));
		
		
		
		products.get(2).setName("jack fruit");
	
		
		
		
		for (List_Array_Product obj:products) {
			obj.display();
			
			System.out.println(obj.getName()+obj.getBrand()+obj.getQty()+obj.getPrice()+obj.getAmount());
			System.out.println("  ");
		}
		

		
	}

}
